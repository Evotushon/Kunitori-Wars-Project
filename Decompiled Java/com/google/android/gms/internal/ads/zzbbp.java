package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.zzq;
import java.nio.ByteBuffer;
import java.util.Arrays;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbbp extends zzbat implements TextureView.SurfaceTextureListener, zzbcn {
    private Surface zzbib;
    private final zzbbl zzdye;
    private final boolean zzdyf;
    private int zzdyk;
    private int zzdyl;
    private int zzdyn;
    private int zzdyo;
    private zzbbk zzdyp;
    private final boolean zzdyq;
    private zzbau zzdys;
    private final zzbbm zzdza;
    private String[] zzdzn;
    private final zzbbj zzeck;
    private zzbcf zzecl;
    private String zzecm;
    private boolean zzecn;
    private int zzeco = 1;
    private boolean zzecp;
    private boolean zzecq;
    private float zzecr;

    public zzbbp(Context context, zzbbl zzbbl, zzbbm zzbbm, boolean z, boolean z2, zzbbj zzbbj) {
        super(context);
        this.zzdyf = z2;
        this.zzdza = zzbbm;
        this.zzdye = zzbbl;
        this.zzdyq = z;
        this.zzeck = zzbbj;
        setSurfaceTextureListener(this);
        this.zzdye.zzb(this);
    }

    private final zzbcf zzzc() {
        return new zzbcf(this.zzdza.getContext(), this.zzeck);
    }

    private final String zzzd() {
        return zzq.zzkv().zzr(this.zzdza.getContext(), this.zzdza.zzyw().zzbmj);
    }

    private final boolean zzze() {
        return this.zzecl != null && !this.zzecn;
    }

    private final boolean zzzf() {
        return zzze() && this.zzeco != 1;
    }

    private final void zzzg() {
        String str;
        if (this.zzecl == null && (str = this.zzecm) != null && this.zzbib != null) {
            if (str.startsWith("cache:")) {
                zzbda zzff = this.zzdza.zzff(this.zzecm);
                if (zzff instanceof zzbdl) {
                    this.zzecl = ((zzbdl) zzff).zzzw();
                    if (this.zzecl.zzzr() == null) {
                        zzawf.zzfa("Precached video player has been released.");
                        return;
                    }
                } else if (zzff instanceof zzbdm) {
                    zzbdm zzbdm = (zzbdm) zzff;
                    String zzzd = zzzd();
                    ByteBuffer byteBuffer = zzbdm.getByteBuffer();
                    boolean zzzx = zzbdm.zzzx();
                    String url = zzbdm.getUrl();
                    if (url == null) {
                        zzawf.zzfa("Stream cache URL is null.");
                        return;
                    } else {
                        this.zzecl = zzzc();
                        this.zzecl.zza(new Uri[]{Uri.parse(url)}, zzzd, byteBuffer, zzzx);
                    }
                } else {
                    String valueOf = String.valueOf(this.zzecm);
                    zzawf.zzfa(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                    return;
                }
            } else {
                this.zzecl = zzzc();
                String zzzd2 = zzzd();
                Uri[] uriArr = new Uri[this.zzdzn.length];
                int i = 0;
                while (true) {
                    String[] strArr = this.zzdzn;
                    if (i >= strArr.length) {
                        break;
                    }
                    uriArr[i] = Uri.parse(strArr[i]);
                    i++;
                }
                this.zzecl.zza(uriArr, zzzd2);
            }
            this.zzecl.zza((zzbcn) this);
            zza(this.zzbib, false);
            this.zzeco = this.zzecl.zzzr().getPlaybackState();
            if (this.zzeco == 3) {
                zzzh();
            }
        }
    }

    private final void zza(Surface surface, boolean z) {
        zzbcf zzbcf = this.zzecl;
        if (zzbcf != null) {
            zzbcf.zza(surface, z);
        } else {
            zzawf.zzfa("Trying to set surface before player is initalized.");
        }
    }

    private final void zza(float f, boolean z) {
        zzbcf zzbcf = this.zzecl;
        if (zzbcf != null) {
            zzbcf.zzb(f, z);
        } else {
            zzawf.zzfa("Trying to set volume before player is initalized.");
        }
    }

    public final void zzxx() {
        zza(this.zzdyz.getVolume(), false);
    }

    private final void zzzh() {
        if (!this.zzecp) {
            this.zzecp = true;
            zzawo.zzdtx.post(new zzbbs(this));
            zzxx();
            this.zzdye.zzew();
            if (this.zzecq) {
                play();
            }
        }
    }

    public final String zzxt() {
        String str = this.zzdyq ? " spherical" : "";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    public final void zza(zzbau zzbau) {
        this.zzdys = zzbau;
    }

    public final void setVideoPath(String str) {
        if (str != null) {
            this.zzecm = str;
            this.zzdzn = new String[]{str};
            zzzg();
        }
    }

    public final void zzb(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.zzecm = str;
            this.zzdzn = (String[]) Arrays.copyOf(strArr, strArr.length);
            zzzg();
        }
    }

    public final void play() {
        if (zzzf()) {
            if (this.zzeck.zzeak) {
                zzzj();
            }
            this.zzecl.zzzr().zzg(true);
            this.zzdye.zzyn();
            this.zzdyz.zzyn();
            this.zzdyy.zzxz();
            zzawo.zzdtx.post(new zzbbt(this));
            return;
        }
        this.zzecq = true;
    }

    public final void stop() {
        if (zzze()) {
            this.zzecl.zzzr().stop();
            if (this.zzecl != null) {
                zza((Surface) null, true);
                zzbcf zzbcf = this.zzecl;
                if (zzbcf != null) {
                    zzbcf.zza((zzbcn) null);
                    this.zzecl.release();
                    this.zzecl = null;
                }
                this.zzeco = 1;
                this.zzecn = false;
                this.zzecp = false;
                this.zzecq = false;
            }
        }
        this.zzdye.zzyo();
        this.zzdyz.zzyo();
        this.zzdye.onStop();
    }

    public final void pause() {
        if (zzzf()) {
            if (this.zzeck.zzeak) {
                zzzk();
            }
            this.zzecl.zzzr().zzg(false);
            this.zzdye.zzyo();
            this.zzdyz.zzyo();
            zzawo.zzdtx.post(new zzbbw(this));
        }
    }

    public final void seekTo(int i) {
        if (zzzf()) {
            this.zzecl.zzzr().seekTo((long) i);
        }
    }

    public final void zzcv(int i) {
        zzbcf zzbcf = this.zzecl;
        if (zzbcf != null) {
            zzbcf.zzzu().zzdc(i);
        }
    }

    public final void zzcw(int i) {
        zzbcf zzbcf = this.zzecl;
        if (zzbcf != null) {
            zzbcf.zzzu().zzdd(i);
        }
    }

    public final void zzcx(int i) {
        zzbcf zzbcf = this.zzecl;
        if (zzbcf != null) {
            zzbcf.zzzu().zzcx(i);
        }
    }

    public final void zzcy(int i) {
        zzbcf zzbcf = this.zzecl;
        if (zzbcf != null) {
            zzbcf.zzzu().zzcy(i);
        }
    }

    public final void zzcz(int i) {
        zzbcf zzbcf = this.zzecl;
        if (zzbcf != null) {
            zzbcf.zzcz(i);
        }
    }

    public final void zza(float f, float f2) {
        zzbbk zzbbk = this.zzdyp;
        if (zzbbk != null) {
            zzbbk.zzb(f, f2);
        }
    }

    public final int getCurrentPosition() {
        if (zzzf()) {
            return (int) this.zzecl.zzzr().zzei();
        }
        return 0;
    }

    public final int getDuration() {
        if (zzzf()) {
            return (int) this.zzecl.zzzr().getDuration();
        }
        return 0;
    }

    public final int getVideoWidth() {
        return this.zzdyk;
    }

    public final int getVideoHeight() {
        return this.zzdyl;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a A[LOOP:0: B:30:0x007a->B:35:0x0095, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            super.onMeasure(r11, r12)
            int r11 = r10.getMeasuredWidth()
            int r12 = r10.getMeasuredHeight()
            float r0 = r10.zzecr
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x002a
            com.google.android.gms.internal.ads.zzbbk r2 = r10.zzdyp
            if (r2 != 0) goto L_0x002a
            float r2 = (float) r11
            float r3 = (float) r12
            float r3 = r2 / r3
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0020
            float r2 = r2 / r0
            int r12 = (int) r2
        L_0x0020:
            float r0 = r10.zzecr
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x002a
            float r11 = (float) r12
            float r11 = r11 * r0
            int r11 = (int) r11
        L_0x002a:
            r10.setMeasuredDimension(r11, r12)
            com.google.android.gms.internal.ads.zzbbk r0 = r10.zzdyp
            if (r0 == 0) goto L_0x0034
            r0.zzm(r11, r12)
        L_0x0034:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 != r2) goto L_0x00a2
            int r0 = r10.zzdyn
            if (r0 <= 0) goto L_0x0040
            if (r0 != r11) goto L_0x0046
        L_0x0040:
            int r0 = r10.zzdyo
            if (r0 <= 0) goto L_0x009e
            if (r0 == r12) goto L_0x009e
        L_0x0046:
            boolean r0 = r10.zzdyf
            if (r0 == 0) goto L_0x009e
            boolean r0 = r10.zzze()
            if (r0 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.zzbcf r0 = r10.zzecl
            com.google.android.gms.internal.ads.zzgn r0 = r0.zzzr()
            long r2 = r0.zzei()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x009e
            boolean r2 = r0.zzeg()
            if (r2 == 0) goto L_0x0067
            goto L_0x009e
        L_0x0067:
            r2 = 1
            r10.zza((float) r1, (boolean) r2)
            r0.zzg(r2)
            long r1 = r0.zzei()
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzq.zzlc()
            long r3 = r3.currentTimeMillis()
        L_0x007a:
            boolean r5 = r10.zzze()
            if (r5 == 0) goto L_0x0097
            long r5 = r0.zzei()
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x0097
            com.google.android.gms.common.util.Clock r5 = com.google.android.gms.ads.internal.zzq.zzlc()
            long r5 = r5.currentTimeMillis()
            long r5 = r5 - r3
            r7 = 250(0xfa, double:1.235E-321)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x007a
        L_0x0097:
            r1 = 0
            r0.zzg(r1)
            r10.zzxx()
        L_0x009e:
            r10.zzdyn = r11
            r10.zzdyo = r12
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbp.onMeasure(int, int):void");
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzdyq) {
            this.zzdyp = new zzbbk(getContext());
            this.zzdyp.zza(surfaceTexture, i, i2);
            this.zzdyp.start();
            SurfaceTexture zzyl = this.zzdyp.zzyl();
            if (zzyl != null) {
                surfaceTexture = zzyl;
            } else {
                this.zzdyp.zzyk();
                this.zzdyp = null;
            }
        }
        this.zzbib = new Surface(surfaceTexture);
        if (this.zzecl == null) {
            zzzg();
        } else {
            zza(this.zzbib, true);
            if (!this.zzeck.zzeak) {
                zzzj();
            }
        }
        if (this.zzdyk == 0 || this.zzdyl == 0) {
            zzo(i, i2);
        } else {
            zzzi();
        }
        zzawo.zzdtx.post(new zzbbv(this));
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzbbk zzbbk = this.zzdyp;
        if (zzbbk != null) {
            zzbbk.zzm(i, i2);
        }
        zzawo.zzdtx.post(new zzbby(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzdye.zzc(this);
        this.zzdyy.zza(surfaceTexture, this.zzdys);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        pause();
        zzbbk zzbbk = this.zzdyp;
        if (zzbbk != null) {
            zzbbk.zzyk();
            this.zzdyp = null;
        }
        if (this.zzecl != null) {
            zzzk();
            Surface surface = this.zzbib;
            if (surface != null) {
                surface.release();
            }
            this.zzbib = null;
            zza((Surface) null, true);
        }
        zzawo.zzdtx.post(new zzbbx(this));
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        zzawf.zzee(sb.toString());
        zzawo.zzdtx.post(new zzbca(this, i));
        super.onWindowVisibilityChanged(i);
    }

    public final void zzb(boolean z, long j) {
        if (this.zzdza != null) {
            zzazq.zzdxo.execute(new zzbbz(this, z, j));
        }
    }

    public final void zzda(int i) {
        if (this.zzeco != i) {
            this.zzeco = i;
            if (i == 3) {
                zzzh();
            } else if (i == 4) {
                if (this.zzeck.zzeak) {
                    zzzk();
                }
                this.zzdye.zzyo();
                this.zzdyz.zzyo();
                zzawo.zzdtx.post(new zzbbr(this));
            }
        }
    }

    public final void zzn(int i, int i2) {
        this.zzdyk = i;
        this.zzdyl = i2;
        zzzi();
    }

    public final void zza(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        zzawf.zzfa(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.zzecn = true;
        if (this.zzeck.zzeak) {
            zzzk();
        }
        zzawo.zzdtx.post(new zzbbu(this, sb2));
    }

    private final void zzzi() {
        zzo(this.zzdyk, this.zzdyl);
    }

    private final void zzo(int i, int i2) {
        float f = i2 > 0 ? ((float) i) / ((float) i2) : 1.0f;
        if (this.zzecr != f) {
            this.zzecr = f;
            requestLayout();
        }
    }

    private final void zzzj() {
        zzbcf zzbcf = this.zzecl;
        if (zzbcf != null) {
            zzbcf.zzaw(true);
        }
    }

    private final void zzzk() {
        zzbcf zzbcf = this.zzecl;
        if (zzbcf != null) {
            zzbcf.zzaw(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(boolean z, long j) {
        this.zzdza.zza(z, j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzdb(int i) {
        zzbau zzbau = this.zzdys;
        if (zzbau != null) {
            zzbau.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzzl() {
        zzbau zzbau = this.zzdys;
        if (zzbau != null) {
            zzbau.zzyb();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(int i, int i2) {
        zzbau zzbau = this.zzdys;
        if (zzbau != null) {
            zzbau.zzk(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzzm() {
        zzbau zzbau = this.zzdys;
        if (zzbau != null) {
            zzbau.zzxy();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzzn() {
        zzbau zzbau = this.zzdys;
        if (zzbau != null) {
            zzbau.onPaused();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzzo() {
        zzbau zzbau = this.zzdys;
        if (zzbau != null) {
            zzbau.zzxz();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzfg(String str) {
        zzbau zzbau = this.zzdys;
        if (zzbau != null) {
            zzbau.zzm("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzzp() {
        zzbau zzbau = this.zzdys;
        if (zzbau != null) {
            zzbau.zzya();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzzq() {
        zzbau zzbau = this.zzdys;
        if (zzbau != null) {
            zzbau.zzew();
        }
    }
}
