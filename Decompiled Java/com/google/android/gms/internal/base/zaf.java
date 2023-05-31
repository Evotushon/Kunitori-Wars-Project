package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zaf extends Drawable implements Drawable.Callback {
    private int mAlpha;
    private int mFrom;
    private boolean zanf;
    private int zann;
    private long zano;
    private int zanp;
    private int zanq;
    private int zanr;
    private boolean zans;
    private zaj zant;
    private Drawable zanu;
    private Drawable zanv;
    private boolean zanw;
    private boolean zanx;
    private boolean zany;
    private int zanz;

    public zaf(Drawable drawable, Drawable drawable2) {
        this((zaj) null);
        drawable = drawable == null ? zah.zaoa : drawable;
        this.zanu = drawable;
        drawable.setCallback(this);
        zaj zaj = this.zant;
        zaj.zaoc = drawable.getChangingConfigurations() | zaj.zaoc;
        drawable2 = drawable2 == null ? zah.zaoa : drawable2;
        this.zanv = drawable2;
        drawable2.setCallback(this);
        zaj zaj2 = this.zant;
        zaj2.zaoc = drawable2.getChangingConfigurations() | zaj2.zaoc;
    }

    zaf(zaj zaj) {
        this.zann = 0;
        this.zanq = 255;
        this.mAlpha = 0;
        this.zanf = true;
        this.zant = new zaj(zaj);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.zant.mChangingConfigurations | this.zant.zaoc;
    }

    public final void setAlpha(int i) {
        if (this.mAlpha == this.zanq) {
            this.mAlpha = i;
        }
        this.zanq = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.zanu.setColorFilter(colorFilter);
        this.zanv.setColorFilter(colorFilter);
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.zanu.getIntrinsicWidth(), this.zanv.getIntrinsicWidth());
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.zanu.getIntrinsicHeight(), this.zanv.getIntrinsicHeight());
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.zanu.setBounds(rect);
        this.zanv.setBounds(rect);
    }

    public final Drawable.ConstantState getConstantState() {
        if (!canConstantState()) {
            return null;
        }
        this.zant.mChangingConfigurations = getChangingConfigurations();
        return this.zant;
    }

    public final int getOpacity() {
        if (!this.zany) {
            this.zanz = Drawable.resolveOpacity(this.zanu.getOpacity(), this.zanv.getOpacity());
            this.zany = true;
        }
        return this.zanz;
    }

    private final boolean canConstantState() {
        if (!this.zanw) {
            this.zanx = (this.zanu.getConstantState() == null || this.zanv.getConstantState() == null) ? false : true;
            this.zanw = true;
        }
        return this.zanx;
    }

    public final Drawable mutate() {
        if (!this.zans && super.mutate() == this) {
            if (canConstantState()) {
                this.zanu.mutate();
                this.zanv.mutate();
                this.zans = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    public final Drawable zacd() {
        return this.zanv;
    }

    public final void startTransition(int i) {
        this.mFrom = 0;
        this.zanp = this.zanq;
        this.mAlpha = 0;
        this.zanr = 250;
        this.zann = 1;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int i = this.zann;
        boolean z = true;
        if (i == 1) {
            this.zano = SystemClock.uptimeMillis();
            this.zann = 2;
            z = false;
        } else if (i == 2 && this.zano >= 0) {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.zano)) / ((float) this.zanr);
            if (uptimeMillis < 1.0f) {
                z = false;
            }
            if (z) {
                this.zann = 0;
            }
            this.mAlpha = (int) ((((float) this.zanp) * Math.min(uptimeMillis, 1.0f)) + 0.0f);
        }
        int i2 = this.mAlpha;
        boolean z2 = this.zanf;
        Drawable drawable = this.zanu;
        Drawable drawable2 = this.zanv;
        if (z) {
            if (!z2 || i2 == 0) {
                drawable.draw(canvas);
            }
            int i3 = this.zanq;
            if (i2 == i3) {
                drawable2.setAlpha(i3);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z2) {
            drawable.setAlpha(this.zanq - i2);
        }
        drawable.draw(canvas);
        if (z2) {
            drawable.setAlpha(this.zanq);
        }
        if (i2 > 0) {
            drawable2.setAlpha(i2);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.zanq);
        }
        invalidateSelf();
    }
}
