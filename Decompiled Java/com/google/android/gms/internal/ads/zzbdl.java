package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;
import java.util.List;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbdl extends zzbda implements zzbcn {
    private String zzdzm;
    private boolean zzeeu;
    private zzbcf zzeex;
    private Exception zzeey;
    private boolean zzeez;

    public zzbdl(zzbbm zzbbm, zzbbj zzbbj) {
        super(zzbbm);
        this.zzeex = new zzbcf(zzbbm.getContext(), zzbbj);
        this.zzeex.zza((zzbcn) this);
    }

    public final void zzda(int i) {
    }

    public final void zzn(int i, int i2) {
    }

    public final void zzb(boolean z, long j) {
        zzbbm zzbbm = (zzbbm) this.zzeem.get();
        if (zzbbm != null) {
            zzazq.zzdxo.execute(new zzbdo(zzbbm, z, j));
        }
    }

    public final void zza(String str, Exception exc) {
        String str2 = (String) zzvh.zzpd().zzd(zzzx.zzchl);
        if (str2 != null) {
            List asList = Arrays.asList(str2.split(","));
            if (asList.contains("all") || asList.contains(exc.getClass().getCanonicalName())) {
                return;
            }
        }
        this.zzeey = exc;
        zzawf.zzd("Precache error", exc);
        zzfm(str);
    }

    public final void zzcw(int i) {
        this.zzeex.zzzu().zzdd(i);
    }

    public final void zzcv(int i) {
        this.zzeex.zzzu().zzdc(i);
    }

    public final void zzcx(int i) {
        this.zzeex.zzzu().zzcx(i);
    }

    public final void zzcy(int i) {
        this.zzeex.zzzu().zzcy(i);
    }

    public final void release() {
        zzbcf zzbcf = this.zzeex;
        if (zzbcf != null) {
            zzbcf.zza((zzbcn) null);
            this.zzeex.release();
        }
        super.release();
    }

    /* access modifiers changed from: protected */
    public final String zzfk(String str) {
        String valueOf = String.valueOf(super.zzfk(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    public final boolean zzfj(String str) {
        return zze(str, new String[]{str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (r11.zzeey == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        throw r11.zzeey;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        r1 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zze(java.lang.String r34, java.lang.String[] r35) {
        /*
            r33 = this;
            r11 = r33
            r12 = r34
            r0 = r35
            r11.zzdzm = r12
            java.lang.String r13 = r33.zzfk(r34)
            java.lang.String r14 = "error"
            int r1 = r0.length     // Catch:{ Exception -> 0x0165 }
            android.net.Uri[] r1 = new android.net.Uri[r1]     // Catch:{ Exception -> 0x0165 }
            r2 = 0
        L_0x0012:
            int r3 = r0.length     // Catch:{ Exception -> 0x0165 }
            if (r2 >= r3) goto L_0x0023
            r3 = r0[r2]     // Catch:{ Exception -> 0x0020 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0020 }
            r1[r2] = r3     // Catch:{ Exception -> 0x0020 }
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0020:
            r0 = move-exception
            goto L_0x0168
        L_0x0023:
            com.google.android.gms.internal.ads.zzbcf r0 = r11.zzeex     // Catch:{ Exception -> 0x0165 }
            java.lang.String r2 = r11.zzdwe     // Catch:{ Exception -> 0x0165 }
            r0.zza((android.net.Uri[]) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0165 }
            java.lang.ref.WeakReference r0 = r11.zzeem     // Catch:{ Exception -> 0x0165 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0165 }
            com.google.android.gms.internal.ads.zzbbm r0 = (com.google.android.gms.internal.ads.zzbbm) r0     // Catch:{ Exception -> 0x0165 }
            if (r0 == 0) goto L_0x0037
            r0.zza((java.lang.String) r13, (com.google.android.gms.internal.ads.zzbda) r11)     // Catch:{ Exception -> 0x0020 }
        L_0x0037:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzq.zzlc()     // Catch:{ Exception -> 0x0165 }
            long r16 = r0.currentTimeMillis()     // Catch:{ Exception -> 0x0165 }
            com.google.android.gms.internal.ads.zzzi<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzzx.zzchr     // Catch:{ Exception -> 0x0165 }
            com.google.android.gms.internal.ads.zzzt r2 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ Exception -> 0x0165 }
            java.lang.Object r1 = r2.zzd(r1)     // Catch:{ Exception -> 0x0165 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0165 }
            long r9 = r1.longValue()     // Catch:{ Exception -> 0x0165 }
            com.google.android.gms.internal.ads.zzzi<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzzx.zzchq     // Catch:{ Exception -> 0x0165 }
            com.google.android.gms.internal.ads.zzzt r2 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ Exception -> 0x0165 }
            java.lang.Object r1 = r2.zzd(r1)     // Catch:{ Exception -> 0x0165 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0165 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x0165 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r6 = r1 * r3
            com.google.android.gms.internal.ads.zzzi<java.lang.Integer> r1 = com.google.android.gms.internal.ads.zzzx.zzchp     // Catch:{ Exception -> 0x0165 }
            com.google.android.gms.internal.ads.zzzt r2 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ Exception -> 0x0165 }
            java.lang.Object r1 = r2.zzd(r1)     // Catch:{ Exception -> 0x0165 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0165 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0165 }
            long r4 = (long) r1     // Catch:{ Exception -> 0x0165 }
            r1 = -1
        L_0x0076:
            monitor-enter(r33)     // Catch:{ Exception -> 0x0165 }
            long r18 = r0.currentTimeMillis()     // Catch:{ all -> 0x015e }
            long r18 = r18 - r16
            int r3 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0131
            boolean r3 = r11.zzeeu     // Catch:{ all -> 0x015e }
            if (r3 == 0) goto L_0x0098
            java.lang.Exception r0 = r11.zzeey     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x008e
            java.lang.String r1 = "badUrl"
            java.lang.Exception r0 = r11.zzeey     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x008e:
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0157 }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x0098:
            boolean r3 = r11.zzeez     // Catch:{ all -> 0x015e }
            r18 = 1
            if (r3 == 0) goto L_0x00a1
            monitor-exit(r33)     // Catch:{ all -> 0x0163 }
            goto L_0x0102
        L_0x00a1:
            com.google.android.gms.internal.ads.zzbcf r3 = r11.zzeex     // Catch:{ all -> 0x015e }
            com.google.android.gms.internal.ads.zzgn r3 = r3.zzzr()     // Catch:{ all -> 0x015e }
            if (r3 == 0) goto L_0x0125
            r20 = r14
            long r14 = r3.getDuration()     // Catch:{ all -> 0x015a }
            r21 = 0
            int r8 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r8 <= 0) goto L_0x0107
            long r23 = r3.getBufferedPosition()     // Catch:{ all -> 0x015a }
            int r3 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x00e4
            int r1 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c3
            r8 = 1
            goto L_0x00c4
        L_0x00c3:
            r8 = 0
        L_0x00c4:
            int r25 = com.google.android.gms.internal.ads.zzbcf.zzzs()     // Catch:{ all -> 0x015a }
            int r26 = com.google.android.gms.internal.ads.zzbcf.zzzt()     // Catch:{ all -> 0x015a }
            r1 = r33
            r2 = r34
            r3 = r13
            r27 = r4
            r4 = r23
            r29 = r6
            r6 = r14
            r31 = r9
            r9 = r25
            r10 = r26
            r1.zza(r2, r3, r4, r6, r8, r9, r10)     // Catch:{ all -> 0x015a }
            r1 = r23
            goto L_0x00ea
        L_0x00e4:
            r27 = r4
            r29 = r6
            r31 = r9
        L_0x00ea:
            int r3 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            if (r3 < 0) goto L_0x00f3
            r11.zzb(r12, r13, r14)     // Catch:{ all -> 0x015a }
            monitor-exit(r33)     // Catch:{ all -> 0x015a }
            goto L_0x0102
        L_0x00f3:
            com.google.android.gms.internal.ads.zzbcf r3 = r11.zzeex     // Catch:{ all -> 0x015a }
            long r3 = r3.getBytesTransferred()     // Catch:{ all -> 0x015a }
            int r5 = (r3 > r27 ? 1 : (r3 == r27 ? 0 : -1))
            if (r5 < 0) goto L_0x0103
            int r3 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r3 <= 0) goto L_0x0103
            monitor-exit(r33)     // Catch:{ all -> 0x015a }
        L_0x0102:
            return r18
        L_0x0103:
            r3 = r1
            r1 = r31
            goto L_0x010d
        L_0x0107:
            r27 = r4
            r29 = r6
            r3 = r1
            r1 = r9
        L_0x010d:
            r11.wait(r1)     // Catch:{ InterruptedException -> 0x011b }
            monitor-exit(r33)     // Catch:{ all -> 0x015a }
            r9 = r1
            r1 = r3
            r14 = r20
            r4 = r27
            r6 = r29
            goto L_0x0076
        L_0x011b:
            java.lang.String r1 = "interrupted"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0157 }
            java.lang.String r2 = "Wait interrupted."
            r0.<init>(r2)     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x0125:
            r20 = r14
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0157 }
            java.lang.String r2 = "ExoPlayer was released during preloading."
            r0.<init>(r2)     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x0131:
            r29 = r6
            r20 = r14
            java.lang.String r1 = "downloadTimeout"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0157 }
            r2 = 47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0157 }
            r3.<init>(r2)     // Catch:{ all -> 0x0157 }
            java.lang.String r2 = "Timeout reached. Limit: "
            r3.append(r2)     // Catch:{ all -> 0x0157 }
            r4 = r29
            r3.append(r4)     // Catch:{ all -> 0x0157 }
            java.lang.String r2 = " ms"
            r3.append(r2)     // Catch:{ all -> 0x0157 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0157 }
            r0.<init>(r2)     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x0157:
            r0 = move-exception
            r14 = r1
            goto L_0x0161
        L_0x015a:
            r0 = move-exception
            r14 = r20
            goto L_0x0161
        L_0x015e:
            r0 = move-exception
            r20 = r14
        L_0x0161:
            monitor-exit(r33)     // Catch:{ all -> 0x0163 }
            throw r0     // Catch:{ Exception -> 0x0020 }
        L_0x0163:
            r0 = move-exception
            goto L_0x0161
        L_0x0165:
            r0 = move-exception
            r20 = r14
        L_0x0168:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r34)
            int r2 = r2.length()
            int r2 = r2 + 34
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Failed to preload url "
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = " Exception: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzawf.zzfa(r1)
            r33.release()
            java.lang.String r0 = zzb((java.lang.String) r14, (java.lang.Exception) r0)
            r11.zza(r12, r13, r14, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdl.zze(java.lang.String, java.lang.String[]):boolean");
    }

    public final void abort() {
        zzfm((String) null);
    }

    private final void zzfm(String str) {
        synchronized (this) {
            this.zzeeu = true;
            notify();
            release();
        }
        String str2 = this.zzdzm;
        if (str2 != null) {
            String zzfk = zzfk(str2);
            Exception exc = this.zzeey;
            if (exc != null) {
                zza(this.zzdzm, zzfk, "badUrl", zzb(str, exc));
            } else {
                zza(this.zzdzm, zzfk, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    public final zzbcf zzzw() {
        synchronized (this) {
            this.zzeez = true;
            notify();
        }
        this.zzeex.zza((zzbcn) null);
        zzbcf zzbcf = this.zzeex;
        this.zzeex = null;
        return zzbcf;
    }

    private static String zzb(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }
}
