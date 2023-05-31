package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzmk {
    private int length;
    private int[] zzane;
    private long[] zzanf;
    private long[] zzanh;
    private int[] zzavu;
    private int zzbce = 1000;
    private int[] zzbcf;
    private zzjq[] zzbcg;
    private zzgz[] zzbch;
    private int zzbci;
    private int zzbcj;
    private int zzbck;
    private long zzbcl;
    private long zzbcm;
    private boolean zzbcn;
    private boolean zzbco;
    private zzgz zzbcp;

    public zzmk() {
        int i = this.zzbce;
        this.zzbcf = new int[i];
        this.zzanf = new long[i];
        this.zzanh = new long[i];
        this.zzavu = new int[i];
        this.zzane = new int[i];
        this.zzbcg = new zzjq[i];
        this.zzbch = new zzgz[i];
        this.zzbcl = Long.MIN_VALUE;
        this.zzbcm = Long.MIN_VALUE;
        this.zzbco = true;
        this.zzbcn = true;
    }

    public final void zzhy() {
        this.zzbci = 0;
        this.zzbcj = 0;
        this.zzbck = 0;
        this.length = 0;
        this.zzbcn = true;
    }

    public final void zzhz() {
        this.zzbcl = Long.MIN_VALUE;
        this.zzbcm = Long.MIN_VALUE;
    }

    public final int zzia() {
        return this.zzbci + this.length;
    }

    public final synchronized boolean zzib() {
        return this.length != 0;
    }

    public final synchronized zzgz zzic() {
        if (this.zzbco) {
            return null;
        }
        return this.zzbcp;
    }

    public final synchronized long zzhs() {
        return Math.max(this.zzbcl, this.zzbcm);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int zza(com.google.android.gms.internal.ads.zzhb r5, com.google.android.gms.internal.ads.zziv r6, boolean r7, boolean r8, com.google.android.gms.internal.ads.zzgz r9, com.google.android.gms.internal.ads.zzmj r10) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.zzib()     // Catch:{ all -> 0x00a6 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0024
            if (r8 == 0) goto L_0x0012
            r5 = 4
            r6.setFlags(r5)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r4)
            return r3
        L_0x0012:
            com.google.android.gms.internal.ads.zzgz r6 = r4.zzbcp     // Catch:{ all -> 0x00a6 }
            if (r6 == 0) goto L_0x0022
            if (r7 != 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzgz r6 = r4.zzbcp     // Catch:{ all -> 0x00a6 }
            if (r6 == r9) goto L_0x0022
        L_0x001c:
            com.google.android.gms.internal.ads.zzgz r6 = r4.zzbcp     // Catch:{ all -> 0x00a6 }
            r5.zzagi = r6     // Catch:{ all -> 0x00a6 }
            monitor-exit(r4)
            return r1
        L_0x0022:
            monitor-exit(r4)
            return r2
        L_0x0024:
            if (r7 != 0) goto L_0x009c
            com.google.android.gms.internal.ads.zzgz[] r7 = r4.zzbch     // Catch:{ all -> 0x00a6 }
            int r8 = r4.zzbcj     // Catch:{ all -> 0x00a6 }
            r7 = r7[r8]     // Catch:{ all -> 0x00a6 }
            if (r7 == r9) goto L_0x002f
            goto L_0x009c
        L_0x002f:
            java.nio.ByteBuffer r5 = r6.zzcs     // Catch:{ all -> 0x00a6 }
            r7 = 0
            r8 = 1
            if (r5 != 0) goto L_0x0037
            r5 = 1
            goto L_0x0038
        L_0x0037:
            r5 = 0
        L_0x0038:
            if (r5 == 0) goto L_0x003c
            monitor-exit(r4)
            return r2
        L_0x003c:
            long[] r5 = r4.zzanh     // Catch:{ all -> 0x00a6 }
            int r9 = r4.zzbcj     // Catch:{ all -> 0x00a6 }
            r0 = r5[r9]     // Catch:{ all -> 0x00a6 }
            r6.zzamu = r0     // Catch:{ all -> 0x00a6 }
            int[] r5 = r4.zzavu     // Catch:{ all -> 0x00a6 }
            int r9 = r4.zzbcj     // Catch:{ all -> 0x00a6 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a6 }
            r6.setFlags(r5)     // Catch:{ all -> 0x00a6 }
            int[] r5 = r4.zzane     // Catch:{ all -> 0x00a6 }
            int r9 = r4.zzbcj     // Catch:{ all -> 0x00a6 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a6 }
            r10.size = r5     // Catch:{ all -> 0x00a6 }
            long[] r5 = r4.zzanf     // Catch:{ all -> 0x00a6 }
            int r9 = r4.zzbcj     // Catch:{ all -> 0x00a6 }
            r0 = r5[r9]     // Catch:{ all -> 0x00a6 }
            r10.zzavf = r0     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.zzjq[] r5 = r4.zzbcg     // Catch:{ all -> 0x00a6 }
            int r9 = r4.zzbcj     // Catch:{ all -> 0x00a6 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a6 }
            r10.zzapz = r5     // Catch:{ all -> 0x00a6 }
            long r0 = r4.zzbcl     // Catch:{ all -> 0x00a6 }
            long r5 = r6.zzamu     // Catch:{ all -> 0x00a6 }
            long r5 = java.lang.Math.max(r0, r5)     // Catch:{ all -> 0x00a6 }
            r4.zzbcl = r5     // Catch:{ all -> 0x00a6 }
            int r5 = r4.length     // Catch:{ all -> 0x00a6 }
            int r5 = r5 - r8
            r4.length = r5     // Catch:{ all -> 0x00a6 }
            int r5 = r4.zzbcj     // Catch:{ all -> 0x00a6 }
            int r5 = r5 + r8
            r4.zzbcj = r5     // Catch:{ all -> 0x00a6 }
            int r5 = r4.zzbci     // Catch:{ all -> 0x00a6 }
            int r5 = r5 + r8
            r4.zzbci = r5     // Catch:{ all -> 0x00a6 }
            int r5 = r4.zzbcj     // Catch:{ all -> 0x00a6 }
            int r6 = r4.zzbce     // Catch:{ all -> 0x00a6 }
            if (r5 != r6) goto L_0x0086
            r4.zzbcj = r7     // Catch:{ all -> 0x00a6 }
        L_0x0086:
            int r5 = r4.length     // Catch:{ all -> 0x00a6 }
            if (r5 <= 0) goto L_0x0092
            long[] r5 = r4.zzanf     // Catch:{ all -> 0x00a6 }
            int r6 = r4.zzbcj     // Catch:{ all -> 0x00a6 }
            r6 = r5[r6]     // Catch:{ all -> 0x00a6 }
            r5 = r6
            goto L_0x0098
        L_0x0092:
            long r5 = r10.zzavf     // Catch:{ all -> 0x00a6 }
            int r7 = r10.size     // Catch:{ all -> 0x00a6 }
            long r7 = (long) r7     // Catch:{ all -> 0x00a6 }
            long r5 = r5 + r7
        L_0x0098:
            r10.zzbcd = r5     // Catch:{ all -> 0x00a6 }
            monitor-exit(r4)
            return r3
        L_0x009c:
            com.google.android.gms.internal.ads.zzgz[] r6 = r4.zzbch     // Catch:{ all -> 0x00a6 }
            int r7 = r4.zzbcj     // Catch:{ all -> 0x00a6 }
            r6 = r6[r7]     // Catch:{ all -> 0x00a6 }
            r5.zzagi = r6     // Catch:{ all -> 0x00a6 }
            monitor-exit(r4)
            return r1
        L_0x00a6:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmk.zza(com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zziv, boolean, boolean, com.google.android.gms.internal.ads.zzgz, com.google.android.gms.internal.ads.zzmj):int");
    }

    public final synchronized long zzid() {
        if (!zzib()) {
            return -1;
        }
        int i = ((this.zzbcj + this.length) - 1) % this.zzbce;
        this.zzbcj = (this.zzbcj + this.length) % this.zzbce;
        this.zzbci += this.length;
        this.length = 0;
        return this.zzanf[i] + ((long) this.zzane[i]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long zzd(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.zzib()     // Catch:{ all -> 0x0061 }
            r1 = -1
            if (r0 == 0) goto L_0x005f
            long[] r0 = r8.zzanh     // Catch:{ all -> 0x0061 }
            int r3 = r8.zzbcj     // Catch:{ all -> 0x0061 }
            r3 = r0[r3]     // Catch:{ all -> 0x0061 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            goto L_0x005f
        L_0x0014:
            long r3 = r8.zzbcm     // Catch:{ all -> 0x0061 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001e
            if (r11 != 0) goto L_0x001e
            monitor-exit(r8)
            return r1
        L_0x001e:
            r11 = 0
            int r0 = r8.zzbcj     // Catch:{ all -> 0x0061 }
            r3 = -1
            r11 = -1
            r4 = 0
        L_0x0024:
            int r5 = r8.zzbck     // Catch:{ all -> 0x0061 }
            if (r0 == r5) goto L_0x0041
            long[] r5 = r8.zzanh     // Catch:{ all -> 0x0061 }
            r6 = r5[r0]     // Catch:{ all -> 0x0061 }
            int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x0041
            int[] r5 = r8.zzavu     // Catch:{ all -> 0x0061 }
            r5 = r5[r0]     // Catch:{ all -> 0x0061 }
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0039
            r11 = r4
        L_0x0039:
            int r0 = r0 + 1
            int r5 = r8.zzbce     // Catch:{ all -> 0x0061 }
            int r0 = r0 % r5
            int r4 = r4 + 1
            goto L_0x0024
        L_0x0041:
            if (r11 != r3) goto L_0x0045
            monitor-exit(r8)
            return r1
        L_0x0045:
            int r9 = r8.zzbcj     // Catch:{ all -> 0x0061 }
            int r9 = r9 + r11
            int r10 = r8.zzbce     // Catch:{ all -> 0x0061 }
            int r9 = r9 % r10
            r8.zzbcj = r9     // Catch:{ all -> 0x0061 }
            int r9 = r8.zzbci     // Catch:{ all -> 0x0061 }
            int r9 = r9 + r11
            r8.zzbci = r9     // Catch:{ all -> 0x0061 }
            int r9 = r8.length     // Catch:{ all -> 0x0061 }
            int r9 = r9 - r11
            r8.length = r9     // Catch:{ all -> 0x0061 }
            long[] r9 = r8.zzanf     // Catch:{ all -> 0x0061 }
            int r10 = r8.zzbcj     // Catch:{ all -> 0x0061 }
            r10 = r9[r10]     // Catch:{ all -> 0x0061 }
            monitor-exit(r8)
            return r10
        L_0x005f:
            monitor-exit(r8)
            return r1
        L_0x0061:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x0065
        L_0x0064:
            throw r9
        L_0x0065:
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmk.zzd(long, boolean):long");
    }

    public final synchronized boolean zzg(zzgz zzgz) {
        if (zzgz == null) {
            this.zzbco = true;
            return false;
        }
        this.zzbco = false;
        if (zzop.zza(zzgz, this.zzbcp)) {
            return false;
        }
        this.zzbcp = zzgz;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ea, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(long r6, int r8, long r9, int r11, com.google.android.gms.internal.ads.zzjq r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.zzbcn     // Catch:{ all -> 0x00eb }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r8 & 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return
        L_0x000c:
            r5.zzbcn = r1     // Catch:{ all -> 0x00eb }
        L_0x000e:
            boolean r0 = r5.zzbco     // Catch:{ all -> 0x00eb }
            r2 = 1
            if (r0 != 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.google.android.gms.internal.ads.zzob.checkState(r0)     // Catch:{ all -> 0x00eb }
            r5.zzei(r6)     // Catch:{ all -> 0x00eb }
            long[] r0 = r5.zzanh     // Catch:{ all -> 0x00eb }
            int r3 = r5.zzbck     // Catch:{ all -> 0x00eb }
            r0[r3] = r6     // Catch:{ all -> 0x00eb }
            long[] r6 = r5.zzanf     // Catch:{ all -> 0x00eb }
            int r7 = r5.zzbck     // Catch:{ all -> 0x00eb }
            r6[r7] = r9     // Catch:{ all -> 0x00eb }
            int[] r6 = r5.zzane     // Catch:{ all -> 0x00eb }
            int r7 = r5.zzbck     // Catch:{ all -> 0x00eb }
            r6[r7] = r11     // Catch:{ all -> 0x00eb }
            int[] r6 = r5.zzavu     // Catch:{ all -> 0x00eb }
            int r7 = r5.zzbck     // Catch:{ all -> 0x00eb }
            r6[r7] = r8     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.zzjq[] r6 = r5.zzbcg     // Catch:{ all -> 0x00eb }
            int r7 = r5.zzbck     // Catch:{ all -> 0x00eb }
            r6[r7] = r12     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.zzgz[] r6 = r5.zzbch     // Catch:{ all -> 0x00eb }
            int r7 = r5.zzbck     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.zzgz r8 = r5.zzbcp     // Catch:{ all -> 0x00eb }
            r6[r7] = r8     // Catch:{ all -> 0x00eb }
            int[] r6 = r5.zzbcf     // Catch:{ all -> 0x00eb }
            int r7 = r5.zzbck     // Catch:{ all -> 0x00eb }
            r6[r7] = r1     // Catch:{ all -> 0x00eb }
            int r6 = r5.length     // Catch:{ all -> 0x00eb }
            int r6 = r6 + r2
            r5.length = r6     // Catch:{ all -> 0x00eb }
            int r6 = r5.length     // Catch:{ all -> 0x00eb }
            int r7 = r5.zzbce     // Catch:{ all -> 0x00eb }
            if (r6 != r7) goto L_0x00dc
            int r6 = r5.zzbce     // Catch:{ all -> 0x00eb }
            int r6 = r6 + 1000
            int[] r7 = new int[r6]     // Catch:{ all -> 0x00eb }
            long[] r8 = new long[r6]     // Catch:{ all -> 0x00eb }
            long[] r9 = new long[r6]     // Catch:{ all -> 0x00eb }
            int[] r10 = new int[r6]     // Catch:{ all -> 0x00eb }
            int[] r11 = new int[r6]     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.zzjq[] r12 = new com.google.android.gms.internal.ads.zzjq[r6]     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.zzgz[] r0 = new com.google.android.gms.internal.ads.zzgz[r6]     // Catch:{ all -> 0x00eb }
            int r2 = r5.zzbce     // Catch:{ all -> 0x00eb }
            int r3 = r5.zzbcj     // Catch:{ all -> 0x00eb }
            int r2 = r2 - r3
            long[] r3 = r5.zzanf     // Catch:{ all -> 0x00eb }
            int r4 = r5.zzbcj     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r3, r4, r8, r1, r2)     // Catch:{ all -> 0x00eb }
            long[] r3 = r5.zzanh     // Catch:{ all -> 0x00eb }
            int r4 = r5.zzbcj     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r3, r4, r9, r1, r2)     // Catch:{ all -> 0x00eb }
            int[] r3 = r5.zzavu     // Catch:{ all -> 0x00eb }
            int r4 = r5.zzbcj     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r3, r4, r10, r1, r2)     // Catch:{ all -> 0x00eb }
            int[] r3 = r5.zzane     // Catch:{ all -> 0x00eb }
            int r4 = r5.zzbcj     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r3, r4, r11, r1, r2)     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.zzjq[] r3 = r5.zzbcg     // Catch:{ all -> 0x00eb }
            int r4 = r5.zzbcj     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r3, r4, r12, r1, r2)     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.zzgz[] r3 = r5.zzbch     // Catch:{ all -> 0x00eb }
            int r4 = r5.zzbcj     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r3, r4, r0, r1, r2)     // Catch:{ all -> 0x00eb }
            int[] r3 = r5.zzbcf     // Catch:{ all -> 0x00eb }
            int r4 = r5.zzbcj     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r3, r4, r7, r1, r2)     // Catch:{ all -> 0x00eb }
            int r3 = r5.zzbcj     // Catch:{ all -> 0x00eb }
            long[] r4 = r5.zzanf     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r4, r1, r8, r2, r3)     // Catch:{ all -> 0x00eb }
            long[] r4 = r5.zzanh     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r4, r1, r9, r2, r3)     // Catch:{ all -> 0x00eb }
            int[] r4 = r5.zzavu     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r4, r1, r10, r2, r3)     // Catch:{ all -> 0x00eb }
            int[] r4 = r5.zzane     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r4, r1, r11, r2, r3)     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.zzjq[] r4 = r5.zzbcg     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r4, r1, r12, r2, r3)     // Catch:{ all -> 0x00eb }
            com.google.android.gms.internal.ads.zzgz[] r4 = r5.zzbch     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r4, r1, r0, r2, r3)     // Catch:{ all -> 0x00eb }
            int[] r4 = r5.zzbcf     // Catch:{ all -> 0x00eb }
            java.lang.System.arraycopy(r4, r1, r7, r2, r3)     // Catch:{ all -> 0x00eb }
            r5.zzanf = r8     // Catch:{ all -> 0x00eb }
            r5.zzanh = r9     // Catch:{ all -> 0x00eb }
            r5.zzavu = r10     // Catch:{ all -> 0x00eb }
            r5.zzane = r11     // Catch:{ all -> 0x00eb }
            r5.zzbcg = r12     // Catch:{ all -> 0x00eb }
            r5.zzbch = r0     // Catch:{ all -> 0x00eb }
            r5.zzbcf = r7     // Catch:{ all -> 0x00eb }
            r5.zzbcj = r1     // Catch:{ all -> 0x00eb }
            int r7 = r5.zzbce     // Catch:{ all -> 0x00eb }
            r5.zzbck = r7     // Catch:{ all -> 0x00eb }
            int r7 = r5.zzbce     // Catch:{ all -> 0x00eb }
            r5.length = r7     // Catch:{ all -> 0x00eb }
            r5.zzbce = r6     // Catch:{ all -> 0x00eb }
            monitor-exit(r5)
            return
        L_0x00dc:
            int r6 = r5.zzbck     // Catch:{ all -> 0x00eb }
            int r6 = r6 + r2
            r5.zzbck = r6     // Catch:{ all -> 0x00eb }
            int r6 = r5.zzbck     // Catch:{ all -> 0x00eb }
            int r7 = r5.zzbce     // Catch:{ all -> 0x00eb }
            if (r6 != r7) goto L_0x00e9
            r5.zzbck = r1     // Catch:{ all -> 0x00eb }
        L_0x00e9:
            monitor-exit(r5)
            return
        L_0x00eb:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmk.zza(long, int, long, int, com.google.android.gms.internal.ads.zzjq):void");
    }

    public final synchronized void zzei(long j) {
        this.zzbcm = Math.max(this.zzbcm, j);
    }
}
