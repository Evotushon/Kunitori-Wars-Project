package com.google.android.gms.tagmanager;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@ShowFirstParty
@VisibleForTesting
class zzeh {
    private static zzeh zzaip;
    private volatile String zzaec = null;
    private volatile zza zzaiq = zza.NONE;
    private volatile String zzair = null;
    private volatile String zzais = null;

    enum zza {
        NONE,
        CONTAINER,
        CONTAINER_DEBUG
    }

    zzeh() {
    }

    @ShowFirstParty
    static zzeh zziy() {
        zzeh zzeh;
        synchronized (zzeh.class) {
            if (zzaip == null) {
                zzaip = new zzeh();
            }
            zzeh = zzaip;
        }
        return zzeh;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean zza(Uri uri) {
        try {
            String decode = URLDecoder.decode(uri.toString(), Constants.ENCODING);
            if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                String valueOf = String.valueOf(decode);
                zzdi.zzab(valueOf.length() != 0 ? "Container preview url: ".concat(valueOf) : new String("Container preview url: "));
                if (decode.matches(".*?&gtm_debug=x$")) {
                    this.zzaiq = zza.CONTAINER_DEBUG;
                } else {
                    this.zzaiq = zza.CONTAINER;
                }
                this.zzais = uri.getQuery().replace("&gtm_debug=x", "");
                if (this.zzaiq == zza.CONTAINER || this.zzaiq == zza.CONTAINER_DEBUG) {
                    String valueOf2 = String.valueOf(this.zzais);
                    this.zzair = valueOf2.length() != 0 ? "/r?".concat(valueOf2) : new String("/r?");
                }
                this.zzaec = zzbh(this.zzais);
                return true;
            } else if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                String valueOf3 = String.valueOf(decode);
                zzdi.zzac(valueOf3.length() != 0 ? "Invalid preview uri: ".concat(valueOf3) : new String("Invalid preview uri: "));
                return false;
            } else if (!zzbh(uri.getQuery()).equals(this.zzaec)) {
                return false;
            } else {
                String valueOf4 = String.valueOf(this.zzaec);
                zzdi.zzab(valueOf4.length() != 0 ? "Exit preview mode for container: ".concat(valueOf4) : new String("Exit preview mode for container: "));
                this.zzaiq = zza.NONE;
                this.zzair = null;
                return true;
            }
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final zza zziz() {
        return this.zzaiq;
    }

    /* access modifiers changed from: package-private */
    public final String zzja() {
        return this.zzair;
    }

    /* access modifiers changed from: package-private */
    public final String getContainerId() {
        return this.zzaec;
    }

    private static String zzbh(String str) {
        return str.split("&")[0].split("=")[1];
    }
}
