package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbav extends FrameLayout implements zzbau {
    private final zzbbm zzdza;
    private final FrameLayout zzdzb;
    private final zzaak zzdzc;
    private final zzbbo zzdzd;
    private final long zzdze;
    @Nullable
    private zzbat zzdzf;
    private boolean zzdzg;
    private boolean zzdzh;
    private boolean zzdzi;
    private boolean zzdzj;
    private long zzdzk;
    private long zzdzl;
    private String zzdzm;
    private String[] zzdzn;
    private Bitmap zzdzo;
    private ImageView zzdzp;
    private boolean zzdzq;

    public static void zza(zzbbm zzbbm) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        zzbbm.zza("onVideoEvent", (Map<String, ?>) hashMap);
    }

    public static void zza(zzbbm zzbbm, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        zzbbm.zza("onVideoEvent", (Map<String, ?>) hashMap);
    }

    public static void zza(zzbbm zzbbm, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str);
        zzbbm.zza("onVideoEvent", (Map<String, ?>) hashMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbav(Context context, zzbbm zzbbm, int i, boolean z, zzaak zzaak, zzbbj zzbbj) {
        super(context);
        Context context2 = context;
        zzbbm zzbbm2 = zzbbm;
        this.zzdza = zzbbm2;
        zzaak zzaak2 = zzaak;
        this.zzdzc = zzaak2;
        this.zzdzb = new FrameLayout(context);
        addView(this.zzdzb, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzbbm.zzyt());
        this.zzdzf = zzbbm.zzyt().zzbkx.zza(context, zzbbm2, i, z, zzaak2, zzbbj);
        zzbat zzbat = this.zzdzf;
        if (zzbat != null) {
            this.zzdzb.addView(zzbat, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzchv)).booleanValue()) {
                zzyf();
            }
        }
        this.zzdzp = new ImageView(context);
        this.zzdze = ((Long) zzvh.zzpd().zzd(zzzx.zzchz)).longValue();
        this.zzdzj = ((Boolean) zzvh.zzpd().zzd(zzzx.zzchx)).booleanValue();
        zzaak zzaak3 = this.zzdzc;
        if (zzaak3 != null) {
            zzaak3.zzh("spinner_used", this.zzdzj ? "1" : "0");
        }
        this.zzdzd = new zzbbo(this);
        zzbat zzbat2 = this.zzdzf;
        if (zzbat2 != null) {
            zzbat2.zza(this);
        }
        if (this.zzdzf == null) {
            zzm("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public final void zzd(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.zzdzb.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void zzc(String str, String[] strArr) {
        this.zzdzm = str;
        this.zzdzn = strArr;
    }

    public final void zza(float f, float f2) {
        zzbat zzbat = this.zzdzf;
        if (zzbat != null) {
            zzbat.zza(f, f2);
        }
    }

    public final void zzhv() {
        if (this.zzdzf != null) {
            if (!TextUtils.isEmpty(this.zzdzm)) {
                this.zzdzf.zzb(this.zzdzm, this.zzdzn);
            } else {
                zzd("no_src", new String[0]);
            }
        }
    }

    public final void pause() {
        zzbat zzbat = this.zzdzf;
        if (zzbat != null) {
            zzbat.pause();
        }
    }

    public final void play() {
        zzbat zzbat = this.zzdzf;
        if (zzbat != null) {
            zzbat.play();
        }
    }

    public final void seekTo(int i) {
        zzbat zzbat = this.zzdzf;
        if (zzbat != null) {
            zzbat.seekTo(i);
        }
    }

    public final void zzyd() {
        zzbat zzbat = this.zzdzf;
        if (zzbat != null) {
            zzbat.zzdyz.setMuted(true);
            zzbat.zzxx();
        }
    }

    public final void zzye() {
        zzbat zzbat = this.zzdzf;
        if (zzbat != null) {
            zzbat.zzdyz.setMuted(false);
            zzbat.zzxx();
        }
    }

    public final void setVolume(float f) {
        zzbat zzbat = this.zzdzf;
        if (zzbat != null) {
            zzbat.zzdyz.setVolume(f);
            zzbat.zzxx();
        }
    }

    public final void zzcv(int i) {
        this.zzdzf.zzcv(i);
    }

    public final void zzcw(int i) {
        this.zzdzf.zzcw(i);
    }

    public final void zzcx(int i) {
        this.zzdzf.zzcx(i);
    }

    public final void zzcy(int i) {
        this.zzdzf.zzcy(i);
    }

    public final void zzcz(int i) {
        this.zzdzf.zzcz(i);
    }

    @TargetApi(14)
    public final void zze(MotionEvent motionEvent) {
        zzbat zzbat = this.zzdzf;
        if (zzbat != null) {
            zzbat.dispatchTouchEvent(motionEvent);
        }
    }

    @TargetApi(14)
    public final void zzyf() {
        zzbat zzbat = this.zzdzf;
        if (zzbat != null) {
            TextView textView = new TextView(zzbat.getContext());
            String valueOf = String.valueOf(this.zzdzf.zzxt());
            textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
            textView.setTextColor(SupportMenu.CATEGORY_MASK);
            textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
            this.zzdzb.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            this.zzdzb.bringChildToFront(textView);
        }
    }

    public final void zzxy() {
        this.zzdzd.resume();
        zzawo.zzdtx.post(new zzbba(this));
    }

    public final void zzew() {
        zzbat zzbat = this.zzdzf;
        if (zzbat != null && this.zzdzl == 0) {
            zzd("canplaythrough", "duration", String.valueOf(((float) zzbat.getDuration()) / 1000.0f), "videoWidth", String.valueOf(this.zzdzf.getVideoWidth()), "videoHeight", String.valueOf(this.zzdzf.getVideoHeight()));
        }
    }

    public final void zzxz() {
        if (this.zzdza.zzys() != null && !this.zzdzh) {
            this.zzdzi = (this.zzdza.zzys().getWindow().getAttributes().flags & 128) != 0;
            if (!this.zzdzi) {
                this.zzdza.zzys().getWindow().addFlags(128);
                this.zzdzh = true;
            }
        }
        this.zzdzg = true;
    }

    public final void onPaused() {
        zzd("pause", new String[0]);
        zzyi();
        this.zzdzg = false;
    }

    public final void zzya() {
        zzd("ended", new String[0]);
        zzyi();
    }

    public final void zzm(String str, @Nullable String str2) {
        zzd(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "what", str, "extra", str2);
    }

    public final void zzyb() {
        if (this.zzdzq && this.zzdzo != null && !zzyh()) {
            this.zzdzp.setImageBitmap(this.zzdzo);
            this.zzdzp.invalidate();
            this.zzdzb.addView(this.zzdzp, new FrameLayout.LayoutParams(-1, -1));
            this.zzdzb.bringChildToFront(this.zzdzp);
        }
        this.zzdzd.pause();
        this.zzdzl = this.zzdzk;
        zzawo.zzdtx.post(new zzbaz(this));
    }

    public final void destroy() {
        this.zzdzd.pause();
        zzbat zzbat = this.zzdzf;
        if (zzbat != null) {
            zzbat.stop();
        }
        zzyi();
    }

    public final void finalize() throws Throwable {
        try {
            this.zzdzd.pause();
            if (this.zzdzf != null) {
                zzbat zzbat = this.zzdzf;
                zzdoe zzdoe = zzazq.zzdxo;
                zzbat.getClass();
                zzdoe.execute(zzbay.zza(zzbat));
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzyg() {
        zzbat zzbat = this.zzdzf;
        if (zzbat != null) {
            long currentPosition = (long) zzbat.getCurrentPosition();
            if (this.zzdzk != currentPosition && currentPosition > 0) {
                zzd("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
                this.zzdzk = currentPosition;
            }
        }
    }

    public final void zzyc() {
        if (this.zzdzg && zzyh()) {
            this.zzdzb.removeView(this.zzdzp);
        }
        if (this.zzdzo != null) {
            long elapsedRealtime = zzq.zzlc().elapsedRealtime();
            if (this.zzdzf.getBitmap(this.zzdzo) != null) {
                this.zzdzq = true;
            }
            long elapsedRealtime2 = zzq.zzlc().elapsedRealtime() - elapsedRealtime;
            if (zzawf.zzvx()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(elapsedRealtime2);
                sb.append("ms");
                zzawf.zzee(sb.toString());
            }
            if (elapsedRealtime2 > this.zzdze) {
                zzawf.zzfa("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzdzj = false;
                this.zzdzo = null;
                zzaak zzaak = this.zzdzc;
                if (zzaak != null) {
                    zzaak.zzh("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    public final void zzk(int i, int i2) {
        if (this.zzdzj) {
            int max = Math.max(i / ((Integer) zzvh.zzpd().zzd(zzzx.zzchy)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzvh.zzpd().zzd(zzzx.zzchy)).intValue(), 1);
            Bitmap bitmap = this.zzdzo;
            if (bitmap == null || bitmap.getWidth() != max || this.zzdzo.getHeight() != max2) {
                this.zzdzo = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.zzdzq = false;
            }
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zzdzd.resume();
        } else {
            this.zzdzd.pause();
            this.zzdzl = this.zzdzk;
        }
        zzawo.zzdtx.post(new zzbax(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zzdzd.resume();
            z = true;
        } else {
            this.zzdzd.pause();
            this.zzdzl = this.zzdzk;
            z = false;
        }
        zzawo.zzdtx.post(new zzbbc(this, z));
    }

    private final boolean zzyh() {
        return this.zzdzp.getParent() != null;
    }

    /* access modifiers changed from: private */
    public final void zzd(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzdza.zza("onVideoEvent", (Map<String, ?>) hashMap);
    }

    private final void zzyi() {
        if (this.zzdza.zzys() != null && this.zzdzh && !this.zzdzi) {
            this.zzdza.zzys().getWindow().clearFlags(128);
            this.zzdzh = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzau(boolean z) {
        zzd("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }
}
