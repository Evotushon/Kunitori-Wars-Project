package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.zzq;
import java.io.InputStream;
import java.util.Map;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzawu {
    public String getDefaultUserAgent(Context context) {
        return "";
    }

    public boolean isAttachedToWindow(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public boolean zza(Activity activity, Configuration configuration) {
        return false;
    }

    public void zzbf(Context context) {
    }

    public void zzg(Activity activity) {
    }

    public int zzwt() {
        return 5;
    }

    public int zzww() {
        return 1;
    }

    public long zzwx() {
        return -1;
    }

    public boolean zza(Context context, WebSettings webSettings) {
        zzayp.zza(context, new zzawt(context, webSettings));
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    public static boolean zza(zzbdv zzbdv) {
        if (zzbdv == null) {
            return false;
        }
        zzbdv.onPause();
        return true;
    }

    public static boolean zzb(zzbdv zzbdv) {
        if (zzbdv == null) {
            return false;
        }
        zzbdv.onResume();
        return true;
    }

    public zzbdy zza(zzbdv zzbdv, zzsn zzsn, boolean z) {
        return new zzbex(zzbdv, zzsn, z);
    }

    public ViewGroup.LayoutParams zzwu() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public Drawable zza(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public static boolean zzwv() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public CookieManager zzbg(Context context) {
        if (zzwv()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzawf.zzc("Failed to obtain CookieManager.", th);
            zzq.zzkz().zza(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public zztf zza(Context context, TelephonyManager telephonyManager) {
        return zztf.ENUM_UNKNOWN;
    }

    public int zza(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    public int zzb(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public WebResourceResponse zza(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    private zzawu() {
    }

    public static zzawu zzcr(int i) {
        if (i >= 28) {
            return new zzaxb();
        }
        if (i >= 26) {
            return new zzaxc();
        }
        if (i >= 24) {
            return new zzawz();
        }
        if (i >= 21) {
            return new zzaxa();
        }
        if (i >= 19) {
            return new zzawx();
        }
        if (i >= 18) {
            return new zzawy();
        }
        if (i >= 17) {
            return new zzawv();
        }
        return new zzawu();
    }
}
