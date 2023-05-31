package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdvz {
    private final zzdwm zzhmb;
    private final zzdwm zzhmc;

    public zzdvz(byte[] bArr, byte[] bArr2) {
        this.zzhmb = zzdwm.zzr(bArr);
        this.zzhmc = zzdwm.zzr(bArr2);
    }

    public final byte[] zzbac() {
        zzdwm zzdwm = this.zzhmb;
        if (zzdwm == null) {
            return null;
        }
        return zzdwm.getBytes();
    }

    public final byte[] zzbad() {
        zzdwm zzdwm = this.zzhmc;
        if (zzdwm == null) {
            return null;
        }
        return zzdwm.getBytes();
    }
}
