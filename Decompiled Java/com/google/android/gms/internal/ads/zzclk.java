package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzclk {
    private int responseCode = 0;
    private long zzgab = 0;
    private long zzgac = 0;
    private long zzgad = 0;
    private final Object zzgae = new Object();
    private final Object zzgaf = new Object();
    private final Object zzgag = new Object();
    private final Object zzgah = new Object();

    public final void zzdk(int i) {
        synchronized (this.zzgae) {
            this.responseCode = i;
        }
    }

    public final int getResponseCode() {
        int i;
        synchronized (this.zzgae) {
            i = this.responseCode;
        }
        return i;
    }

    public final void zzeq(long j) {
        synchronized (this.zzgaf) {
            this.zzgab = j;
        }
    }

    public final long zzanw() {
        long j;
        synchronized (this.zzgaf) {
            j = this.zzgab;
        }
        return j;
    }

    public final synchronized void zzfe(long j) {
        synchronized (this.zzgag) {
            this.zzgac = j;
        }
    }

    public final synchronized long zzanx() {
        long j;
        synchronized (this.zzgag) {
            j = this.zzgac;
        }
        return j;
    }

    public final synchronized void zzer(long j) {
        synchronized (this.zzgah) {
            this.zzgad = j;
        }
    }

    public final synchronized long zzany() {
        long j;
        synchronized (this.zzgah) {
            j = this.zzgad;
        }
        return j;
    }
}
