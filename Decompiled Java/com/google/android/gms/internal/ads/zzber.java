package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzbff;

@TargetApi(17)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzber<WebViewT extends zzbev & zzbfd & zzbff> {
    private final zzbew zzeit;
    private final WebViewT zzeiu;

    public static zzber<zzbdv> zzc(zzbdv zzbdv) {
        return new zzber<>(zzbdv, new zzbeu(zzbdv));
    }

    private zzber(WebViewT webviewt, zzbew zzbew) {
        this.zzeit = zzbew;
        this.zzeiu = webviewt;
    }

    @JavascriptInterface
    public final void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            zzawf.zzfa("URL is empty, ignoring message");
        } else {
            zzawo.zzdtx.post(new zzbet(this, str));
        }
    }

    @JavascriptInterface
    public final String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zzawf.zzee("Click string is empty, not proceeding.");
            return "";
        }
        zzdq zzaai = ((zzbfd) this.zzeiu).zzaai();
        if (zzaai == null) {
            zzawf.zzee("Signal utils is empty, ignoring.");
            return "";
        }
        zzdg zzcb = zzaai.zzcb();
        if (zzcb == null) {
            zzawf.zzee("Signals object is empty, ignoring.");
            return "";
        } else if (this.zzeiu.getContext() != null) {
            return zzcb.zza(this.zzeiu.getContext(), str, ((zzbff) this.zzeiu).getView(), this.zzeiu.zzys());
        } else {
            zzawf.zzee("Context is null, ignoring.");
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzfq(String str) {
        this.zzeit.zzh(Uri.parse(str));
    }
}
