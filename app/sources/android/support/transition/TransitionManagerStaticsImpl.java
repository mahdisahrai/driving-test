package android.support.transition;

import android.view.ViewGroup;

abstract class TransitionManagerStaticsImpl {
    public abstract void beginDelayedTransition(ViewGroup viewGroup);

    public abstract void beginDelayedTransition(ViewGroup viewGroup, TransitionImpl transitionImpl);

    /* renamed from: go */
    public abstract void mo1643go(SceneImpl sceneImpl);

    /* renamed from: go */
    public abstract void mo1644go(SceneImpl sceneImpl, TransitionImpl transitionImpl);

    TransitionManagerStaticsImpl() {
    }
}
