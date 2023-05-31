package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzsw {
    private final byte[] zzbuo;
    private int zzbup;
    private int zzbuq;
    private final /* synthetic */ zzss zzbur;

    private zzsw(zzss zzss, byte[] bArr) {
        this.zzbur = zzss;
        this.zzbuo = bArr;
    }

    public final synchronized void zzdt() {
        try {
            if (this.zzbur.zzbum) {
                this.zzbur.zzbul.zzc(this.zzbuo);
                this.zzbur.zzbul.zzm(this.zzbup);
                this.zzbur.zzbul.zzn(this.zzbuq);
                this.zzbur.zzbul.zza((int[]) null);
                this.zzbur.zzbul.zzdt();
            }
        } catch (RemoteException e) {
            zzazh.zzb("Clearcut log failed", e);
        }
    }

    public final zzsw zzbq(int i) {
        this.zzbup = i;
        return this;
    }

    public final zzsw zzbr(int i) {
        this.zzbuq = i;
        return this;
    }
}
