package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final class zzdmn extends OutputStream {
    zzdmn() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    public final void write(int i) {
    }

    public final void write(byte[] bArr) {
        zzdlg.checkNotNull(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) {
        zzdlg.checkNotNull(bArr);
    }
}
