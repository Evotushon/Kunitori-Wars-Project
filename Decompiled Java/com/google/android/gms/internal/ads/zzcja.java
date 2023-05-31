package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcja implements zzdnu<zzdeq> {
    private final /* synthetic */ zzciz zzfyc;

    zzcja(zzciz zzciz) {
        this.zzfyc = zzciz;
    }

    public final void zzb(Throwable th) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcre)).booleanValue()) {
            Matcher matcher = zzciz.zzfyb.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zzfyc.zzfya.zzdk(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzdeq zzdeq = (zzdeq) obj;
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcre)).booleanValue()) {
            this.zzfyc.zzfya.zzdk(zzdeq.zzgqm.zzgqj.responseCode);
            this.zzfyc.zzfya.zzeq(zzdeq.zzgqm.zzgqj.zzfzs);
        }
    }
}
