package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcrj implements zzeej<zzcrh> {
    private final zzcrh zzgey;

    private zzcrj(zzcrh zzcrh) {
        this.zzgey = zzcrh;
    }

    public static zzcrj zzd(zzcrh zzcrh) {
        return new zzcrj(zzcrh);
    }

    public final /* synthetic */ Object get() {
        zzcrh zzcrh = this.zzgey;
        if (zzcrh != null) {
            return (zzcrh) zzeep.zza(zzcrh, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
