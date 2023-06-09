package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdq {
    private static final String[] zzwv = {"/aclk", "/pcs/click", "/dbm/clk"};
    private String zzwr = "googleads.g.doubleclick.net";
    private String zzws = "/pagead/ads";
    private String zzwt = "ad.doubleclick.net";
    private String[] zzwu = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private zzdg zzww;

    public zzdq(zzdg zzdg) {
        this.zzww = zzdg;
    }

    private final boolean zza(Uri uri) {
        if (uri != null) {
            try {
                return uri.getHost().equals(this.zzwt);
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw new NullPointerException();
        }
    }

    public final boolean zzb(Uri uri) {
        if (uri != null) {
            try {
                String host = uri.getHost();
                for (String endsWith : this.zzwu) {
                    if (host.endsWith(endsWith)) {
                        return true;
                    }
                }
            } catch (NullPointerException unused) {
            }
            return false;
        }
        throw new NullPointerException();
    }

    public final zzdg zzcb() {
        return this.zzww;
    }

    public final Uri zza(Uri uri, Context context) throws zzdt {
        return zza(uri, this.zzww.zzb(context));
    }

    public final void zza(MotionEvent motionEvent) {
        this.zzww.zza(motionEvent);
    }

    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws zzdt {
        try {
            return zza(uri, this.zzww.zza(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzdt("Provided Uri is not in a valid state");
        }
    }

    public final boolean zzc(Uri uri) {
        if (zzb(uri)) {
            for (String endsWith : zzwv) {
                if (uri.getPath().endsWith(endsWith)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final Uri zza(Uri uri, String str) throws zzdt {
        try {
            boolean zza = zza(uri);
            if (zza) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzdt("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new zzdt("Query parameter already exists: ms");
            }
            if (zza) {
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    return Uri.parse(uri2.substring(0, i) + "dc_ms" + "=" + str + ";" + uri2.substring(i));
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i2 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i2) + "ms" + "=" + str + "&" + uri3.substring(i2));
        } catch (UnsupportedOperationException unused) {
            throw new zzdt("Provided Uri is not in a valid state");
        }
    }
}
