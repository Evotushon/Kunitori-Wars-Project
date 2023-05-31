package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcad {
    private final zzbzh zzfod;
    private final zzccv zzfqy;
    private final zzceb zzfrh;
    private final zzbkk zzfri;
    private final Context zzur;

    public zzcad(Context context, zzceb zzceb, zzccv zzccv, zzbkk zzbkk, zzbzh zzbzh) {
        this.zzur = context;
        this.zzfrh = zzceb;
        this.zzfqy = zzccv;
        this.zzfri = zzbkk;
        this.zzfod = zzbzh;
    }

    public final View zzalp() throws zzbei {
        zzbdv zza = this.zzfrh.zza(zzuk.zzh(this.zzur), false);
        zza.getView().setVisibility(8);
        zza.zza("/sendMessageToSdk", (zzafz<? super zzbdv>) new zzcac(this));
        zza.zza("/adMuted", (zzafz<? super zzbdv>) new zzcaf(this));
        this.zzfqy.zza(new WeakReference(zza), "/loadHtml", new zzcae(this));
        this.zzfqy.zza(new WeakReference(zza), "/showOverlay", new zzcah(this));
        this.zzfqy.zza(new WeakReference(zza), "/hideOverlay", new zzcag(this));
        return zza.getView();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbdv zzbdv, Map map) {
        zzawf.zzez("Hiding native ads overlay.");
        zzbdv.getView().setVisibility(8);
        this.zzfri.zzbf(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzbdv zzbdv, Map map) {
        zzawf.zzez("Showing native ads overlay.");
        zzbdv.getView().setVisibility(0);
        this.zzfri.zzbf(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzfqy.zza("sendMessageToNativeJs", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbdv zzbdv, Map map) {
        this.zzfod.zzajt();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzbdv zzbdv, Map map) {
        this.zzfqy.zza("sendMessageToNativeJs", (Map<String, ?>) map);
    }
}
