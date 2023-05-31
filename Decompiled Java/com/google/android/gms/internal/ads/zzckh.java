package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzq;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzckh extends zzaqn {
    private final Executor zzfeo;
    private final zzaro zzfza;
    private final zzarl zzfzb;
    private final zzbjh zzfzc;
    private final HashMap<String, zzcks> zzfzd;
    private final Context zzur;

    public zzckh(Context context, Executor executor, zzaro zzaro, zzbjh zzbjh, zzarl zzarl, HashMap<String, zzcks> hashMap) {
        zzzx.initialize(context);
        this.zzur = context;
        this.zzfeo = executor;
        this.zzfza = zzaro;
        this.zzfzb = zzarl;
        this.zzfzc = zzbjh;
        this.zzfzd = hashMap;
    }

    public final zzaqk zza(zzaqi zzaqi) throws RemoteException {
        return null;
    }

    public final void zza(zzaqi zzaqi, zzaqp zzaqp) throws RemoteException {
    }

    public final zzdof<InputStream> zzb(zzaqx zzaqx, int i) {
        zzakk zza = zzq.zzli().zza(this.zzur, zzazo.zzxr());
        zzcyw zza2 = this.zzfzc.zza(zzaqx, i);
        zzakc<I, O> zza3 = zza.zza("google.afma.response.normalize", zzckv.zzfzl, zzakj.zzdbv);
        zzckw zzckw = new zzckw(this.zzur, zzaqx.zzdjo.zzbmj, this.zzfza, zzaqx.zzdko);
        zzdif zzaee = zza2.zzaee();
        zzcks zzcks = null;
        if (!zzabn.zzcvg.get().booleanValue()) {
            if (zzaqx.zzdnd != null && !zzaqx.zzdnd.isEmpty()) {
                zzawf.zzee("Request contained a PoolKey but split request is disabled.");
            }
        } else if (zzaqx.zzdnd != null && !zzaqx.zzdnd.isEmpty() && (zzcks = this.zzfzd.remove(zzaqx.zzdnd)) == null) {
            zzawf.zzee("Request contained a PoolKey but no matching parameters were found.");
        }
        if (zzcks == null) {
            zzdof<JSONObject> zza4 = zza(zzaqx, zzaee, zza2);
            zzdof<zzard> zza5 = zza(zza4, zzaee, zza);
            zzdhs zzata = zzaee.zza(zzdig.HTTP, (zzdof<?>[]) new zzdof[]{zza5, zza4}).zzb(new zzckg(zza4, zza5)).zzb(zzckw).zzata();
            return zzaee.zza(zzdig.PRE_PROCESS, (zzdof<?>[]) new zzdof[]{zza4, zza5, zzata}).zzb(new zzckj(zzata, zza4, zza5)).zza(zza3).zzata();
        }
        zzdhs zzata2 = zzaee.zza(zzdig.HTTP, zzdnt.zzaj(new zzckz(zzcks.zzfzi, zzcks.zzfzh))).zzb(zzckw).zzata();
        zzdof zzaj = zzdnt.zzaj(zzcks);
        return zzaee.zza(zzdig.PRE_PROCESS, (zzdof<?>[]) new zzdof[]{zzata2, zzaj}).zzb(new zzcki(zzata2, zzaj)).zza(zza3).zzata();
    }

    private static zzdof<JSONObject> zza(zzaqx zzaqx, zzdif zzdif, zzcyw zzcyw) {
        zzckl zzckl = new zzckl(zzcyw);
        return zzdif.zza(zzdig.GMS_SIGNALS, zzdnt.zzaj(zzaqx.zzdmz)).zza(zzckl).zzb(zzckk.zzfxq).zzata();
    }

    private static zzdof<zzard> zza(zzdof<JSONObject> zzdof, zzdif zzdif, zzakk zzakk) {
        return zzdif.zza(zzdig.BUILD_URL, zzdof).zza(zzakk.zza("AFMA_getAdDictionary", zzakj.zzdbu, zzckn.zzdbt)).zzata();
    }

    public final void zza(zzaqx zzaqx, zzaqr zzaqr) {
        zzdof<InputStream> zzb = zzb(zzaqx, Binder.getCallingUid());
        zza(zzb, zzaqr);
        zzb.addListener(new zzckm(this), this.zzfeo);
    }

    public final zzdof<InputStream> zzc(zzaqx zzaqx, int i) {
        if (!zzabn.zzcvg.get().booleanValue()) {
            return zzdnt.immediateFailedFuture(new Exception("Split request is disabled."));
        }
        if (zzaqx.zzdnc == null) {
            return zzdnt.immediateFailedFuture(new Exception("Pool configuration missing from request."));
        }
        if (zzaqx.zzdnc.zzgss == 0 || zzaqx.zzdnc.zzgst == 0) {
            return zzdnt.immediateFailedFuture(new Exception("Caching is disabled."));
        }
        zzakk zza = zzq.zzli().zza(this.zzur, zzazo.zzxr());
        zzcyw zza2 = this.zzfzc.zza(zzaqx, i);
        zzdif zzaee = zza2.zzaee();
        zzdof<JSONObject> zza3 = zza(zzaqx, zzaee, zza2);
        zzdof<zzard> zza4 = zza(zza3, zzaee, zza);
        return zzaee.zza(zzdig.GET_URL_AND_CACHE_KEY, (zzdof<?>[]) new zzdof[]{zza3, zza4}).zzb(new zzckp(this, zza4, zza3)).zzata();
    }

    public final zzdof<InputStream> zzgi(String str) {
        if (!zzabn.zzcvg.get().booleanValue()) {
            return zzdnt.immediateFailedFuture(new Exception("Split request is disabled."));
        }
        zzckq zzckq = new zzckq(this);
        if (this.zzfzd.remove(str) != null) {
            return zzdnt.zzaj(zzckq);
        }
        String valueOf = String.valueOf(str);
        return zzdnt.immediateFailedFuture(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
    }

    public final void zzc(zzaqx zzaqx, zzaqr zzaqr) {
        zza(zzc(zzaqx, Binder.getCallingUid()), zzaqr);
    }

    public final void zza(String str, zzaqr zzaqr) {
        zza(zzgi(str), zzaqr);
    }

    public final void zzb(zzaqx zzaqx, zzaqr zzaqr) {
        zzdof zzdof;
        int callingUid = Binder.getCallingUid();
        zzakk zza = zzq.zzli().zza(this.zzur, zzazo.zzxr());
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcqn)).booleanValue()) {
            zzdof = zzdnt.immediateFailedFuture(new Exception("Signal collection disabled."));
        } else {
            zzcyw zza2 = this.zzfzc.zza(zzaqx, callingUid);
            zzcyd<JSONObject> zzaed = zza2.zzaed();
            zzdof = zza2.zzaee().zza(zzdig.GET_SIGNALS, zzdnt.zzaj(zzaqx.zzdmz)).zza(new zzcko(zzaed)).zzw(zzdig.JS_SIGNALS).zza(zza.zza("google.afma.request.getSignals", zzakj.zzdbu, zzakj.zzdbv)).zzata();
        }
        zza((zzdof<InputStream>) zzdof, zzaqr);
    }

    private final void zza(zzdof<InputStream> zzdof, zzaqr zzaqr) {
        zzdnt.zza(zzdnt.zzb(zzdof, new zzckr(this), (Executor) zzazq.zzdxk), new zzckt(this, zzaqr), zzazq.zzdxp);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zza(zzdof zzdof, zzdof zzdof2) throws Exception {
        String zzuk = ((zzard) zzdof.get()).zzuk();
        this.zzfzd.put(zzuk, new zzcks((zzard) zzdof.get(), (JSONObject) zzdof2.get()));
        return new ByteArrayInputStream(zzuk.getBytes(zzdks.UTF_8));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzant() {
        zzazu.zza(this.zzfzb.zzum(), "persistFlags");
    }
}
