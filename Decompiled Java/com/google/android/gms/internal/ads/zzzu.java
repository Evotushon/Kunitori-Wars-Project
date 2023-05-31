package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzzu implements zzabx {
    private final /* synthetic */ zzzt zzcgy;

    zzzu(zzzt zzzt) {
        this.zzcgy = zzzt;
    }

    public final Boolean zze(String str, boolean z) {
        return Boolean.valueOf(this.zzcgy.zzcgv.getBoolean(str, z));
    }

    public final Long getLong(String str, long j) {
        try {
            return Long.valueOf(this.zzcgy.zzcgv.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf((long) this.zzcgy.zzcgv.getInt(str, (int) j));
        }
    }

    public final Double zza(String str, double d) {
        return Double.valueOf((double) this.zzcgy.zzcgv.getFloat(str, (float) d));
    }

    public final String get(String str, String str2) {
        return this.zzcgy.zzcgv.getString(str, str2);
    }
}
