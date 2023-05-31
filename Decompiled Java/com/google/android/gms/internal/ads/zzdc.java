package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdc {
    private final Context zzur;
    private final zzdka zzus;
    private final zzdja zzut;
    /* access modifiers changed from: private */
    public final zzdix zzuu;
    private final Executor zzuv;
    private boolean zzuw;
    private volatile long zzux = 0;

    @VisibleForTesting
    zzdc(@NonNull Context context, @NonNull zzdix zzdix, @NonNull zzdka zzdka, @NonNull zzdja zzdja, @NonNull Executor executor) {
        this.zzur = context;
        this.zzuu = zzdix;
        this.zzus = zzdka;
        this.zzut = zzdja;
        this.zzuv = executor;
    }

    public final synchronized boolean zzbo() {
        if (this.zzuw) {
            return true;
        }
        zzdkb zzdr = this.zzus.zzdr(zzdkj.zzgyf);
        if (zzdr != null && !zzdr.zza() && this.zzut.zzb(zzdr) == null) {
            this.zzuw = true;
        }
        return this.zzuw;
    }

    public final void zzbp() {
        this.zzuv.execute(new zzdf(this));
    }

    /* access modifiers changed from: private */
    public final void zzbq() {
        String str;
        String str2;
        zzdkb zzdr = this.zzus.zzdr(zzdkj.zzgyf);
        if (zzdr != null) {
            String zzdc = zzdr.zzatn().zzdc();
            str = zzdr.zzatn().zzdd();
            str2 = zzdc;
        } else {
            str2 = null;
            str = null;
        }
        try {
            zzdke zza = zzdjf.zza(this.zzur, 1, str2, str, "1", this.zzuu);
            if (zza.zzgye == null) {
                return;
            }
            if (zza.zzgye.length != 0) {
                zzfx zza2 = zzfx.zza(zzdxn.zzt(zza.zzgye), zzdym.zzbch());
                boolean z = false;
                if (!zza2.zzcy().zzdc().isEmpty() && !zza2.zzcy().zzdd().isEmpty()) {
                    if (zza2.zzda().toByteArray().length != 0) {
                        zzdkb zzdr2 = this.zzus.zzdr(zzdkj.zzgyf);
                        if (zzdr2 != null) {
                            zzgb zzatn = zzdr2.zzatn();
                            if (zzatn != null) {
                                if (zza2.zzcy().zzdc().equals(zzatn.zzdc())) {
                                    if (!zza2.zzcy().zzdd().equals(zzatn.zzdd())) {
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                }
                if (z && this.zzus.zza(zza2, (zzdkg) null) && this.zzut.zzb(this.zzus.zzdr(zzdkj.zzgyf)) == null) {
                    this.zzuw = true;
                    this.zzux = System.currentTimeMillis() / 1000;
                }
            }
        } catch (zzdzh e) {
            this.zzuu.zza(4002, 0, e);
        }
    }

    public final void zza(MotionEvent motionEvent) {
        zzbr();
        if (zzbo()) {
            this.zzut.zza((String) null, motionEvent);
        }
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        zzbr();
        if (!zzbo()) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza = this.zzut.zza(context, (String) null, str, view, activity);
        this.zzuu.zza(5000, System.currentTimeMillis() - currentTimeMillis, zza, (Map<String, String>) null);
        return zza;
    }

    public final String zza(Context context, View view, Activity activity) {
        zzbr();
        if (!zzbo()) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb = this.zzut.zzb(context, (String) null, view, activity);
        this.zzuu.zza(5002, System.currentTimeMillis() - currentTimeMillis, zzb, (Map<String, String>) null);
        return zzb;
    }

    public final String zzb(Context context) {
        zzbr();
        if (!zzbo()) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzu = this.zzut.zzu(context, (String) null);
        this.zzuu.zza(5001, System.currentTimeMillis() - currentTimeMillis, zzu, (Map<String, String>) null);
        return zzu;
    }

    private final void zzbr() {
        if ((System.currentTimeMillis() / 1000) - this.zzux <= 3600) {
            return;
        }
        if (!this.zzuw || (this.zzut.zzatb() != null && this.zzut.zzatb().zzff(3600))) {
            zzbp();
        }
    }
}
