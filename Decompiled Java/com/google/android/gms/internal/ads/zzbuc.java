package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbuc implements zzeej<zzbtl> {
    private final zzbtl zzflk;

    private zzbuc(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbuc zzu(zzbtl zzbtl) {
        return new zzbuc(zzbtl);
    }

    public final /* synthetic */ Object get() {
        zzbtl zzbtl = this.zzflk;
        if (zzbtl != null) {
            return (zzbtl) zzeep.zza(zzbtl, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
