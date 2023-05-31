package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzaun implements zzauv {
    static final zzauv zzdqw = new zzaun();

    private zzaun() {
    }

    public final Object zzb(zzbgd zzbgd) {
        String currentScreenName = zzbgd.getCurrentScreenName();
        if (currentScreenName != null) {
            return currentScreenName;
        }
        String currentScreenClass = zzbgd.getCurrentScreenClass();
        return currentScreenClass != null ? currentScreenClass : "";
    }
}
