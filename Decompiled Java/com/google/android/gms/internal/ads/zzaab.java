package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.zzq;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaab {
    private String zzbmj = null;
    private String zzcsn;
    private Map<String, String> zzcsq;
    private Context zzur = null;

    public zzaab(Context context, String str) {
        String str2;
        this.zzur = context;
        this.zzbmj = str;
        this.zzcsn = zzabf.zzcuh.get();
        this.zzcsq = new LinkedHashMap();
        this.zzcsq.put("s", "gmob_sdk");
        this.zzcsq.put("v", "3");
        this.zzcsq.put("os", Build.VERSION.RELEASE);
        this.zzcsq.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.zzcsq;
        zzq.zzkv();
        map.put("device", zzawo.zzwq());
        Map<String, String> map2 = this.zzcsq;
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        map2.put("app", str2);
        Map<String, String> map3 = this.zzcsq;
        zzq.zzkv();
        map3.put("is_lite_sdk", zzawo.zzba(context) ? "1" : "0");
        Future<zzarg> zzz = zzq.zzlg().zzz(this.zzur);
        try {
            this.zzcsq.put("network_coarse", Integer.toString(zzz.get().zzdnt));
            this.zzcsq.put("network_fine", Integer.toString(zzz.get().zzdnu));
        } catch (Exception e) {
            zzq.zzkz().zza(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzqq() {
        return this.zzcsn;
    }

    /* access modifiers changed from: package-private */
    public final Context getContext() {
        return this.zzur;
    }

    /* access modifiers changed from: package-private */
    public final String zzkp() {
        return this.zzbmj;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> zzqr() {
        return this.zzcsq;
    }
}
