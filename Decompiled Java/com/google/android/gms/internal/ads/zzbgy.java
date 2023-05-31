package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbgy implements zzeej<zzazo> {
    private final zzbgn zzeky;

    public zzbgy(zzbgn zzbgn) {
        this.zzeky = zzbgn;
    }

    public static zzazo zzb(zzbgn zzbgn) {
        return (zzazo) zzeep.zza(zzbgn.zzacw(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzb(this.zzeky);
    }
}
