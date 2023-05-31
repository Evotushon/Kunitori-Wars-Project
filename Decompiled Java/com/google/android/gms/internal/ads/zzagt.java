package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.zzq;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzagt implements zzn {
    /* access modifiers changed from: private */
    public volatile zzagi zzczd;
    private final Context zzur;

    public zzagt(Context context) {
        this.zzur = context;
    }

    public final zzo zzc(zzq<?> zzq) throws zzae {
        zzagl zzh = zzagl.zzh(zzq);
        long elapsedRealtime = zzq.zzlc().elapsedRealtime();
        try {
            zzazy zzazy = new zzazy();
            this.zzczd = new zzagi(this.zzur, zzq.zzlj().zzxg(), new zzagx(this, zzazy), new zzagw(this, zzazy));
            this.zzczd.checkAvailabilityAndConnect();
            zzdof zza = zzdnt.zza(zzdnt.zzb(zzazy, new zzags(this, zzh), (Executor) zzazq.zzdxk), (long) ((Integer) zzvh.zzpd().zzd(zzzx.zzcof)).intValue(), TimeUnit.MILLISECONDS, zzazq.zzdxn);
            zza.addListener(new zzagu(this), zzazq.zzdxk);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zza.get();
            long elapsedRealtime2 = zzq.zzlc().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            zzawf.zzee(sb.toString());
            zzagn zzagn = (zzagn) new zzaqw(parcelFileDescriptor).zza(zzagn.CREATOR);
            if (zzagn == null) {
                return null;
            }
            if (zzagn.zzcza) {
                throw new zzae(zzagn.zzczb);
            } else if (zzagn.zzcyy.length != zzagn.zzcyz.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                for (int i = 0; i < zzagn.zzcyy.length; i++) {
                    hashMap.put(zzagn.zzcyy[i], zzagn.zzcyz[i]);
                }
                return new zzo(zzagn.statusCode, zzagn.data, (Map<String, String>) hashMap, zzagn.zzac, zzagn.zzad);
            }
        } catch (InterruptedException | ExecutionException unused) {
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(zzq.zzlc().elapsedRealtime() - elapsedRealtime);
            sb2.append("ms");
            zzawf.zzee(sb2.toString());
            return null;
        } catch (Throwable th) {
            long elapsedRealtime3 = zzq.zzlc().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime3);
            sb3.append("ms");
            zzawf.zzee(sb3.toString());
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public final void disconnect() {
        if (this.zzczd != null) {
            this.zzczd.disconnect();
            Binder.flushPendingCommands();
        }
    }
}
