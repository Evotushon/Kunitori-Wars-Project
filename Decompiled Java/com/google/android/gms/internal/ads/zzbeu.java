package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbeu implements zzbew {
    private final zzbdv zzeiw;

    zzbeu(zzbdv zzbdv) {
        this.zzeiw = zzbdv;
    }

    public final void zzh(Uri uri) {
        zzbfi zzaaf = this.zzeiw.zzaaf();
        if (zzaaf == null) {
            zzawf.zzey("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaaf.zzh(uri);
        }
    }
}
