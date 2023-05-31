package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzciz extends zzcix {
    /* access modifiers changed from: private */
    public static final Pattern zzfyb = Pattern.compile("Received error HTTP response code: (.*)");
    private final ScheduledExecutorService zzfib;
    private final zzdeu zzfir;
    private final zzdoe zzfrv;
    private final zzcic zzfxz;
    /* access modifiers changed from: private */
    public final zzclk zzfya;

    zzciz(zzbsm zzbsm, zzdeu zzdeu, zzcic zzcic, zzdoe zzdoe, ScheduledExecutorService scheduledExecutorService, zzclk zzclk) {
        super(zzbsm);
        this.zzfir = zzdeu;
        this.zzfxz = zzcic;
        this.zzfrv = zzdoe;
        this.zzfib = scheduledExecutorService;
        this.zzfya = zzclk;
    }

    public final zzdof<zzdeq> zzb(zzaqx zzaqx) throws zzcid {
        zzdof<zzdeq> zzb = zzdnt.zzb(this.zzfxz.zze(zzaqx), new zzciy(this), (Executor) this.zzfrv);
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcpt)).booleanValue()) {
            zzb = zzdnt.zzb(zzdnt.zza(zzb, (long) ((Integer) zzvh.zzpd().zzd(zzzx.zzcpu)).intValue(), TimeUnit.SECONDS, this.zzfib), TimeoutException.class, zzcjb.zzblf, zzazq.zzdxp);
        }
        zzdnt.zza(zzb, new zzcja(this), zzazq.zzdxp);
        return zzb;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zzd(InputStream inputStream) throws Exception {
        return zzdnt.zzaj(new zzdeq(new zzdel(this.zzfir), zzdeo.zza(new InputStreamReader(inputStream))));
    }
}
