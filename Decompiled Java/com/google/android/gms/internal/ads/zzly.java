package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzly {
    private final zzji zzapu;
    private final zzjg[] zzbbi;
    private zzjg zzbbj;

    public zzly(zzjg[] zzjgArr, zzji zzji) {
        this.zzbbi = zzjgArr;
        this.zzapu = zzji;
    }

    public final zzjg zza(zzjf zzjf, Uri uri) throws IOException, InterruptedException {
        zzjg zzjg = this.zzbbj;
        if (zzjg != null) {
            return zzjg;
        }
        zzjg[] zzjgArr = this.zzbbi;
        int length = zzjgArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzjg zzjg2 = zzjgArr[i];
            try {
                if (zzjg2.zza(zzjf)) {
                    this.zzbbj = zzjg2;
                    zzjf.zzgm();
                    break;
                }
                i++;
            } catch (EOFException unused) {
            } finally {
                zzjf.zzgm();
            }
        }
        zzjg zzjg3 = this.zzbbj;
        if (zzjg3 != null) {
            zzjg3.zza(this.zzapu);
            return this.zzbbj;
        }
        String zza = zzop.zza((Object[]) this.zzbbi);
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(zza);
        sb.append(") could read the stream.");
        throw new zzmt(sb.toString(), uri);
    }

    public final void release() {
        zzjg zzjg = this.zzbbj;
        if (zzjg != null) {
            zzjg.release();
            this.zzbbj = null;
        }
    }
}
