package jp.co.koeitecmo.ktgl.android.touch;

import android.view.View;

public final class Manager {
    public static final native View getView(short s);

    public static final native void initializeRegion(short s, float f, float f2, float f3, float f4, boolean z);

    public static final native void initializeRegionCoverParent(short s, boolean z);
}
