package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzio {
    private int flags;

    public void clear() {
        this.flags = 0;
    }

    public final boolean zzgc() {
        return zzx(Integer.MIN_VALUE);
    }

    public final boolean zzgd() {
        return zzx(4);
    }

    public final boolean zzge() {
        return zzx(1);
    }

    public final void setFlags(int i) {
        this.flags = i;
    }

    public final void zzw(int i) {
        this.flags |= Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public final boolean zzx(int i) {
        return (this.flags & i) == i;
    }
}
