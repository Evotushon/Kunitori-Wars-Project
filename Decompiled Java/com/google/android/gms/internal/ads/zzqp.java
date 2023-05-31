package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzqp {
    @Nullable
    private static MessageDigest zzbqn;
    protected Object mLock = new Object();

    /* access modifiers changed from: package-private */
    public abstract byte[] zzbw(String str);

    /* access modifiers changed from: protected */
    @Nullable
    public final MessageDigest zzml() {
        synchronized (this.mLock) {
            if (zzbqn != null) {
                MessageDigest messageDigest = zzbqn;
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    zzbqn = MessageDigest.getInstance(Constants.MD5);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = zzbqn;
            return messageDigest2;
        }
    }
}
