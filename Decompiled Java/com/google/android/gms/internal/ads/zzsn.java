package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzsp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzsn {
    private final zzss zzbsk;
    @GuardedBy("this")
    private final zztv zzbsl;
    private final boolean zzbsm;

    public static zzsn zzmy() {
        return new zzsn();
    }

    public zzsn(zzss zzss) {
        this.zzbsk = zzss;
        this.zzbsm = ((Boolean) zzvh.zzpd().zzd(zzzx.zzcot)).booleanValue();
        this.zzbsl = new zztv();
        zzmz();
    }

    private zzsn() {
        this.zzbsm = false;
        this.zzbsk = new zzss();
        this.zzbsl = new zztv();
        zzmz();
    }

    public final synchronized void zza(zzsp.zza.C0019zza zza) {
        if (this.zzbsm) {
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcou)).booleanValue()) {
                zzc(zza);
            } else {
                zzb(zza);
            }
        }
    }

    private final synchronized void zzb(zzsp.zza.C0019zza zza) {
        this.zzbsl.zzcbi = zzna();
        this.zzbsk.zzf(zzeda.zzb(this.zzbsl)).zzbr(zza.zzaf()).zzdt();
        String valueOf = String.valueOf(Integer.toString(zza.zzaf(), 10));
        zzawf.zzee(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void zzc(zzsp.zza.C0019zza zza) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(zzd(zza).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zzawf.zzee("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zzawf.zzee("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zzawf.zzee("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                zzawf.zzee("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    zzawf.zzee("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    private final synchronized String zzd(zzsp.zza.C0019zza zza) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.zzbsl.zzcbe, Long.valueOf(zzq.zzlc().elapsedRealtime()), Integer.valueOf(zza.zzaf()), Base64.encodeToString(zzeda.zzb(this.zzbsl), 3)});
    }

    public final synchronized void zza(zzsq zzsq) {
        if (this.zzbsm) {
            try {
                zzsq.zza(this.zzbsl);
            } catch (NullPointerException e) {
                zzq.zzkz().zza(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    private final synchronized void zzmz() {
        this.zzbsl.zzcbm = new zztr();
        this.zzbsl.zzcbm.zzcak = new zztq();
        this.zzbsl.zzcbj = new zztt();
    }

    private static long[] zzna() {
        int i;
        List<String> zzqk = zzzx.zzqk();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = zzqk.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] split = it.next().split(",");
            int length = split.length;
            while (i < length) {
                try {
                    arrayList.add(Long.valueOf(split[i]));
                } catch (NumberFormatException unused) {
                    zzawf.zzee("Experiment ID is not a number");
                }
                i++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            jArr[i2] = ((Long) obj).longValue();
            i2++;
        }
        return jArr;
    }
}
