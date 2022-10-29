package android.support.constraint;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.constraint.solver.widgets.Animator;
import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.ConstraintWidgetContainer;
import android.support.constraint.solver.widgets.Guideline;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class ConstraintLayout extends ViewGroup {
    static final boolean ALLOWS_EMBEDDED = false;
    private static final boolean SIMPLE_LAYOUT = true;
    private static final String TAG = "ConstraintLayout";
    SparseArray<View> mChildrenByIds = new SparseArray<>();
    private boolean mDirtyHierarchy = SIMPLE_LAYOUT;
    ConstraintWidgetContainer mLayoutWidget = new ConstraintWidgetContainer();
    private final ArrayList<ConstraintWidget> mSizeDependentsWidgets = new ArrayList<>(100);
    int previousHeightMeasureSpec = -1;
    int previousPaddingLeft = -1;
    int previousPaddingTop = -1;
    int previousWidthMeasureSpec = -1;

    public ConstraintLayout(Context context) {
        super(context);
        init();
    }

    public ConstraintLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ConstraintLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        this.mLayoutWidget.setCompanionWidget(this);
        this.mChildrenByIds.put(getId(), this);
    }

    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(child);
        }
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        ConstraintWidget widget = getViewWidget(view);
        if ((view instanceof Guideline) && !(widget instanceof Guideline)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.widget = new Guideline();
            layoutParams.isGuideline = SIMPLE_LAYOUT;
            widget = layoutParams.widget;
        }
        ConstraintWidgetContainer container = this.mLayoutWidget;
        widget.setCompanionWidget(view);
        this.mChildrenByIds.put(view.getId(), view);
        container.add(widget);
        widget.setParent(container);
        updateHierarchy();
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.remove(getViewWidget(view));
        updateHierarchy();
    }

    private void updateHierarchy() {
        int count = getChildCount();
        boolean recompute = false;
        int i = 0;
        while (true) {
            if (i >= count) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                recompute = SIMPLE_LAYOUT;
                break;
            } else {
                i++;
            }
        }
        if (recompute) {
            this.mSizeDependentsWidgets.clear();
            setChildrenConstraints();
        }
    }

    /* access modifiers changed from: package-private */
    public void setChildrenConstraints() {
        ConstraintWidget target;
        ConstraintWidget target2;
        ConstraintWidget target3;
        ConstraintWidget target4;
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            ConstraintWidget widget = getViewWidget(child);
            if (widget != null) {
                LayoutParams layoutParams = (LayoutParams) child.getLayoutParams();
                widget.reset();
                widget.setParent(this.mLayoutWidget);
                widget.setVisibility(child.getVisibility());
                widget.setCompanionWidget(child);
                if (!layoutParams.verticalLock || !layoutParams.horizontalLock) {
                    this.mSizeDependentsWidgets.add(widget);
                }
                if (layoutParams.isGuideline) {
                    Guideline guideline = (Guideline) widget;
                    if (layoutParams.guideBegin != -1) {
                        guideline.setGuideBegin(layoutParams.guideBegin);
                    }
                    if (layoutParams.guideEnd != -1) {
                        guideline.setGuideEnd(layoutParams.guideEnd);
                    }
                    if (layoutParams.guidePercent != -1.0f) {
                        guideline.setGuidePercent(layoutParams.guidePercent);
                    }
                    if (layoutParams.orientation == LayoutParams.VERTICAL) {
                        guideline.setOrientation(1);
                    } else {
                        guideline.setOrientation(0);
                    }
                } else if (layoutParams.leftToLeft != LayoutParams.UNSET || layoutParams.leftToRight != LayoutParams.UNSET || layoutParams.rightToLeft != LayoutParams.UNSET || layoutParams.rightToRight != LayoutParams.UNSET || layoutParams.topToTop != LayoutParams.UNSET || layoutParams.topToBottom != LayoutParams.UNSET || layoutParams.bottomToTop != LayoutParams.UNSET || layoutParams.bottomToBottom != LayoutParams.UNSET || layoutParams.baselineToBaseline != LayoutParams.UNSET || layoutParams.editorAbsoluteX != LayoutParams.UNSET || layoutParams.editorAbsoluteY != LayoutParams.UNSET) {
                    if (layoutParams.width == -1) {
                        layoutParams.horizontalLock = false;
                    }
                    if (layoutParams.height == -1) {
                        layoutParams.verticalLock = false;
                    }
                    if (layoutParams.leftToLeft != LayoutParams.UNSET) {
                        ConstraintWidget target5 = getTargetWidget(layoutParams.leftToLeft);
                        if (target5 != null) {
                            widget.immediateConnect(ConstraintAnchor.Type.LEFT, target5, ConstraintAnchor.Type.LEFT, layoutParams.leftMargin);
                        }
                    } else if (!(layoutParams.leftToRight == LayoutParams.UNSET || (target = getTargetWidget(layoutParams.leftToRight)) == null)) {
                        widget.immediateConnect(ConstraintAnchor.Type.LEFT, target, ConstraintAnchor.Type.RIGHT, layoutParams.leftMargin);
                    }
                    if (layoutParams.rightToLeft != LayoutParams.UNSET) {
                        ConstraintWidget target6 = getTargetWidget(layoutParams.rightToLeft);
                        if (target6 != null) {
                            widget.immediateConnect(ConstraintAnchor.Type.RIGHT, target6, ConstraintAnchor.Type.LEFT, layoutParams.rightMargin);
                        }
                    } else if (!(layoutParams.rightToRight == LayoutParams.UNSET || (target2 = getTargetWidget(layoutParams.rightToRight)) == null)) {
                        widget.immediateConnect(ConstraintAnchor.Type.RIGHT, target2, ConstraintAnchor.Type.RIGHT, layoutParams.rightMargin);
                    }
                    if (layoutParams.topToTop != LayoutParams.UNSET) {
                        ConstraintWidget target7 = getTargetWidget(layoutParams.topToTop);
                        if (target7 != null) {
                            widget.immediateConnect(ConstraintAnchor.Type.TOP, target7, ConstraintAnchor.Type.TOP, layoutParams.topMargin);
                        }
                    } else if (!(layoutParams.topToBottom == LayoutParams.UNSET || (target3 = getTargetWidget(layoutParams.topToBottom)) == null)) {
                        widget.immediateConnect(ConstraintAnchor.Type.TOP, target3, ConstraintAnchor.Type.BOTTOM, layoutParams.topMargin);
                    }
                    if (layoutParams.bottomToTop != LayoutParams.UNSET) {
                        ConstraintWidget target8 = getTargetWidget(layoutParams.bottomToTop);
                        if (target8 != null) {
                            widget.immediateConnect(ConstraintAnchor.Type.BOTTOM, target8, ConstraintAnchor.Type.TOP, layoutParams.bottomMargin);
                        }
                    } else if (!(layoutParams.bottomToBottom == LayoutParams.UNSET || (target4 = getTargetWidget(layoutParams.bottomToBottom)) == null)) {
                        widget.immediateConnect(ConstraintAnchor.Type.BOTTOM, target4, ConstraintAnchor.Type.BOTTOM, layoutParams.bottomMargin);
                    }
                    if (layoutParams.baselineToBaseline != LayoutParams.UNSET) {
                        View view = this.mChildrenByIds.get(layoutParams.baselineToBaseline);
                        ConstraintWidget target9 = getTargetWidget(layoutParams.baselineToBaseline);
                        if (target9 != null) {
                            layoutParams.needsBaseline = SIMPLE_LAYOUT;
                            ((LayoutParams) view.getLayoutParams()).needsBaseline = SIMPLE_LAYOUT;
                            widget.getAnchor(ConstraintAnchor.Type.BASELINE).connect(target9.getAnchor(ConstraintAnchor.Type.BASELINE), 0, ConstraintAnchor.Strength.STRONG, 0, SIMPLE_LAYOUT);
                            widget.getAnchor(ConstraintAnchor.Type.TOP).reset();
                            widget.getAnchor(ConstraintAnchor.Type.BOTTOM).reset();
                        }
                    }
                    if (layoutParams.horizontalBias >= 0.0f && layoutParams.horizontalBias != 0.5f) {
                        widget.setHorizontalBiasPercent(layoutParams.horizontalBias);
                    }
                    if (layoutParams.verticalBias >= 0.0f && layoutParams.verticalBias != 0.5f) {
                        widget.setVerticalBiasPercent(layoutParams.verticalBias);
                    }
                    if (!layoutParams.horizontalLock) {
                        widget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.ANY);
                        widget.setWidth(0);
                        if (layoutParams.width == -1) {
                            widget.setWidth(this.mLayoutWidget.getWidth());
                        }
                    } else {
                        widget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                        widget.setWidth(layoutParams.width);
                    }
                    if (!layoutParams.verticalLock) {
                        widget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.ANY);
                        widget.setHeight(0);
                        if (layoutParams.height == -1) {
                            widget.setWidth(this.mLayoutWidget.getHeight());
                        }
                    } else {
                        widget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                        widget.setHeight(layoutParams.height);
                    }
                    if (isInEditMode() && !(layoutParams.editorAbsoluteX == LayoutParams.UNSET && layoutParams.editorAbsoluteY == LayoutParams.UNSET)) {
                        widget.setOrigin(layoutParams.editorAbsoluteX, layoutParams.editorAbsoluteY);
                    }
                    if (layoutParams.dimensionRatio > 0.0f) {
                        widget.setDimensionRatio(layoutParams.dimensionRatio);
                    }
                }
            }
        }
    }

    private final ConstraintWidget getTargetWidget(int id) {
        if (id == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(id);
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).widget;
    }

    private final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).widget;
    }

    /* access modifiers changed from: package-private */
    public void internalMeasureChildren(int parentWidthSpec, int parentHeightSpec) {
        int childWidthMeasureSpec;
        int childHeightMeasureSpec;
        int baseline;
        int heightPadding = getPaddingTop() + getPaddingBottom();
        int widthPadding = getPaddingLeft() + getPaddingRight();
        int widgetsCount = getChildCount();
        for (int i = 0; i < widgetsCount; i++) {
            View child = getChildAt(i);
            if (child.getVisibility() != 8) {
                LayoutParams params = (LayoutParams) child.getLayoutParams();
                ConstraintWidget widget = params.widget;
                if (!params.isGuideline) {
                    int width = params.width;
                    int height = params.height;
                    if (width == 0) {
                        childWidthMeasureSpec = getChildMeasureSpec(parentWidthSpec, widthPadding, -2);
                    } else {
                        childWidthMeasureSpec = getChildMeasureSpec(parentWidthSpec, widthPadding, width);
                    }
                    if (height == 0) {
                        childHeightMeasureSpec = getChildMeasureSpec(parentHeightSpec, heightPadding, -2);
                    } else {
                        childHeightMeasureSpec = getChildMeasureSpec(parentHeightSpec, heightPadding, height);
                    }
                    child.measure(childWidthMeasureSpec, childHeightMeasureSpec);
                    int width2 = child.getMeasuredWidth();
                    int height2 = child.getMeasuredHeight();
                    widget.setWidth(width2);
                    widget.setHeight(height2);
                    if (params.needsBaseline && (baseline = child.getBaseline()) != -1) {
                        widget.setBaselineDistance(baseline);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        View child;
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            updateHierarchy();
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (this.previousPaddingLeft == -1 || this.previousPaddingTop == -1 || this.previousHeightMeasureSpec == -1 || this.previousWidthMeasureSpec == -1 || this.previousPaddingLeft != paddingLeft || this.previousPaddingTop != paddingTop || this.previousWidthMeasureSpec != widthMeasureSpec || this.previousHeightMeasureSpec != heightMeasureSpec) {
            this.mLayoutWidget.setX(paddingLeft);
            this.mLayoutWidget.setY(paddingTop);
            setSelfDimensionBehaviour(widthMeasureSpec, heightMeasureSpec);
        }
        this.previousPaddingLeft = paddingLeft;
        this.previousPaddingTop = paddingTop;
        this.previousWidthMeasureSpec = widthMeasureSpec;
        this.previousHeightMeasureSpec = heightMeasureSpec;
        internalMeasureChildren(widthMeasureSpec, heightMeasureSpec);
        solveLinearSystem();
        int childState = 0;
        int sizeDependentWidgetsCount = this.mSizeDependentsWidgets.size();
        int heightPadding = paddingTop + getPaddingBottom();
        int widthPadding = paddingLeft + getPaddingRight();
        if (sizeDependentWidgetsCount > 0) {
            for (int i = 0; i < sizeDependentWidgetsCount; i++) {
                ConstraintWidget widget = this.mSizeDependentsWidgets.get(i);
                if (!(widget instanceof Guideline) && (child = (View) widget.getCompanionWidget()) != null) {
                    int widthSpec = View.MeasureSpec.makeMeasureSpec(widget.getWidth(), 1073741824);
                    int heightSpec = View.MeasureSpec.makeMeasureSpec(widget.getHeight(), 1073741824);
                    ViewGroup.LayoutParams lp = child.getLayoutParams();
                    if (lp.width == -2) {
                        widthSpec = getChildMeasureSpec(widthMeasureSpec, widthPadding, lp.width);
                    }
                    if (lp.height == -2) {
                        heightSpec = getChildMeasureSpec(heightMeasureSpec, heightPadding, lp.height);
                    }
                    child.measure(widthSpec, heightSpec);
                    int width = child.getMeasuredWidth();
                    int height = child.getMeasuredHeight();
                    widget.setWidth(width);
                    widget.setHeight(height);
                    if (Build.VERSION.SDK_INT >= 11) {
                        childState = combineMeasuredStates(childState, child.getMeasuredState());
                    }
                }
            }
            solveLinearSystem();
        }
        int androidLayoutWidth = this.mLayoutWidget.getWidth() + widthPadding;
        int androidLayoutHeight = this.mLayoutWidget.getHeight() + heightPadding;
        if (Build.VERSION.SDK_INT >= 11) {
            setMeasuredDimension(16777215 & resolveSizeAndState(androidLayoutWidth, widthMeasureSpec, childState), 16777215 & resolveSizeAndState(androidLayoutHeight, heightMeasureSpec, childState << 16));
            return;
        }
        setMeasuredDimension(androidLayoutWidth, androidLayoutHeight);
    }

    /* access modifiers changed from: package-private */
    public void setSelfDimensionBehaviour(int widthMeasureSpec, int heightMeasureSpec) {
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        int heightPadding = getPaddingTop() + getPaddingBottom();
        int widthPadding = getPaddingLeft() + getPaddingRight();
        ConstraintWidget.DimensionBehaviour widthBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour heightBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        int desiredWidth = 0;
        int desiredHeight = 0;
        ViewGroup.LayoutParams params = getLayoutParams();
        switch (widthMode) {
            case Integer.MIN_VALUE:
                widthBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                break;
            case 0:
                if (params.width <= 0) {
                    widthBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    break;
                } else {
                    desiredWidth = params.width;
                    break;
                }
            case 1073741824:
                desiredWidth = widthSize - widthPadding;
                break;
        }
        switch (heightMode) {
            case Integer.MIN_VALUE:
                heightBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                break;
            case 0:
                if (params.height <= 0) {
                    heightBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    break;
                } else {
                    desiredHeight = params.height;
                    break;
                }
            case 1073741824:
                desiredHeight = heightSize - heightPadding;
                break;
        }
        this.mLayoutWidget.setHorizontalDimensionBehaviour(widthBehaviour);
        this.mLayoutWidget.setWidth(desiredWidth);
        this.mLayoutWidget.setVerticalDimensionBehaviour(heightBehaviour);
        this.mLayoutWidget.setHeight(desiredHeight);
    }

    private void solveLinearSystem() {
        Animator.setAnimationEnabled(false);
        this.mLayoutWidget.layout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int widgetsCount = getChildCount();
        for (int i = 0; i < widgetsCount; i++) {
            View child = getChildAt(i);
            ConstraintWidget widget = ((LayoutParams) child.getLayoutParams()).widget;
            int l = widget.getDrawX();
            int t = widget.getDrawY();
            child.layout(l, t, l + widget.getWidth(), t + widget.getHeight());
        }
    }

    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new LayoutParams(p);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof LayoutParams;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static int HORIZONTAL = 0;
        public static final int PARENT_ID = 0;
        public static int UNSET = -1;
        public static int VERTICAL = 1;
        public int baselineToBaseline = UNSET;
        public int bottomToBottom = UNSET;
        public int bottomToTop = UNSET;
        public float dimensionRatio = 0.0f;
        public int editorAbsoluteX = UNSET;
        public int editorAbsoluteY = UNSET;
        public int endToEnd = UNSET;
        public int endToStart = UNSET;
        public int guideBegin = UNSET;
        public int guideEnd = UNSET;
        public float guidePercent = ((float) UNSET);
        public float horizontalBias = 0.5f;
        boolean horizontalLock = ConstraintLayout.SIMPLE_LAYOUT;
        public boolean isGuideline = false;
        public int leftToLeft = UNSET;
        public int leftToRight = UNSET;
        public boolean needsBaseline = false;
        public int orientation = UNSET;
        int originalLeftToLeft = UNSET;
        int originalLeftToRight = UNSET;
        int originalRightToLeft = UNSET;
        int originalRightToRight = UNSET;
        public int rightToLeft = UNSET;
        public int rightToRight = UNSET;
        public int startToEnd = UNSET;
        public int startToStart = UNSET;
        public int topToBottom = UNSET;
        public int topToTop = UNSET;
        public float verticalBias = 0.5f;
        boolean verticalLock = ConstraintLayout.SIMPLE_LAYOUT;
        ConstraintWidget widget = new ConstraintWidget();

        public LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
            int colonIndex;
            TypedArray a = c.obtainStyledAttributes(attrs, C0002R.styleable.ConstraintLayout_Layout);
            int N = a.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a.getIndex(i);
                if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf) {
                    this.leftToLeft = a.getResourceId(attr, this.leftToLeft);
                    if (this.leftToLeft == UNSET) {
                        this.leftToLeft = a.getInt(attr, UNSET);
                    }
                    this.originalLeftToLeft = this.leftToLeft;
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf) {
                    this.leftToRight = a.getResourceId(attr, this.leftToRight);
                    if (this.leftToRight == UNSET) {
                        this.leftToRight = a.getInt(attr, UNSET);
                    }
                    this.originalLeftToRight = this.leftToRight;
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf) {
                    this.rightToLeft = a.getResourceId(attr, this.rightToLeft);
                    if (this.rightToLeft == UNSET) {
                        this.rightToLeft = a.getInt(attr, UNSET);
                    }
                    this.originalRightToLeft = this.rightToLeft;
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf) {
                    this.rightToRight = a.getResourceId(attr, this.rightToRight);
                    if (this.rightToRight == UNSET) {
                        this.rightToRight = a.getInt(attr, UNSET);
                    }
                    this.originalRightToRight = this.rightToRight;
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf) {
                    this.topToTop = a.getResourceId(attr, this.topToTop);
                    if (this.topToTop == UNSET) {
                        this.topToTop = a.getInt(attr, UNSET);
                    }
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf) {
                    this.topToBottom = a.getResourceId(attr, this.topToBottom);
                    if (this.topToBottom == UNSET) {
                        this.topToBottom = a.getInt(attr, UNSET);
                    }
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf) {
                    this.bottomToTop = a.getResourceId(attr, this.bottomToTop);
                    if (this.bottomToTop == UNSET) {
                        this.bottomToTop = a.getInt(attr, UNSET);
                    }
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf) {
                    this.bottomToBottom = a.getResourceId(attr, this.bottomToBottom);
                    if (this.bottomToBottom == UNSET) {
                        this.bottomToBottom = a.getInt(attr, UNSET);
                    }
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf) {
                    this.baselineToBaseline = a.getResourceId(attr, this.baselineToBaseline);
                    if (this.baselineToBaseline == UNSET) {
                        this.baselineToBaseline = a.getInt(attr, UNSET);
                    }
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX) {
                    this.editorAbsoluteX = a.getDimensionPixelOffset(attr, this.editorAbsoluteX);
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY) {
                    this.editorAbsoluteY = a.getDimensionPixelOffset(attr, this.editorAbsoluteY);
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin) {
                    this.guideBegin = a.getDimensionPixelOffset(attr, this.guideBegin);
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end) {
                    this.guideEnd = a.getDimensionPixelOffset(attr, this.guideEnd);
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent) {
                    this.guidePercent = a.getFloat(attr, this.guidePercent);
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_android_orientation) {
                    this.orientation = a.getInt(attr, this.orientation);
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf) {
                    this.startToEnd = a.getResourceId(attr, this.startToEnd);
                    if (this.startToEnd == UNSET) {
                        this.startToEnd = a.getInt(attr, UNSET);
                    }
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf) {
                    this.startToStart = a.getResourceId(attr, this.startToStart);
                    if (this.startToStart == UNSET) {
                        this.startToStart = a.getInt(attr, UNSET);
                    }
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf) {
                    this.endToStart = a.getResourceId(attr, this.endToStart);
                    if (this.endToStart == UNSET) {
                        this.endToStart = a.getInt(attr, UNSET);
                    }
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf) {
                    this.endToEnd = a.getResourceId(attr, this.endToEnd);
                    if (this.endToEnd == UNSET) {
                        this.endToEnd = a.getInt(attr, UNSET);
                    }
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias) {
                    this.horizontalBias = a.getFloat(attr, this.horizontalBias);
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias) {
                    this.verticalBias = a.getFloat(attr, this.verticalBias);
                } else if (attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio) {
                    String ratio = a.getString(attr);
                    if (ratio != null && (colonIndex = ratio.indexOf(58)) >= 0 && colonIndex < ratio.length() - 1) {
                        String nominator = ratio.substring(0, colonIndex);
                        String denominator = ratio.substring(colonIndex + 1);
                        if (nominator.length() > 0 && denominator.length() > 0) {
                            try {
                                float nominatorValue = Float.parseFloat(nominator);
                                float denominatorValue = Float.parseFloat(denominator);
                                if (nominatorValue > 0.0f && denominatorValue > 0.0f) {
                                    this.dimensionRatio = Math.abs(nominatorValue / denominatorValue);
                                }
                            } catch (NumberFormatException e) {
                            }
                        }
                    }
                } else if (!(attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator || attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator || attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator || attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator || attr == C0002R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator)) {
                    Log.w(ConstraintLayout.TAG, "Unknown attribute 0x" + Integer.toHexString(attr));
                }
            }
            if (this.width == 0) {
                this.horizontalLock = false;
            }
            if (this.height == 0) {
                this.verticalLock = false;
            }
            if (this.guidePercent != ((float) UNSET) || this.guideBegin != UNSET || this.guideEnd != UNSET) {
                this.isGuideline = ConstraintLayout.SIMPLE_LAYOUT;
                this.horizontalLock = ConstraintLayout.SIMPLE_LAYOUT;
                this.verticalLock = ConstraintLayout.SIMPLE_LAYOUT;
                if (!(this.widget instanceof Guideline)) {
                    this.widget = new Guideline();
                }
            }
        }

        public LayoutParams(int width, int height) {
            super(width, height);
        }

        public LayoutParams(ViewGroup.LayoutParams source) {
            super(source);
        }

        /* access modifiers changed from: protected */
        public void setBaseAttributes(TypedArray a, int widthAttr, int heightAttr) {
            try {
                this.width = a.getLayoutDimension(widthAttr, "layout_width");
                this.height = a.getLayoutDimension(heightAttr, "layout_height");
            } catch (RuntimeException e) {
            }
        }

        @TargetApi(17)
        public void resolveLayoutDirection(int layoutDirection) {
            boolean isRtl = ConstraintLayout.SIMPLE_LAYOUT;
            super.resolveLayoutDirection(layoutDirection);
            this.rightToLeft = this.originalRightToLeft;
            this.rightToRight = this.originalRightToRight;
            this.leftToRight = this.originalLeftToRight;
            this.leftToLeft = this.originalLeftToLeft;
            if (1 != getLayoutDirection()) {
                isRtl = false;
            }
            if (isRtl) {
                if (this.startToEnd != UNSET) {
                    this.rightToLeft = this.startToEnd;
                }
                if (this.startToStart != UNSET) {
                    this.rightToRight = this.startToStart;
                }
                if (this.endToStart != UNSET) {
                    this.leftToRight = this.endToStart;
                }
                if (this.endToEnd != UNSET) {
                    this.leftToLeft = this.endToEnd;
                    return;
                }
                return;
            }
            if (this.startToEnd != UNSET) {
                this.leftToRight = this.startToEnd;
            }
            if (this.startToStart != UNSET) {
                this.leftToLeft = this.startToStart;
            }
            if (this.endToStart != UNSET) {
                this.rightToLeft = this.endToStart;
            }
            if (this.endToEnd != UNSET) {
                this.rightToRight = this.endToEnd;
            }
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.mDirtyHierarchy = SIMPLE_LAYOUT;
    }
}
