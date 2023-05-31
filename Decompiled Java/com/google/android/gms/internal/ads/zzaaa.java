package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaaa {
    private File file;
    @VisibleForTesting
    private String zzbmj;
    @VisibleForTesting
    private BlockingQueue<zzaak> zzcsk = new ArrayBlockingQueue(100);
    @VisibleForTesting
    private LinkedHashMap<String, String> zzcsl = new LinkedHashMap<>();
    @VisibleForTesting
    private Map<String, zzaae> zzcsm = new HashMap();
    @VisibleForTesting
    private String zzcsn;
    private final HashSet<String> zzcso = new HashSet<>(Arrays.asList(new String[]{"noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"}));
    private AtomicBoolean zzcsp;
    @VisibleForTesting
    private Context zzur;

    public final void zza(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.zzur = context;
        this.zzbmj = str;
        this.zzcsn = str2;
        this.zzcsp = new AtomicBoolean(false);
        this.zzcsp.set(zzabe.zzcug.get().booleanValue());
        if (this.zzcsp.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.file = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry next : map.entrySet()) {
            this.zzcsl.put((String) next.getKey(), (String) next.getValue());
        }
        zzazq.zzdxk.execute(new zzaad(this));
        this.zzcsm.put("action", zzaae.zzcst);
        this.zzcsm.put(FirebaseAnalytics.Param.AD_FORMAT, zzaae.zzcst);
        this.zzcsm.put("e", zzaae.zzcsu);
    }

    public final boolean zza(zzaak zzaak) {
        return this.zzcsk.offer(zzaak);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[SYNTHETIC, Splitter:B:32:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092 A[SYNTHETIC, Splitter:B:37:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza(java.util.Map<java.lang.String, java.lang.String> r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            java.lang.String r1 = r4.zzcsn
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0014:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.appendQueryParameter(r3, r2)
            goto L_0x0014
        L_0x0030:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            android.net.Uri r1 = r1.build()
            java.lang.String r1 = r1.toString()
            r5.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = "&it="
            r5.append(r1)
            r5.append(r6)
        L_0x004b:
            java.lang.String r5 = r5.toString()
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.zzcsp
            boolean r6 = r6.get()
            if (r6 == 0) goto L_0x00a1
            java.io.File r6 = r4.file
            if (r6 == 0) goto L_0x009b
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x007f }
            r3 = 1
            r2.<init>(r6, r3)     // Catch:{ IOException -> 0x007f }
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            r2.write(r5)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            r5 = 10
            r2.write(r5)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            r2.close()     // Catch:{ IOException -> 0x0072 }
            return
        L_0x0072:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzawf.zzd(r0, r5)
            return
        L_0x0077:
            r5 = move-exception
            r1 = r2
            goto L_0x0090
        L_0x007a:
            r5 = move-exception
            r1 = r2
            goto L_0x0080
        L_0x007d:
            r5 = move-exception
            goto L_0x0090
        L_0x007f:
            r5 = move-exception
        L_0x0080:
            java.lang.String r6 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.zzawf.zzd(r6, r5)     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x008f
            r1.close()     // Catch:{ IOException -> 0x008b }
            goto L_0x008f
        L_0x008b:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzawf.zzd(r0, r5)
        L_0x008f:
            return
        L_0x0090:
            if (r1 == 0) goto L_0x009a
            r1.close()     // Catch:{ IOException -> 0x0096 }
            goto L_0x009a
        L_0x0096:
            r6 = move-exception
            com.google.android.gms.internal.ads.zzawf.zzd(r0, r6)
        L_0x009a:
            throw r5
        L_0x009b:
            java.lang.String r5 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.ads.zzawf.zzfa(r5)
            return
        L_0x00a1:
            com.google.android.gms.ads.internal.zzq.zzkv()
            android.content.Context r6 = r4.zzur
            java.lang.String r0 = r4.zzbmj
            com.google.android.gms.internal.ads.zzawo.zzb(r6, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaa.zza(java.util.Map, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> zza(Map<String, String> map, @Nullable Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry next : map2.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, zzcr(str).zzg(str2, (String) next.getValue()));
        }
        return linkedHashMap;
    }

    public final zzaae zzcr(String str) {
        zzaae zzaae = this.zzcsm.get(str);
        if (zzaae != null) {
            return zzaae;
        }
        return zzaae.zzcss;
    }

    public final void zzcs(String str) {
        if (!this.zzcso.contains(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdkVersion", this.zzbmj);
            linkedHashMap.put("ue", str);
            zza(zza((Map<String, String>) this.zzcsl, (Map<String, String>) linkedHashMap), "");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzqp() {
        while (true) {
            try {
                zzaak take = this.zzcsk.take();
                String zzqu = take.zzqu();
                if (!TextUtils.isEmpty(zzqu)) {
                    zza(zza((Map<String, String>) this.zzcsl, take.zzqv()), zzqu);
                }
            } catch (InterruptedException e) {
                zzawf.zzd("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }
}
