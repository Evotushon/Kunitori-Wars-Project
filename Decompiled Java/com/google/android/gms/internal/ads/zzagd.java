package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzb;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbey;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzbff;
import java.net.URISyntaxException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzagd<T extends zzbev & zzbey & zzbfc & zzbfd & zzbff> implements zzafz<T> {
    private final zzc zzcyt;
    private final zzaom zzcyu;

    public zzagd(zzc zzc, zzaom zzaom) {
        this.zzcyt = zzc;
        this.zzcyu = zzaom;
    }

    private static boolean zzd(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int zze(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            zzq.zzkx();
            return 7;
        } else if ("l".equalsIgnoreCase(str)) {
            zzq.zzkx();
            return 6;
        } else if ("c".equalsIgnoreCase(str)) {
            return zzq.zzkx().zzwt();
        } else {
            return -1;
        }
    }

    private final void zzab(boolean z) {
        zzaom zzaom = this.zzcyu;
        if (zzaom != null) {
            zzaom.zzac(z);
        }
    }

    @VisibleForTesting
    static Uri zza(Context context, zzdq zzdq, Uri uri, View view, @Nullable Activity activity) {
        if (zzdq == null) {
            return uri;
        }
        try {
            if (zzdq.zzc(uri)) {
                return zzdq.zza(uri, context, view, activity);
            }
            return uri;
        } catch (zzdt unused) {
            return uri;
        } catch (Exception e) {
            zzq.zzkz().zza(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    @VisibleForTesting
    static Uri zzf(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            zzawf.zzc(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e);
        }
        return uri;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbev zzbev = (zzbev) obj;
        String zzb = zzaux.zzb((String) map.get("u"), zzbev.getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            zzawf.zzfa("Action missing from an open GMSG.");
            return;
        }
        zzc zzc = this.zzcyt;
        if (zzc != null && !zzc.zzjv()) {
            this.zzcyt.zzbr(zzb);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((zzbey) zzbev).zzaak()) {
                zzawf.zzfa("Cannot expand WebView that is already expanded.");
                return;
            }
            zzab(false);
            ((zzbfc) zzbev).zzc(zzd(map), zze(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            zzab(false);
            if (zzb != null) {
                ((zzbfc) zzbev).zza(zzd(map), zze(map), zzb);
            } else {
                ((zzbfc) zzbev).zza(zzd(map), zze(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if (!"app".equalsIgnoreCase(str) || !"true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzab(true);
            String str2 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    intent = Intent.parseUri(str2, 0);
                } catch (URISyntaxException e) {
                    String valueOf = String.valueOf(str2);
                    zzawf.zzc(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e);
                }
            }
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                if (!Uri.EMPTY.equals(data)) {
                    intent.setData(zzf(zza(zzbev.getContext(), ((zzbfd) zzbev).zzaai(), data, ((zzbff) zzbev).getView(), zzbev.zzys())));
                }
            }
            if (intent != null) {
                ((zzbfc) zzbev).zza(new zzb(intent));
                return;
            }
            if (!TextUtils.isEmpty(zzb)) {
                zzb = zzf(zza(zzbev.getContext(), ((zzbfd) zzbev).zzaai(), Uri.parse(zzb), ((zzbff) zzbev).getView(), zzbev.zzys())).toString();
            }
            ((zzbfc) zzbev).zza(new zzb((String) map.get("i"), zzb, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
        } else {
            zzab(true);
            if (TextUtils.isEmpty(zzb)) {
                zzawf.zzfa("Destination url cannot be empty.");
                return;
            }
            try {
                ((zzbfc) zzbev).zza(new zzb(new zzagc(zzbev.getContext(), ((zzbfd) zzbev).zzaai(), ((zzbff) zzbev).getView()).zzc(map)));
            } catch (ActivityNotFoundException e2) {
                zzawf.zzfa(e2.getMessage());
            }
        }
    }
}
