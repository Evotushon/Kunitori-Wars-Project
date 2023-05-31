package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzsm extends PushbackInputStream {
    private final /* synthetic */ zzsh zzbsj;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzsm(zzsh zzsh, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zzbsj = zzsh;
    }

    public final synchronized void close() throws IOException {
        this.zzbsj.zzbsc.disconnect();
        super.close();
    }
}
