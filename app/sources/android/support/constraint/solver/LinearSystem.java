package android.support.constraint.solver;

import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintAnchor;
import java.util.Arrays;
import java.util.HashMap;

public class LinearSystem {
    private static final boolean DEBUG = false;
    private static final int POOL_SIZE = 1000;
    private int TABLE_SIZE;
    private boolean[] mAlreadyTestedCandidates;
    private final Cache mCache;
    private ArrayRow mGoal;
    private int mMaxColumns;
    int mMaxRows;
    int mNumColumns;
    int mNumRows;
    private SolverVariable[] mPoolVariables;
    private int mPoolVariablesCount;
    private ArrayRow[] mRows;
    private HashMap<String, SolverVariable> mVariables;
    private int mVariablesID;
    private ArrayRow[] tempClientsCopy;
    SolverVariable[] tempVars;

    public LinearSystem() {
        this.mVariablesID = 0;
        this.mVariables = null;
        this.TABLE_SIZE = 32;
        this.mMaxColumns = this.TABLE_SIZE;
        this.mRows = null;
        this.mAlreadyTestedCandidates = new boolean[this.TABLE_SIZE];
        this.mNumColumns = 1;
        this.mNumRows = 0;
        this.mMaxRows = this.TABLE_SIZE;
        this.mPoolVariables = new SolverVariable[1000];
        this.mPoolVariablesCount = 0;
        this.tempVars = new SolverVariable[256];
        this.tempClientsCopy = new ArrayRow[32];
        this.mRows = new ArrayRow[this.TABLE_SIZE];
        releaseRows();
        this.mCache = new Cache();
    }

    /* access modifiers changed from: package-private */
    public void increaseTableSize() {
        this.TABLE_SIZE *= 2;
        this.mRows = (ArrayRow[]) Arrays.copyOf(this.mRows, this.TABLE_SIZE);
        this.mCache.mIndexedVariables = (SolverVariable[]) Arrays.copyOf(this.mCache.mIndexedVariables, this.TABLE_SIZE);
        this.mAlreadyTestedCandidates = new boolean[this.TABLE_SIZE];
        this.mMaxColumns = this.TABLE_SIZE;
        this.mMaxRows = this.TABLE_SIZE;
        releaseGoal();
        this.mGoal = null;
    }

    private void releaseRows() {
        for (int i = 0; i < this.mRows.length; i++) {
            ArrayRow row = this.mRows[i];
            if (row != null) {
                row.reset();
                this.mCache.arrayRowPool.release(row);
            }
            this.mRows[i] = null;
        }
    }

    private void releaseGoal() {
        if (this.mGoal != null) {
            this.mGoal.reset();
            this.mCache.arrayRowPool.release(this.mGoal);
        }
    }

    public void reset() {
        for (SolverVariable variable : this.mCache.mIndexedVariables) {
            if (variable != null) {
                variable.reset();
            }
        }
        this.mCache.solverVariablePool.releaseAll(this.mPoolVariables, this.mPoolVariablesCount);
        this.mPoolVariablesCount = 0;
        Arrays.fill(this.mCache.mIndexedVariables, (Object) null);
        if (this.mVariables != null) {
            this.mVariables.clear();
        }
        this.mVariablesID = 0;
        releaseGoal();
        this.mGoal = null;
        this.mNumColumns = 1;
        for (int i = 0; i < this.mNumRows; i++) {
            this.mRows[i].used = false;
        }
        releaseRows();
        this.mNumRows = 0;
    }

    public void addConstraint(LinearEquation e) {
        addConstraint(EquationCreation.createRowFromEquation(this, e));
    }

    public SolverVariable createObjectVariable(Object anchor) {
        if (anchor == null) {
            return null;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        if (!(anchor instanceof ConstraintAnchor)) {
            return null;
        }
        SolverVariable variable = ((ConstraintAnchor) anchor).getSolverVariable();
        if (variable == null) {
            ((ConstraintAnchor) anchor).resetSolverVariable(this.mCache);
            variable = ((ConstraintAnchor) anchor).getSolverVariable();
        }
        if (variable.f3id != -1) {
            return variable;
        }
        this.mVariablesID++;
        this.mNumColumns++;
        variable.f3id = this.mVariablesID;
        variable.mType = SolverVariable.Type.UNRESTRICTED;
        this.mCache.mIndexedVariables[this.mVariablesID] = variable;
        return variable;
    }

    public ArrayRow createRow() {
        ArrayRow row = this.mCache.arrayRowPool.acquire();
        if (row == null) {
            return new ArrayRow(this.mCache);
        }
        return row;
    }

    public SolverVariable createSlackVariable() {
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable variable = acquireSolverVariable(SolverVariable.Type.SLACK);
        this.mVariablesID++;
        this.mNumColumns++;
        variable.f3id = this.mVariablesID;
        this.mCache.mIndexedVariables[this.mVariablesID] = variable;
        return variable;
    }

    /* access modifiers changed from: package-private */
    public void addError(ArrayRow row) {
        row.addError(createErrorVariable(), createErrorVariable());
    }

    /* access modifiers changed from: package-private */
    public void addSingleError(ArrayRow row, int sign) {
        row.addSingleError(createErrorVariable(), sign);
    }

    private SolverVariable createVariable(String name, SolverVariable.Type type) {
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable variable = acquireSolverVariable(type);
        variable.setName(name);
        this.mVariablesID++;
        this.mNumColumns++;
        variable.f3id = this.mVariablesID;
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        this.mVariables.put(name, variable);
        this.mCache.mIndexedVariables[this.mVariablesID] = variable;
        return variable;
    }

    private SolverVariable createErrorVariable() {
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable variable = acquireSolverVariable(SolverVariable.Type.ERROR);
        this.mVariablesID++;
        this.mNumColumns++;
        variable.f3id = this.mVariablesID;
        this.mCache.mIndexedVariables[this.mVariablesID] = variable;
        return variable;
    }

    private final SolverVariable acquireSolverVariable(SolverVariable.Type type) {
        SolverVariable variable = this.mCache.solverVariablePool.acquire();
        if (variable == null) {
            variable = new SolverVariable(this.mCache, type);
        }
        variable.reset();
        variable.setType(type);
        SolverVariable[] solverVariableArr = this.mPoolVariables;
        int i = this.mPoolVariablesCount;
        this.mPoolVariablesCount = i + 1;
        solverVariableArr[i] = variable;
        return variable;
    }

    public ArrayRow getGoal() {
        return this.mGoal;
    }

    public ArrayRow getRow(int n) {
        return this.mRows[n];
    }

    public float getValueFor(String name) {
        SolverVariable v = getVariable(name, SolverVariable.Type.UNRESTRICTED);
        if (v == null) {
            return 0.0f;
        }
        return v.computedValue;
    }

    public int getObjectVariableValue(Object anchor) {
        SolverVariable variable = ((ConstraintAnchor) anchor).getSolverVariable();
        if (variable != null) {
            return (int) (variable.computedValue + 0.5f);
        }
        return 0;
    }

    public SolverVariable getVariable(String name, SolverVariable.Type type) {
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        SolverVariable variable = this.mVariables.get(name);
        if (variable == null) {
            return createVariable(name, type);
        }
        return variable;
    }

    public void rebuildGoalFromErrors() {
        if (this.mGoal != null) {
            this.mGoal.reset();
        } else {
            this.mGoal = createRow();
        }
        for (int i = 1; i < this.mNumColumns; i++) {
            SolverVariable variable = this.mCache.mIndexedVariables[i];
            if (variable.mType == SolverVariable.Type.ERROR) {
                this.mGoal.variables.put(variable, 1.0f);
            }
        }
    }

    public void minimize() throws Exception {
        rebuildGoalFromErrors();
        minimizeGoal(this.mGoal);
    }

    public void minimizeGoal(ArrayRow goal) throws Exception {
        goal.variables.updateFromSystem(goal, this.mRows);
        if (!goal.hasAtLeastOnePositiveVariable()) {
            computeValues();
            return;
        }
        try {
            int enforceBFS = enforceBFS(goal);
            int tries = optimize(goal);
            computeValues();
        } catch (Exception e) {
            computeValues();
            throw e;
        }
    }

    private void updateRowFromVariables(ArrayRow row) {
        row.variables.updateFromSystem(row, this.mRows);
        if (row.variables.currentSize == 0) {
            row.isSimpleDefinition = true;
        }
    }

    public void addConstraint(ArrayRow row) {
        if (row != null) {
            if (this.mNumRows + 1 >= this.mMaxRows || this.mNumColumns + 1 >= this.mMaxColumns) {
                increaseTableSize();
            }
            updateRowFromVariables(row);
            row.ensurePositiveConstant();
            row.pickRowVariable();
            if (row.hasKeyVariable()) {
                if (this.mRows[this.mNumRows] != null) {
                    this.mCache.arrayRowPool.release(this.mRows[this.mNumRows]);
                }
                row.updateClientEquations();
                this.mRows[this.mNumRows] = row;
                row.variable.definitionId = this.mNumRows;
                this.mNumRows++;
                int count = row.variable.mClientEquationsCount;
                if (count > 0) {
                    while (this.tempClientsCopy.length < count) {
                        this.tempClientsCopy = new ArrayRow[(this.tempClientsCopy.length * 2)];
                    }
                    ArrayRow[] clients = this.tempClientsCopy;
                    System.arraycopy(row.variable.mClientEquations, 0, clients, 0, count);
                    for (int i = 0; i < count; i++) {
                        ArrayRow client = clients[i];
                        if (client != row) {
                            client.variables.updateFromRow(client, row);
                            client.updateClientEquations();
                        }
                    }
                }
            }
        }
    }

    private int optimize(ArrayRow goal) {
        int pivotRowIndex;
        boolean done = false;
        int tries = 0;
        for (int i = 0; i < this.mNumColumns; i++) {
            this.mAlreadyTestedCandidates[i] = false;
        }
        int tested = 0;
        while (!done) {
            tries++;
            SolverVariable pivotCandidate = goal.variables.getPivotCandidate();
            if (pivotCandidate != null) {
                if (this.mAlreadyTestedCandidates[pivotCandidate.f3id]) {
                    pivotCandidate = null;
                } else {
                    this.mAlreadyTestedCandidates[pivotCandidate.f3id] = true;
                    tested++;
                    if (tested >= this.mNumColumns) {
                        done = true;
                    }
                }
            }
            if (pivotCandidate != null) {
                float minWeak = Float.MAX_VALUE;
                float minStrong = Float.MAX_VALUE;
                int pivotRowIndexWeak = -1;
                int pivotRowIndexStrong = -1;
                for (int i2 = 0; i2 < this.mNumRows; i2++) {
                    ArrayRow current = this.mRows[i2];
                    if (current.variable.mType != SolverVariable.Type.UNRESTRICTED && current.hasVariable(pivotCandidate)) {
                        float C = current.constantValue;
                        float a_j = current.variables.get(pivotCandidate);
                        if (a_j < 0.0f) {
                            float value = (-1.0f * C) / a_j;
                            if (pivotCandidate.mStrength == SolverVariable.Strength.STRONG) {
                                if (value < minStrong) {
                                    minStrong = value;
                                    pivotRowIndexStrong = i2;
                                }
                            } else if (value < minWeak) {
                                minWeak = value;
                                pivotRowIndexWeak = i2;
                            }
                        }
                    }
                }
                if (pivotRowIndexStrong > -1) {
                    pivotRowIndex = pivotRowIndexStrong;
                } else {
                    pivotRowIndex = pivotRowIndexWeak;
                }
                if (pivotRowIndex > -1) {
                    ArrayRow pivotEquation = this.mRows[pivotRowIndex];
                    pivotEquation.variable.definitionId = -1;
                    pivotEquation.pivot(pivotCandidate);
                    pivotEquation.variable.definitionId = pivotRowIndex;
                    for (int i3 = 0; i3 < this.mNumRows; i3++) {
                        this.mRows[i3].updateRowWithEquation(pivotEquation);
                    }
                    goal.updateRowWithEquation(pivotEquation);
                } else {
                    done = true;
                }
            } else {
                done = true;
            }
        }
        return tries;
    }

    private int enforceBFS(ArrayRow goal) throws Exception {
        int pivotRowIndex;
        int pivotColumnIndex;
        int tries = 0;
        boolean infeasibleSystem = false;
        int i = 0;
        while (true) {
            if (i >= this.mNumRows) {
                break;
            } else if (this.mRows[i].variable.mType != SolverVariable.Type.UNRESTRICTED && this.mRows[i].constantValue < 0.0f) {
                infeasibleSystem = true;
                break;
            } else {
                i++;
            }
        }
        if (infeasibleSystem) {
            boolean done = false;
            tries = 0;
            while (!done) {
                tries++;
                float minWeak = Float.MAX_VALUE;
                float minStrong = Float.MAX_VALUE;
                int pivotRowIndexWeak = -1;
                int pivotRowIndexStrong = -1;
                int pivotColumnIndexStrong = -1;
                int pivotColumnIndexWeak = -1;
                for (int i2 = 0; i2 < this.mNumRows; i2++) {
                    ArrayRow current = this.mRows[i2];
                    SolverVariable variable = current.variable;
                    if (variable.mType != SolverVariable.Type.UNRESTRICTED && current.constantValue < 0.0f) {
                        for (int j = 1; j < this.mNumColumns; j++) {
                            SolverVariable candidate = this.mCache.mIndexedVariables[j];
                            float a_j = current.variables.get(candidate);
                            if (a_j > 0.0f) {
                                float value = goal.variables.get(candidate) / a_j;
                                if (variable.mStrength == SolverVariable.Strength.STRONG) {
                                    if (value < minStrong) {
                                        minStrong = value;
                                        pivotRowIndexStrong = i2;
                                        pivotColumnIndexStrong = j;
                                    }
                                } else if (value < minWeak) {
                                    minWeak = value;
                                    pivotRowIndexWeak = i2;
                                    pivotColumnIndexWeak = j;
                                }
                            }
                        }
                    }
                }
                if (pivotRowIndexStrong != -1) {
                    pivotRowIndex = pivotRowIndexStrong;
                    pivotColumnIndex = pivotColumnIndexStrong;
                } else {
                    pivotRowIndex = pivotRowIndexWeak;
                    pivotColumnIndex = pivotColumnIndexWeak;
                }
                if (pivotRowIndex != -1) {
                    ArrayRow pivotEquation = this.mRows[pivotRowIndex];
                    pivotEquation.variable.definitionId = -1;
                    pivotEquation.pivot(this.mCache.mIndexedVariables[pivotColumnIndex]);
                    pivotEquation.variable.definitionId = pivotRowIndex;
                    for (int i3 = 0; i3 < this.mNumRows; i3++) {
                        this.mRows[i3].updateRowWithEquation(pivotEquation);
                    }
                    goal.updateRowWithEquation(pivotEquation);
                } else {
                    done = true;
                }
            }
        }
        boolean infeasibleSystem2 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= this.mNumRows) {
                break;
            } else if (this.mRows[i4].variable.mType != SolverVariable.Type.UNRESTRICTED && this.mRows[i4].constantValue < 0.0f) {
                infeasibleSystem2 = true;
                break;
            } else {
                i4++;
            }
        }
        if (infeasibleSystem2) {
        }
        return tries;
    }

    private void computeValues() {
        for (int i = 0; i < this.mNumRows; i++) {
            ArrayRow row = this.mRows[i];
            row.variable.computedValue = row.constantValue;
        }
    }

    /* access modifiers changed from: package-private */
    public void replaceVariable(ArrayRow target, SolverVariable variable) {
        int idx = variable.definitionId;
        if (idx != -1) {
            target.updateRowWithEquation(this.mRows[idx]);
        }
    }

    public void displayRows() {
        displaySolverVariables();
        String s = "";
        for (int i = 0; i < this.mNumRows; i++) {
            s = (s + this.mRows[i]) + "\n";
        }
        if (this.mGoal != null) {
            s = s + this.mGoal + "\n";
        }
        System.out.println(s);
    }

    public void displayReadableRows() {
        displaySolverVariables();
        String s = "";
        for (int i = 0; i < this.mNumRows; i++) {
            s = (s + this.mRows[i].toReadableString()) + "\n";
        }
        if (this.mGoal != null) {
            s = s + this.mGoal.toReadableString() + "\n";
        }
        System.out.println(s);
    }

    public void displayVariablesReadableRows() {
        displaySolverVariables();
        String s = "";
        for (int i = 0; i < this.mNumRows; i++) {
            if (this.mRows[i].variable.mType == SolverVariable.Type.UNRESTRICTED) {
                s = (s + this.mRows[i].toReadableString()) + "\n";
            }
        }
        if (this.mGoal != null) {
            s = s + this.mGoal.toReadableString() + "\n";
        }
        System.out.println(s);
    }

    public int getMemoryUsed() {
        int actualRowSize = 0;
        for (int i = 0; i < this.mNumRows; i++) {
            if (this.mRows[i] != null) {
                actualRowSize += this.mRows[i].sizeInBytes();
            }
        }
        return actualRowSize;
    }

    public int getNumEquations() {
        return this.mNumRows;
    }

    public int getNumVariables() {
        return this.mVariablesID;
    }

    public void displaySystemInformations() {
        int rowSize = 0;
        for (int i = 0; i < this.TABLE_SIZE; i++) {
            if (this.mRows[i] != null) {
                rowSize += this.mRows[i].sizeInBytes();
            }
        }
        int actualRowSize = 0;
        for (int i2 = 0; i2 < this.mNumRows; i2++) {
            if (this.mRows[i2] != null) {
                actualRowSize += this.mRows[i2].sizeInBytes();
            }
        }
        System.out.println("Linear System -> Table size: " + this.TABLE_SIZE + " (" + getDisplaySize(this.TABLE_SIZE * this.TABLE_SIZE) + ") -- row sizes: " + getDisplaySize(rowSize) + ", actual size: " + getDisplaySize(actualRowSize) + " rows: " + this.mNumRows + "/" + this.mMaxRows + " cols: " + this.mNumColumns + "/" + this.mMaxColumns + " " + 0 + " occupied cells, " + getDisplaySize(0) + " " + LinkedVariables.sCreation + " created Link variables");
    }

    private void displaySolverVariables() {
        String s = "Display Rows (" + this.mNumRows + "x" + this.mNumColumns + ") :\n\t | C | ";
        for (int i = 1; i <= this.mNumColumns; i++) {
            s = (s + this.mCache.mIndexedVariables[i]) + " | ";
        }
        System.out.println(s + "\n");
    }

    private String getDisplaySize(int n) {
        int mb = ((n * 4) / 1024) / 1024;
        if (mb > 0) {
            return "" + mb + " Mb";
        }
        int kb = (n * 4) / 1024;
        if (kb > 0) {
            return "" + kb + " Kb";
        }
        return "" + (n * 4) + " bytes";
    }

    public Cache getCache() {
        return this.mCache;
    }
}
