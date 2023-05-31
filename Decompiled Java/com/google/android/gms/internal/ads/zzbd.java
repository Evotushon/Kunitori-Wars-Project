package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzbd extends zzedt implements Closeable {
    private static zzeeb zzcr = zzeeb.zzn(zzbd.class);

    public zzbd(zzedv zzedv, zzbe zzbe) throws IOException {
        zza(zzedv, zzedv.size(), zzbe);
    }

    public void close() throws IOException {
        this.zzifn.close();
    }

    public String toString() {
        String obj = this.zzifn.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
