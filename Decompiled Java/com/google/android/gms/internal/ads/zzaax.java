package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class zzaax<T> {
    private final String zzcc;
    private final T zzcgl;
    private final int zzcti;

    public static zzaax<Boolean> zzf(String str, boolean z) {
        return new zzaax<>(str, Boolean.valueOf(z), zzaaz.zzctj);
    }

    public static zzaax<Long> zzb(String str, long j) {
        return new zzaax<>(str, Long.valueOf(j), zzaaz.zzctk);
    }

    public static zzaax<String> zzi(String str, String str2) {
        return new zzaax<>(str, str2, zzaaz.zzctm);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [int, java.lang.Integer] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected zzaax(java.lang.String r1, T r2, java.lang.Integer r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.zzcc = r1
            r0.zzcgl = r2
            r0.zzcti = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaax.<init>(java.lang.String, java.lang.Object, int):void");
    }

    public T get() {
        zzabx zzra = zzabw.zzra();
        if (zzra != null) {
            int i = zzaaw.zzcth[this.zzcti - 1];
            if (i == 1) {
                return zzra.zze(this.zzcc, ((Boolean) this.zzcgl).booleanValue());
            }
            if (i == 2) {
                return zzra.getLong(this.zzcc, ((Long) this.zzcgl).longValue());
            }
            if (i == 3) {
                return zzra.zza(this.zzcc, ((Double) this.zzcgl).doubleValue());
            }
            if (i == 4) {
                return zzra.get(this.zzcc, (String) this.zzcgl);
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException("Flag is not initialized.");
    }
}
