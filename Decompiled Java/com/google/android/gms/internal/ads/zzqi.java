package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzqi implements Application.ActivityLifecycleCallbacks {
    /* access modifiers changed from: private */
    public boolean foreground = true;
    /* access modifiers changed from: private */
    public final Object lock = new Object();
    /* access modifiers changed from: private */
    public boolean zzbpn = false;
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    public final List<zzqk> zzbpo = new ArrayList();
    @GuardedBy("lock")
    private final List<zzqv> zzbpp = new ArrayList();
    private Runnable zzbpq;
    private long zzbpr;
    private Context zzur;
    private boolean zzyb = false;
    @Nullable
    private Activity zzzo;

    zzqi() {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(Application application, Context context) {
        if (!this.zzyb) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                setActivity((Activity) context);
            }
            this.zzur = application;
            this.zzbpr = ((Long) zzvh.zzpd().zzd(zzzx.zzcju)).longValue();
            this.zzyb = true;
        }
    }

    public final void zza(zzqk zzqk) {
        synchronized (this.lock) {
            this.zzbpo.add(zzqk);
        }
    }

    public final void zzb(zzqk zzqk) {
        synchronized (this.lock) {
            this.zzbpo.remove(zzqk);
        }
    }

    @Nullable
    public final Activity getActivity() {
        return this.zzzo;
    }

    @Nullable
    public final Context getContext() {
        return this.zzur;
    }

    public final void onActivityStarted(Activity activity) {
        setActivity(activity);
    }

    public final void onActivityResumed(Activity activity) {
        setActivity(activity);
        this.zzbpn = false;
        boolean z = !this.foreground;
        this.foreground = true;
        if (this.zzbpq != null) {
            zzawo.zzdtx.removeCallbacks(this.zzbpq);
        }
        synchronized (this.lock) {
            for (zzqv onActivityResumed : this.zzbpp) {
                try {
                    onActivityResumed.onActivityResumed(activity);
                } catch (Exception e) {
                    zzq.zzkz().zza(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzazh.zzc("", e);
                }
            }
            if (z) {
                for (zzqk zzp : this.zzbpo) {
                    try {
                        zzp.zzp(true);
                    } catch (Exception e2) {
                        zzazh.zzc("", e2);
                    }
                }
            } else {
                zzawf.zzeb("App is still foreground.");
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        setActivity(activity);
        synchronized (this.lock) {
            for (zzqv onActivityPaused : this.zzbpp) {
                try {
                    onActivityPaused.onActivityPaused(activity);
                } catch (Exception e) {
                    zzq.zzkz().zza(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzazh.zzc("", e);
                }
            }
        }
        this.zzbpn = true;
        if (this.zzbpq != null) {
            zzawo.zzdtx.removeCallbacks(this.zzbpq);
        }
        zzdkp zzdkp = zzawo.zzdtx;
        zzqh zzqh = new zzqh(this);
        this.zzbpq = zzqh;
        zzdkp.postDelayed(zzqh, this.zzbpr);
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.lock) {
            if (this.zzzo != null) {
                if (this.zzzo.equals(activity)) {
                    this.zzzo = null;
                }
                Iterator<zzqv> it = this.zzbpp.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().zza(activity)) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        zzq.zzkz().zza(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        zzazh.zzc("", e);
                    }
                }
            }
        }
    }

    private final void setActivity(Activity activity) {
        synchronized (this.lock) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.zzzo = activity;
            }
        }
    }
}
