package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbnw implements zzeej<zzdeq> {
    private final zzbnv zzfij;

    private zzbnw(zzbnv zzbnv) {
        this.zzfij = zzbnv;
    }

    public static zzbnw zzc(zzbnv zzbnv) {
        return new zzbnw(zzbnv);
    }

    public static zzdeq zzd(zzbnv zzbnv) {
        return (zzdeq) zzeep.zza(zzbnv.zzahm(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzd(this.zzfij);
    }
}
