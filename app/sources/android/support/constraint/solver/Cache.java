package android.support.constraint.solver;

import android.support.constraint.solver.LinkedVariables;
import android.support.constraint.solver.Pools;
import android.support.constraint.solver.SolverVariable;

public class Cache {
    private static final int POOL_SIZE = 4096;
    public Pools.Pool<ArrayRow> arrayRowPool = new Pools.SimplePool(256);
    public Pools.Pool<SolverVariable.Link> linkedSolverVariablePool = new Pools.SimplePool(256);
    public Pools.Pool<LinkedVariables.Link> linkedVariablesPool = new Pools.SimplePool(256);
    public SolverVariable[] mIndexedVariables = new SolverVariable[32];
    public Pools.Pool<SolverVariable> solverVariablePool = new Pools.SimplePool(256);
}
