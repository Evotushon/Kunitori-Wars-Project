package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbm;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzde {
    /* access modifiers changed from: private */
    public static final ConditionVariable zzuz = new ConditionVariable();
    @VisibleForTesting
    protected static volatile zzss zzva = null;
    private static volatile Random zzvc = null;
    /* access modifiers changed from: private */
    public zzei zzuy;
    @VisibleForTesting
    protected volatile Boolean zzvb;

    public zzde(zzei zzei) {
        this.zzuy = zzei;
        zzei.zzcc().execute(new zzdh(this));
    }

    public final void zza(int i, int i2, long j) {
        zza(i, i2, j, (String) null, (Exception) null);
    }

    public final void zza(int i, int i2, long j, String str) {
        zza(i, -1, j, str, (Exception) null);
    }

    public final void zza(int i, int i2, long j, String str, Exception exc) {
        try {
            zzuz.block();
            if (this.zzvb.booleanValue() && zzva != null) {
                zzbm.zza.C0002zza zzc = zzbm.zza.zzt().zzi(this.zzuy.zzur.getPackageName()).zzc(j);
                if (str != null) {
                    zzc.zzl(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    zzdww.zza((Throwable) exc, new PrintWriter(stringWriter));
                    zzc.zzj(stringWriter.toString()).zzk(exc.getClass().getName());
                }
                zzsw zzf = zzva.zzf(((zzbm.zza) ((zzdyz) zzc.zzbcx())).toByteArray());
                zzf.zzbr(i);
                if (i2 != -1) {
                    zzf.zzbq(i2);
                }
                zzf.zzdt();
            }
        } catch (Exception unused) {
        }
    }

    public static int zzbs() {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ThreadLocalRandom.current().nextInt();
            }
            return zzbt().nextInt();
        } catch (RuntimeException unused) {
            return zzbt().nextInt();
        }
    }

    private static Random zzbt() {
        if (zzvc == null) {
            synchronized (zzde.class) {
                if (zzvc == null) {
                    zzvc = new Random();
                }
            }
        }
        return zzvc;
    }
}
