package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcvs implements Callable {
    private final zzcvp zzgjf;

    zzcvs(zzcvp zzcvp) {
        this.zzgjf = zzcvp;
    }

    public final Object call() {
        String str;
        String str2;
        String str3;
        zzcvp zzcvp = this.zzgjf;
        zzq.zzkv();
        zzqj zzvy = zzq.zzkz().zzvk().zzvy();
        Bundle bundle = null;
        if (!(zzvy == null || zzvy == null || (zzq.zzkz().zzvk().zzvz() && zzq.zzkz().zzvk().zzwb()))) {
            if (zzvy.zzmk()) {
                zzvy.wakeup();
            }
            zzqd zzmi = zzvy.zzmi();
            if (zzmi != null) {
                str2 = zzmi.zzlx();
                str = zzmi.zzly();
                str3 = zzmi.zzlz();
                if (str2 != null) {
                    zzq.zzkz().zzvk().zzef(str2);
                }
                if (str3 != null) {
                    zzq.zzkz().zzvk().zzeg(str3);
                }
            } else {
                str2 = zzq.zzkz().zzvk().zzwa();
                str3 = zzq.zzkz().zzvk().zzwc();
                str = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (!zzq.zzkz().zzvk().zzwb()) {
                if (str3 == null || TextUtils.isEmpty(str3)) {
                    bundle2.putString("v_fp_vertical", "no_hash");
                } else {
                    bundle2.putString("v_fp_vertical", str3);
                }
            }
            if (str2 != null && !zzq.zzkz().zzvk().zzvz()) {
                bundle2.putString("fingerprint", str2);
                if (!str2.equals(str)) {
                    bundle2.putString("v_fp", str);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new zzcvq(bundle);
    }
}
