package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

@WorkerThread
/* compiled from: com.google.android.gms:play-services-measurement@@17.6.0 */
final class zzey implements Runnable {
    private final URL zza;
    private final byte[] zzb;
    private final zzew zzc;
    private final String zzd;
    private final Map<String, String> zze;
    private final /* synthetic */ zzeu zzf;

    public zzey(zzeu zzeu, String str, URL url, byte[] bArr, Map<String, String> map, zzew zzew) {
        this.zzf = zzeu;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzew);
        this.zza = url;
        this.zzb = bArr;
        this.zzc = zzew;
        this.zzd = str;
        this.zze = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A[SYNTHETIC, Splitter:B:44:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0101 A[SYNTHETIC, Splitter:B:57:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.zzeu r1 = r13.zzf
            r1.zzb()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.zzeu r3 = r13.zzf     // Catch:{ IOException -> 0x00fa, all -> 0x00c0 }
            java.net.URL r4 = r13.zza     // Catch:{ IOException -> 0x00fa, all -> 0x00c0 }
            java.net.HttpURLConnection r3 = r3.zza((java.net.URL) r4)     // Catch:{ IOException -> 0x00fa, all -> 0x00c0 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.zze     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            if (r4 == 0) goto L_0x003b
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.zze     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        L_0x001f:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            goto L_0x001f
        L_0x003b:
            byte[] r4 = r13.zzb     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            if (r4 == 0) goto L_0x0086
            com.google.android.gms.measurement.internal.zzeu r4 = r13.zzf     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.zzks r4 = r4.f_()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            byte[] r5 = r13.zzb     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            byte[] r4 = r4.zzc(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.zzeu r5 = r13.zzf     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.zzer r5 = r5.zzq()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.zzet r5 = r5.zzw()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r6 = "Uploading data. size"
            int r7 = r4.length     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r5.zza(r6, r7)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r5, r6)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            int r5 = r4.length     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r3.setFixedLengthStreamingMode(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r3.connect()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r5.write(r4)     // Catch:{ IOException -> 0x0080, all -> 0x007c }
            r5.close()     // Catch:{ IOException -> 0x0080, all -> 0x007c }
            goto L_0x0086
        L_0x007c:
            r4 = move-exception
            r11 = r1
            r1 = r5
            goto L_0x00c3
        L_0x0080:
            r4 = move-exception
            r11 = r1
            r9 = r4
            r1 = r5
            goto L_0x00fe
        L_0x0086:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00b6, all -> 0x00b3 }
            com.google.android.gms.measurement.internal.zzeu r2 = r13.zzf     // Catch:{ IOException -> 0x00b1, all -> 0x00af }
            byte[] r10 = com.google.android.gms.measurement.internal.zzeu.zza((java.net.HttpURLConnection) r3)     // Catch:{ IOException -> 0x00b1, all -> 0x00af }
            if (r3 == 0) goto L_0x0099
            r3.disconnect()
        L_0x0099:
            com.google.android.gms.measurement.internal.zzeu r0 = r13.zzf
            com.google.android.gms.measurement.internal.zzfo r0 = r0.zzp()
            com.google.android.gms.measurement.internal.zzez r1 = new com.google.android.gms.measurement.internal.zzez
            java.lang.String r6 = r13.zzd
            com.google.android.gms.measurement.internal.zzew r7 = r13.zzc
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.zza((java.lang.Runnable) r1)
            return
        L_0x00af:
            r4 = move-exception
            goto L_0x00c4
        L_0x00b1:
            r4 = move-exception
            goto L_0x00b8
        L_0x00b3:
            r4 = move-exception
            r11 = r1
            goto L_0x00c4
        L_0x00b6:
            r4 = move-exception
            r11 = r1
        L_0x00b8:
            r9 = r4
            goto L_0x00ff
        L_0x00ba:
            r4 = move-exception
            r11 = r1
            goto L_0x00c3
        L_0x00bd:
            r4 = move-exception
            r11 = r1
            goto L_0x00fd
        L_0x00c0:
            r4 = move-exception
            r3 = r1
            r11 = r3
        L_0x00c3:
            r8 = 0
        L_0x00c4:
            if (r1 == 0) goto L_0x00de
            r1.close()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00de
        L_0x00ca:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzeu r2 = r13.zzf
            com.google.android.gms.measurement.internal.zzer r2 = r2.zzq()
            com.google.android.gms.measurement.internal.zzet r2 = r2.zze()
            java.lang.String r5 = r13.zzd
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzer.zza((java.lang.String) r5)
            r2.zza(r0, r5, r1)
        L_0x00de:
            if (r3 == 0) goto L_0x00e3
            r3.disconnect()
        L_0x00e3:
            com.google.android.gms.measurement.internal.zzeu r0 = r13.zzf
            com.google.android.gms.measurement.internal.zzfo r0 = r0.zzp()
            com.google.android.gms.measurement.internal.zzez r1 = new com.google.android.gms.measurement.internal.zzez
            java.lang.String r6 = r13.zzd
            com.google.android.gms.measurement.internal.zzew r7 = r13.zzc
            r9 = 0
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.zza((java.lang.Runnable) r1)
            throw r4
        L_0x00fa:
            r4 = move-exception
            r3 = r1
            r11 = r3
        L_0x00fd:
            r9 = r4
        L_0x00fe:
            r8 = 0
        L_0x00ff:
            if (r1 == 0) goto L_0x0119
            r1.close()     // Catch:{ IOException -> 0x0105 }
            goto L_0x0119
        L_0x0105:
            r1 = move-exception
            com.google.android.gms.measurement.internal.zzeu r2 = r13.zzf
            com.google.android.gms.measurement.internal.zzer r2 = r2.zzq()
            com.google.android.gms.measurement.internal.zzet r2 = r2.zze()
            java.lang.String r4 = r13.zzd
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzer.zza((java.lang.String) r4)
            r2.zza(r0, r4, r1)
        L_0x0119:
            if (r3 == 0) goto L_0x011e
            r3.disconnect()
        L_0x011e:
            com.google.android.gms.measurement.internal.zzeu r0 = r13.zzf
            com.google.android.gms.measurement.internal.zzfo r0 = r0.zzp()
            com.google.android.gms.measurement.internal.zzez r1 = new com.google.android.gms.measurement.internal.zzez
            java.lang.String r6 = r13.zzd
            com.google.android.gms.measurement.internal.zzew r7 = r13.zzc
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.zza((java.lang.Runnable) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzey.run():void");
    }
}
