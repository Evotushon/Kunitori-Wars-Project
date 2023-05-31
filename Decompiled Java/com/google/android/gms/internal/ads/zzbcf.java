package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbcf implements zzgm, zzlz, zzoc<zzno>, zzpg {
    @VisibleForTesting
    private static int zzedd;
    @VisibleForTesting
    private static int zzede;
    private int bytesTransferred;
    private final zzbbj zzeck;
    private final zzbcg zzedf;
    private final zzhe zzedg;
    private final zzhe zzedh;
    private final zznc zzedi;
    private zzgn zzedj;
    private ByteBuffer zzedk;
    private boolean zzedl;
    private zzbcn zzedm;
    private Set<WeakReference<zzbcc>> zzedn = new HashSet();
    private final Context zzur;

    public zzbcf(Context context, zzbbj zzbbj) {
        this.zzur = context;
        this.zzeck = zzbbj;
        this.zzedf = new zzbcg();
        this.zzedg = new zzpa(this.zzur, zzkx.zzazk, 0, zzawo.zzdtx, this, -1);
        this.zzedh = new zzii(zzkx.zzazk);
        this.zzedi = new zzmx();
        if (zzawf.zzvx()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            zzawf.zzee(sb.toString());
        }
        zzedd++;
        this.zzedj = zzgr.zza(new zzhe[]{this.zzedh, this.zzedg}, this.zzedi, this.zzedf);
        this.zzedj.zza((zzgm) this);
    }

    public final void zza(zzhf zzhf) {
    }

    public final void zza(zzhj zzhj, Object obj) {
    }

    public final void zza(zzmu zzmu, zznf zznf) {
    }

    public final void zzb(Surface surface) {
    }

    public final void zzd(String str, long j, long j2) {
    }

    public final void zze(zzis zzis) {
    }

    public final /* bridge */ /* synthetic */ void zze(Object obj) {
    }

    public final void zzef() {
    }

    public final void zzf(int i, long j) {
    }

    public final void zzf(zzis zzis) {
    }

    public final void zzf(boolean z) {
    }

    public final void zzk(zzgz zzgz) {
    }

    public final zzgn zzzr() {
        return this.zzedj;
    }

    public static int zzzs() {
        return zzedd;
    }

    public static int zzzt() {
        return zzede;
    }

    public final void zza(zzbcn zzbcn) {
        this.zzedm = zzbcn;
    }

    public final zzbcg zzzu() {
        return this.zzedf;
    }

    public final void zza(Uri[] uriArr, String str) {
        zza(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zza(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzme zzme;
        if (this.zzedj != null) {
            this.zzedk = byteBuffer;
            this.zzedl = z;
            if (uriArr.length == 1) {
                zzme = zzb(uriArr[0], str);
            } else {
                zzme[] zzmeArr = new zzme[uriArr.length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzmeArr[i] = zzb(uriArr[i], str);
                }
                zzme = new zzmf(zzmeArr);
            }
            this.zzedj.zza(zzme);
            zzede++;
        }
    }

    public final void release() {
        zzgn zzgn = this.zzedj;
        if (zzgn != null) {
            zzgn.zzb((zzgm) this);
            this.zzedj.release();
            this.zzedj = null;
            zzede--;
        }
    }

    public final long getBytesTransferred() {
        return (long) this.bytesTransferred;
    }

    public final void zzb(IOException iOException) {
        zzbcn zzbcn = this.zzedm;
        if (zzbcn != null) {
            zzbcn.zza("onLoadError", iOException);
        }
    }

    public final void zzb(int i, int i2, int i3, float f) {
        zzbcn zzbcn = this.zzedm;
        if (zzbcn != null) {
            zzbcn.zzn(i, i2);
        }
    }

    public final void zza(boolean z, int i) {
        zzbcn zzbcn = this.zzedm;
        if (zzbcn != null) {
            zzbcn.zzda(i);
        }
    }

    public final void zza(zzgk zzgk) {
        zzbcn zzbcn = this.zzedm;
        if (zzbcn != null) {
            zzbcn.zza("onPlayerError", zzgk);
        }
    }

    public final void zzcz(int i) {
        for (WeakReference<zzbcc> weakReference : this.zzedn) {
            zzbcc zzbcc = (zzbcc) weakReference.get();
            if (zzbcc != null) {
                zzbcc.setReceiveBufferSize(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(Surface surface, boolean z) {
        if (this.zzedj != null) {
            zzgo zzgo = new zzgo(this.zzedg, 1, surface);
            if (z) {
                this.zzedj.zzb(zzgo);
                return;
            }
            this.zzedj.zza(zzgo);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(float f, boolean z) {
        if (this.zzedj != null) {
            zzgo zzgo = new zzgo(this.zzedh, 2, Float.valueOf(f));
            if (z) {
                this.zzedj.zzb(zzgo);
                return;
            }
            this.zzedj.zza(zzgo);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzaw(boolean z) {
        if (this.zzedj != null) {
            for (int i = 0; i < this.zzedj.zzeh(); i++) {
                this.zzedi.zzf(i, !z);
            }
        }
    }

    @VisibleForTesting
    private final zzme zzb(Uri uri, String str) {
        zzbci zzbci;
        zznn zznn;
        if (!this.zzedl || this.zzedk.limit() <= 0) {
            if (this.zzeck.zzeas > 0) {
                zznn = new zzbch(this, str);
            } else {
                zznn = new zzbck(this, str);
            }
            zzbcm zzbcj = this.zzeck.zzeat ? new zzbcj(this, zznn) : zznn;
            if (this.zzedk.limit() > 0) {
                byte[] bArr = new byte[this.zzedk.limit()];
                this.zzedk.get(bArr);
                zzbcj = new zzbcm(zzbcj, bArr);
            }
            zzbci = zzbcj;
        } else {
            byte[] bArr2 = new byte[this.zzedk.limit()];
            this.zzedk.get(bArr2);
            zzbci = new zzbci(bArr2);
        }
        return new zzma(uri, zzbci, zzbcl.zzedw, this.zzeck.zzeau, zzawo.zzdtx, this, (String) null, this.zzeck.zzeaq);
    }

    public final void finalize() throws Throwable {
        zzedd--;
        if (zzawf.zzvx()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            zzawf.zzee(sb.toString());
        }
    }

    public final /* synthetic */ void zzc(Object obj, int i) {
        this.bytesTransferred += i;
    }

    public final /* synthetic */ void zza(Object obj, zznp zznp) {
        this.bytesTransferred = 0;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzno zza(zznn zznn) {
        return new zzbce(this.zzur, zznn.zzim(), this, new zzbco(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(boolean z, long j) {
        zzbcn zzbcn = this.zzedm;
        if (zzbcn != null) {
            zzbcn.zzb(z, j);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzno zzfh(String str) {
        return new zznr(str, (zzoo<String>) null, this.zzeck.zzeat ? null : this, this.zzeck.zzean, this.zzeck.zzeap, true, (zznw) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzno zzfi(String str) {
        zzbcc zzbcc = new zzbcc(str, this.zzeck.zzeat ? null : this, this.zzeck.zzean, this.zzeck.zzeap, this.zzeck.zzeas);
        this.zzedn.add(new WeakReference(zzbcc));
        return zzbcc;
    }
}
