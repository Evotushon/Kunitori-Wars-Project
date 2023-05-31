package com.google.android.gms.internal.ads;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzecx {
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    private static final Charset UTF_8 = Charset.forName(Constants.ENCODING);
    public static final Object zzhzz = new Object();

    public static void zza(zzect zzect, zzect zzect2) {
        if (zzect.zzhzu != null) {
            zzect2.zzhzu = (zzecv) zzect.zzhzu.clone();
        }
    }
}
