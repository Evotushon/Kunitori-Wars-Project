package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbik extends zzwm {
    private final zzazo zzblu;
    private final zzaui zzbnp;
    private final zzcnk zzfct;
    private final zzcmc<zzdfb, zzcnl> zzfcu;
    private final zzcrq zzfcv;
    private final zzcho zzfcw;
    private final zzceu zzfcx;
    private final Context zzur;
    @GuardedBy("this")
    private boolean zzyb = false;

    zzbik(Context context, zzazo zzazo, zzcnk zzcnk, zzcmc<zzdfb, zzcnl> zzcmc, zzcrq zzcrq, zzcho zzcho, zzaui zzaui, zzceu zzceu) {
        this.zzur = context;
        this.zzblu = zzazo;
        this.zzfct = zzcnk;
        this.zzfcu = zzcmc;
        this.zzfcv = zzcrq;
        this.zzfcw = zzcho;
        this.zzbnp = zzaui;
        this.zzfcx = zzceu;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void initialize() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzyb     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "Mobile ads is initialized already."
            com.google.android.gms.internal.ads.zzawf.zzfa(r0)     // Catch:{ all -> 0x005d }
            monitor-exit(r3)
            return
        L_0x000c:
            android.content.Context r0 = r3.zzur     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzzx.initialize(r0)     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzavr r0 = com.google.android.gms.ads.internal.zzq.zzkz()     // Catch:{ all -> 0x005d }
            android.content.Context r1 = r3.zzur     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzazo r2 = r3.zzblu     // Catch:{ all -> 0x005d }
            r0.zzd(r1, r2)     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzrr r0 = com.google.android.gms.ads.internal.zzq.zzlb()     // Catch:{ all -> 0x005d }
            android.content.Context r1 = r3.zzur     // Catch:{ all -> 0x005d }
            r0.initialize(r1)     // Catch:{ all -> 0x005d }
            r0 = 1
            r3.zzyb = r0     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzcho r0 = r3.zzfcw     // Catch:{ all -> 0x005d }
            r0.zzanf()     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzzx.zzclh     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x005d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0044
            com.google.android.gms.internal.ads.zzcrq r0 = r3.zzfcv     // Catch:{ all -> 0x005d }
            r0.zzamh()     // Catch:{ all -> 0x005d }
        L_0x0044:
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzzx.zzcno     // Catch:{ all -> 0x005d }
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x005d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x005b
            com.google.android.gms.internal.ads.zzceu r0 = r3.zzfcx     // Catch:{ all -> 0x005d }
            r0.zzamh()     // Catch:{ all -> 0x005d }
        L_0x005b:
            monitor-exit(r3)
            return
        L_0x005d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbik.initialize():void");
    }

    public final synchronized void setAppVolume(float f) {
        zzq.zzla().setAppVolume(f);
    }

    public final synchronized float zzpj() {
        return zzq.zzla().zzpj();
    }

    public final synchronized void setAppMuted(boolean z) {
        zzq.zzla().setAppMuted(z);
    }

    public final synchronized boolean zzpk() {
        return zzq.zzla().zzpk();
    }

    public final synchronized void zzce(String str) {
        zzzx.initialize(this.zzur);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcnn)).booleanValue()) {
                zzq.zzld().zza(this.zzur, this.zzblu, str, (Runnable) null);
            }
        }
    }

    public final void zzb(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzawf.zzey("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zzawf.zzey("Context is null. Failed to open debug menu.");
            return;
        }
        zzaxg zzaxg = new zzaxg(context);
        zzaxg.setAdUnitId(str);
        zzaxg.zzx(this.zzblu.zzbmj);
        zzaxg.showDialog();
    }

    public final void zza(@Nullable String str, IObjectWrapper iObjectWrapper) {
        String str2;
        zzzx.initialize(this.zzur);
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcnp)).booleanValue()) {
            zzq.zzkv();
            str2 = zzawo.zzbe(this.zzur);
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            boolean booleanValue = ((Boolean) zzvh.zzpd().zzd(zzzx.zzcnn)).booleanValue() | ((Boolean) zzvh.zzpd().zzd(zzzx.zzcjq)).booleanValue();
            zzbin zzbin = null;
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcjq)).booleanValue()) {
                booleanValue = true;
                zzbin = new zzbin(this, (Runnable) ObjectWrapper.unwrap(iObjectWrapper));
            }
            if (booleanValue) {
                zzq.zzld().zza(this.zzur, this.zzblu, str, (Runnable) zzbin);
            }
        }
    }

    public final String getVersionString() {
        return this.zzblu.zzbmj;
    }

    public final void zzcf(String str) {
        this.zzfcv.zzgl(str);
    }

    public final void zza(zzalk zzalk) throws RemoteException {
        this.zzfct.zzb(zzalk);
    }

    public final void zza(zzahc zzahc) throws RemoteException {
        this.zzfcw.zzb(zzahc);
    }

    public final List<zzagz> zzpl() throws RemoteException {
        return this.zzfcw.zzang();
    }

    public final void zza(zzyw zzyw) throws RemoteException {
        this.zzbnp.zza(this.zzur, zzyw);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map<String, zzalj> zzvs = zzq.zzkz().zzvk().zzwf().zzvs();
        if (zzvs != null && !zzvs.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    zzawf.zzd("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.zzfct.zzaod()) {
                HashMap hashMap = new HashMap();
                for (zzalj zzalj : zzvs.values()) {
                    for (zzalg next : zzalj.zzddo) {
                        String str = next.zzddb;
                        for (String next2 : next.zzdct) {
                            if (!hashMap.containsKey(next2)) {
                                hashMap.put(next2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(next2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    try {
                        zzcmd<zzdfb, zzcnl> zzd = this.zzfcu.zzd(str2, jSONObject);
                        if (zzd != null) {
                            zzdfb zzdfb = (zzdfb) zzd.zzdel;
                            if (!zzdfb.isInitialized()) {
                                if (zzdfb.zzsu()) {
                                    zzdfb.zza(this.zzur, (zzasm) (zzcnl) zzd.zzgbd, (List<String>) (List) entry.getValue());
                                    String valueOf = String.valueOf(str2);
                                    zzawf.zzeb(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                                }
                            }
                        }
                    } catch (zzdfa e) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str2);
                        sb.append("\"");
                        zzawf.zzd(sb.toString(), e);
                    }
                }
            }
        }
    }
}
