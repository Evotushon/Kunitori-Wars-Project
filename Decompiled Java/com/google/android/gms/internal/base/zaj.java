package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaj extends Drawable.ConstantState {
    int mChangingConfigurations;
    int zaoc;

    zaj(zaj zaj) {
        if (zaj != null) {
            this.mChangingConfigurations = zaj.mChangingConfigurations;
            this.zaoc = zaj.zaoc;
        }
    }

    public final Drawable newDrawable() {
        return new zaf(this);
    }

    public final int getChangingConfigurations() {
        return this.mChangingConfigurations;
    }
}
