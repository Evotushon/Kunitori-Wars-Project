package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzni {
    private zznh zzbem;

    public abstract zznk zza(zzhh[] zzhhArr, zzmu zzmu) throws zzgk;

    public abstract void zzd(Object obj);

    public final void zza(zznh zznh) {
        this.zzbem = zznh;
    }

    /* access modifiers changed from: protected */
    public final void invalidate() {
        zznh zznh = this.zzbem;
        if (zznh != null) {
            zznh.zzek();
        }
    }
}
