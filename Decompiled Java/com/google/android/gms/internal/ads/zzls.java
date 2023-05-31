package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzls implements zzji, zzmc, zzmo, zzny<zzlv> {
    private final Uri uri;
    private final zzdkp zzada;
    /* access modifiers changed from: private */
    public final zzdkp zzadx;
    /* access modifiers changed from: private */
    public boolean zzaee;
    private boolean zzafa;
    private long zzagy;
    private final zzno zzamy;
    private final int zzbac;
    /* access modifiers changed from: private */
    public final zzlz zzbad;
    private final zzmd zzbae;
    private final zznm zzbaf;
    /* access modifiers changed from: private */
    public final String zzbag;
    /* access modifiers changed from: private */
    public final long zzbah;
    private final zznv zzbai = new zznv("Loader:ExtractorMediaPeriod");
    private final zzly zzbaj;
    private final zzod zzbak;
    private final Runnable zzbal;
    /* access modifiers changed from: private */
    public final Runnable zzbam;
    /* access modifiers changed from: private */
    public final SparseArray<zzmm> zzban;
    /* access modifiers changed from: private */
    public zzmb zzbao;
    private zzjl zzbap;
    private boolean zzbaq;
    private boolean zzbar;
    private boolean zzbas;
    private int zzbat;
    private zzmu zzbau;
    private boolean[] zzbav;
    private boolean[] zzbaw;
    private boolean zzbax;
    private long zzbay;
    private long zzbaz;
    private int zzbba;
    private boolean zzbbb;
    private long zzce;

    public zzls(Uri uri2, zzno zzno, zzjg[] zzjgArr, int i, zzdkp zzdkp, zzlz zzlz, zzmd zzmd, zznm zznm, String str, int i2) {
        this.uri = uri2;
        this.zzamy = zzno;
        this.zzbac = i;
        this.zzada = zzdkp;
        this.zzbad = zzlz;
        this.zzbae = zzmd;
        this.zzbaf = zznm;
        this.zzbag = str;
        this.zzbah = (long) i2;
        this.zzbaj = new zzly(zzjgArr, this);
        this.zzbak = new zzod();
        this.zzbal = new zzlr(this);
        this.zzbam = new zzlu(this);
        this.zzadx = new zzdkp();
        this.zzbaz = -9223372036854775807L;
        this.zzban = new SparseArray<>();
        this.zzce = -1;
    }

    public final void zzef(long j) {
    }

    public final void release() {
        this.zzbai.zza((Runnable) new zzlt(this, this.zzbaj));
        this.zzadx.removeCallbacksAndMessages((Object) null);
        this.zzaee = true;
    }

    public final void zza(zzmb zzmb, long j) {
        this.zzbao = zzmb;
        this.zzbak.open();
        startLoading();
    }

    public final void zzhl() throws IOException {
        this.zzbai.zzbc(Integer.MIN_VALUE);
    }

    public final zzmu zzhm() {
        return this.zzbau;
    }

    public final long zza(zznd[] zzndArr, boolean[] zArr, zzmn[] zzmnArr, boolean[] zArr2, long j) {
        zzob.checkState(this.zzafa);
        for (int i = 0; i < zzndArr.length; i++) {
            if (zzmnArr[i] != null && (zzndArr[i] == null || !zArr[i])) {
                int zza = zzmnArr[i].track;
                zzob.checkState(this.zzbav[zza]);
                this.zzbat--;
                this.zzbav[zza] = false;
                this.zzban.valueAt(zza).disable();
                zzmnArr[i] = null;
            }
        }
        boolean z = false;
        for (int i2 = 0; i2 < zzndArr.length; i2++) {
            if (zzmnArr[i2] == null && zzndArr[i2] != null) {
                zznd zznd = zzndArr[i2];
                zzob.checkState(zznd.length() == 1);
                zzob.checkState(zznd.zzax(0) == 0);
                int zza2 = this.zzbau.zza(zznd.zzii());
                zzob.checkState(!this.zzbav[zza2]);
                this.zzbat++;
                this.zzbav[zza2] = true;
                zzmnArr[i2] = new zzlx(this, zza2);
                zArr2[i2] = true;
                z = true;
            }
        }
        if (!this.zzbar) {
            int size = this.zzban.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!this.zzbav[i3]) {
                    this.zzban.valueAt(i3).disable();
                }
            }
        }
        if (this.zzbat == 0) {
            this.zzbas = false;
            if (this.zzbai.isLoading()) {
                this.zzbai.zzip();
            }
        } else if (!this.zzbar ? j != 0 : z) {
            j = zzeg(j);
            for (int i4 = 0; i4 < zzmnArr.length; i4++) {
                if (zzmnArr[i4] != null) {
                    zArr2[i4] = true;
                }
            }
        }
        this.zzbar = true;
        return j;
    }

    public final boolean zzee(long j) {
        if (this.zzbbb) {
            return false;
        }
        if (this.zzafa && this.zzbat == 0) {
            return false;
        }
        boolean open = this.zzbak.open();
        if (this.zzbai.isLoading()) {
            return open;
        }
        startLoading();
        return true;
    }

    public final long zzhk() {
        if (this.zzbat == 0) {
            return Long.MIN_VALUE;
        }
        return zzho();
    }

    public final long zzhn() {
        if (!this.zzbas) {
            return -9223372036854775807L;
        }
        this.zzbas = false;
        return this.zzbay;
    }

    public final long zzho() {
        long j;
        if (this.zzbbb) {
            return Long.MIN_VALUE;
        }
        if (zzht()) {
            return this.zzbaz;
        }
        if (this.zzbax) {
            j = Long.MAX_VALUE;
            int size = this.zzban.size();
            for (int i = 0; i < size; i++) {
                if (this.zzbaw[i]) {
                    j = Math.min(j, this.zzban.valueAt(i).zzhs());
                }
            }
        } else {
            j = zzhs();
        }
        return j == Long.MIN_VALUE ? this.zzbay : j;
    }

    public final long zzeg(long j) {
        if (!this.zzbap.zzgn()) {
            j = 0;
        }
        this.zzbay = j;
        int size = this.zzban.size();
        boolean z = !zzht();
        int i = 0;
        while (z && i < size) {
            if (this.zzbav[i]) {
                z = this.zzban.valueAt(i).zze(j, false);
            }
            i++;
        }
        if (!z) {
            this.zzbaz = j;
            this.zzbbb = false;
            if (this.zzbai.isLoading()) {
                this.zzbai.zzip();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    this.zzban.valueAt(i2).zzk(this.zzbav[i2]);
                }
            }
        }
        this.zzbas = false;
        return j;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzat(int i) {
        if (!this.zzbbb) {
            return !zzht() && this.zzban.valueAt(i).zzib();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void zzhp() throws IOException {
        this.zzbai.zzbc(Integer.MIN_VALUE);
    }

    /* access modifiers changed from: package-private */
    public final int zza(int i, zzhb zzhb, zziv zziv, boolean z) {
        if (this.zzbas || zzht()) {
            return -3;
        }
        return this.zzban.valueAt(i).zza(zzhb, zziv, z, this.zzbbb, this.zzbay);
    }

    /* access modifiers changed from: package-private */
    public final void zzd(int i, long j) {
        zzmm valueAt = this.zzban.valueAt(i);
        if (!this.zzbbb || j <= valueAt.zzhs()) {
            valueAt.zze(j, true);
        } else {
            valueAt.zzif();
        }
    }

    public final zzjn zzc(int i, int i2) {
        zzmm zzmm = this.zzban.get(i);
        if (zzmm != null) {
            return zzmm;
        }
        zzmm zzmm2 = new zzmm(this.zzbaf);
        zzmm2.zza(this);
        this.zzban.put(i, zzmm2);
        return zzmm2;
    }

    public final void zzgp() {
        this.zzbaq = true;
        this.zzadx.post(this.zzbal);
    }

    public final void zza(zzjl zzjl) {
        this.zzbap = zzjl;
        this.zzadx.post(this.zzbal);
    }

    public final void zzf(zzgz zzgz) {
        this.zzadx.post(this.zzbal);
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r4v0 ?, r4v3 ?, r4v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public final void zzhq() {
        /*
            r8 = this;
            boolean r0 = r8.zzaee
            if (r0 != 0) goto L_0x009d
            boolean r0 = r8.zzafa
            if (r0 != 0) goto L_0x009d
            com.google.android.gms.internal.ads.zzjl r0 = r8.zzbap
            if (r0 == 0) goto L_0x009d
            boolean r0 = r8.zzbaq
            if (r0 != 0) goto L_0x0012
            goto L_0x009d
        L_0x0012:
            android.util.SparseArray<com.google.android.gms.internal.ads.zzmm> r0 = r8.zzban
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x001a:
            if (r2 >= r0) goto L_0x002e
            android.util.SparseArray<com.google.android.gms.internal.ads.zzmm> r3 = r8.zzban
            java.lang.Object r3 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.zzmm r3 = (com.google.android.gms.internal.ads.zzmm) r3
            com.google.android.gms.internal.ads.zzgz r3 = r3.zzic()
            if (r3 != 0) goto L_0x002b
            return
        L_0x002b:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002e:
            com.google.android.gms.internal.ads.zzod r2 = r8.zzbak
            r2.zzir()
            com.google.android.gms.internal.ads.zzmr[] r2 = new com.google.android.gms.internal.ads.zzmr[r0]
            boolean[] r3 = new boolean[r0]
            r8.zzbaw = r3
            boolean[] r3 = new boolean[r0]
            r8.zzbav = r3
            com.google.android.gms.internal.ads.zzjl r3 = r8.zzbap
            long r3 = r3.getDurationUs()
            r8.zzagy = r3
            r3 = 0
        L_0x0046:
            r4 = 1
            if (r3 >= r0) goto L_0x007c
            android.util.SparseArray<com.google.android.gms.internal.ads.zzmm> r5 = r8.zzban
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.zzmm r5 = (com.google.android.gms.internal.ads.zzmm) r5
            com.google.android.gms.internal.ads.zzgz r5 = r5.zzic()
            com.google.android.gms.internal.ads.zzmr r6 = new com.google.android.gms.internal.ads.zzmr
            com.google.android.gms.internal.ads.zzgz[] r7 = new com.google.android.gms.internal.ads.zzgz[r4]
            r7[r1] = r5
            r6.<init>(r7)
            r2[r3] = r6
            java.lang.String r5 = r5.zzafn
            boolean r6 = com.google.android.gms.internal.ads.zzoi.zzbj(r5)
            if (r6 != 0) goto L_0x0070
            boolean r5 = com.google.android.gms.internal.ads.zzoi.zzbi(r5)
            if (r5 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            boolean[] r5 = r8.zzbaw
            r5[r3] = r4
            boolean r5 = r8.zzbax
            r4 = r4 | r5
            r8.zzbax = r4
            int r3 = r3 + 1
            goto L_0x0046
        L_0x007c:
            com.google.android.gms.internal.ads.zzmu r0 = new com.google.android.gms.internal.ads.zzmu
            r0.<init>(r2)
            r8.zzbau = r0
            r8.zzafa = r4
            com.google.android.gms.internal.ads.zzmd r0 = r8.zzbae
            com.google.android.gms.internal.ads.zzms r1 = new com.google.android.gms.internal.ads.zzms
            long r2 = r8.zzagy
            com.google.android.gms.internal.ads.zzjl r4 = r8.zzbap
            boolean r4 = r4.zzgn()
            r1.<init>(r2, r4)
            r2 = 0
            r0.zzb(r1, r2)
            com.google.android.gms.internal.ads.zzmb r0 = r8.zzbao
            r0.zza(r8)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzls.zzhq():void");
    }

    private final void zza(zzlv zzlv) {
        if (this.zzce == -1) {
            this.zzce = zzlv.zzce;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        r0 = r9.zzbap;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void startLoading() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.zzlv r6 = new com.google.android.gms.internal.ads.zzlv
            android.net.Uri r2 = r9.uri
            com.google.android.gms.internal.ads.zzno r3 = r9.zzamy
            com.google.android.gms.internal.ads.zzly r4 = r9.zzbaj
            com.google.android.gms.internal.ads.zzod r5 = r9.zzbak
            r0 = r6
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r0 = r9.zzafa
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0040
            boolean r0 = r9.zzht()
            com.google.android.gms.internal.ads.zzob.checkState(r0)
            long r3 = r9.zzagy
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            long r7 = r9.zzbaz
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0031
            r0 = 1
            r9.zzbbb = r0
            r9.zzbaz = r1
            return
        L_0x0031:
            com.google.android.gms.internal.ads.zzjl r0 = r9.zzbap
            long r3 = r9.zzbaz
            long r3 = r0.zzdz(r3)
            long r7 = r9.zzbaz
            r6.zze(r3, r7)
            r9.zzbaz = r1
        L_0x0040:
            int r0 = r9.zzhr()
            r9.zzbba = r0
            int r0 = r9.zzbac
            r3 = -1
            if (r0 != r3) goto L_0x0067
            boolean r0 = r9.zzafa
            if (r0 == 0) goto L_0x0066
            long r3 = r9.zzce
            r7 = -1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0066
            com.google.android.gms.internal.ads.zzjl r0 = r9.zzbap
            if (r0 == 0) goto L_0x0064
            long r3 = r0.getDurationUs()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r0 = 6
            goto L_0x0067
        L_0x0066:
            r0 = 3
        L_0x0067:
            com.google.android.gms.internal.ads.zznv r1 = r9.zzbai
            r1.zza(r6, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzls.startLoading():void");
    }

    private final int zzhr() {
        int size = this.zzban.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.zzban.valueAt(i2).zzia();
        }
        return i;
    }

    private final long zzhs() {
        int size = this.zzban.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.zzban.valueAt(i).zzhs());
        }
        return j;
    }

    private final boolean zzht() {
        return this.zzbaz != -9223372036854775807L;
    }

    public final /* synthetic */ int zza(zzoa zzoa, long j, long j2, IOException iOException) {
        zzjl zzjl;
        zzlv zzlv = (zzlv) zzoa;
        zza(zzlv);
        zzdkp zzdkp = this.zzada;
        if (!(zzdkp == null || this.zzbad == null)) {
            zzdkp.post(new zzlw(this, iOException));
        }
        if (iOException instanceof zzmt) {
            return 3;
        }
        boolean z = zzhr() > this.zzbba;
        if (this.zzce == -1 && ((zzjl = this.zzbap) == null || zzjl.getDurationUs() == -9223372036854775807L)) {
            this.zzbay = 0;
            this.zzbas = this.zzafa;
            int size = this.zzban.size();
            for (int i = 0; i < size; i++) {
                this.zzban.valueAt(i).zzk(!this.zzafa || this.zzbav[i]);
            }
            zzlv.zze(0, 0);
        }
        this.zzbba = zzhr();
        return z ? 1 : 0;
    }

    public final /* synthetic */ void zza(zzoa zzoa, long j, long j2, boolean z) {
        zza((zzlv) zzoa);
        if (!z && this.zzbat > 0) {
            int size = this.zzban.size();
            for (int i = 0; i < size; i++) {
                this.zzban.valueAt(i).zzk(this.zzbav[i]);
            }
            this.zzbao.zza(this);
        }
    }

    public final /* synthetic */ void zza(zzoa zzoa, long j, long j2) {
        zza((zzlv) zzoa);
        this.zzbbb = true;
        if (this.zzagy == -9223372036854775807L) {
            long zzhs = zzhs();
            this.zzagy = zzhs == Long.MIN_VALUE ? 0 : zzhs + 10000;
            this.zzbae.zzb(new zzms(this.zzagy, this.zzbap.zzgn()), (Object) null);
        }
        this.zzbao.zza(this);
    }
}
