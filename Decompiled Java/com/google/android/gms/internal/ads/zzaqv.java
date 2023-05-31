package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzaqv implements Runnable {
    private final OutputStream zzdmu;
    private final byte[] zzdmv;

    zzaqv(OutputStream outputStream, byte[] bArr) {
        this.zzdmu = outputStream;
        this.zzdmv = bArr;
    }

    public final void run() {
        zzaqw.zza(this.zzdmu, this.zzdmv);
    }
}
