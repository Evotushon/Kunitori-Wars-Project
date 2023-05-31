package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzbgn;
import com.google.android.gms.internal.ads.zzbih;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzbgk implements zzbjh {
    @GuardedBy("AppComponent.class")
    private static zzbgk zzekw;

    /* access modifiers changed from: protected */
    public abstract zzcyw zza(zzdaf zzdaf);

    public abstract Executor zzacf();

    public abstract ScheduledExecutorService zzacg();

    public abstract Executor zzach();

    public abstract zzdoe zzaci();

    public abstract zzbsf zzacj();

    public abstract zzcnk zzack();

    public abstract zzbik zzacl();

    public abstract zzbmf zzacm();

    public abstract zzbkx zzacn();

    public abstract zzdbi zzaco();

    public abstract zzbws zzacp();

    public abstract zzbxr zzacq();

    public abstract zzcdt zzacr();

    public abstract zzddz zzacs();

    public abstract zzcsw zzact();

    public static zzbgk zza(Context context, zzalk zzalk, int i) {
        zzbgk zze = zze(context, i);
        zze.zzack().zzb(zzalk);
        return zze;
    }

    @Deprecated
    public static zzbgk zze(Context context, int i) {
        synchronized (zzbgk.class) {
            if (zzekw == null) {
                return zza(new zzazo(20089000, i, true, false), context, (zzbih.zza) new zzbhg());
            }
            zzbgk zzbgk = zzekw;
            return zzbgk;
        }
    }

    @Deprecated
    private static zzbgk zza(zzazo zzazo, Context context, zzbih.zza zza) {
        zzbgk zzbgk;
        synchronized (zzbgk.class) {
            if (zzekw == null) {
                zzekw = new zzbhv().zzc(new zzbgn(new zzbgn.zza().zza(zzazo).zzbv(context))).zza(new zzbih(zza)).zzaet();
                zzzx.initialize(context);
                zzq.zzkz().zzd(context, zzazo);
                zzq.zzlb().initialize(context);
                zzq.zzkv().zzaq(context);
                zzq.zzkv().zzar(context);
                zzawd.zzap(context);
                zzq.zzky().initialize(context);
                zzq.zzlq().initialize(context);
                if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcre)).booleanValue()) {
                    new zzclu(context, zzazo, new zzsn(new zzss(context)), new zzcle(new zzclc(context), zzekw.zzaci())).zzaob();
                }
            }
            zzbgk = zzekw;
        }
        return zzbgk;
    }

    public final zzcyw zza(zzaqx zzaqx, int i) {
        return zza(new zzdaf(zzaqx, i));
    }
}
