package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.6.0 */
public final class zzdq {
    private final boolean zza;

    public zzdq(zzdt zzdt) {
        zzeb.zza(zzdt, (Object) "BuildInfo must be non-null");
        this.zza = !zzdt.zza();
    }

    public final boolean zza(String str) {
        zzeb.zza(str, (Object) "flagName must not be null");
        if (!this.zza) {
            return true;
        }
        return zzds.zza.zza().zza(str);
    }
}
