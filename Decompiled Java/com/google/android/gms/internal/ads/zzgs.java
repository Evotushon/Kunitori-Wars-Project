package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzgs implements Handler.Callback, zzmb, zzmd, zznh {
    private int repeatMode = 0;
    private int state;
    private final zzhe[] zzacx;
    private final zzni zzacy;
    private final zzdkp zzada;
    private final zzhk zzadd;
    private final zzhl zzade;
    private boolean zzadg;
    private boolean zzadk;
    private zzhj zzadl;
    private zzhf zzadp;
    private zzgu zzadq;
    private final zzhh[] zzadu;
    private final zzhd zzadv;
    private final zzon zzadw;
    private final zzdkp zzadx;
    private final HandlerThread zzady;
    private final zzgn zzadz;
    private zzhe zzaea;
    private zzof zzaeb;
    private zzme zzaec;
    private zzhe[] zzaed;
    private boolean zzaee;
    private boolean zzaef;
    private int zzaeg;
    private int zzaeh;
    private long zzaei;
    private int zzaej;
    private zzgx zzaek;
    private long zzael;
    private zzgv zzaem;
    private zzgv zzaen;
    private zzgv zzaeo;

    public zzgs(zzhe[] zzheArr, zzni zzni, zzhd zzhd, boolean z, int i, zzdkp zzdkp, zzgu zzgu, zzgn zzgn) {
        this.zzacx = zzheArr;
        this.zzacy = zzni;
        this.zzadv = zzhd;
        this.zzadg = z;
        this.zzada = zzdkp;
        this.state = 1;
        this.zzadq = zzgu;
        this.zzadz = zzgn;
        this.zzadu = new zzhh[zzheArr.length];
        for (int i2 = 0; i2 < zzheArr.length; i2++) {
            zzheArr[i2].setIndex(i2);
            this.zzadu[i2] = zzheArr[i2].zzdu();
        }
        this.zzadw = new zzon();
        this.zzaed = new zzhe[0];
        this.zzadd = new zzhk();
        this.zzade = new zzhl();
        zzni.zza(this);
        this.zzadp = zzhf.zzagj;
        this.zzady = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.zzady.start();
        this.zzadx = new zzdkp(this.zzady.getLooper(), this);
    }

    public final void zza(zzme zzme, boolean z) {
        this.zzadx.obtainMessage(0, 1, 0, zzme).sendToTarget();
    }

    public final void zzg(boolean z) {
        this.zzadx.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void zza(zzhj zzhj, int i, long j) {
        this.zzadx.obtainMessage(3, new zzgx(zzhj, i, j)).sendToTarget();
    }

    public final void stop() {
        this.zzadx.sendEmptyMessage(5);
    }

    public final void zza(zzgo... zzgoArr) {
        if (this.zzaee) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.zzaeg++;
        this.zzadx.obtainMessage(11, zzgoArr).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|23|20|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x001f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzb(com.google.android.gms.internal.ads.zzgo... r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzaee     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Ignoring messages sent after release."
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x000e:
            int r0 = r3.zzaeg     // Catch:{ all -> 0x0031 }
            int r1 = r0 + 1
            r3.zzaeg = r1     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.zzdkp r1 = r3.zzadx     // Catch:{ all -> 0x0031 }
            r2 = 11
            android.os.Message r4 = r1.obtainMessage(r2, r4)     // Catch:{ all -> 0x0031 }
            r4.sendToTarget()     // Catch:{ all -> 0x0031 }
        L_0x001f:
            int r4 = r3.zzaeh     // Catch:{ all -> 0x0031 }
            if (r4 > r0) goto L_0x002f
            r3.wait()     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x001f
        L_0x0027:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0031 }
            r4.interrupt()     // Catch:{ all -> 0x0031 }
            goto L_0x001f
        L_0x002f:
            monitor-exit(r3)
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0035
        L_0x0034:
            throw r4
        L_0x0035:
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgs.zzb(com.google.android.gms.internal.ads.zzgo[]):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void release() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzaee     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            com.google.android.gms.internal.ads.zzdkp r0 = r2.zzadx     // Catch:{ all -> 0x0024 }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.zzaee     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.zzady     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0028
        L_0x0027:
            throw r0
        L_0x0028:
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgs.release():void");
    }

    public final void zzb(zzhj zzhj, Object obj) {
        this.zzadx.obtainMessage(7, Pair.create(zzhj, obj)).sendToTarget();
    }

    public final void zza(zzmc zzmc) {
        this.zzadx.obtainMessage(8, zzmc).sendToTarget();
    }

    public final void zzek() {
        this.zzadx.sendEmptyMessage(10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:216:0x038c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0454, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0455, code lost:
        r2 = r0;
        r8.zzadq = new com.google.android.gms.internal.ads.zzgu(r3, r4);
        r3 = r8.zzada;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x045f, code lost:
        if (r1 != false) goto L_0x0461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0461, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0463, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0464, code lost:
        r3.obtainMessage(4, r1, 0, r8.zzadq).sendToTarget();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x046d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x08af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x08b0, code lost:
        r1 = r0;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x08b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x08b5, code lost:
        r1 = r0;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x08b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x08ba, code lost:
        r1 = r0;
        android.util.Log.e("ExoPlayerImplInternal", "Internal runtime error.", r1);
        r8.zzada.obtainMessage(8, com.google.android.gms.internal.ads.zzgk.zza(r1)).sendToTarget();
        zzeo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x08d4, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00cd, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ce, code lost:
        monitor-enter(r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r8.zzaeh++;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x028f A[Catch:{ all -> 0x0454, all -> 0x038c, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0292 A[Catch:{ all -> 0x0454, all -> 0x038c, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0296 A[Catch:{ all -> 0x0454, all -> 0x038c, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0358 A[Catch:{ all -> 0x0454, all -> 0x038c, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x036c A[Catch:{ all -> 0x0454, all -> 0x038c, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0538 A[Catch:{ all -> 0x0454, all -> 0x038c, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x053f A[Catch:{ all -> 0x0454, all -> 0x038c, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0559 A[Catch:{ all -> 0x0454, all -> 0x038c, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x055c A[Catch:{ all -> 0x0454, all -> 0x038c, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0597 A[Catch:{ all -> 0x0454, all -> 0x038c, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x05ab A[Catch:{ all -> 0x0454, all -> 0x038c, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x05c7 A[Catch:{ all -> 0x0454, all -> 0x038c, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }, LOOP:8: B:331:0x05c7->B:335:0x05d9, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0729 A[Catch:{ all -> 0x0454, all -> 0x038c, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x07e2 A[Catch:{ all -> 0x0454, all -> 0x038c, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:504:0x08b9 A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r35) {
        /*
            r34 = this;
            r8 = r34
            r1 = r35
            r10 = 1
            int r2 = r1.what     // Catch:{ zzgk -> 0x08f1, IOException -> 0x08d5, RuntimeException -> 0x08b9 }
            r11 = 7
            r3 = 0
            r14 = 3
            r5 = -1
            r6 = 0
            r15 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r9 = 0
            switch(r2) {
                case 0: goto L_0x0878;
                case 1: goto L_0x084b;
                case 2: goto L_0x046e;
                case 3: goto L_0x03b5;
                case 4: goto L_0x0394;
                case 5: goto L_0x0390;
                case 6: goto L_0x0379;
                case 7: goto L_0x021b;
                case 8: goto L_0x01e5;
                case 9: goto L_0x01d2;
                case 10: goto L_0x00dd;
                case 11: goto L_0x009f;
                case 12: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            return r9
        L_0x0019:
            int r1 = r1.arg1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.repeatMode = r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0026:
            if (r2 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != r3) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.zzgv r4 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != r4) goto L_0x0037
            r4 = r3
            r3 = r2
            r2 = 1
            goto L_0x003a
        L_0x0037:
            r4 = r3
            r3 = r2
            r2 = 0
        L_0x003a:
            com.google.android.gms.internal.ads.zzhj r11 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r12 = r3.zzaeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r13 = r8.zzade     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhk r14 = r8.zzadd     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r11 = r11.zza((int) r12, (com.google.android.gms.internal.ads.zzhl) r13, (com.google.android.gms.internal.ads.zzhk) r14, (int) r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r12 = r3.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r12 == 0) goto L_0x0065
            if (r11 == r5) goto L_0x0065
            com.google.android.gms.internal.ads.zzgv r12 = r3.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r12 = r12.zzaeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r12 != r11) goto L_0x0065
            com.google.android.gms.internal.ads.zzgv r3 = r3.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r11 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r3 != r11) goto L_0x005a
            r11 = 1
            goto L_0x005b
        L_0x005a:
            r11 = 0
        L_0x005b:
            r4 = r4 | r11
            com.google.android.gms.internal.ads.zzgv r11 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r3 != r11) goto L_0x0062
            r11 = 1
            goto L_0x0063
        L_0x0062:
            r11 = 0
        L_0x0063:
            r2 = r2 | r11
            goto L_0x003a
        L_0x0065:
            com.google.android.gms.internal.ads.zzgv r5 = r3.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r5 == 0) goto L_0x0070
            com.google.android.gms.internal.ads.zzgv r5 = r3.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            zza((com.google.android.gms.internal.ads.zzgv) r5)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r3.zzafc = r6     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0070:
            int r5 = r3.zzaeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean r5 = r8.zzo(r5)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r3.zzaez = r5     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != 0) goto L_0x007c
            r8.zzaem = r3     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x007c:
            if (r4 != 0) goto L_0x0095
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 == 0) goto L_0x0095
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r2.zzaeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgu r3 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r3 = r3.zzaes     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r3 = r8.zza((int) r2, (long) r3)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgu r5 = new com.google.android.gms.internal.ads.zzgu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r5.<init>(r2, r3)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzadq = r5     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0095:
            int r2 = r8.state     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != r15) goto L_0x009e
            if (r1 == 0) goto L_0x009e
            r8.setState(r7)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x009e:
            return r10
        L_0x009f:
            java.lang.Object r1 = r1.obj     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgo[] r1 = (com.google.android.gms.internal.ads.zzgo[]) r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r1.length     // Catch:{ all -> 0x00cc }
        L_0x00a4:
            if (r9 >= r2) goto L_0x00b4
            r3 = r1[r9]     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.zzgp r4 = r3.zzacu     // Catch:{ all -> 0x00cc }
            int r5 = r3.zzacv     // Catch:{ all -> 0x00cc }
            java.lang.Object r3 = r3.zzacw     // Catch:{ all -> 0x00cc }
            r4.zza(r5, r3)     // Catch:{ all -> 0x00cc }
            int r9 = r9 + 1
            goto L_0x00a4
        L_0x00b4:
            com.google.android.gms.internal.ads.zzme r1 = r8.zzaec     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x00bd
            com.google.android.gms.internal.ads.zzdkp r1 = r8.zzadx     // Catch:{ all -> 0x00cc }
            r1.sendEmptyMessage(r7)     // Catch:{ all -> 0x00cc }
        L_0x00bd:
            monitor-enter(r34)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r1 = r8.zzaeh     // Catch:{ all -> 0x00c8 }
            int r1 = r1 + r10
            r8.zzaeh = r1     // Catch:{ all -> 0x00c8 }
            r34.notifyAll()     // Catch:{ all -> 0x00c8 }
            monitor-exit(r34)     // Catch:{ all -> 0x00c8 }
            return r10
        L_0x00c8:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x00c8 }
            throw r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x00cc:
            r0 = move-exception
            r1 = r0
            monitor-enter(r34)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r8.zzaeh     // Catch:{ all -> 0x00d9 }
            int r2 = r2 + r10
            r8.zzaeh = r2     // Catch:{ all -> 0x00d9 }
            r34.notifyAll()     // Catch:{ all -> 0x00d9 }
            monitor-exit(r34)     // Catch:{ all -> 0x00d9 }
            throw r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x00d9:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x00d9 }
            throw r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x00dd:
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x01d1
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2 = 1
        L_0x00e4:
            if (r1 == 0) goto L_0x01d1
            boolean r3 = r1.zzafa     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r3 != 0) goto L_0x00ec
            goto L_0x01d1
        L_0x00ec:
            boolean r3 = r1.zzet()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r3 != 0) goto L_0x00fa
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 != r3) goto L_0x00f7
            r2 = 0
        L_0x00f7:
            com.google.android.gms.internal.ads.zzgv r1 = r1.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x00e4
        L_0x00fa:
            if (r2 == 0) goto L_0x0198
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 == r3) goto L_0x0104
            r2 = 1
            goto L_0x0105
        L_0x0104:
            r2 = 0
        L_0x0105:
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r3 = r3.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            zza((com.google.android.gms.internal.ads.zzgv) r3)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r3.zzafc = r6     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzaem = r3     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzaen = r3     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhe[] r3 = r8.zzacx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r3 = r3.length     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean[] r3 = new boolean[r3]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r4 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgu r5 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r11 = r5.zzaes     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r4 = r4.zza(r11, r2, r3)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgu r2 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r11 = r2.zzaes     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0136
            com.google.android.gms.internal.ads.zzgu r2 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2.zzaes = r4     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzdq(r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0136:
            com.google.android.gms.internal.ads.zzhe[] r2 = r8.zzacx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r2.length     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean[] r2 = new boolean[r2]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r4 = 0
            r5 = 0
        L_0x013d:
            com.google.android.gms.internal.ads.zzhe[] r11 = r8.zzacx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r11 = r11.length     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r4 >= r11) goto L_0x0189
            com.google.android.gms.internal.ads.zzhe[] r11 = r8.zzacx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r11 = r11[r4]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r12 = r11.getState()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r12 == 0) goto L_0x014e
            r12 = 1
            goto L_0x014f
        L_0x014e:
            r12 = 0
        L_0x014f:
            r2[r4] = r12     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r12 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzmn[] r12 = r12.zzaew     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r12 = r12[r4]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r12 == 0) goto L_0x015b
            int r5 = r5 + 1
        L_0x015b:
            boolean r13 = r2[r4]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r13 == 0) goto L_0x0186
            com.google.android.gms.internal.ads.zzmn r13 = r11.zzdw()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r12 == r13) goto L_0x017d
            com.google.android.gms.internal.ads.zzhe r13 = r8.zzaea     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r11 != r13) goto L_0x0176
            if (r12 != 0) goto L_0x0172
            com.google.android.gms.internal.ads.zzon r12 = r8.zzadw     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzof r13 = r8.zzaeb     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r12.zza(r13)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0172:
            r8.zzaeb = r6     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzaea = r6     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0176:
            zza((com.google.android.gms.internal.ads.zzhe) r11)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r11.disable()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0186
        L_0x017d:
            boolean r12 = r3[r4]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r12 == 0) goto L_0x0186
            long r12 = r8.zzael     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r11.zzdm(r12)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0186:
            int r4 = r4 + 1
            goto L_0x013d
        L_0x0189:
            com.google.android.gms.internal.ads.zzdkp r3 = r8.zzada     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zznk r1 = r1.zzafd     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            android.os.Message r1 = r3.obtainMessage(r14, r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.sendToTarget()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zza((boolean[]) r2, (int) r5)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x01c6
        L_0x0198:
            r8.zzaem = r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r1 = r1.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x019e:
            if (r1 == 0) goto L_0x01a6
            r1.release()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r1 = r1.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x019e
        L_0x01a6:
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.zzafc = r6     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean r1 = r1.zzafa     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x01c6
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r1 = r1.zzaer     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r4 = r8.zzael     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r11 = r3.zzer()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r4 = r4 - r11
            long r1 = java.lang.Math.max(r1, r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r3.zzb(r1, r9)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x01c6:
            r34.zzeq()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r34.zzen()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzdkp r1 = r8.zzadx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.sendEmptyMessage(r7)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x01d1:
            return r10
        L_0x01d2:
            java.lang.Object r1 = r1.obj     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzmc r1 = (com.google.android.gms.internal.ads.zzmc) r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 == 0) goto L_0x01e4
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzmc r2 = r2.zzaeu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 == r1) goto L_0x01e1
            goto L_0x01e4
        L_0x01e1:
            r34.zzeq()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x01e4:
            return r10
        L_0x01e5:
            java.lang.Object r1 = r1.obj     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzmc r1 = (com.google.android.gms.internal.ads.zzmc) r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 == 0) goto L_0x021a
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzmc r2 = r2.zzaeu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 == r1) goto L_0x01f4
            goto L_0x021a
        L_0x01f4:
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.zzafa = r10     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.zzet()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r2 = r1.zzaer     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r2 = r1.zzb(r2, r9)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.zzaer = r2     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 != 0) goto L_0x0217
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzaen = r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r1 = r1.zzaer     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzdq(r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzb((com.google.android.gms.internal.ads.zzgv) r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0217:
            r34.zzeq()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x021a:
            return r10
        L_0x021b:
            java.lang.Object r1 = r1.obj     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhj r2 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Object r3 = r1.first     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhj r3 = (com.google.android.gms.internal.ads.zzhj) r3     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzadl = r3     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Object r1 = r1.second     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != 0) goto L_0x028a
            int r3 = r8.zzaej     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r3 <= 0) goto L_0x025a
            com.google.android.gms.internal.ads.zzgx r3 = r8.zzaek     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            android.util.Pair r3 = r8.zza((com.google.android.gms.internal.ads.zzgx) r3)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r4 = r8.zzaej     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzaej = r9     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzaek = r6     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r3 != 0) goto L_0x0242
            r8.zza((java.lang.Object) r1, (int) r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0378
        L_0x0242:
            com.google.android.gms.internal.ads.zzgu r7 = new com.google.android.gms.internal.ads.zzgu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Object r11 = r3.first     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r11 = r11.intValue()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Object r3 = r3.second     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r14 = r3.longValue()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r7.<init>(r11, r14)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzadq = r7     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x028b
        L_0x025a:
            com.google.android.gms.internal.ads.zzgu r3 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r3 = r3.zzaer     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x028a
            com.google.android.gms.internal.ads.zzhj r3 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean r3 = r3.isEmpty()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r3 == 0) goto L_0x026f
            r8.zza((java.lang.Object) r1, (int) r9)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0378
        L_0x026f:
            android.util.Pair r3 = r8.zzb((int) r9, (long) r12)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgu r4 = new com.google.android.gms.internal.ads.zzgu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Object r7 = r3.first     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r7 = r7.intValue()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Object r3 = r3.second     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r14 = r3.longValue()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r4.<init>(r7, r14)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzadq = r4     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x028a:
            r4 = 0
        L_0x028b:
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r3 == 0) goto L_0x0292
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0294
        L_0x0292:
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0294:
            if (r3 == 0) goto L_0x0375
            com.google.android.gms.internal.ads.zzhj r7 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Object r11 = r3.zzaev     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r7 = r7.zzc(r11)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r7 != r5) goto L_0x02f8
            int r6 = r3.zzaeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhj r7 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r8.zza((int) r6, (com.google.android.gms.internal.ads.zzhj) r2, (com.google.android.gms.internal.ads.zzhj) r7)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != r5) goto L_0x02af
            r8.zza((java.lang.Object) r1, (int) r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0378
        L_0x02af:
            com.google.android.gms.internal.ads.zzhj r6 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r7 = r8.zzade     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r6.zza((int) r2, (com.google.android.gms.internal.ads.zzhl) r7, (boolean) r9)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            android.util.Pair r2 = r8.zzb((int) r9, (long) r12)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Object r6 = r2.first     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r6 = r6.intValue()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Object r2 = r2.second     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r11 = r2.longValue()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhj r2 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r7 = r8.zzade     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2.zza((int) r6, (com.google.android.gms.internal.ads.zzhl) r7, (boolean) r10)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r2 = r8.zzade     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Object r2 = r2.zzaev     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r3.zzaeq = r5     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x02d7:
            com.google.android.gms.internal.ads.zzgv r7 = r3.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r7 == 0) goto L_0x02eb
            com.google.android.gms.internal.ads.zzgv r3 = r3.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Object r7 = r3.zzaev     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean r7 = r7.equals(r2)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r7 == 0) goto L_0x02e7
            r7 = r6
            goto L_0x02e8
        L_0x02e7:
            r7 = -1
        L_0x02e8:
            r3.zzaeq = r7     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x02d7
        L_0x02eb:
            long r2 = r8.zza((int) r6, (long) r11)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgu r5 = new com.google.android.gms.internal.ads.zzgu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r5.<init>(r6, r2)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzadq = r5     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0375
        L_0x02f8:
            boolean r2 = r8.zzo(r7)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r3.zzc(r7, r2)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r3 != r2) goto L_0x0305
            r2 = 1
            goto L_0x0306
        L_0x0305:
            r2 = 0
        L_0x0306:
            com.google.android.gms.internal.ads.zzgu r11 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r11 = r11.zzaeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r7 == r11) goto L_0x031f
            com.google.android.gms.internal.ads.zzgu r11 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgu r12 = new com.google.android.gms.internal.ads.zzgu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r13 = r11.zzaer     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r12.<init>(r7, r13)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r13 = r11.zzaes     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r12.zzaes = r13     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r13 = r11.zzaet     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r12.zzaet = r13     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzadq = r12     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x031f:
            com.google.android.gms.internal.ads.zzgv r11 = r3.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r11 == 0) goto L_0x0375
            com.google.android.gms.internal.ads.zzgv r11 = r3.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhj r12 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r13 = r8.zzade     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhk r14 = r8.zzadd     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r15 = r8.repeatMode     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r7 = r12.zza((int) r7, (com.google.android.gms.internal.ads.zzhl) r13, (com.google.android.gms.internal.ads.zzhk) r14, (int) r15)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r7 == r5) goto L_0x0356
            java.lang.Object r12 = r11.zzaev     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhj r13 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r14 = r8.zzade     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r13 = r13.zza((int) r7, (com.google.android.gms.internal.ads.zzhl) r14, (boolean) r10)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Object r13 = r13.zzaev     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean r12 = r12.equals(r13)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r12 == 0) goto L_0x0356
            boolean r3 = r8.zzo(r7)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r11.zzc(r7, r3)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r11 != r3) goto L_0x0352
            r3 = 1
            goto L_0x0353
        L_0x0352:
            r3 = 0
        L_0x0353:
            r2 = r2 | r3
            r3 = r11
            goto L_0x031f
        L_0x0356:
            if (r2 != 0) goto L_0x036c
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r2.zzaeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgu r3 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r5 = r3.zzaes     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r5 = r8.zza((int) r2, (long) r5)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgu r3 = new com.google.android.gms.internal.ads.zzgu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r3.<init>(r2, r5)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzadq = r3     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0375
        L_0x036c:
            r8.zzaem = r3     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2.zzafc = r6     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            zza((com.google.android.gms.internal.ads.zzgv) r11)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0375:
            r8.zzb((java.lang.Object) r1, (int) r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0378:
            return r10
        L_0x0379:
            r8.zzi(r10)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhd r1 = r8.zzadv     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.zzex()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.setState(r10)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            monitor-enter(r34)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzaee = r10     // Catch:{ all -> 0x038c }
            r34.notifyAll()     // Catch:{ all -> 0x038c }
            monitor-exit(r34)     // Catch:{ all -> 0x038c }
            return r10
        L_0x038c:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x038c }
            throw r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0390:
            r34.zzeo()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            return r10
        L_0x0394:
            java.lang.Object r1 = r1.obj     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhf r1 = (com.google.android.gms.internal.ads.zzhf) r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzof r2 = r8.zzaeb     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 == 0) goto L_0x03a3
            com.google.android.gms.internal.ads.zzof r2 = r8.zzaeb     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhf r1 = r2.zzb(r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x03a9
        L_0x03a3:
            com.google.android.gms.internal.ads.zzon r2 = r8.zzadw     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhf r1 = r2.zzb(r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x03a9:
            r8.zzadp = r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzdkp r2 = r8.zzada     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            android.os.Message r1 = r2.obtainMessage(r11, r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.sendToTarget()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            return r10
        L_0x03b5:
            java.lang.Object r1 = r1.obj     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgx r1 = (com.google.android.gms.internal.ads.zzgx) r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhj r2 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != 0) goto L_0x03c6
            int r2 = r8.zzaej     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r2 + r10
            r8.zzaej = r2     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzaek = r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0453
        L_0x03c6:
            android.util.Pair r2 = r8.zza((com.google.android.gms.internal.ads.zzgx) r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != 0) goto L_0x03ec
            com.google.android.gms.internal.ads.zzgu r1 = new com.google.android.gms.internal.ads.zzgu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.<init>(r9, r3)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzadq = r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzdkp r1 = r8.zzada     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgu r2 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            android.os.Message r1 = r1.obtainMessage(r15, r10, r9, r2)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.sendToTarget()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgu r1 = new com.google.android.gms.internal.ads.zzgu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.<init>(r9, r12)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzadq = r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.setState(r15)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzi(r9)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0453
        L_0x03ec:
            long r3 = r1.zzafh     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x03f4
            r1 = 1
            goto L_0x03f5
        L_0x03f4:
            r1 = 0
        L_0x03f5:
            java.lang.Object r3 = r2.first     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r3 = r3.intValue()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Object r2 = r2.second     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r4 = r2.longValue()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgu r2 = r8.zzadq     // Catch:{ all -> 0x0454 }
            int r2 = r2.zzaeq     // Catch:{ all -> 0x0454 }
            if (r3 != r2) goto L_0x0430
            r6 = 1000(0x3e8, double:4.94E-321)
            long r11 = r4 / r6
            com.google.android.gms.internal.ads.zzgu r2 = r8.zzadq     // Catch:{ all -> 0x0454 }
            long r13 = r2.zzaes     // Catch:{ all -> 0x0454 }
            long r13 = r13 / r6
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0430
            com.google.android.gms.internal.ads.zzgu r2 = new com.google.android.gms.internal.ads.zzgu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2.<init>(r3, r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzadq = r2     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzdkp r2 = r8.zzada     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x0425
            r1 = 1
            goto L_0x0426
        L_0x0425:
            r1 = 0
        L_0x0426:
            com.google.android.gms.internal.ads.zzgu r3 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.sendToTarget()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0453
        L_0x0430:
            long r6 = r8.zza((int) r3, (long) r4)     // Catch:{ all -> 0x0454 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x043a
            r2 = 1
            goto L_0x043b
        L_0x043a:
            r2 = 0
        L_0x043b:
            r1 = r1 | r2
            com.google.android.gms.internal.ads.zzgu r2 = new com.google.android.gms.internal.ads.zzgu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2.<init>(r3, r6)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzadq = r2     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzdkp r2 = r8.zzada     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x0449
            r1 = 1
            goto L_0x044a
        L_0x0449:
            r1 = 0
        L_0x044a:
            com.google.android.gms.internal.ads.zzgu r3 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.sendToTarget()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0453:
            return r10
        L_0x0454:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.zzgu r6 = new com.google.android.gms.internal.ads.zzgu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r6.<init>(r3, r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzadq = r6     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzdkp r3 = r8.zzada     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x0463
            r1 = 1
            goto L_0x0464
        L_0x0463:
            r1 = 0
        L_0x0464:
            com.google.android.gms.internal.ads.zzgu r4 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.sendToTarget()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            throw r2     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x046e:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhj r1 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 != 0) goto L_0x047e
            com.google.android.gms.internal.ads.zzme r1 = r8.zzaec     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.zzhw()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r14 = r5
            goto L_0x06da
        L_0x047e:
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 != 0) goto L_0x0487
            com.google.android.gms.internal.ads.zzgu r1 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r1 = r1.zzaeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x04c5
        L_0x0487:
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r1 = r1.zzaeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean r2 = r2.zzaez     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != 0) goto L_0x04d2
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean r2 = r2.zzes()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 == 0) goto L_0x04d2
            com.google.android.gms.internal.ads.zzhj r2 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r7 = r8.zzade     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r2 = r2.zza((int) r1, (com.google.android.gms.internal.ads.zzhl) r7, (boolean) r9)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r14 = r2.zzagy     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x04a8
            goto L_0x04d2
        L_0x04a8:
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 == 0) goto L_0x04b9
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r2.index     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r7 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r7 = r7.index     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r2 - r7
            r7 = 100
            if (r2 == r7) goto L_0x04d2
        L_0x04b9:
            com.google.android.gms.internal.ads.zzhj r2 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r7 = r8.zzade     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhk r14 = r8.zzadd     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r15 = r8.repeatMode     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r1 = r2.zza((int) r1, (com.google.android.gms.internal.ads.zzhl) r7, (com.google.android.gms.internal.ads.zzhk) r14, (int) r15)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x04c5:
            com.google.android.gms.internal.ads.zzhj r2 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r2.zzfb()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 < r2) goto L_0x04d5
            com.google.android.gms.internal.ads.zzme r1 = r8.zzaec     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.zzhw()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x04d2:
            r14 = r5
            goto L_0x05a7
        L_0x04d5:
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != 0) goto L_0x04df
            com.google.android.gms.internal.ads.zzgu r2 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r3 = r2.zzaes     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x04dd:
            r14 = r5
            goto L_0x0534
        L_0x04df:
            com.google.android.gms.internal.ads.zzhj r2 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r7 = r8.zzade     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2.zza((int) r1, (com.google.android.gms.internal.ads.zzhl) r7, (boolean) r9)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhj r2 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhk r7 = r8.zzadd     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2.zza((int) r9, (com.google.android.gms.internal.ads.zzhk) r7, (boolean) r9)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x04f0
            goto L_0x04dd
        L_0x04f0:
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r1 = r1.zzer()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhj r7 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r14 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r14 = r14.zzaeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r15 = r8.zzade     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r7 = r7.zza((int) r14, (com.google.android.gms.internal.ads.zzhl) r15, (boolean) r9)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r14 = r7.zzagy     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r1 = r1 + r14
            long r14 = r8.zzael     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r1 = r1 - r14
            com.google.android.gms.internal.ads.zzhj r7 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r14 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r18 = java.lang.Math.max(r3, r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1 = r34
            r2 = r7
            r3 = r14
            r14 = r5
            r4 = r16
            r6 = r18
            android.util.Pair r1 = r1.zza(r2, r3, r4, r6)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x05a7
            java.lang.Object r2 = r1.first     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r2.intValue()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Object r1 = r1.second     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r3 = r1.longValue()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1 = r2
        L_0x0534:
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != 0) goto L_0x053f
            r5 = 60000000(0x3938700, double:2.96439388E-316)
            long r5 = r5 + r3
        L_0x053c:
            r23 = r5
            goto L_0x0555
        L_0x053f:
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r5 = r2.zzer()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhj r2 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r7 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r7 = r7.zzaeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r11 = r8.zzade     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r2 = r2.zza((int) r7, (com.google.android.gms.internal.ads.zzhl) r11, (boolean) r9)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r12 = r2.zzagy     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r5 = r5 + r12
            goto L_0x053c
        L_0x0555:
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != 0) goto L_0x055c
            r29 = 0
            goto L_0x0563
        L_0x055c:
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r2.index     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r2 + r10
            r29 = r2
        L_0x0563:
            boolean r31 = r8.zzo(r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhj r2 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r5 = r8.zzade     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2.zza((int) r1, (com.google.android.gms.internal.ads.zzhl) r5, (boolean) r10)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r2 = new com.google.android.gms.internal.ads.zzgv     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhe[] r5 = r8.zzacx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhh[] r6 = r8.zzadu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzni r7 = r8.zzacy     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhd r11 = r8.zzadv     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzme r12 = r8.zzaec     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r13 = r8.zzade     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            java.lang.Object r13 = r13.zzaev     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r20 = r2
            r21 = r5
            r22 = r6
            r25 = r7
            r26 = r11
            r27 = r12
            r28 = r13
            r30 = r1
            r32 = r3
            r20.<init>(r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x059b
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.zzafc = r2     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x059b:
            r8.zzaem = r2     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzmc r1 = r1.zzaeu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.zza(r8, r3)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzh(r10)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x05a7:
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x05c0
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean r1 = r1.zzes()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x05b4
            goto L_0x05c0
        L_0x05b4:
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x05c3
            boolean r1 = r8.zzadk     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 != 0) goto L_0x05c3
            r34.zzeq()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x05c3
        L_0x05c0:
            r8.zzh(r9)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x05c3:
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x06da
        L_0x05c7:
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == r2) goto L_0x0604
            long r1 = r8.zzael     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r3 = r3.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r3 = r3.zzaey     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0604
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.release()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r1 = r1.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzb((com.google.android.gms.internal.ads.zzgv) r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgu r1 = new com.google.android.gms.internal.ads.zzgu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r2.zzaeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r3 = r3.zzaer     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.<init>(r2, r3)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzadq = r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r34.zzen()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzdkp r1 = r8.zzada     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2 = 5
            com.google.android.gms.internal.ads.zzgu r3 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.sendToTarget()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x05c7
        L_0x0604:
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean r1 = r1.zzaez     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x062e
            r1 = 0
        L_0x060b:
            com.google.android.gms.internal.ads.zzhe[] r2 = r8.zzacx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r2.length     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 >= r2) goto L_0x06da
            com.google.android.gms.internal.ads.zzhe[] r2 = r8.zzacx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2 = r2[r1]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzmn[] r3 = r3.zzaew     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r3 = r3[r1]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r3 == 0) goto L_0x062b
            com.google.android.gms.internal.ads.zzmn r4 = r2.zzdw()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r4 != r3) goto L_0x062b
            boolean r3 = r2.zzdx()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r3 == 0) goto L_0x062b
            r2.zzdy()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x062b:
            int r1 = r1 + 1
            goto L_0x060b
        L_0x062e:
            r1 = 0
        L_0x062f:
            com.google.android.gms.internal.ads.zzhe[] r2 = r8.zzacx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r2.length     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 >= r2) goto L_0x0651
            com.google.android.gms.internal.ads.zzhe[] r2 = r8.zzacx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2 = r2[r1]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzmn[] r3 = r3.zzaew     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r3 = r3[r1]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzmn r4 = r2.zzdw()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r4 != r3) goto L_0x06da
            if (r3 == 0) goto L_0x064e
            boolean r2 = r2.zzdx()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != 0) goto L_0x064e
            goto L_0x06da
        L_0x064e:
            int r1 = r1 + 1
            goto L_0x062f
        L_0x0651:
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r1 = r1.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x06da
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r1 = r1.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean r1 = r1.zzafa     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x06da
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zznk r1 = r1.zzafd     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r2 = r2.zzafc     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzaen = r2     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zznk r2 = r2.zzafd     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzmc r3 = r3.zzaeu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r3 = r3.zzhn()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0680
            r3 = 1
            goto L_0x0681
        L_0x0680:
            r3 = 0
        L_0x0681:
            r4 = 0
        L_0x0682:
            com.google.android.gms.internal.ads.zzhe[] r5 = r8.zzacx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r5 = r5.length     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r4 >= r5) goto L_0x06da
            com.google.android.gms.internal.ads.zzhe[] r5 = r8.zzacx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r5 = r5[r4]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zznf r6 = r1.zzbeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zznd r6 = r6.zzay(r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r6 == 0) goto L_0x06d7
            if (r3 != 0) goto L_0x06d4
            boolean r6 = r5.zzdz()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r6 != 0) goto L_0x06d7
            com.google.android.gms.internal.ads.zznf r6 = r2.zzbeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zznd r6 = r6.zzay(r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhg[] r7 = r1.zzbeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r7 = r7[r4]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhg[] r11 = r2.zzbeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r11 = r11[r4]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r6 == 0) goto L_0x06d4
            boolean r7 = r11.equals(r7)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r7 == 0) goto L_0x06d4
            int r7 = r6.length()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgz[] r7 = new com.google.android.gms.internal.ads.zzgz[r7]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r11 = 0
        L_0x06b8:
            int r12 = r7.length     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r11 >= r12) goto L_0x06c4
            com.google.android.gms.internal.ads.zzgz r12 = r6.zzav(r11)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r7[r11] = r12     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r11 = r11 + 1
            goto L_0x06b8
        L_0x06c4:
            com.google.android.gms.internal.ads.zzgv r6 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzmn[] r6 = r6.zzaew     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r6 = r6[r4]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r11 = r8.zzaen     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r11 = r11.zzer()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r5.zza(r7, r6, r11)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x06d7
        L_0x06d4:
            r5.zzdy()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x06d7:
            int r4 = r4 + 1
            goto L_0x0682
        L_0x06da:
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2 = 10
            if (r1 != 0) goto L_0x06e8
            r34.zzep()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zza((long) r14, (long) r2)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x084a
        L_0x06e8:
            java.lang.String r1 = "doSomeWork"
            com.google.android.gms.internal.ads.zzoq.beginSection(r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r34.zzen()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r1 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzmc r1 = r1.zzaeu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgu r4 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r4 = r4.zzaes     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.zzef(r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhe[] r1 = r8.zzaed     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r4 = r1.length     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r5 = 0
            r6 = 1
            r7 = 1
        L_0x0701:
            if (r5 >= r4) goto L_0x0738
            r11 = r1[r5]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r12 = r8.zzael     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r2 = r8.zzaei     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r11.zzb(r12, r2)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r7 == 0) goto L_0x0716
            boolean r2 = r11.zzez()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 == 0) goto L_0x0716
            r7 = 1
            goto L_0x0717
        L_0x0716:
            r7 = 0
        L_0x0717:
            boolean r2 = r11.isReady()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != 0) goto L_0x0726
            boolean r2 = r11.zzez()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 == 0) goto L_0x0724
            goto L_0x0726
        L_0x0724:
            r2 = 0
            goto L_0x0727
        L_0x0726:
            r2 = 1
        L_0x0727:
            if (r2 != 0) goto L_0x072c
            r11.zzea()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x072c:
            if (r6 == 0) goto L_0x0732
            if (r2 == 0) goto L_0x0732
            r6 = 1
            goto L_0x0733
        L_0x0732:
            r6 = 0
        L_0x0733:
            int r5 = r5 + 1
            r2 = 10
            goto L_0x0701
        L_0x0738:
            if (r6 != 0) goto L_0x073d
            r34.zzep()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x073d:
            com.google.android.gms.internal.ads.zzof r1 = r8.zzaeb     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x0762
            com.google.android.gms.internal.ads.zzof r1 = r8.zzaeb     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhf r1 = r1.zzfn()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhf r2 = r8.zzadp     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean r2 = r1.equals(r2)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != 0) goto L_0x0762
            r8.zzadp = r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzon r2 = r8.zzadw     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzof r3 = r8.zzaeb     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2.zza(r3)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzdkp r2 = r8.zzada     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.sendToTarget()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0762:
            com.google.android.gms.internal.ads.zzhj r1 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r2.zzaeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r3 = r8.zzade     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r1 = r1.zza((int) r2, (com.google.android.gms.internal.ads.zzhl) r3, (boolean) r9)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r1 = r1.zzagy     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r7 == 0) goto L_0x0793
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0783
            com.google.android.gms.internal.ads.zzgu r3 = r8.zzadq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r3 = r3.zzaes     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0793
        L_0x0783:
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaeo     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean r3 = r3.zzaez     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r3 == 0) goto L_0x0793
            r3 = 4
            r8.setState(r3)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r34.zzem()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r4 = 2
            goto L_0x0813
        L_0x0793:
            int r3 = r8.state     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r4 = 2
            if (r3 != r4) goto L_0x07f8
            com.google.android.gms.internal.ads.zzhe[] r3 = r8.zzaed     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r3 = r3.length     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r3 <= 0) goto L_0x07e6
            if (r6 == 0) goto L_0x07e4
            boolean r1 = r8.zzaef     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean r2 = r2.zzafa     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 != 0) goto L_0x07ac
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r2 = r2.zzaer     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x07b4
        L_0x07ac:
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzmc r2 = r2.zzaeu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r2 = r2.zzho()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x07b4:
            r5 = -9223372036854775808
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x07d0
            com.google.android.gms.internal.ads.zzgv r2 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean r2 = r2.zzaez     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r2 == 0) goto L_0x07c2
            r1 = 1
            goto L_0x07e0
        L_0x07c2:
            com.google.android.gms.internal.ads.zzhj r2 = r8.zzadl     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r3 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r3 = r3.zzaeq     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r5 = r8.zzade     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhl r2 = r2.zza((int) r3, (com.google.android.gms.internal.ads.zzhl) r5, (boolean) r9)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r2 = r2.zzagy     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x07d0:
            com.google.android.gms.internal.ads.zzhd r5 = r8.zzadv     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgv r6 = r8.zzaem     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r11 = r8.zzael     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r6 = r6.zzer()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            long r11 = r11 - r6
            long r2 = r2 - r11
            boolean r1 = r5.zzc(r2, r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x07e0:
            if (r1 == 0) goto L_0x07e4
            r1 = 1
            goto L_0x07ea
        L_0x07e4:
            r1 = 0
            goto L_0x07ea
        L_0x07e6:
            boolean r1 = r8.zzdr(r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x07ea:
            if (r1 == 0) goto L_0x0813
            r1 = 3
            r8.setState(r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            boolean r1 = r8.zzadg     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x0813
            r34.zzel()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0813
        L_0x07f8:
            int r3 = r8.state     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r5 = 3
            if (r3 != r5) goto L_0x0813
            com.google.android.gms.internal.ads.zzhe[] r3 = r8.zzaed     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r3 = r3.length     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r3 <= 0) goto L_0x0803
            goto L_0x0807
        L_0x0803:
            boolean r6 = r8.zzdr(r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0807:
            if (r6 != 0) goto L_0x0813
            boolean r1 = r8.zzadg     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzaef = r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.setState(r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r34.zzem()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0813:
            int r1 = r8.state     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 != r4) goto L_0x0824
            com.google.android.gms.internal.ads.zzhe[] r1 = r8.zzaed     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r2 = r1.length     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x081a:
            if (r9 >= r2) goto L_0x0824
            r3 = r1[r9]     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r3.zzea()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r9 = r9 + 1
            goto L_0x081a
        L_0x0824:
            boolean r1 = r8.zzadg     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x082d
            int r1 = r8.state     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2 = 3
            if (r1 == r2) goto L_0x0831
        L_0x082d:
            int r1 = r8.state     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 != r4) goto L_0x0837
        L_0x0831:
            r1 = 10
            r8.zza((long) r14, (long) r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0847
        L_0x0837:
            com.google.android.gms.internal.ads.zzhe[] r1 = r8.zzaed     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r1 = r1.length     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x0842
            r1 = 1000(0x3e8, double:4.94E-321)
            r8.zza((long) r14, (long) r1)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0847
        L_0x0842:
            com.google.android.gms.internal.ads.zzdkp r1 = r8.zzadx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.removeMessages(r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0847:
            com.google.android.gms.internal.ads.zzoq.endSection()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x084a:
            return r10
        L_0x084b:
            r4 = 2
            int r1 = r1.arg1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x0852
            r1 = 1
            goto L_0x0853
        L_0x0852:
            r1 = 0
        L_0x0853:
            r8.zzaef = r9     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzadg = r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 != 0) goto L_0x0860
            r34.zzem()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r34.zzen()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0877
        L_0x0860:
            int r1 = r8.state     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2 = 3
            if (r1 != r2) goto L_0x086e
            r34.zzel()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzdkp r1 = r8.zzadx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.sendEmptyMessage(r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            goto L_0x0877
        L_0x086e:
            int r1 = r8.state     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 != r4) goto L_0x0877
            com.google.android.gms.internal.ads.zzdkp r1 = r8.zzadx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.sendEmptyMessage(r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x0877:
            return r10
        L_0x0878:
            r4 = 2
            java.lang.Object r2 = r1.obj     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzme r2 = (com.google.android.gms.internal.ads.zzme) r2     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            int r1 = r1.arg1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x0883
            r1 = 1
            goto L_0x0884
        L_0x0883:
            r1 = 0
        L_0x0884:
            com.google.android.gms.internal.ads.zzdkp r3 = r8.zzada     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r3.sendEmptyMessage(r9)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzi(r10)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzhd r3 = r8.zzadv     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r3.zzew()     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            if (r1 == 0) goto L_0x089f
            com.google.android.gms.internal.ads.zzgu r1 = new com.google.android.gms.internal.ads.zzgu     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r9, r5)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.zzadq = r1     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
        L_0x089f:
            r8.zzaec = r2     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzgn r1 = r8.zzadz     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r2.zza(r1, r10, r8)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r8.setState(r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            com.google.android.gms.internal.ads.zzdkp r1 = r8.zzadx     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            r1.sendEmptyMessage(r4)     // Catch:{ zzgk -> 0x08b4, IOException -> 0x08af, RuntimeException -> 0x08b9 }
            return r10
        L_0x08af:
            r0 = move-exception
            r1 = r0
            r3 = 8
            goto L_0x08d9
        L_0x08b4:
            r0 = move-exception
            r1 = r0
            r3 = 8
            goto L_0x08f5
        L_0x08b9:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Internal runtime error."
            android.util.Log.e(r2, r3, r1)
            com.google.android.gms.internal.ads.zzdkp r2 = r8.zzada
            com.google.android.gms.internal.ads.zzgk r1 = com.google.android.gms.internal.ads.zzgk.zza((java.lang.RuntimeException) r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.zzeo()
            return r10
        L_0x08d5:
            r0 = move-exception
            r3 = 8
            r1 = r0
        L_0x08d9:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r4 = "Source error."
            android.util.Log.e(r2, r4, r1)
            com.google.android.gms.internal.ads.zzdkp r2 = r8.zzada
            com.google.android.gms.internal.ads.zzgk r1 = com.google.android.gms.internal.ads.zzgk.zza((java.io.IOException) r1)
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.zzeo()
            return r10
        L_0x08f1:
            r0 = move-exception
            r3 = 8
            r1 = r0
        L_0x08f5:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r4 = "Renderer error."
            android.util.Log.e(r2, r4, r1)
            com.google.android.gms.internal.ads.zzdkp r2 = r8.zzada
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.zzeo()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgs.handleMessage(android.os.Message):boolean");
    }

    private final void setState(int i) {
        if (this.state != i) {
            this.state = i;
            this.zzada.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    private final void zzh(boolean z) {
        if (this.zzadk != z) {
            this.zzadk = z;
            this.zzada.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    private final void zzel() throws zzgk {
        this.zzaef = false;
        this.zzadw.start();
        for (zzhe start : this.zzaed) {
            start.start();
        }
    }

    private final void zzem() throws zzgk {
        this.zzadw.stop();
        for (zzhe zza : this.zzaed) {
            zza(zza);
        }
    }

    private final void zzen() throws zzgk {
        long j;
        zzgv zzgv = this.zzaeo;
        if (zzgv != null) {
            long zzhn = zzgv.zzaeu.zzhn();
            if (zzhn != -9223372036854775807L) {
                zzdq(zzhn);
            } else {
                zzhe zzhe = this.zzaea;
                if (zzhe == null || zzhe.zzez()) {
                    this.zzael = this.zzadw.zzfx();
                } else {
                    this.zzael = this.zzaeb.zzfx();
                    this.zzadw.zzel(this.zzael);
                }
                zzhn = this.zzael - this.zzaeo.zzer();
            }
            this.zzadq.zzaes = zzhn;
            this.zzaei = SystemClock.elapsedRealtime() * 1000;
            if (this.zzaed.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.zzaeo.zzaeu.zzho();
            }
            zzgu zzgu = this.zzadq;
            if (j == Long.MIN_VALUE) {
                j = this.zzadl.zza(this.zzaeo.zzaeq, this.zzade, false).zzagy;
            }
            zzgu.zzaet = j;
        }
    }

    private final void zza(long j, long j2) {
        this.zzadx.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.zzadx.sendEmptyMessage(2);
        } else {
            this.zzadx.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private final long zza(int i, long j) throws zzgk {
        zzgv zzgv;
        zzem();
        this.zzaef = false;
        setState(2);
        zzgv zzgv2 = this.zzaeo;
        if (zzgv2 == null) {
            zzgv zzgv3 = this.zzaem;
            if (zzgv3 != null) {
                zzgv3.release();
            }
            zzgv = null;
        } else {
            zzgv = null;
            while (zzgv2 != null) {
                if (zzgv2.zzaeq != i || !zzgv2.zzafa) {
                    zzgv2.release();
                } else {
                    zzgv = zzgv2;
                }
                zzgv2 = zzgv2.zzafc;
            }
        }
        zzgv zzgv4 = this.zzaeo;
        if (!(zzgv4 == zzgv && zzgv4 == this.zzaen)) {
            for (zzhe disable : this.zzaed) {
                disable.disable();
            }
            this.zzaed = new zzhe[0];
            this.zzaeb = null;
            this.zzaea = null;
            this.zzaeo = null;
        }
        if (zzgv != null) {
            zzgv.zzafc = null;
            this.zzaem = zzgv;
            this.zzaen = zzgv;
            zzb(zzgv);
            if (this.zzaeo.zzafb) {
                j = this.zzaeo.zzaeu.zzeg(j);
            }
            zzdq(j);
            zzeq();
        } else {
            this.zzaem = null;
            this.zzaen = null;
            this.zzaeo = null;
            zzdq(j);
        }
        this.zzadx.sendEmptyMessage(2);
        return j;
    }

    private final void zzdq(long j) throws zzgk {
        long j2;
        zzgv zzgv = this.zzaeo;
        if (zzgv == null) {
            j2 = 60000000;
        } else {
            j2 = zzgv.zzer();
        }
        this.zzael = j + j2;
        this.zzadw.zzel(this.zzael);
        for (zzhe zzdm : this.zzaed) {
            zzdm.zzdm(this.zzael);
        }
    }

    private final void zzeo() {
        zzi(true);
        this.zzadv.onStopped();
        setState(1);
    }

    private final void zzi(boolean z) {
        this.zzadx.removeMessages(2);
        this.zzaef = false;
        this.zzadw.stop();
        this.zzaeb = null;
        this.zzaea = null;
        this.zzael = 60000000;
        for (zzhe zzhe : this.zzaed) {
            try {
                zza(zzhe);
                zzhe.disable();
            } catch (zzgk | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.zzaed = new zzhe[0];
        zzgv zzgv = this.zzaeo;
        if (zzgv == null) {
            zzgv = this.zzaem;
        }
        zza(zzgv);
        this.zzaem = null;
        this.zzaen = null;
        this.zzaeo = null;
        zzh(false);
        if (z) {
            zzme zzme = this.zzaec;
            if (zzme != null) {
                zzme.zzhx();
                this.zzaec = null;
            }
            this.zzadl = null;
        }
    }

    private static void zza(zzhe zzhe) throws zzgk {
        if (zzhe.getState() == 2) {
            zzhe.stop();
        }
    }

    private final boolean zzdr(long j) {
        if (j == -9223372036854775807L || this.zzadq.zzaes < j) {
            return true;
        }
        return this.zzaeo.zzafc != null && this.zzaeo.zzafc.zzafa;
    }

    private final void zzep() throws IOException {
        zzgv zzgv = this.zzaem;
        if (zzgv != null && !zzgv.zzafa) {
            zzgv zzgv2 = this.zzaen;
            if (zzgv2 == null || zzgv2.zzafc == this.zzaem) {
                zzhe[] zzheArr = this.zzaed;
                int length = zzheArr.length;
                int i = 0;
                while (i < length) {
                    if (zzheArr[i].zzdx()) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.zzaem.zzaeu.zzhl();
            }
        }
    }

    private final void zza(Object obj, int i) {
        this.zzadq = new zzgu(0, 0);
        zzb(obj, i);
        this.zzadq = new zzgu(0, -9223372036854775807L);
        setState(4);
        zzi(false);
    }

    private final void zzb(Object obj, int i) {
        this.zzada.obtainMessage(6, new zzgw(this.zzadl, obj, this.zzadq, i)).sendToTarget();
    }

    private final int zza(int i, zzhj zzhj, zzhj zzhj2) {
        int zzfb = zzhj.zzfb();
        int i2 = i;
        int i3 = -1;
        for (int i4 = 0; i4 < zzfb && i3 == -1; i4++) {
            i2 = zzhj.zza(i2, this.zzade, this.zzadd, this.repeatMode);
            i3 = zzhj2.zzc(zzhj.zza(i2, this.zzade, true).zzaev);
        }
        return i3;
    }

    private final boolean zzo(int i) {
        this.zzadl.zza(i, this.zzade, false);
        if (this.zzadl.zza(0, this.zzadd, false).zzagu || this.zzadl.zza(i, this.zzade, this.zzadd, this.repeatMode) != -1) {
            return false;
        }
        return true;
    }

    private final Pair<Integer, Long> zza(zzgx zzgx) {
        zzhj zzhj = zzgx.zzadl;
        if (zzhj.isEmpty()) {
            zzhj = this.zzadl;
        }
        try {
            Pair<Integer, Long> zzb = zzb(zzhj, zzgx.zzafg, zzgx.zzafh);
            zzhj zzhj2 = this.zzadl;
            if (zzhj2 == zzhj) {
                return zzb;
            }
            int zzc = zzhj2.zzc(zzhj.zza(((Integer) zzb.first).intValue(), this.zzade, true).zzaev);
            if (zzc != -1) {
                return Pair.create(Integer.valueOf(zzc), (Long) zzb.second);
            }
            int zza = zza(((Integer) zzb.first).intValue(), zzhj, this.zzadl);
            if (zza == -1) {
                return null;
            }
            this.zzadl.zza(zza, this.zzade, false);
            return zzb(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzha(this.zzadl, zzgx.zzafg, zzgx.zzafh);
        }
    }

    private final Pair<Integer, Long> zzb(int i, long j) {
        return zzb(this.zzadl, i, -9223372036854775807L);
    }

    private final Pair<Integer, Long> zzb(zzhj zzhj, int i, long j) {
        return zza(zzhj, i, j, 0);
    }

    private final Pair<Integer, Long> zza(zzhj zzhj, int i, long j, long j2) {
        zzob.zzc(i, 0, zzhj.zzfa());
        zzhj.zza(i, this.zzadd, false, j2);
        if (j == -9223372036854775807L) {
            j = this.zzadd.zzagx;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        long j3 = this.zzadd.zzagz + j;
        long j4 = zzhj.zza(0, this.zzade, false).zzagy;
        if (j4 != -9223372036854775807L) {
            int i2 = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j3));
    }

    private final void zzeq() {
        long j;
        if (!this.zzaem.zzafa) {
            j = 0;
        } else {
            j = this.zzaem.zzaeu.zzhk();
        }
        if (j == Long.MIN_VALUE) {
            zzh(false);
            return;
        }
        long zzer = this.zzael - this.zzaem.zzer();
        boolean zzdt = this.zzadv.zzdt(j - zzer);
        zzh(zzdt);
        if (zzdt) {
            this.zzaem.zzaeu.zzee(zzer);
        }
    }

    private static void zza(zzgv zzgv) {
        while (zzgv != null) {
            zzgv.release();
            zzgv = zzgv.zzafc;
        }
    }

    private final void zzb(zzgv zzgv) throws zzgk {
        if (this.zzaeo != zzgv) {
            boolean[] zArr = new boolean[this.zzacx.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                zzhe[] zzheArr = this.zzacx;
                if (i < zzheArr.length) {
                    zzhe zzhe = zzheArr[i];
                    zArr[i] = zzhe.getState() != 0;
                    zznd zzay = zzgv.zzafd.zzbeo.zzay(i);
                    if (zzay != null) {
                        i2++;
                    }
                    if (zArr[i] && (zzay == null || (zzhe.zzdz() && zzhe.zzdw() == this.zzaeo.zzaew[i]))) {
                        if (zzhe == this.zzaea) {
                            this.zzadw.zza(this.zzaeb);
                            this.zzaeb = null;
                            this.zzaea = null;
                        }
                        zza(zzhe);
                        zzhe.disable();
                    }
                    i++;
                } else {
                    this.zzaeo = zzgv;
                    this.zzada.obtainMessage(3, zzgv.zzafd).sendToTarget();
                    zza(zArr, i2);
                    return;
                }
            }
        }
    }

    private final void zza(boolean[] zArr, int i) throws zzgk {
        this.zzaed = new zzhe[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzhe[] zzheArr = this.zzacx;
            if (i2 < zzheArr.length) {
                zzhe zzhe = zzheArr[i2];
                zznd zzay = this.zzaeo.zzafd.zzbeo.zzay(i2);
                if (zzay != null) {
                    int i4 = i3 + 1;
                    this.zzaed[i3] = zzhe;
                    if (zzhe.getState() == 0) {
                        zzhg zzhg = this.zzaeo.zzafd.zzbeq[i2];
                        boolean z = this.zzadg && this.state == 3;
                        boolean z2 = !zArr[i2] && z;
                        zzgz[] zzgzArr = new zzgz[zzay.length()];
                        for (int i5 = 0; i5 < zzgzArr.length; i5++) {
                            zzgzArr[i5] = zzay.zzav(i5);
                        }
                        zzhe.zza(zzhg, zzgzArr, this.zzaeo.zzaew[i2], this.zzael, z2, this.zzaeo.zzer());
                        zzof zzdv = zzhe.zzdv();
                        if (zzdv != null) {
                            if (this.zzaeb == null) {
                                this.zzaeb = zzdv;
                                this.zzaea = zzhe;
                                this.zzaeb.zzb(this.zzadp);
                            } else {
                                throw zzgk.zza((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
                            }
                        }
                        if (z) {
                            zzhe.start();
                        }
                    }
                    i3 = i4;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final /* synthetic */ void zza(zzmq zzmq) {
        this.zzadx.obtainMessage(9, (zzmc) zzmq).sendToTarget();
    }
}
