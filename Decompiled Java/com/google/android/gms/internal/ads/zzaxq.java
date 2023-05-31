package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaxq extends zzak {
    private final Context zzur;

    public static zzu zzbj(Context context) {
        zzu zzu = new zzu(new zzal(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzaxq(context, new zzat()));
        zzu.start();
        return zzu;
    }

    private zzaxq(Context context, zzah zzah) {
        super(zzah);
        this.zzur = context;
    }

    public final zzo zzc(zzq<?> zzq) throws zzae {
        if (zzq.zzh() && zzq.getMethod() == 0) {
            if (Pattern.matches((String) zzvh.zzpd().zzd(zzzx.zzcoe), zzq.getUrl())) {
                zzvh.zzoz();
                if (zzayx.zzd(this.zzur, 13400000)) {
                    zzo zzc = new zzagt(this.zzur).zzc(zzq);
                    if (zzc != null) {
                        String valueOf = String.valueOf(zzq.getUrl());
                        zzawf.zzee(valueOf.length() != 0 ? "Got gmscore asset response: ".concat(valueOf) : new String("Got gmscore asset response: "));
                        return zzc;
                    }
                    String valueOf2 = String.valueOf(zzq.getUrl());
                    zzawf.zzee(valueOf2.length() != 0 ? "Failed to get gmscore asset response: ".concat(valueOf2) : new String("Failed to get gmscore asset response: "));
                }
            }
        }
        return super.zzc(zzq);
    }
}
