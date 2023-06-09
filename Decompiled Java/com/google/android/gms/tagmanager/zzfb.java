package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.internal.gtm.zzl;
import com.google.android.gms.internal.gtm.zzor;
import com.google.android.gms.internal.gtm.zzot;
import com.google.android.gms.internal.gtm.zzov;
import com.google.android.gms.internal.gtm.zzox;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@VisibleForTesting
final class zzfb {
    private static final zzdz<zzl> zzajp = new zzdz<>(zzgj.zzkc(), true);
    private final DataLayer zzaed;
    private final zzov zzajq;
    private final zzbo zzajr;
    private final Map<String, zzbq> zzajs;
    private final Map<String, zzbq> zzajt;
    private final Map<String, zzbq> zzaju;
    private final zzp<zzot, zzdz<zzl>> zzajv;
    private final zzp<String, zzfh> zzajw;
    private final Set<zzox> zzajx;
    private final Map<String, zzfi> zzajy;
    private volatile String zzajz;
    private int zzaka;

    public zzfb(Context context, zzov zzov, DataLayer dataLayer, zzan zzan, zzan zzan2, zzbo zzbo) {
        if (zzov != null) {
            this.zzajq = zzov;
            this.zzajx = new HashSet(zzov.zzls());
            this.zzaed = dataLayer;
            this.zzajr = zzbo;
            zzfc zzfc = new zzfc(this);
            new zzq();
            this.zzajv = zzq.zza(1048576, zzfc);
            zzfd zzfd = new zzfd(this);
            new zzq();
            this.zzajw = zzq.zza(1048576, zzfd);
            this.zzajs = new HashMap();
            zzb(new zzm(context));
            zzb(new zzam(zzan2));
            zzb(new zzaz(dataLayer));
            zzb(new zzgk(context, dataLayer));
            this.zzajt = new HashMap();
            zzc(new zzak());
            zzc(new zzbl());
            zzc(new zzbm());
            zzc(new zzbs());
            zzc(new zzbt());
            zzc(new zzde());
            zzc(new zzdf());
            zzc(new zzel());
            zzc(new zzfy());
            this.zzaju = new HashMap();
            zza((zzbq) new zze(context));
            zza((zzbq) new zzf(context));
            zza((zzbq) new zzh(context));
            zza((zzbq) new zzi(context));
            zza((zzbq) new zzj(context));
            zza((zzbq) new zzk(context));
            zza((zzbq) new zzl(context));
            zza((zzbq) new zzt());
            zza((zzbq) new zzaj(this.zzajq.getVersion()));
            zza((zzbq) new zzam(zzan));
            zza((zzbq) new zzas(dataLayer));
            zza((zzbq) new zzbc(context));
            zza((zzbq) new zzbd());
            zza((zzbq) new zzbk());
            zza((zzbq) new zzbp(this));
            zza((zzbq) new zzbu());
            zza((zzbq) new zzbv());
            zza((zzbq) new zzcv(context));
            zza((zzbq) new zzcx());
            zza((zzbq) new zzdd());
            zza((zzbq) new zzdk());
            zza((zzbq) new zzdm(context));
            zza((zzbq) new zzea());
            zza((zzbq) new zzee());
            zza((zzbq) new zzei());
            zza((zzbq) new zzek());
            zza((zzbq) new zzem(context));
            zza((zzbq) new zzfj());
            zza((zzbq) new zzfk());
            zza((zzbq) new zzge());
            zza((zzbq) new zzgl());
            this.zzajy = new HashMap();
            for (zzox next : this.zzajx) {
                for (int i = 0; i < next.zzmq().size(); i++) {
                    zzot zzot = next.zzmq().get(i);
                    zzfi zzb = zzb(this.zzajy, zza(zzot));
                    zzb.zza(next);
                    zzb.zza(next, zzot);
                    zzb.zza(next, "Unknown");
                }
                for (int i2 = 0; i2 < next.zzmr().size(); i2++) {
                    zzot zzot2 = next.zzmr().get(i2);
                    zzfi zzb2 = zzb(this.zzajy, zza(zzot2));
                    zzb2.zza(next);
                    zzb2.zzb(next, zzot2);
                    zzb2.zzb(next, "Unknown");
                }
            }
            for (Map.Entry next2 : this.zzajq.zzmo().entrySet()) {
                for (zzot zzot3 : (List) next2.getValue()) {
                    if (!zzgj.zzg(zzot3.zzlu().get(zzb.NOT_DEFAULT_MACRO.toString())).booleanValue()) {
                        zzb(this.zzajy, (String) next2.getKey()).zzb(zzot3);
                    }
                }
            }
            return;
        }
        throw new NullPointerException("resource cannot be null");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zze(java.util.List<com.google.android.gms.internal.gtm.zzj> r19) {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            java.util.Iterator r0 = r19.iterator()     // Catch:{ all -> 0x0185 }
        L_0x0007:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0185 }
            if (r2 == 0) goto L_0x0183
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0185 }
            com.google.android.gms.internal.gtm.zzj r2 = (com.google.android.gms.internal.gtm.zzj) r2     // Catch:{ all -> 0x0185 }
            java.lang.String r3 = r2.name     // Catch:{ all -> 0x0185 }
            if (r3 == 0) goto L_0x015f
            java.lang.String r3 = r2.name     // Catch:{ all -> 0x0185 }
            java.lang.String r4 = "gaExperiment:"
            boolean r3 = r3.startsWith(r4)     // Catch:{ all -> 0x0185 }
            if (r3 != 0) goto L_0x0023
            goto L_0x015f
        L_0x0023:
            com.google.android.gms.tagmanager.DataLayer r3 = r1.zzaed     // Catch:{ all -> 0x0185 }
            com.google.android.gms.internal.gtm.zzh r4 = r2.zzqi     // Catch:{ all -> 0x0185 }
            if (r4 != 0) goto L_0x002f
            java.lang.String r2 = "supplemental missing experimentSupplemental"
            com.google.android.gms.tagmanager.zzdi.zzac(r2)     // Catch:{ all -> 0x0185 }
            goto L_0x0007
        L_0x002f:
            com.google.android.gms.internal.gtm.zzh r4 = r2.zzqi     // Catch:{ all -> 0x0185 }
            com.google.android.gms.internal.gtm.zzl[] r4 = r4.zzpf     // Catch:{ all -> 0x0185 }
            int r5 = r4.length     // Catch:{ all -> 0x0185 }
            r6 = 0
            r7 = 0
        L_0x0036:
            if (r7 >= r5) goto L_0x0044
            r8 = r4[r7]     // Catch:{ all -> 0x0185 }
            java.lang.String r8 = com.google.android.gms.tagmanager.zzgj.zzc(r8)     // Catch:{ all -> 0x0185 }
            r3.zzaq(r8)     // Catch:{ all -> 0x0185 }
            int r7 = r7 + 1
            goto L_0x0036
        L_0x0044:
            com.google.android.gms.internal.gtm.zzh r4 = r2.zzqi     // Catch:{ all -> 0x0185 }
            com.google.android.gms.internal.gtm.zzl[] r4 = r4.zzpe     // Catch:{ all -> 0x0185 }
            int r5 = r4.length     // Catch:{ all -> 0x0185 }
            r7 = 0
        L_0x004a:
            r8 = 0
            if (r7 >= r5) goto L_0x008a
            r9 = r4[r7]     // Catch:{ all -> 0x0185 }
            java.lang.Object r9 = com.google.android.gms.tagmanager.zzgj.zzh((com.google.android.gms.internal.gtm.zzl) r9)     // Catch:{ all -> 0x0185 }
            boolean r10 = r9 instanceof java.util.Map     // Catch:{ all -> 0x0185 }
            if (r10 != 0) goto L_0x007f
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0185 }
            java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0185 }
            int r10 = r10.length()     // Catch:{ all -> 0x0185 }
            int r10 = r10 + 36
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0185 }
            r11.<init>(r10)     // Catch:{ all -> 0x0185 }
            java.lang.String r10 = "value: "
            r11.append(r10)     // Catch:{ all -> 0x0185 }
            r11.append(r9)     // Catch:{ all -> 0x0185 }
            java.lang.String r9 = " is not a map value, ignored."
            r11.append(r9)     // Catch:{ all -> 0x0185 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x0185 }
            com.google.android.gms.tagmanager.zzdi.zzac(r9)     // Catch:{ all -> 0x0185 }
            goto L_0x0082
        L_0x007f:
            r8 = r9
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x0185 }
        L_0x0082:
            if (r8 == 0) goto L_0x0087
            r3.push(r8)     // Catch:{ all -> 0x0185 }
        L_0x0087:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x008a:
            com.google.android.gms.internal.gtm.zzh r2 = r2.zzqi     // Catch:{ all -> 0x0185 }
            com.google.android.gms.internal.gtm.zzc$zzc[] r2 = r2.zzpg     // Catch:{ all -> 0x0185 }
            int r4 = r2.length     // Catch:{ all -> 0x0185 }
            r5 = 0
        L_0x0090:
            if (r5 >= r4) goto L_0x0007
            r7 = r2[r5]     // Catch:{ all -> 0x0185 }
            boolean r9 = r7.hasKey()     // Catch:{ all -> 0x0185 }
            if (r9 != 0) goto L_0x00a1
            java.lang.String r7 = "GaExperimentRandom: No key"
            com.google.android.gms.tagmanager.zzdi.zzac(r7)     // Catch:{ all -> 0x0185 }
            goto L_0x015b
        L_0x00a1:
            java.lang.String r9 = r7.getKey()     // Catch:{ all -> 0x0185 }
            java.lang.Object r9 = r3.get(r9)     // Catch:{ all -> 0x0185 }
            boolean r10 = r9 instanceof java.lang.Number     // Catch:{ all -> 0x0185 }
            if (r10 != 0) goto L_0x00af
            r10 = r8
            goto L_0x00ba
        L_0x00af:
            r10 = r9
            java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ all -> 0x0185 }
            long r10 = r10.longValue()     // Catch:{ all -> 0x0185 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0185 }
        L_0x00ba:
            long r11 = r7.zzg()     // Catch:{ all -> 0x0185 }
            long r13 = r7.zzh()     // Catch:{ all -> 0x0185 }
            boolean r15 = r7.zzi()     // Catch:{ all -> 0x0185 }
            if (r15 == 0) goto L_0x00da
            if (r10 == 0) goto L_0x00da
            long r15 = r10.longValue()     // Catch:{ all -> 0x0185 }
            int r17 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r17 < 0) goto L_0x00da
            long r15 = r10.longValue()     // Catch:{ all -> 0x0185 }
            int r10 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x00f6
        L_0x00da:
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 > 0) goto L_0x0156
            double r9 = java.lang.Math.random()     // Catch:{ all -> 0x0185 }
            long r13 = r13 - r11
            double r13 = (double) r13
            java.lang.Double.isNaN(r13)
            double r9 = r9 * r13
            double r11 = (double) r11
            java.lang.Double.isNaN(r11)
            double r9 = r9 + r11
            long r9 = java.lang.Math.round(r9)     // Catch:{ all -> 0x0185 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0185 }
        L_0x00f6:
            java.lang.String r10 = r7.getKey()     // Catch:{ all -> 0x0185 }
            r3.zzaq(r10)     // Catch:{ all -> 0x0185 }
            java.lang.String r10 = r7.getKey()     // Catch:{ all -> 0x0185 }
            java.util.Map r9 = com.google.android.gms.tagmanager.DataLayer.zzg(r10, r9)     // Catch:{ all -> 0x0185 }
            long r10 = r7.zzj()     // Catch:{ all -> 0x0185 }
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0152
            java.lang.String r10 = "gtm"
            boolean r10 = r9.containsKey(r10)     // Catch:{ all -> 0x0185 }
            if (r10 != 0) goto L_0x0133
            java.lang.String r10 = "gtm"
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ all -> 0x0185 }
            java.lang.String r12 = "lifetime"
            r11[r6] = r12     // Catch:{ all -> 0x0185 }
            long r12 = r7.zzj()     // Catch:{ all -> 0x0185 }
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0185 }
            r12 = 1
            r11[r12] = r7     // Catch:{ all -> 0x0185 }
            java.util.Map r7 = com.google.android.gms.tagmanager.DataLayer.mapOf(r11)     // Catch:{ all -> 0x0185 }
            r9.put(r10, r7)     // Catch:{ all -> 0x0185 }
            goto L_0x0152
        L_0x0133:
            java.lang.String r10 = "gtm"
            java.lang.Object r10 = r9.get(r10)     // Catch:{ all -> 0x0185 }
            boolean r11 = r10 instanceof java.util.Map     // Catch:{ all -> 0x0185 }
            if (r11 == 0) goto L_0x014d
            java.util.Map r10 = (java.util.Map) r10     // Catch:{ all -> 0x0185 }
            java.lang.String r11 = "lifetime"
            long r12 = r7.zzj()     // Catch:{ all -> 0x0185 }
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0185 }
            r10.put(r11, r7)     // Catch:{ all -> 0x0185 }
            goto L_0x0152
        L_0x014d:
            java.lang.String r7 = "GaExperimentRandom: gtm not a map"
            com.google.android.gms.tagmanager.zzdi.zzac(r7)     // Catch:{ all -> 0x0185 }
        L_0x0152:
            r3.push(r9)     // Catch:{ all -> 0x0185 }
            goto L_0x015b
        L_0x0156:
            java.lang.String r7 = "GaExperimentRandom: random range invalid"
            com.google.android.gms.tagmanager.zzdi.zzac(r7)     // Catch:{ all -> 0x0185 }
        L_0x015b:
            int r5 = r5 + 1
            goto L_0x0090
        L_0x015f:
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0185 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0185 }
            int r3 = r3.length()     // Catch:{ all -> 0x0185 }
            int r3 = r3 + 22
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0185 }
            r4.<init>(r3)     // Catch:{ all -> 0x0185 }
            java.lang.String r3 = "Ignored supplemental: "
            r4.append(r3)     // Catch:{ all -> 0x0185 }
            r4.append(r2)     // Catch:{ all -> 0x0185 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0185 }
            com.google.android.gms.tagmanager.zzdi.zzab(r2)     // Catch:{ all -> 0x0185 }
            goto L_0x0007
        L_0x0183:
            monitor-exit(r18)
            return
        L_0x0185:
            r0 = move-exception
            monitor-exit(r18)
            goto L_0x0189
        L_0x0188:
            throw r0
        L_0x0189:
            goto L_0x0188
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzfb.zze(java.util.List):void");
    }

    public final synchronized void zzan(String str) {
        zzbk(str);
        zzar zzid = this.zzajr.zzba(str).zzid();
        for (zzot zza : zza(this.zzajx, (Set<String>) new HashSet(), (zzfg) new zzff(this), zzid.zzhs()).getObject()) {
            zza(this.zzajs, zza, (Set<String>) new HashSet(), zzid.zzhr());
        }
        zzbk((String) null);
    }

    public final zzdz<zzl> zzbj(String str) {
        this.zzaka = 0;
        return zza(str, (Set<String>) new HashSet(), this.zzajr.zzaz(str).zzic());
    }

    @VisibleForTesting
    private final synchronized void zzbk(String str) {
        this.zzajz = str;
    }

    /* access modifiers changed from: package-private */
    public final synchronized String zzjf() {
        return this.zzajz;
    }

    private static zzfi zzb(Map<String, zzfi> map, String str) {
        zzfi zzfi = map.get(str);
        if (zzfi != null) {
            return zzfi;
        }
        zzfi zzfi2 = new zzfi();
        map.put(str, zzfi2);
        return zzfi2;
    }

    private final zzdz<Set<zzot>> zza(Set<zzox> set, Set<String> set2, zzfg zzfg, zzfa zzfa) {
        boolean z;
        zzdz zzdz;
        Set<String> set3 = set2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<zzox> it = set.iterator();
        while (true) {
            boolean z2 = true;
            while (true) {
                if (it.hasNext()) {
                    zzox next = it.next();
                    zzeq zzis = zzfa.zzis();
                    Iterator<zzot> it2 = next.zzlx().iterator();
                    while (true) {
                        boolean z3 = true;
                        while (true) {
                            if (!it2.hasNext()) {
                                Iterator<zzot> it3 = next.zzlw().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        zzgj.zzi(true);
                                        zzdz = new zzdz(true, z);
                                        break;
                                    }
                                    zzdz<Boolean> zza = zza(it3.next(), set3, zzis.zzin());
                                    if (!zza.getObject().booleanValue()) {
                                        zzgj.zzi(false);
                                        zzdz = new zzdz(false, zza.zziu());
                                        break;
                                    }
                                    z = z && zza.zziu();
                                }
                            } else {
                                zzdz<Boolean> zza2 = zza(it2.next(), set3, zzis.zzim());
                                if (zza2.getObject().booleanValue()) {
                                    zzgj.zzi(false);
                                    zzdz = new zzdz(false, zza2.zziu());
                                    break;
                                } else if (!z || !zza2.zziu()) {
                                    z3 = false;
                                }
                            }
                        }
                    }
                    if (((Boolean) zzdz.getObject()).booleanValue()) {
                        zzfg.zza(next, hashSet, hashSet2, zzis);
                    } else {
                        zzfg zzfg2 = zzfg;
                    }
                    if (!z2 || !zzdz.zziu()) {
                        z2 = false;
                    }
                } else {
                    hashSet.removeAll(hashSet2);
                    zzfa.zzb(hashSet);
                    return new zzdz<>(hashSet, z2);
                }
            }
        }
    }

    private static String zza(zzot zzot) {
        return zzgj.zzc(zzot.zzlu().get(zzb.INSTANCE_NAME.toString()));
    }

    private static void zza(Map<String, zzbq> map, zzbq zzbq) {
        if (map.containsKey(zzbq.zzif())) {
            String valueOf = String.valueOf(zzbq.zzif());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Duplicate function type name: ".concat(valueOf) : new String("Duplicate function type name: "));
        } else {
            map.put(zzbq.zzif(), zzbq);
        }
    }

    @VisibleForTesting
    private final void zza(zzbq zzbq) {
        zza(this.zzaju, zzbq);
    }

    @VisibleForTesting
    private final void zzb(zzbq zzbq) {
        zza(this.zzajs, zzbq);
    }

    @VisibleForTesting
    private final void zzc(zzbq zzbq) {
        zza(this.zzajt, zzbq);
    }

    @VisibleForTesting
    private final zzdz<Boolean> zza(zzot zzot, Set<String> set, zzen zzen) {
        zzdz<zzl> zza = zza(this.zzajt, zzot, set, zzen);
        Boolean zzg = zzgj.zzg(zza.getObject());
        zzen.zza(zzgj.zzi(zzg));
        return new zzdz<>(zzg, zza.zziu());
    }

    private final String zzjg() {
        if (this.zzaka <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.zzaka));
        for (int i = 2; i < this.zzaka; i++) {
            sb.append(' ');
        }
        sb.append(": ");
        return sb.toString();
    }

    private final zzdz<zzl> zza(String str, Set<String> set, zzdl zzdl) {
        zzot zzot;
        this.zzaka++;
        zzfh zzfh = this.zzajw.get(str);
        if (zzfh != null) {
            this.zzajr.zzie();
            zza(zzfh.zzji(), set);
            this.zzaka--;
            return zzfh.zzjh();
        }
        zzfi zzfi = this.zzajy.get(str);
        if (zzfi == null) {
            String zzjg = zzjg();
            StringBuilder sb = new StringBuilder(String.valueOf(zzjg).length() + 15 + String.valueOf(str).length());
            sb.append(zzjg);
            sb.append("Invalid macro: ");
            sb.append(str);
            zzdi.zzav(sb.toString());
            this.zzaka--;
            return zzajp;
        }
        zzdz<Set<zzot>> zza = zza(zzfi.zzjj(), set, (zzfg) new zzfe(this, zzfi.zzjk(), zzfi.zzjl(), zzfi.zzjn(), zzfi.zzjm()), zzdl.zzhs());
        if (zza.getObject().isEmpty()) {
            zzot = zzfi.zzjo();
        } else {
            if (zza.getObject().size() > 1) {
                String zzjg2 = zzjg();
                StringBuilder sb2 = new StringBuilder(String.valueOf(zzjg2).length() + 37 + String.valueOf(str).length());
                sb2.append(zzjg2);
                sb2.append("Multiple macros active for macroName ");
                sb2.append(str);
                zzdi.zzac(sb2.toString());
            }
            zzot = (zzot) zza.getObject().iterator().next();
        }
        if (zzot == null) {
            this.zzaka--;
            return zzajp;
        }
        zzdz<zzl> zza2 = zza(this.zzaju, zzot, set, zzdl.zzil());
        boolean z = zza.zziu() && zza2.zziu();
        zzdz<zzl> zzdz = zzajp;
        if (zza2 != zzdz) {
            zzdz = new zzdz<>(zza2.getObject(), z);
        }
        zzl zzji = zzot.zzji();
        if (zzdz.zziu()) {
            this.zzajw.zza(str, new zzfh(zzdz, zzji));
        }
        zza(zzji, set);
        this.zzaka--;
        return zzdz;
    }

    private final void zza(zzl zzl, Set<String> set) {
        zzdz<zzl> zza;
        if (zzl != null && (zza = zza(zzl, set, (zzgm) new zzdx())) != zzajp) {
            Object zzh = zzgj.zzh(zza.getObject());
            if (zzh instanceof Map) {
                this.zzaed.push((Map) zzh);
            } else if (zzh instanceof List) {
                for (Object next : (List) zzh) {
                    if (next instanceof Map) {
                        this.zzaed.push((Map) next);
                    } else {
                        zzdi.zzac("pushAfterEvaluate: value not a Map");
                    }
                }
            } else {
                zzdi.zzac("pushAfterEvaluate: value not a Map or List");
            }
        }
    }

    private final zzdz<zzl> zza(zzl zzl, Set<String> set, zzgm zzgm) {
        if (!zzl.zzqw) {
            return new zzdz<>(zzl, true);
        }
        int i = zzl.type;
        if (i == 2) {
            zzl zzk = zzor.zzk(zzl);
            zzk.zzqn = new zzl[zzl.zzqn.length];
            for (int i2 = 0; i2 < zzl.zzqn.length; i2++) {
                zzdz<zzl> zza = zza(zzl.zzqn[i2], set, zzgm.zzv(i2));
                zzdz<zzl> zzdz = zzajp;
                if (zza == zzdz) {
                    return zzdz;
                }
                zzk.zzqn[i2] = zza.getObject();
            }
            return new zzdz<>(zzk, false);
        } else if (i == 3) {
            zzl zzk2 = zzor.zzk(zzl);
            if (zzl.zzqo.length != zzl.zzqp.length) {
                String valueOf = String.valueOf(zzl.toString());
                zzdi.zzav(valueOf.length() != 0 ? "Invalid serving value: ".concat(valueOf) : new String("Invalid serving value: "));
                return zzajp;
            }
            zzk2.zzqo = new zzl[zzl.zzqo.length];
            zzk2.zzqp = new zzl[zzl.zzqo.length];
            for (int i3 = 0; i3 < zzl.zzqo.length; i3++) {
                zzdz<zzl> zza2 = zza(zzl.zzqo[i3], set, zzgm.zzw(i3));
                zzdz<zzl> zza3 = zza(zzl.zzqp[i3], set, zzgm.zzx(i3));
                zzdz<zzl> zzdz2 = zzajp;
                if (zza2 == zzdz2 || zza3 == zzdz2) {
                    return zzajp;
                }
                zzk2.zzqo[i3] = zza2.getObject();
                zzk2.zzqp[i3] = zza3.getObject();
            }
            return new zzdz<>(zzk2, false);
        } else if (i != 4) {
            if (i != 7) {
                int i4 = zzl.type;
                StringBuilder sb = new StringBuilder(25);
                sb.append("Unknown type: ");
                sb.append(i4);
                zzdi.zzav(sb.toString());
                return zzajp;
            }
            zzl zzk3 = zzor.zzk(zzl);
            zzk3.zzqu = new zzl[zzl.zzqu.length];
            for (int i5 = 0; i5 < zzl.zzqu.length; i5++) {
                zzdz<zzl> zza4 = zza(zzl.zzqu[i5], set, zzgm.zzy(i5));
                zzdz<zzl> zzdz3 = zzajp;
                if (zza4 == zzdz3) {
                    return zzdz3;
                }
                zzk3.zzqu[i5] = zza4.getObject();
            }
            return new zzdz<>(zzk3, false);
        } else if (set.contains(zzl.zzqq)) {
            String str = zzl.zzqq;
            String obj = set.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(obj).length());
            sb2.append("Macro cycle detected.  Current macro reference: ");
            sb2.append(str);
            sb2.append(".  Previous macro references: ");
            sb2.append(obj);
            sb2.append(".");
            zzdi.zzav(sb2.toString());
            return zzajp;
        } else {
            set.add(zzl.zzqq);
            zzdz<zzl> zza5 = zzgn.zza(zza(zzl.zzqq, set, zzgm.zzit()), zzl.zzqv);
            set.remove(zzl.zzqq);
            return zza5;
        }
    }

    private final zzdz<zzl> zza(Map<String, zzbq> map, zzot zzot, Set<String> set, zzen zzen) {
        zzl zzl = zzot.zzlu().get(zzb.FUNCTION.toString());
        if (zzl == null) {
            zzdi.zzav("No function id in properties");
            return zzajp;
        }
        String str = zzl.zzqr;
        zzbq zzbq = map.get(str);
        if (zzbq == null) {
            zzdi.zzav(String.valueOf(str).concat(" has no backing implementation."));
            return zzajp;
        }
        zzdz<zzl> zzdz = this.zzajv.get(zzot);
        if (zzdz != null) {
            this.zzajr.zzie();
            return zzdz;
        }
        HashMap hashMap = new HashMap();
        boolean z = true;
        boolean z2 = true;
        for (Map.Entry next : zzot.zzlu().entrySet()) {
            zzdz<zzl> zza = zza((zzl) next.getValue(), set, zzen.zzbg((String) next.getKey()).zzb((zzl) next.getValue()));
            zzdz<zzl> zzdz2 = zzajp;
            if (zza == zzdz2) {
                return zzdz2;
            }
            if (zza.zziu()) {
                zzot.zza((String) next.getKey(), zza.getObject());
            } else {
                z2 = false;
            }
            hashMap.put((String) next.getKey(), zza.getObject());
        }
        if (!zzbq.zza(hashMap.keySet())) {
            String valueOf = String.valueOf(zzbq.zzig());
            String valueOf2 = String.valueOf(hashMap.keySet());
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
            sb.append("Incorrect keys for function ");
            sb.append(str);
            sb.append(" required ");
            sb.append(valueOf);
            sb.append(" had ");
            sb.append(valueOf2);
            zzdi.zzav(sb.toString());
            return zzajp;
        }
        if (!z2 || !zzbq.zzgw()) {
            z = false;
        }
        zzdz<zzl> zzdz3 = new zzdz<>(zzbq.zzb(hashMap), z);
        if (z) {
            this.zzajv.zza(zzot, zzdz3);
        }
        zzen.zza(zzdz3.getObject());
        return zzdz3;
    }
}
