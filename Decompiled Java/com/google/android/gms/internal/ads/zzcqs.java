package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzcqs extends zzalt {
    private final zzbrm zzfhv;
    private final zzbrc zzfil;
    private final zzbrv zzfmd;
    private final zzbqp zzfnf;
    private final zzbqg zzfng;
    private final zzbsy zzftt;
    private final zzbvk zzgeh;
    protected final zzbsu zzgei;

    public zzcqs(zzbqg zzbqg, zzbqp zzbqp, zzbrc zzbrc, zzbrm zzbrm, zzbsy zzbsy, zzbrv zzbrv, zzbvk zzbvk, zzbsu zzbsu) {
        this.zzfng = zzbqg;
        this.zzfnf = zzbqp;
        this.zzfil = zzbrc;
        this.zzfhv = zzbrm;
        this.zzftt = zzbsy;
        this.zzfmd = zzbrv;
        this.zzgeh = zzbvk;
        this.zzgei = zzbsu;
    }

    public final void onAdFailedToLoad(int i) {
    }

    public final void zza(zzadn zzadn, String str) {
    }

    public final void zza(zzalv zzalv) {
    }

    public void zza(zzass zzass) throws RemoteException {
    }

    public void zzb(Bundle bundle) throws RemoteException {
    }

    public void zzb(zzasq zzasq) {
    }

    public void zzco(int i) throws RemoteException {
    }

    public final void zzdk(String str) {
    }

    public void zzsy() throws RemoteException {
    }

    public final void onAdClicked() {
        this.zzfng.onAdClicked();
    }

    public final void onAdClosed() {
        this.zzfmd.zztj();
    }

    public final void onAdLeftApplication() {
        this.zzfil.onAdLeftApplication();
    }

    public final void onAdOpened() {
        this.zzfmd.zztk();
    }

    public final void onAppEvent(String str, String str2) {
        this.zzftt.onAppEvent(str, str2);
    }

    public final void onAdLoaded() {
        this.zzfhv.onAdLoaded();
    }

    public void onAdImpression() {
        this.zzfnf.onAdImpression();
        this.zzgei.zzaif();
    }

    public final void onVideoPause() {
        this.zzgeh.onVideoPause();
    }

    public void zzsx() {
        this.zzgeh.onVideoStart();
    }

    public void onVideoEnd() {
        this.zzgeh.onVideoEnd();
    }

    public final void onVideoPlay() throws RemoteException {
        this.zzgeh.onVideoPlay();
    }
}
