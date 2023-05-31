package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzrq {
    @AppOpenAd.AppOpenAdOrientation
    private final int orientation;
    private final zzui zzabf;
    private final zzxr zzabh;
    private zzvx zzbrh;
    private final String zzbri;
    private final AppOpenAd.AppOpenAdLoadCallback zzbrj;
    private final zzall zzbrk = new zzall();
    private final Context zzur;

    public zzrq(Context context, String str, zzxr zzxr, @AppOpenAd.AppOpenAdOrientation int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzur = context;
        this.zzbri = str;
        this.zzabh = zzxr;
        this.orientation = i;
        this.zzbrj = appOpenAdLoadCallback;
        this.zzabf = zzui.zzcdb;
    }

    public final void zzms() {
        try {
            this.zzbrh = zzvh.zzpa().zza(this.zzur, zzuk.zzor(), this.zzbri, this.zzbrk);
            this.zzbrh.zza(new zzur(this.orientation));
            this.zzbrh.zza((zzrh) new zzre(this.zzbrj));
            this.zzbrh.zza(zzui.zza(this.zzur, this.zzabh));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }
}
