package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.zzq;
import com.google.firebase.messaging.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcho {
    /* access modifiers changed from: private */
    public final Executor executor;
    private final zzazo zzblr;
    private final Context zzcgw;
    private final Executor zzfeo;
    private final ScheduledExecutorService zzffm;
    private boolean zzfwn = false;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public boolean zzfwo = false;
    /* access modifiers changed from: private */
    public final long zzfwp;
    /* access modifiers changed from: private */
    public final zzazy<Boolean> zzfwq = new zzazy<>();
    private final WeakReference<Context> zzfwr;
    private final zzcnk zzfws;
    /* access modifiers changed from: private */
    public final zzcgy zzfwt;
    private Map<String, zzagz> zzfwu = new ConcurrentHashMap();

    public zzcho(Executor executor2, Context context, WeakReference<Context> weakReference, Executor executor3, zzcnk zzcnk, ScheduledExecutorService scheduledExecutorService, zzcgy zzcgy, zzazo zzazo) {
        this.zzfws = zzcnk;
        this.zzcgw = context;
        this.zzfwr = weakReference;
        this.executor = executor3;
        this.zzffm = scheduledExecutorService;
        this.zzfeo = executor2;
        this.zzfwt = zzcgy;
        this.zzblr = zzazo;
        this.zzfwp = zzq.zzlc().elapsedRealtime();
        zza("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public final void zzb(zzahc zzahc) {
        this.zzfwq.addListener(new zzchr(this, zzahc), this.zzfeo);
    }

    public final void zzanf() {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzclk)).booleanValue() && !zzabk.zzcuz.get().booleanValue()) {
            if (this.zzblr.zzdxg >= ((Integer) zzvh.zzpd().zzd(zzzx.zzcll)).intValue()) {
                if (!this.zzfwn) {
                    synchronized (this) {
                        if (!this.zzfwn) {
                            this.zzfwt.zzanc();
                            this.zzfwq.addListener(new zzchq(this), this.executor);
                            this.zzfwn = true;
                            zzdof<String> zzanh = zzanh();
                            this.zzffm.schedule(new zzchs(this), ((Long) zzvh.zzpd().zzd(zzzx.zzcln)).longValue(), TimeUnit.SECONDS);
                            zzdnt.zza(zzanh, new zzchz(this), this.executor);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        zza("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zzfwq.set(false);
    }

    public final List<zzagz> zzang() {
        ArrayList arrayList = new ArrayList();
        for (String next : this.zzfwu.keySet()) {
            zzagz zzagz = this.zzfwu.get(next);
            arrayList.add(new zzagz(next, zzagz.zzczg, zzagz.zzczh, zzagz.description));
        }
        return arrayList;
    }

    private final synchronized zzdof<String> zzanh() {
        String zzvq = zzq.zzkz().zzvk().zzwf().zzvq();
        if (!TextUtils.isEmpty(zzvq)) {
            return zzdnt.zzaj(zzvq);
        }
        zzazy zzazy = new zzazy();
        zzq.zzkz().zzvk().zzb(new zzcht(this, zzazy));
        return zzazy;
    }

    /* access modifiers changed from: private */
    public final void zzgg(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = new Object();
                zzazy zzazy = new zzazy();
                zzdof zza = zzdnt.zza(zzazy, ((Long) zzvh.zzpd().zzd(zzzx.zzclm)).longValue(), TimeUnit.SECONDS, this.zzffm);
                this.zzfwt.zzge(next);
                long elapsedRealtime = zzq.zzlc().elapsedRealtime();
                Iterator<String> it = keys;
                zzchv zzchv = r1;
                zzchv zzchv2 = new zzchv(this, obj, zzazy, next, elapsedRealtime);
                zza.addListener(zzchv, this.executor);
                arrayList.add(zza);
                zzcib zzcib = new zzcib(this, obj, next, elapsedRealtime, zzazy);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                }
                            }
                            arrayList2.add(new zzahj(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                zza(next, false, "", 0);
                try {
                    this.zzfeo.execute(new zzchx(this, this.zzfws.zze(next, new JSONObject()), zzcib, arrayList2, next));
                } catch (zzdfa unused2) {
                    try {
                        zzcib.onInitializationFailed("Failed to create Adapter.");
                    } catch (RemoteException e) {
                        zzazh.zzc("", e);
                    }
                }
                keys = it;
            }
            zzdnt.zzh(arrayList).zza(new zzchu(this), this.executor);
        } catch (JSONException e2) {
            zzawf.zza("Malformed CLD response", e2);
        }
    }

    /* access modifiers changed from: private */
    public final void zza(String str, boolean z, String str2, int i) {
        this.zzfwu.put(str, new zzagz(str, z, i, str2));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        com.google.android.gms.internal.ads.zzazh.zzc("", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 74);
        r4.append("Failed to initialize adapter. ");
        r4.append(r5);
        r4.append(" does not implement the initialize() method.");
        r3.onInitializationFailed(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzdfb r2, com.google.android.gms.internal.ads.zzahb r3, java.util.List r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.zzfwr     // Catch:{ zzdfa -> 0x0011 }
            java.lang.Object r0 = r0.get()     // Catch:{ zzdfa -> 0x0011 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ zzdfa -> 0x0011 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            android.content.Context r0 = r1.zzcgw     // Catch:{ zzdfa -> 0x0011 }
        L_0x000d:
            r2.zza((android.content.Context) r0, (com.google.android.gms.internal.ads.zzahb) r3, (java.util.List<com.google.android.gms.internal.ads.zzahj>) r4)     // Catch:{ zzdfa -> 0x0011 }
            return
        L_0x0011:
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2.length()     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2 + 74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0035 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = "Failed to initialize adapter. "
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            r4.append(r5)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = " does not implement the initialize() method."
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = r4.toString()     // Catch:{ RemoteException -> 0x0035 }
            r3.onInitializationFailed(r2)     // Catch:{ RemoteException -> 0x0035 }
            return
        L_0x0035:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.zzazh.zzc(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcho.zza(com.google.android.gms.internal.ads.zzdfb, com.google.android.gms.internal.ads.zzahb, java.util.List, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzani() throws Exception {
        this.zzfwq.set(true);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, zzazy zzazy, String str, long j) {
        synchronized (obj) {
            if (!zzazy.isDone()) {
                zza(str, false, "Timeout.", (int) (zzq.zzlc().elapsedRealtime() - j));
                this.zzfwt.zzq(str, "timeout");
                zzazy.set(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzanj() {
        synchronized (this) {
            if (!this.zzfwo) {
                zza("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzq.zzlc().elapsedRealtime() - this.zzfwp));
                this.zzfwq.setException(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzazy zzazy) {
        this.executor.execute(new zzchw(this, zzazy));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzank() {
        this.zzfwt.zzand();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzahc zzahc) {
        try {
            zzahc.zzd(zzang());
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }
}
