package com.google.android.gms.internal.ads;

import com.adjust.sdk.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcm implements Runnable {
    private zzcm() {
    }

    public final void run() {
        try {
            MessageDigest unused = zzck.zzmt = MessageDigest.getInstance(Constants.MD5);
        } catch (NoSuchAlgorithmException unused2) {
        } finally {
            zzck.zzmw.countDown();
        }
    }
}
