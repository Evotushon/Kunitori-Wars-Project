package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzbfa extends zzbdy {
    public zzbfa(zzbdv zzbdv, zzsn zzsn, boolean z) {
        super(zzbdv, zzsn, z);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final WebResourceResponse zza(WebView webView, String str, @Nullable Map<String, String> map) {
        String str2;
        if (!(webView instanceof zzbdv)) {
            zzawf.zzfa("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzbdv zzbdv = (zzbdv) webView;
        if (this.zzefw != null) {
            this.zzefw.zza(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzd(str, map);
        }
        if (zzbdv.zzaaf() != null) {
            zzbdv.zzaaf().zzts();
        }
        if (zzbdv.zzaad().zzaby()) {
            str2 = (String) zzvh.zzpd().zzd(zzzx.zzcig);
        } else if (zzbdv.zzaak()) {
            str2 = (String) zzvh.zzpd().zzd(zzzx.zzcif);
        } else {
            str2 = (String) zzvh.zzpd().zzd(zzzx.zzcie);
        }
        zzq.zzkv();
        return zzawo.zzd(zzbdv.getContext(), zzbdv.zzyw().zzbmj, str2);
    }
}
