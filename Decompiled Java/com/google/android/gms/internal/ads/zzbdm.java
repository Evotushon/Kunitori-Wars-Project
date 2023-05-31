package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbdm extends zzbda implements zzoc<zzno> {
    private String url;
    private ByteBuffer zzakt;
    private final zzbbj zzeck;
    private boolean zzeeu;
    private final zzbdj zzefa = new zzbdj();
    private final zzbcs zzefb = new zzbcs();
    private boolean zzefc;
    private final Object zzefd = new Object();
    private boolean zzefe;

    public zzbdm(zzbbm zzbbm, zzbbj zzbbj) {
        super(zzbbm);
        this.zzeck = zzbbj;
    }

    public final /* bridge */ /* synthetic */ void zzc(Object obj, int i) {
    }

    public final /* bridge */ /* synthetic */ void zze(Object obj) {
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean zzzx() {
        return this.zzefe;
    }

    /* access modifiers changed from: protected */
    public final String zzfk(String str) {
        String valueOf = String.valueOf(super.zzfk(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    private final void zzyg() {
        int zzzv = (int) this.zzefa.zzzv();
        int zzl = (int) this.zzefb.zzl(this.zzakt);
        int position = this.zzakt.position();
        int round = Math.round(((float) zzl) * (((float) position) / ((float) zzzv)));
        boolean z = round > 0;
        int zzzs = zzbcf.zzzs();
        int zzzt = zzbcf.zzzt();
        String str = this.url;
        zza(str, zzfk(str), position, zzzv, (long) round, (long) zzl, z, zzzs, zzzt);
    }

    /* JADX WARNING: type inference failed for: r1v31, types: [com.google.android.gms.internal.ads.zzbce] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        if (r9.zzakt.remaining() > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c4, code lost:
        zzyg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
        if (r9.zzeeu != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        r12 = r1.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d5, code lost:
        if ((r12 - r16) < r4) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d7, code lost:
        zzyg();
        r16 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        if ((r12 - r2) > (1000 * r6)) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r1 = new java.lang.StringBuilder(49);
        r1.append("Timeout exceeded. Limit: ");
        r1.append(r6);
        r1.append(" sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010a, code lost:
        throw new java.io.IOException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010b, code lost:
        r12 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r1 = r9.zzakt.limit();
        r3 = new java.lang.StringBuilder(35);
        r3.append("Precache abort at ");
        r3.append(r1);
        r3.append(" bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0130, code lost:
        throw new java.io.IOException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0136, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0137, code lost:
        r12 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzfj(java.lang.String r22) {
        /*
            r21 = this;
            r9 = r21
            r10 = r22
            r9.url = r10
            java.lang.String r11 = r21.zzfk(r22)
            java.lang.String r12 = "error"
            r13 = 0
            com.google.android.gms.internal.ads.zznr r0 = new com.google.android.gms.internal.ads.zznr     // Catch:{ Exception -> 0x013c }
            java.lang.String r2 = r9.zzdwe     // Catch:{ Exception -> 0x013c }
            r3 = 0
            com.google.android.gms.internal.ads.zzbbj r1 = r9.zzeck     // Catch:{ Exception -> 0x013c }
            int r5 = r1.zzean     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzbbj r1 = r9.zzeck     // Catch:{ Exception -> 0x013c }
            int r6 = r1.zzeap     // Catch:{ Exception -> 0x013c }
            r7 = 1
            r8 = 0
            r1 = r0
            r4 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzbbj r1 = r9.zzeck     // Catch:{ Exception -> 0x013c }
            boolean r1 = r1.zzeat     // Catch:{ Exception -> 0x013c }
            if (r1 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.zzbce r1 = new com.google.android.gms.internal.ads.zzbce     // Catch:{ Exception -> 0x0032 }
            android.content.Context r2 = r9.mContext     // Catch:{ Exception -> 0x0032 }
            r3 = 0
            r1.<init>(r2, r0, r3, r3)     // Catch:{ Exception -> 0x0032 }
            r0 = r1
            goto L_0x0035
        L_0x0032:
            r0 = move-exception
            goto L_0x013f
        L_0x0035:
            android.net.Uri r1 = android.net.Uri.parse(r22)     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zznp r2 = new com.google.android.gms.internal.ads.zznp     // Catch:{ Exception -> 0x013c }
            r2.<init>(r1)     // Catch:{ Exception -> 0x013c }
            r0.zza(r2)     // Catch:{ Exception -> 0x013c }
            java.lang.ref.WeakReference r1 = r9.zzeem     // Catch:{ Exception -> 0x013c }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzbbm r1 = (com.google.android.gms.internal.ads.zzbbm) r1     // Catch:{ Exception -> 0x013c }
            if (r1 == 0) goto L_0x004e
            r1.zza((java.lang.String) r11, (com.google.android.gms.internal.ads.zzbda) r9)     // Catch:{ Exception -> 0x0032 }
        L_0x004e:
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzq.zzlc()     // Catch:{ Exception -> 0x013c }
            long r2 = r1.currentTimeMillis()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzzi<java.lang.Long> r4 = com.google.android.gms.internal.ads.zzzx.zzchr     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzzt r5 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ Exception -> 0x013c }
            java.lang.Object r4 = r5.zzd(r4)     // Catch:{ Exception -> 0x013c }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x013c }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzzi<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzzx.zzchq     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzzt r7 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ Exception -> 0x013c }
            java.lang.Object r6 = r7.zzd(r6)     // Catch:{ Exception -> 0x013c }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x013c }
            long r6 = r6.longValue()     // Catch:{ Exception -> 0x013c }
            com.google.android.gms.internal.ads.zzbbj r8 = r9.zzeck     // Catch:{ Exception -> 0x013c }
            int r8 = r8.zzeam     // Catch:{ Exception -> 0x013c }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ Exception -> 0x013c }
            r9.zzakt = r8     // Catch:{ Exception -> 0x013c }
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r8]     // Catch:{ Exception -> 0x013c }
            r16 = r2
        L_0x0086:
            java.nio.ByteBuffer r14 = r9.zzakt     // Catch:{ Exception -> 0x013c }
            int r14 = r14.remaining()     // Catch:{ Exception -> 0x013c }
            int r14 = java.lang.Math.min(r14, r8)     // Catch:{ Exception -> 0x013c }
            int r14 = r0.read(r15, r13, r14)     // Catch:{ Exception -> 0x013c }
            r8 = -1
            if (r14 != r8) goto L_0x00a9
            r8 = 1
            r9.zzefe = r8     // Catch:{ Exception -> 0x0032 }
            com.google.android.gms.internal.ads.zzbcs r0 = r9.zzefb     // Catch:{ Exception -> 0x0032 }
            java.nio.ByteBuffer r1 = r9.zzakt     // Catch:{ Exception -> 0x0032 }
            long r0 = r0.zzl(r1)     // Catch:{ Exception -> 0x0032 }
            int r1 = (int) r0     // Catch:{ Exception -> 0x0032 }
            long r0 = (long) r1     // Catch:{ Exception -> 0x0032 }
            r9.zzb(r10, r11, r0)     // Catch:{ Exception -> 0x0032 }
        L_0x00a7:
            r1 = 1
            goto L_0x00c8
        L_0x00a9:
            java.lang.Object r8 = r9.zzefd     // Catch:{ Exception -> 0x013c }
            monitor-enter(r8)     // Catch:{ Exception -> 0x013c }
            boolean r13 = r9.zzeeu     // Catch:{ all -> 0x0131 }
            if (r13 != 0) goto L_0x00b9
            java.nio.ByteBuffer r13 = r9.zzakt     // Catch:{ all -> 0x0131 }
            r18 = r12
            r12 = 0
            r13.put(r15, r12, r14)     // Catch:{ all -> 0x013a }
            goto L_0x00bb
        L_0x00b9:
            r18 = r12
        L_0x00bb:
            monitor-exit(r8)     // Catch:{ all -> 0x013a }
            java.nio.ByteBuffer r8 = r9.zzakt     // Catch:{ Exception -> 0x0136 }
            int r8 = r8.remaining()     // Catch:{ Exception -> 0x0136 }
            if (r8 > 0) goto L_0x00c9
            r21.zzyg()     // Catch:{ Exception -> 0x0136 }
            goto L_0x00a7
        L_0x00c8:
            return r1
        L_0x00c9:
            boolean r8 = r9.zzeeu     // Catch:{ Exception -> 0x0136 }
            if (r8 != 0) goto L_0x010b
            long r12 = r1.currentTimeMillis()     // Catch:{ Exception -> 0x0136 }
            long r19 = r12 - r16
            int r8 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x00dc
            r21.zzyg()     // Catch:{ Exception -> 0x0136 }
            r16 = r12
        L_0x00dc:
            long r12 = r12 - r2
            r19 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r6
            int r8 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r8 > 0) goto L_0x00eb
            r12 = r18
            r8 = 8192(0x2000, float:1.14794E-41)
            r13 = 0
            goto L_0x0086
        L_0x00eb:
            java.lang.String r12 = "downloadTimeout"
            r0 = 49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0032 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = "Timeout exceeded. Limit: "
            r1.append(r0)     // Catch:{ Exception -> 0x0032 }
            r1.append(r6)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = " sec"
            r1.append(r0)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0032 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x0032 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0032 }
            throw r1     // Catch:{ Exception -> 0x0032 }
        L_0x010b:
            java.lang.String r12 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0032 }
            java.nio.ByteBuffer r1 = r9.zzakt     // Catch:{ Exception -> 0x0032 }
            int r1 = r1.limit()     // Catch:{ Exception -> 0x0032 }
            r2 = 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0032 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r2 = "Precache abort at "
            r3.append(r2)     // Catch:{ Exception -> 0x0032 }
            r3.append(r1)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = " bytes"
            r3.append(r1)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0032 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0032 }
            throw r0     // Catch:{ Exception -> 0x0032 }
        L_0x0131:
            r0 = move-exception
            r18 = r12
        L_0x0134:
            monitor-exit(r8)     // Catch:{ all -> 0x013a }
            throw r0     // Catch:{ Exception -> 0x0136 }
        L_0x0136:
            r0 = move-exception
            r12 = r18
            goto L_0x013f
        L_0x013a:
            r0 = move-exception
            goto L_0x0134
        L_0x013c:
            r0 = move-exception
            r18 = r12
        L_0x013f:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r1)
            java.lang.String r1 = ":"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = java.lang.String.valueOf(r22)
            int r1 = r1.length()
            int r1 = r1 + 34
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Failed to preload url "
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = " Exception: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzawf.zzfa(r1)
            r9.zza(r10, r11, r12, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdm.zzfj(java.lang.String):boolean");
    }

    public final void abort() {
        this.zzeeu = true;
    }

    public final ByteBuffer getByteBuffer() {
        synchronized (this.zzefd) {
            if (this.zzakt != null && !this.zzefc) {
                this.zzakt.flip();
                this.zzefc = true;
            }
            this.zzeeu = true;
        }
        return this.zzakt;
    }

    public final /* synthetic */ void zza(Object obj, zznp zznp) {
        zzno zzno = (zzno) obj;
        if (zzno instanceof zznr) {
            this.zzefa.zza((zznr) zzno);
        }
    }
}
