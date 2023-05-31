package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcgx {
    private final Executor executor;
    private final String packageName;
    private final String zzcsn = zzabf.zzcuh.get();
    private final zzazl zzdwb;
    private final Map<String, String> zzfwd = new HashMap();
    private final Context zzur;

    public zzcgx(Executor executor2, zzazl zzazl, Context context) {
        this.executor = executor2;
        this.zzdwb = zzazl;
        this.zzur = context;
        this.packageName = context.getPackageName();
        this.zzfwd.put("s", "gmob_sdk");
        this.zzfwd.put("v", "3");
        this.zzfwd.put("os", Build.VERSION.RELEASE);
        this.zzfwd.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.zzfwd;
        zzq.zzkv();
        map.put("device", zzawo.zzwq());
        this.zzfwd.put("app", this.packageName);
        Map<String, String> map2 = this.zzfwd;
        zzq.zzkv();
        map2.put("is_lite_sdk", zzawo.zzba(this.zzur) ? "1" : "0");
        this.zzfwd.put("e", TextUtils.join(",", zzzx.zzqk()));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzm(java.util.Map<java.lang.String, java.lang.String> r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.zzcsn
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0012:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x002e
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.appendQueryParameter(r2, r1)
            goto L_0x0012
        L_0x002e:
            android.net.Uri r4 = r0.build()
            java.lang.String r4 = r4.toString()
            com.google.android.gms.internal.ads.zzaax<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzabf.zzcui
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0059
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzzx.zzclo
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r0 = 0
            goto L_0x005a
        L_0x0059:
            r0 = 1
        L_0x005a:
            if (r0 == 0) goto L_0x0066
            java.util.concurrent.Executor r0 = r3.executor
            com.google.android.gms.internal.ads.zzcgw r1 = new com.google.android.gms.internal.ads.zzcgw
            r1.<init>(r3, r4)
            r0.execute(r1)
        L_0x0066:
            com.google.android.gms.internal.ads.zzawf.zzee(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgx.zzm(java.util.Map):void");
    }

    public final Map<String, String> zzana() {
        return new HashMap(this.zzfwd);
    }

    public final ConcurrentHashMap<String, String> zzanb() {
        return new ConcurrentHashMap<>(this.zzfwd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzgd(String str) {
        this.zzdwb.zzeo(str);
    }
}
