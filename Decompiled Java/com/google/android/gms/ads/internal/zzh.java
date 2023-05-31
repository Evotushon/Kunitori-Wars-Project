package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzawf;
import com.google.android.gms.internal.ads.zzayx;
import com.google.android.gms.internal.ads.zzazo;
import com.google.android.gms.internal.ads.zzazq;
import com.google.android.gms.internal.ads.zzdg;
import com.google.android.gms.internal.ads.zzdr;
import com.google.android.gms.internal.ads.zzvh;
import com.google.android.gms.internal.ads.zzzx;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzh implements zzdg, Runnable {
    private final List<Object[]> zzblp = new Vector();
    private final AtomicReference<zzdg> zzblq = new AtomicReference<>();
    private zzazo zzblr;
    private CountDownLatch zzbls = new CountDownLatch(1);
    private Context zzur;

    public zzh(Context context, zzazo zzazo) {
        this.zzur = context;
        this.zzblr = zzazo;
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcmg)).booleanValue()) {
            zzazq.zzdxk.execute(this);
            return;
        }
        zzvh.zzoz();
        if (zzayx.zzxj()) {
            zzazq.zzdxk.execute(this);
        } else {
            run();
        }
    }

    private final boolean zzjy() {
        try {
            this.zzbls.await();
            return true;
        } catch (InterruptedException e) {
            zzawf.zzd("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    private final void zzjz() {
        if (!this.zzblp.isEmpty()) {
            for (Object[] next : this.zzblp) {
                if (next.length == 1) {
                    this.zzblq.get().zza((MotionEvent) next[0]);
                } else if (next.length == 3) {
                    this.zzblq.get().zza(((Integer) next[0]).intValue(), ((Integer) next[1]).intValue(), ((Integer) next[2]).intValue());
                }
            }
            this.zzblp.clear();
        }
    }

    private static Context zzf(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final String zzb(Context context) {
        zzdg zzdg;
        if (!zzjy() || (zzdg = this.zzblq.get()) == null) {
            return "";
        }
        zzjz();
        return zzdg.zzb(zzf(context));
    }

    public final String zza(Context context, View view, Activity activity) {
        zzdg zzdg = this.zzblq.get();
        return zzdg != null ? zzdg.zza(context, view, activity) : "";
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, (Activity) null);
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        zzdg zzdg;
        if (!zzjy() || (zzdg = this.zzblq.get()) == null) {
            return "";
        }
        zzjz();
        return zzdg.zza(zzf(context), str, view, activity);
    }

    public final void zzb(View view) {
        zzdg zzdg = this.zzblq.get();
        if (zzdg != null) {
            zzdg.zzb(view);
        }
    }

    public final void zza(MotionEvent motionEvent) {
        zzdg zzdg = this.zzblq.get();
        if (zzdg != null) {
            zzjz();
            zzdg.zza(motionEvent);
            return;
        }
        this.zzblp.add(new Object[]{motionEvent});
    }

    public final void zza(int i, int i2, int i3) {
        zzdg zzdg = this.zzblq.get();
        if (zzdg != null) {
            zzjz();
            zzdg.zza(i, i2, i3);
            return;
        }
        this.zzblp.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void run() {
        boolean z = false;
        try {
            boolean z2 = this.zzblr.zzdxh;
            if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcjy)).booleanValue() && z2) {
                z = true;
            }
            this.zzblq.set(zzdr.zza(this.zzblr.zzbmj, zzf(this.zzur), z));
        } finally {
            this.zzbls.countDown();
            this.zzur = null;
            this.zzblr = null;
        }
    }
}
