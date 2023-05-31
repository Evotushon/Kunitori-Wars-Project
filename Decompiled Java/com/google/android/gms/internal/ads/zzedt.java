package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzedt implements zzbi, Closeable, Iterator<zzbf> {
    private static zzeeb zzcr = zzeeb.zzn(zzedt.class);
    private static final zzbf zzifp = new zzedw("eof ");
    long zzare = 0;
    long zzbcq = 0;
    protected zzedv zzifn;
    protected zzbe zzifq;
    private zzbf zzifr = null;
    long zzifs = 0;
    private List<zzbf> zzift = new ArrayList();

    public final List<zzbf> zzbgk() {
        if (this.zzifn == null || this.zzifr == zzifp) {
            return this.zzift;
        }
        return new zzedz(this.zzift, this);
    }

    public void zza(zzedv zzedv, long j, zzbe zzbe) throws IOException {
        this.zzifn = zzedv;
        long position = zzedv.position();
        this.zzbcq = position;
        this.zzifs = position;
        zzedv.zzfc(zzedv.position() + j);
        this.zzare = zzedv.position();
        this.zzifq = zzbe;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        zzbf zzbf = this.zzifr;
        if (zzbf == zzifp) {
            return false;
        }
        if (zzbf != null) {
            return true;
        }
        try {
            this.zzifr = (zzbf) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzifr = zzifp;
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzbgl */
    public final zzbf next() {
        zzbf zza;
        zzbf zzbf = this.zzifr;
        if (zzbf == null || zzbf == zzifp) {
            zzedv zzedv = this.zzifn;
            if (zzedv == null || this.zzifs >= this.zzare) {
                this.zzifr = zzifp;
                throw new NoSuchElementException();
            }
            try {
                synchronized (zzedv) {
                    this.zzifn.zzfc(this.zzifs);
                    zza = this.zzifq.zza(this.zzifn, this);
                    this.zzifs = this.zzifn.position();
                }
                return zza;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.zzifr = null;
            return zzbf;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zzift.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.zzift.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public void close() throws IOException {
        this.zzifn.close();
    }
}
