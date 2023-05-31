package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbce implements zzno {
    private boolean isOpen;
    private Uri uri;
    private InputStream zzecz;
    private final zzno zzeda;
    @Nullable
    private final zzoc<zzno> zzedb;
    private final zzbcd zzedc;
    private final Context zzur;

    public zzbce(Context context, zzno zzno, zzoc<zzno> zzoc, zzbcd zzbcd) {
        this.zzur = context;
        this.zzeda = zzno;
        this.zzedb = zzoc;
        this.zzedc = zzbcd;
    }

    public final void close() throws IOException {
        if (this.isOpen) {
            this.isOpen = false;
            this.uri = null;
            InputStream inputStream = this.zzecz;
            if (inputStream != null) {
                IOUtils.closeQuietly((Closeable) inputStream);
                this.zzecz = null;
            } else {
                this.zzeda.close();
            }
            zzoc<zzno> zzoc = this.zzedb;
            if (zzoc != null) {
                zzoc.zze(this);
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r6.cancel(true);
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r6.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d0, code lost:
        r6 = com.google.android.gms.ads.internal.zzq.zzlc().elapsedRealtime() - r11;
        r1.zzedc.zzb(false, r6);
        r4 = new java.lang.StringBuilder(44);
        r4.append("Cache connection took ");
        r4.append(r6);
        r4.append("ms");
        com.google.android.gms.internal.ads.zzawf.zzee(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f4, code lost:
        r4 = com.google.android.gms.ads.internal.zzq.zzlc().elapsedRealtime() - r11;
        r1.zzedc.zzb(false, r4);
        r6 = new java.lang.StringBuilder(44);
        r6.append("Cache connection took ");
        r6.append(r4);
        r6.append("ms");
        com.google.android.gms.internal.ads.zzawf.zzee(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0117, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:18:0x009f, B:21:0x00cd] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x009f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00cd */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x00cd=Splitter:B:21:0x00cd, B:18:0x009f=Splitter:B:18:0x009f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zza(com.google.android.gms.internal.ads.zznp r21) throws java.io.IOException {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.String r2 = "ms"
            java.lang.String r3 = "Cache connection took "
            boolean r4 = r1.isOpen
            if (r4 != 0) goto L_0x015e
            r4 = 1
            r1.isOpen = r4
            android.net.Uri r5 = r0.uri
            r1.uri = r5
            com.google.android.gms.internal.ads.zzoc<com.google.android.gms.internal.ads.zzno> r5 = r1.zzedb
            if (r5 == 0) goto L_0x001a
            r5.zza(r1, r0)
        L_0x001a:
            android.net.Uri r5 = r0.uri
            com.google.android.gms.internal.ads.zzrz r5 = com.google.android.gms.internal.ads.zzrz.zzd(r5)
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.zzzx.zzcoa
            com.google.android.gms.internal.ads.zzzt r7 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r6 = r7.zzd(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r7 = -1
            if (r6 == 0) goto L_0x0118
            if (r5 == 0) goto L_0x0136
            long r9 = r0.zzana
            r5.zzbry = r9
            boolean r6 = r5.zzbrx
            if (r6 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzzi<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzzx.zzcoc
            com.google.android.gms.internal.ads.zzzt r9 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r6 = r9.zzd(r6)
            java.lang.Long r6 = (java.lang.Long) r6
            goto L_0x0057
        L_0x004b:
            com.google.android.gms.internal.ads.zzzi<java.lang.Long> r6 = com.google.android.gms.internal.ads.zzzx.zzcob
            com.google.android.gms.internal.ads.zzzt r9 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r6 = r9.zzd(r6)
            java.lang.Long r6 = (java.lang.Long) r6
        L_0x0057:
            long r9 = r6.longValue()
            com.google.android.gms.common.util.Clock r6 = com.google.android.gms.ads.internal.zzq.zzlc()
            long r11 = r6.elapsedRealtime()
            com.google.android.gms.ads.internal.zzq.zzlp()
            android.content.Context r6 = r1.zzur
            java.util.concurrent.Future r6 = com.google.android.gms.internal.ads.zzso.zza(r6, r5)
            r13 = 0
            r14 = 44
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            java.lang.Object r9 = r6.get(r9, r15)     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            java.io.InputStream r9 = (java.io.InputStream) r9     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            r1.zzecz = r9     // Catch:{ ExecutionException | TimeoutException -> 0x00cd, InterruptedException -> 0x009f }
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzq.zzlc()
            long r5 = r0.elapsedRealtime()
            long r5 = r5 - r11
            com.google.android.gms.internal.ads.zzbcd r0 = r1.zzedc
            r0.zzb(r4, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r3)
            r0.append(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzawf.zzee(r0)
            return r7
        L_0x009d:
            r0 = move-exception
            goto L_0x00f4
        L_0x009f:
            r6.cancel(r4)     // Catch:{ all -> 0x009d }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x009d }
            r4.interrupt()     // Catch:{ all -> 0x009d }
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzq.zzlc()
            long r6 = r4.elapsedRealtime()
            long r6 = r6 - r11
            com.google.android.gms.internal.ads.zzbcd r4 = r1.zzedc
            r4.zzb(r13, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r14)
            r4.append(r3)
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.zzawf.zzee(r2)
            goto L_0x0136
        L_0x00cd:
            r6.cancel(r4)     // Catch:{ all -> 0x009d }
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzq.zzlc()
            long r6 = r4.elapsedRealtime()
            long r6 = r6 - r11
            com.google.android.gms.internal.ads.zzbcd r4 = r1.zzedc
            r4.zzb(r13, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r14)
            r4.append(r3)
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.zzawf.zzee(r2)
            goto L_0x0136
        L_0x00f4:
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzq.zzlc()
            long r4 = r4.elapsedRealtime()
            long r4 = r4 - r11
            com.google.android.gms.internal.ads.zzbcd r6 = r1.zzedc
            r6.zzb(r13, r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r14)
            r6.append(r3)
            r6.append(r4)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.google.android.gms.internal.ads.zzawf.zzee(r2)
            throw r0
        L_0x0118:
            r2 = 0
            if (r5 == 0) goto L_0x0127
            long r2 = r0.zzana
            r5.zzbry = r2
            com.google.android.gms.internal.ads.zzrr r2 = com.google.android.gms.ads.internal.zzq.zzlb()
            com.google.android.gms.internal.ads.zzry r2 = r2.zza((com.google.android.gms.internal.ads.zzrz) r5)
        L_0x0127:
            if (r2 == 0) goto L_0x0136
            boolean r3 = r2.zzmu()
            if (r3 == 0) goto L_0x0136
            java.io.InputStream r0 = r2.zzmv()
            r1.zzecz = r0
            return r7
        L_0x0136:
            if (r5 == 0) goto L_0x0157
            com.google.android.gms.internal.ads.zznp r2 = new com.google.android.gms.internal.ads.zznp
            java.lang.String r3 = r5.url
            android.net.Uri r10 = android.net.Uri.parse(r3)
            byte[] r11 = r0.zzbet
            long r12 = r0.zzbeu
            long r14 = r0.zzana
            long r3 = r0.zzce
            java.lang.String r5 = r0.zzcc
            int r0 = r0.flags
            r9 = r2
            r16 = r3
            r18 = r5
            r19 = r0
            r9.<init>(r10, r11, r12, r14, r16, r18, r19)
            r0 = r2
        L_0x0157:
            com.google.android.gms.internal.ads.zzno r2 = r1.zzeda
            long r2 = r2.zza(r0)
            return r2
        L_0x015e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Attempt to open an already open CacheDataSource."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbce.zza(com.google.android.gms.internal.ads.zznp):long");
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.isOpen) {
            InputStream inputStream = this.zzecz;
            if (inputStream != null) {
                i3 = inputStream.read(bArr, i, i2);
            } else {
                i3 = this.zzeda.read(bArr, i, i2);
            }
            zzoc<zzno> zzoc = this.zzedb;
            if (zzoc != null) {
                zzoc.zzc(this, i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    public final Uri getUri() {
        return this.uri;
    }
}
