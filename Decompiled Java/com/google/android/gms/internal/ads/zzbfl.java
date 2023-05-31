package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbfl {
    public final int heightPixels;
    private final int type;
    public final int widthPixels;

    public static zzbfl zzb(zzuk zzuk) {
        if (zzuk.zzcdc) {
            return new zzbfl(3, 0, 0);
        }
        if (zzuk.zzcde) {
            return new zzbfl(2, 0, 0);
        }
        if (zzuk.zzbml) {
            return zzabv();
        }
        return zzq(zzuk.widthPixels, zzuk.heightPixels);
    }

    public static zzbfl zzabv() {
        return new zzbfl(0, 0, 0);
    }

    public static zzbfl zzq(int i, int i2) {
        return new zzbfl(1, i, i2);
    }

    public static zzbfl zzabw() {
        return new zzbfl(4, 0, 0);
    }

    public static zzbfl zzabx() {
        return new zzbfl(5, 0, 0);
    }

    private zzbfl(int i, int i2, int i3) {
        this.type = i;
        this.widthPixels = i2;
        this.heightPixels = i3;
    }

    public final boolean isFluid() {
        return this.type == 2;
    }

    public final boolean zzaby() {
        return this.type == 3;
    }

    public final boolean zzabz() {
        return this.type == 0;
    }

    public final boolean zzaca() {
        return this.type == 4;
    }

    public final boolean zzacb() {
        return this.type == 5;
    }
}
