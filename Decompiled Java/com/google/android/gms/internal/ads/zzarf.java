package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzarf {
    private float zzboq;
    private int zzdhj;
    private int zzdhk;
    private int zzdnm;
    private boolean zzdnn;
    private boolean zzdno;
    private int zzdnp;
    private int zzdnq;
    private int zzdnr;
    private String zzdns;
    private int zzdnt;
    private int zzdnu;
    private int zzdnv;
    private boolean zzdnw;
    private int zzdnx;
    private double zzdny;
    private boolean zzdnz;
    private String zzdoa;
    private String zzdob;
    private boolean zzdoc;
    private boolean zzdod;
    private String zzdoe;
    private boolean zzdof;
    private final boolean zzdog;
    private boolean zzdoh;
    private String zzdoi;
    private String zzdoj;
    private String zzdok;
    private boolean zzdol;

    public zzarf(Context context) {
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        zzv(context);
        zzw(context);
        zzx(context);
        Locale locale = Locale.getDefault();
        boolean z = true;
        this.zzdoc = zza(packageManager, "geo:0,0?q=donuts") != null;
        this.zzdod = zza(packageManager, "http://www.google.com") == null ? false : z;
        this.zzdoe = locale.getCountry();
        zzvh.zzoz();
        this.zzdof = zzayx.zzxi();
        this.zzdog = DeviceProperties.isLatchsky(context);
        this.zzdoh = DeviceProperties.isSidewinder(context);
        this.zzdoi = locale.getLanguage();
        this.zzdoj = zza(context, packageManager);
        this.zzdok = zzy(context);
        Resources resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.zzboq = displayMetrics.density;
            this.zzdhj = displayMetrics.widthPixels;
            this.zzdhk = displayMetrics.heightPixels;
        }
    }

    public zzarf(Context context, zzarg zzarg) {
        zzv(context);
        zzw(context);
        zzx(context);
        this.zzdoa = Build.FINGERPRINT;
        this.zzdob = Build.DEVICE;
        this.zzdol = PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzaau.zzl(context);
        this.zzdoc = zzarg.zzdoc;
        this.zzdod = zzarg.zzdod;
        this.zzdoe = zzarg.zzdoe;
        this.zzdof = zzarg.zzdof;
        this.zzdog = zzarg.zzdog;
        this.zzdoh = zzarg.zzdoh;
        this.zzdoi = zzarg.zzdoi;
        this.zzdoj = zzarg.zzdoj;
        this.zzdok = zzarg.zzdok;
        this.zzboq = zzarg.zzboq;
        this.zzdhj = zzarg.zzdhj;
        this.zzdhk = zzarg.zzdhk;
    }

    private final void zzv(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.zzdnm = audioManager.getMode();
                this.zzdnn = audioManager.isMusicActive();
                this.zzdno = audioManager.isSpeakerphoneOn();
                this.zzdnp = audioManager.getStreamVolume(3);
                this.zzdnq = audioManager.getRingerMode();
                this.zzdnr = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzq.zzkz().zza(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.zzdnm = -2;
        this.zzdnn = false;
        this.zzdno = false;
        this.zzdnp = 0;
        this.zzdnq = 2;
        this.zzdnr = 0;
    }

    @TargetApi(16)
    private final void zzw(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.zzdns = telephonyManager.getNetworkOperator();
        this.zzdnu = telephonyManager.getNetworkType();
        this.zzdnv = telephonyManager.getPhoneType();
        this.zzdnt = -2;
        this.zzdnw = false;
        this.zzdnx = -1;
        zzq.zzkv();
        if (zzawo.zzq(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.zzdnt = activeNetworkInfo.getType();
                this.zzdnx = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.zzdnt = -1;
            }
            this.zzdnw = connectivityManager.isActiveNetworkMetered();
        }
    }

    private final void zzx(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            this.zzdny = (double) (((float) registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.zzdnz = z;
            return;
        }
        this.zzdny = -1.0d;
        this.zzdnz = false;
    }

    private static String zzy(Context context) {
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.vending", 128);
            if (packageInfo != null) {
                int i = packageInfo.versionCode;
                String str = packageInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String zza(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo zza = zza(packageManager, "market://details?id=com.google.android.gms.ads");
        if (zza == null || (activityInfo = zza.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
            if (packageInfo != null) {
                int i = packageInfo.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private static ResolveInfo zza(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzq.zzkz().zza(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final zzarg zzul() {
        return new zzarg(this.zzdnm, this.zzdoc, this.zzdod, this.zzdns, this.zzdoe, this.zzdof, this.zzdog, this.zzdoh, this.zzdnn, this.zzdno, this.zzdoi, this.zzdoj, this.zzdok, this.zzdnp, this.zzdnt, this.zzdnu, this.zzdnv, this.zzdnq, this.zzdnr, this.zzboq, this.zzdhj, this.zzdhk, this.zzdny, this.zzdnz, this.zzdnw, this.zzdnx, this.zzdoa, this.zzdol, this.zzdob);
    }
}
