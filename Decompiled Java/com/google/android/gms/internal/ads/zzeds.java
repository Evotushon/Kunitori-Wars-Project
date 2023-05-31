package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzeds implements zzbf {
    private static zzeeb zzcr = zzeeb.zzn(zzeds.class);
    private String type;
    private long zzavf;
    private zzbi zzifg;
    boolean zzifi;
    private boolean zzifj;
    private ByteBuffer zzifk;
    private long zzifl;
    private long zzifm = -1;
    private zzedv zzifn;
    private ByteBuffer zzifo = null;

    private final synchronized void zzbgi() {
        if (!this.zzifj) {
            try {
                zzeeb zzeeb = zzcr;
                String valueOf = String.valueOf(this.type);
                zzeeb.zzhs(valueOf.length() != 0 ? "mem mapping ".concat(valueOf) : new String("mem mapping "));
                this.zzifk = this.zzifn.zzh(this.zzifl, this.zzifm);
                this.zzifj = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzg(ByteBuffer byteBuffer);

    protected zzeds(String str) {
        this.type = str;
        this.zzifj = true;
        this.zzifi = true;
    }

    public final void zza(zzedv zzedv, ByteBuffer byteBuffer, long j, zzbe zzbe) throws IOException {
        this.zzifl = zzedv.position();
        this.zzavf = this.zzifl - ((long) byteBuffer.remaining());
        this.zzifm = j;
        this.zzifn = zzedv;
        zzedv.zzfc(zzedv.position() + j);
        this.zzifj = false;
        this.zzifi = false;
        zzbgj();
    }

    public final synchronized void zzbgj() {
        zzbgi();
        zzeeb zzeeb = zzcr;
        String valueOf = String.valueOf(this.type);
        zzeeb.zzhs(valueOf.length() != 0 ? "parsing details of ".concat(valueOf) : new String("parsing details of "));
        if (this.zzifk != null) {
            ByteBuffer byteBuffer = this.zzifk;
            this.zzifi = true;
            byteBuffer.rewind();
            zzg(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzifo = byteBuffer.slice();
            }
            this.zzifk = null;
        }
    }

    public final String getType() {
        return this.type;
    }

    public final void zza(zzbi zzbi) {
        this.zzifg = zzbi;
    }
}
