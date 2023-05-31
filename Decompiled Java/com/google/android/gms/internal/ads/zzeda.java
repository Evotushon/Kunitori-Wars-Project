package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzeda {
    protected volatile int zzhnu = -1;

    public void zza(zzecr zzecr) throws IOException {
    }

    /* access modifiers changed from: protected */
    public int zzon() {
        return 0;
    }

    public final int zzbda() {
        int zzon = zzon();
        this.zzhnu = zzon;
        return zzon;
    }

    public static final byte[] zzb(zzeda zzeda) {
        byte[] bArr = new byte[zzeda.zzbda()];
        try {
            zzecr zzq = zzecr.zzq(bArr, 0, bArr.length);
            zzeda.zza(zzq);
            zzq.zzbcc();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public String toString() {
        return zzecz.zza(this);
    }

    /* renamed from: zzbfq */
    public zzeda clone() throws CloneNotSupportedException {
        return (zzeda) super.clone();
    }
}
