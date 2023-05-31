package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbmu implements zzbqu, zzbrn {
    private final zzazo zzblu;
    @Nullable
    private final zzbdv zzdae;
    private final zzdei zzfhg;
    @GuardedBy("this")
    @Nullable
    private IObjectWrapper zzfhh;
    @GuardedBy("this")
    private boolean zzfhi;
    private final Context zzur;

    public zzbmu(Context context, @Nullable zzbdv zzbdv, zzdei zzdei, zzazo zzazo) {
        this.zzur = context;
        this.zzdae = zzbdv;
        this.zzfhg = zzdei;
        this.zzblu = zzazo;
    }

    public final synchronized void onAdLoaded() {
        if (!this.zzfhi) {
            zzahe();
        }
    }

    public final synchronized void onAdImpression() {
        if (!this.zzfhi) {
            zzahe();
        }
        if (!(!this.zzfhg.zzdmn || this.zzfhh == null || this.zzdae == null)) {
            this.zzdae.zza("onSdkImpression", (Map<String, ?>) new ArrayMap());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzahe() {
        /*
            r10 = this;
            monitor-enter(r10)
            com.google.android.gms.internal.ads.zzdei r0 = r10.zzfhg     // Catch:{ all -> 0x008b }
            boolean r0 = r0.zzdmn     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r10)
            return
        L_0x0009:
            com.google.android.gms.internal.ads.zzbdv r0 = r10.zzdae     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r10)
            return
        L_0x000f:
            com.google.android.gms.internal.ads.zzaoy r0 = com.google.android.gms.ads.internal.zzq.zzlk()     // Catch:{ all -> 0x008b }
            android.content.Context r1 = r10.zzur     // Catch:{ all -> 0x008b }
            boolean r0 = r0.zzq(r1)     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x001d
            monitor-exit(r10)
            return
        L_0x001d:
            com.google.android.gms.internal.ads.zzazo r0 = r10.zzblu     // Catch:{ all -> 0x008b }
            int r0 = r0.zzdxf     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.ads.zzazo r1 = r10.zzblu     // Catch:{ all -> 0x008b }
            int r1 = r1.zzdxg     // Catch:{ all -> 0x008b }
            r2 = 23
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
            r3.<init>(r2)     // Catch:{ all -> 0x008b }
            r3.append(r0)     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "."
            r3.append(r0)     // Catch:{ all -> 0x008b }
            r3.append(r1)     // Catch:{ all -> 0x008b }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.ads.zzdei r0 = r10.zzfhg     // Catch:{ all -> 0x008b }
            org.json.JSONObject r0 = r0.zzgqa     // Catch:{ all -> 0x008b }
            java.lang.String r1 = "media_type"
            r2 = -1
            int r0 = r0.optInt(r1, r2)     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x004a
            r0 = 0
            goto L_0x004c
        L_0x004a:
            java.lang.String r0 = "javascript"
        L_0x004c:
            r9 = r0
            com.google.android.gms.internal.ads.zzaoy r4 = com.google.android.gms.ads.internal.zzq.zzlk()     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.ads.zzbdv r0 = r10.zzdae     // Catch:{ all -> 0x008b }
            android.webkit.WebView r6 = r0.getWebView()     // Catch:{ all -> 0x008b }
            java.lang.String r7 = ""
            java.lang.String r8 = "javascript"
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.zza(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x008b }
            r10.zzfhh = r0     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.ads.zzbdv r0 = r10.zzdae     // Catch:{ all -> 0x008b }
            android.view.View r0 = r0.getView()     // Catch:{ all -> 0x008b }
            com.google.android.gms.dynamic.IObjectWrapper r1 = r10.zzfhh     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x0089
            if (r0 == 0) goto L_0x0089
            com.google.android.gms.internal.ads.zzaoy r1 = com.google.android.gms.ads.internal.zzq.zzlk()     // Catch:{ all -> 0x008b }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r10.zzfhh     // Catch:{ all -> 0x008b }
            r1.zza(r2, r0)     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.ads.zzbdv r0 = r10.zzdae     // Catch:{ all -> 0x008b }
            com.google.android.gms.dynamic.IObjectWrapper r1 = r10.zzfhh     // Catch:{ all -> 0x008b }
            r0.zzap(r1)     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.ads.zzaoy r0 = com.google.android.gms.ads.internal.zzq.zzlk()     // Catch:{ all -> 0x008b }
            com.google.android.gms.dynamic.IObjectWrapper r1 = r10.zzfhh     // Catch:{ all -> 0x008b }
            r0.zzab(r1)     // Catch:{ all -> 0x008b }
            r0 = 1
            r10.zzfhi = r0     // Catch:{ all -> 0x008b }
        L_0x0089:
            monitor-exit(r10)
            return
        L_0x008b:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbmu.zzahe():void");
    }
}
