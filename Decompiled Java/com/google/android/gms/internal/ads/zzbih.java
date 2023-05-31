package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzbih {
    private zza zzfcr;

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static abstract class zza {
        public abstract zzbdi zzadc();

        public abstract zzbaw zzadd();

        public abstract zzss zzade();

        public abstract zzaud zzadf();

        public abstract zzapm zzadg();
    }

    public zzbih(zza zza2) {
        this.zzfcr = zza2;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzaue, com.google.android.gms.internal.ads.zzaty] */
    public final com.google.android.gms.ads.internal.zza zzafj() {
        zza zza2 = this.zzfcr;
        return new com.google.android.gms.ads.internal.zza(zza2.zzadc(), zza2.zzadd(), new zzaty(zza2.zzadf()), zza2.zzade(), zza2.zzadg());
    }

    public final zzaud zzadf() {
        return this.zzfcr.zzadf();
    }

    public final zzapm zzadg() {
        return this.zzfcr.zzadg();
    }
}
