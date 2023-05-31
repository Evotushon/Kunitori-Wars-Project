package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzede;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzats implements zzaub {
    /* access modifiers changed from: private */
    public static List<Future<Void>> zzdpi = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */
    public final Object lock = new Object();
    private final zzaua zzdmi;
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    public final zzedo zzdpj;
    @GuardedBy("lock")
    private final LinkedHashMap<String, zzedp> zzdpk;
    @GuardedBy("lock")
    private final List<String> zzdpl = new ArrayList();
    @GuardedBy("lock")
    private final List<String> zzdpm = new ArrayList();
    private final zzaud zzdpn;
    @VisibleForTesting
    private boolean zzdpo;
    private final zzaug zzdpp;
    private HashSet<String> zzdpq = new HashSet<>();
    private boolean zzdpr = false;
    private boolean zzdps = false;
    private boolean zzdpt = false;
    private final Context zzur;

    public zzats(Context context, zzazo zzazo, zzaua zzaua, String str, zzaud zzaud) {
        Preconditions.checkNotNull(zzaua, "SafeBrowsing config is not present.");
        this.zzur = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzdpk = new LinkedHashMap<>();
        this.zzdpn = zzaud;
        this.zzdmi = zzaua;
        for (String lowerCase : this.zzdmi.zzdqb) {
            this.zzdpq.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.zzdpq.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzedo zzedo = new zzedo();
        zzedo.zziee = zzede.zzb.zzg.OCTAGON_AD;
        zzedo.url = str;
        zzedo.zzieg = str;
        zzede.zzb.zza.C0011zza zzbfv = zzede.zzb.zza.zzbfv();
        if (this.zzdmi.zzdpx != null) {
            zzbfv.zzhp(this.zzdmi.zzdpx);
        }
        zzedo.zziei = (zzede.zzb.zza) ((zzdyz) zzbfv.zzbcx());
        zzede.zzb.zzi.zza zzbt = zzede.zzb.zzi.zzbgf().zzbt(Wrappers.packageManager(this.zzur).isCallerInstantApp());
        if (zzazo.zzbmj != null) {
            zzbt.zzhq(zzazo.zzbmj);
        }
        long apkVersion = (long) GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzur);
        if (apkVersion > 0) {
            zzbt.zzfu(apkVersion);
        }
        zzedo.zzies = (zzede.zzb.zzi) ((zzdyz) zzbt.zzbcx());
        this.zzdpj = zzedo;
        this.zzdpp = new zzaug(this.zzur, this.zzdmi.zzdqe, this);
    }

    static final /* synthetic */ Void zzea(String str) {
        return null;
    }

    public final zzaua zzup() {
        return this.zzdmi;
    }

    public final void zzdw(String str) {
        synchronized (this.lock) {
            this.zzdpj.zziek = str;
        }
    }

    public final boolean zzuq() {
        return PlatformVersion.isAtLeastKitKat() && this.zzdmi.zzdpz && !this.zzdps;
    }

    public final void zzj(View view) {
        if (this.zzdmi.zzdpz && !this.zzdps) {
            zzq.zzkv();
            Bitmap zzl = zzawo.zzl(view);
            if (zzl == null) {
                zzauc.zzeb("Failed to capture the webview bitmap.");
                return;
            }
            this.zzdps = true;
            zzawo.zzc(new zzatt(this, zzl));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.lock
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x0009
            r2 = 1
            r6.zzdpt = r2     // Catch:{ all -> 0x00c6 }
        L_0x0009:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzedp> r2 = r6.zzdpk     // Catch:{ all -> 0x00c6 }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x0023
            if (r9 != r1) goto L_0x0021
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzedp> r8 = r6.zzdpk     // Catch:{ all -> 0x00c6 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzedp r7 = (com.google.android.gms.internal.ads.zzedp) r7     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzede$zzb$zzh$zza r8 = com.google.android.gms.internal.ads.zzede.zzb.zzh.zza.zzhh(r9)     // Catch:{ all -> 0x00c6 }
            r7.zzifc = r8     // Catch:{ all -> 0x00c6 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            return
        L_0x0023:
            com.google.android.gms.internal.ads.zzedp r1 = new com.google.android.gms.internal.ads.zzedp     // Catch:{ all -> 0x00c6 }
            r1.<init>()     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzede$zzb$zzh$zza r9 = com.google.android.gms.internal.ads.zzede.zzb.zzh.zza.zzhh(r9)     // Catch:{ all -> 0x00c6 }
            r1.zzifc = r9     // Catch:{ all -> 0x00c6 }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzedp> r9 = r6.zzdpk     // Catch:{ all -> 0x00c6 }
            int r9 = r9.size()     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00c6 }
            r1.zziew = r9     // Catch:{ all -> 0x00c6 }
            r1.url = r7     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzedn r9 = new com.google.android.gms.internal.ads.zzedn     // Catch:{ all -> 0x00c6 }
            r9.<init>()     // Catch:{ all -> 0x00c6 }
            r1.zziex = r9     // Catch:{ all -> 0x00c6 }
            java.util.HashSet<java.lang.String> r9 = r6.zzdpq     // Catch:{ all -> 0x00c6 }
            int r9 = r9.size()     // Catch:{ all -> 0x00c6 }
            if (r9 <= 0) goto L_0x00bf
            if (r8 == 0) goto L_0x00bf
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00c6 }
            r9.<init>()     // Catch:{ all -> 0x00c6 }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00c6 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00c6 }
        L_0x005a:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x00b2
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00c6 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00c6 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00c6 }
            if (r3 == 0) goto L_0x0073
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00c6 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00c6 }
            goto L_0x0075
        L_0x0073:
            java.lang.String r3 = ""
        L_0x0075:
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x00c6 }
            if (r4 == 0) goto L_0x0082
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00c6 }
            goto L_0x0084
        L_0x0082:
            java.lang.String r2 = ""
        L_0x0084:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00c6 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ all -> 0x00c6 }
            java.util.HashSet<java.lang.String> r5 = r6.zzdpq     // Catch:{ all -> 0x00c6 }
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x00c6 }
            if (r4 == 0) goto L_0x005a
            com.google.android.gms.internal.ads.zzede$zzb$zzc$zza r4 = com.google.android.gms.internal.ads.zzede.zzb.zzc.zzbfx()     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzdxn r3 = com.google.android.gms.internal.ads.zzdxn.zzhi(r3)     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzede$zzb$zzc$zza r3 = r4.zzao(r3)     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzdxn r2 = com.google.android.gms.internal.ads.zzdxn.zzhi(r2)     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzede$zzb$zzc$zza r2 = r3.zzap(r2)     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzeah r2 = r2.zzbcx()     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzdyz r2 = (com.google.android.gms.internal.ads.zzdyz) r2     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzede$zzb$zzc r2 = (com.google.android.gms.internal.ads.zzede.zzb.zzc) r2     // Catch:{ all -> 0x00c6 }
            r9.add(r2)     // Catch:{ all -> 0x00c6 }
            goto L_0x005a
        L_0x00b2:
            int r8 = r9.size()     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzede$zzb$zzc[] r8 = new com.google.android.gms.internal.ads.zzede.zzb.zzc[r8]     // Catch:{ all -> 0x00c6 }
            r9.toArray(r8)     // Catch:{ all -> 0x00c6 }
            com.google.android.gms.internal.ads.zzedn r9 = r1.zziex     // Catch:{ all -> 0x00c6 }
            r9.zziea = r8     // Catch:{ all -> 0x00c6 }
        L_0x00bf:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.zzedp> r8 = r6.zzdpk     // Catch:{ all -> 0x00c6 }
            r8.put(r7, r1)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            return
        L_0x00c6:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c9:
            throw r7
        L_0x00ca:
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzats.zza(java.lang.String, java.util.Map, int):void");
    }

    /* access modifiers changed from: package-private */
    public final void zzdx(String str) {
        synchronized (this.lock) {
            this.zzdpl.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzdy(String str) {
        synchronized (this.lock) {
            this.zzdpm.add(str);
        }
    }

    public final String[] zza(String[] strArr) {
        return (String[]) this.zzdpp.zzb(strArr).toArray(new String[0]);
    }

    public final void zzur() {
        this.zzdpr = true;
    }

    @Nullable
    private final zzedp zzdz(String str) {
        zzedp zzedp;
        synchronized (this.lock) {
            zzedp = this.zzdpk.get(str);
        }
        return zzedp;
    }

    public final void zzus() {
        synchronized (this.lock) {
            zzdof<O> zzb = zzdnt.zzb(this.zzdpn.zza(this.zzur, this.zzdpk.keySet()), new zzatr(this), (Executor) zzazq.zzdxp);
            zzdof<O> zza = zzdnt.zza(zzb, 10, TimeUnit.SECONDS, zzazq.zzdxn);
            zzdnt.zza(zzb, new zzatw(this, zza), zzazq.zzdxp);
            zzdpi.add(zza);
        }
    }

    @VisibleForTesting
    private final zzdof<Void> zzut() {
        zzdof<Void> zzb;
        if (!((this.zzdpo && this.zzdmi.zzdqd) || (this.zzdpt && this.zzdmi.zzdqc) || (!this.zzdpo && this.zzdmi.zzdqa))) {
            return zzdnt.zzaj(null);
        }
        synchronized (this.lock) {
            this.zzdpj.zziej = new zzedp[this.zzdpk.size()];
            this.zzdpk.values().toArray(this.zzdpj.zziej);
            this.zzdpj.zziet = (String[]) this.zzdpl.toArray(new String[0]);
            this.zzdpj.zzieu = (String[]) this.zzdpm.toArray(new String[0]);
            if (zzauc.isEnabled()) {
                String str = this.zzdpj.url;
                String str2 = this.zzdpj.zziek;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(str);
                sb.append("\n  clickUrl: ");
                sb.append(str2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (zzedp zzedp : this.zzdpj.zziej) {
                    sb2.append("    [");
                    sb2.append(zzedp.zzifd.length);
                    sb2.append("] ");
                    sb2.append(zzedp.url);
                }
                zzauc.zzeb(sb2.toString());
            }
            zzdof<String> zza = new zzaxx(this.zzur).zza(1, this.zzdmi.zzdpy, (Map<String, String>) null, zzeda.zzb(this.zzdpj));
            if (zzauc.isEnabled()) {
                zza.addListener(new zzatv(this), zzazq.zzdxk);
            }
            zzb = zzdnt.zzb(zza, zzatu.zzdpv, (Executor) zzazq.zzdxp);
        }
        return zzb;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zzh(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.lock) {
                            int length = optJSONArray.length();
                            zzedp zzdz = zzdz(str);
                            if (zzdz == null) {
                                String valueOf = String.valueOf(str);
                                zzauc.zzeb(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                zzdz.zzifd = new String[length];
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    zzdz.zzifd[i] = optJSONArray.getJSONObject(i).getString("threat_type");
                                }
                                boolean z2 = this.zzdpo;
                                if (length > 0) {
                                    z = true;
                                }
                                this.zzdpo = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (zzabp.zzcvp.get().booleanValue()) {
                    zzawf.zzb("Failed to get SafeBrowsing metadata", e);
                }
                return zzdnt.immediateFailedFuture(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zzdpo) {
            synchronized (this.lock) {
                this.zzdpj.zziee = zzede.zzb.zzg.OCTAGON_AD_SB_MATCH;
            }
        }
        return zzut();
    }
}
