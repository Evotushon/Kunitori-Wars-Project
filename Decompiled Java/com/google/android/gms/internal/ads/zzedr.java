package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzedr extends zzedt implements zzbf {
    private String type;
    private long zzavf;
    private zzbi zzifg;
    private boolean zzifh;

    public zzedr(String str) {
        this.type = str;
    }

    public final void zza(zzbi zzbi) {
        this.zzifg = zzbi;
    }

    public final String getType() {
        return this.type;
    }

    public final void zza(zzedv zzedv, ByteBuffer byteBuffer, long j, zzbe zzbe) throws IOException {
        this.zzavf = zzedv.position() - ((long) byteBuffer.remaining());
        this.zzifh = byteBuffer.remaining() == 16;
        zza(zzedv, j, zzbe);
    }

    public final void zza(zzedv zzedv, long j, zzbe zzbe) throws IOException {
        this.zzifn = zzedv;
        this.zzifs = zzedv.position();
        this.zzbcq = this.zzifs - ((long) ((this.zzifh || 8 + j >= 4294967296L) ? 16 : 8));
        zzedv.zzfc(zzedv.position() + j);
        this.zzare = zzedv.position();
        this.zzifq = zzbe;
    }
}
