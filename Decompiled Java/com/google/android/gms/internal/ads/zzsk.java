package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzsk implements Runnable {
    private final zzsh zzbsf;
    private final zzsa zzbsg;
    private final zzrz zzbsh;
    private final zzazy zzbsi;

    zzsk(zzsh zzsh, zzsa zzsa, zzrz zzrz, zzazy zzazy) {
        this.zzbsf = zzsh;
        this.zzbsg = zzsa;
        this.zzbsh = zzrz;
        this.zzbsi = zzazy;
    }

    public final void run() {
        zzsh zzsh = this.zzbsf;
        zzsa zzsa = this.zzbsg;
        zzrz zzrz = this.zzbsh;
        zzazy zzazy = this.zzbsi;
        try {
            zzry zza = zzsa.zzmx().zza(zzrz);
            if (!zza.zzmu()) {
                zzazy.setException(new RuntimeException("No entry contents."));
                zzsh.zzbsc.disconnect();
                return;
            }
            zzsm zzsm = new zzsm(zzsh, zza.zzmv(), 1);
            int read = zzsm.read();
            if (read != -1) {
                zzsm.unread(read);
                zzazy.set(zzsm);
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            zzawf.zzc("Unable to obtain a cache service instance.", e);
            zzazy.setException(e);
            zzsh.zzbsc.disconnect();
        }
    }
}
