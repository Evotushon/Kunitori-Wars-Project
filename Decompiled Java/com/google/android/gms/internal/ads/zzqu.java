package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzqu {
    @VisibleForTesting
    private ByteArrayOutputStream zzbqt = new ByteArrayOutputStream(4096);
    @VisibleForTesting
    private Base64OutputStream zzbqu = new Base64OutputStream(this.zzbqt, 10);

    public final void write(byte[] bArr) throws IOException {
        this.zzbqu.write(bArr);
    }

    public final String toString() {
        try {
            this.zzbqu.close();
        } catch (IOException e) {
            zzawf.zzc("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.zzbqt.close();
            return this.zzbqt.toString();
        } catch (IOException e2) {
            zzawf.zzc("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.zzbqt = null;
            this.zzbqu = null;
        }
    }
}
