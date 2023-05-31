package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbzv {
    private final Executor executor;
    private final zzach zzdff;
    private final zzawh zzdsq;
    private final Executor zzfeo;
    private final zzdeu zzfir;
    private final zzbyz zzfne;
    private final zzbzd zzfof;
    private final zzbyu zzfon;
    @Nullable
    private final zzcad zzfqt;

    public zzbzv(zzawh zzawh, zzdeu zzdeu, zzbzd zzbzd, zzbyz zzbyz, @Nullable zzcad zzcad, Executor executor2, Executor executor3, zzbyu zzbyu) {
        this.zzdsq = zzawh;
        this.zzfir = zzdeu;
        this.zzdff = zzdeu.zzdff;
        this.zzfof = zzbzd;
        this.zzfne = zzbyz;
        this.zzfqt = zzcad;
        this.zzfeo = executor2;
        this.executor = executor3;
        this.zzfon = zzbyu;
    }

    public final void zza(zzcal zzcal) {
        this.zzfeo.execute(new zzbzu(this, zzcal));
    }

    private static void zza(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void zzc(@Nullable zzcal zzcal) {
        if (zzcal != null && this.zzfqt != null && zzcal.zzale() != null) {
            if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcrc)).booleanValue() || this.zzfof.zzakq()) {
                try {
                    zzcal.zzale().addView(this.zzfqt.zzalp());
                } catch (zzbei e) {
                    zzawf.zza("web view can not be obtained", e);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static boolean zza(zzcal zzcal, String[] strArr) {
        Map<String, WeakReference<View>> zzalh = zzcal.zzalh();
        if (zzalh == null) {
            return false;
        }
        for (String str : strArr) {
            if (zzalh.get(str) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean zza(@NonNull ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        View zzaki = this.zzfne.zzaki();
        if (zzaki == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzaki.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzaki.getParent()).removeView(zzaki);
        }
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcnd)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzaki, layoutParams);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        if (this.zzfne.zzaki() == null) {
            return;
        }
        if (2 == this.zzfne.zzake() || 1 == this.zzfne.zzake()) {
            this.zzdsq.zza(this.zzfir.zzgqr, String.valueOf(this.zzfne.zzake()), z);
        } else if (6 == this.zzfne.zzake()) {
            this.zzdsq.zza(this.zzfir.zzgqr, "2", z);
            this.zzdsq.zza(this.zzfir.zzgqr, "1", z);
        }
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x010b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzcal r10) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.zzbzd r0 = r9.zzfof
            boolean r0 = r0.zzaks()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0015
            com.google.android.gms.internal.ads.zzbzd r0 = r9.zzfof
            boolean r0 = r0.zzakr()
            if (r0 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r0 = 0
            goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r3 = 0
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "1098"
            java.lang.String r4 = "3011"
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            r4 = 0
        L_0x0022:
            r5 = 2
            if (r4 >= r5) goto L_0x0037
            r5 = r0[r4]
            android.view.View r5 = r10.zzgc(r5)
            if (r5 == 0) goto L_0x0034
            boolean r6 = r5 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x0034
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x0038
        L_0x0034:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x0037:
            r5 = r3
        L_0x0038:
            if (r5 == 0) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            android.view.View r4 = r10.zzagm()
            android.content.Context r4 = r4.getContext()
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            r7 = -2
            r6.<init>(r7, r7)
            com.google.android.gms.internal.ads.zzbyz r7 = r9.zzfne
            android.view.View r7 = r7.zzakf()
            if (r7 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.zzbyz r4 = r9.zzfne
            android.view.View r4 = r4.zzakf()
            com.google.android.gms.internal.ads.zzach r7 = r9.zzdff
            if (r7 != 0) goto L_0x005e
            goto L_0x009b
        L_0x005e:
            if (r0 != 0) goto L_0x009b
            int r7 = r7.zzbkh
            zza((android.widget.RelativeLayout.LayoutParams) r6, (int) r7)
            r4.setLayoutParams(r6)
            goto L_0x009b
        L_0x0069:
            com.google.android.gms.internal.ads.zzbyz r7 = r9.zzfne
            com.google.android.gms.internal.ads.zzacj r7 = r7.zzrl()
            boolean r7 = r7 instanceof com.google.android.gms.internal.ads.zzaby
            if (r7 != 0) goto L_0x0075
            r4 = r3
            goto L_0x009b
        L_0x0075:
            com.google.android.gms.internal.ads.zzbyz r7 = r9.zzfne
            com.google.android.gms.internal.ads.zzacj r7 = r7.zzrl()
            com.google.android.gms.internal.ads.zzaby r7 = (com.google.android.gms.internal.ads.zzaby) r7
            if (r0 != 0) goto L_0x0086
            int r8 = r7.zzre()
            zza((android.widget.RelativeLayout.LayoutParams) r6, (int) r8)
        L_0x0086:
            com.google.android.gms.internal.ads.zzacb r8 = new com.google.android.gms.internal.ads.zzacb
            r8.<init>(r4, r7, r6)
            com.google.android.gms.internal.ads.zzzi<java.lang.String> r4 = com.google.android.gms.internal.ads.zzzx.zzcna
            com.google.android.gms.internal.ads.zzzt r6 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r4 = r6.zzd(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r8.setContentDescription(r4)
            r4 = r8
        L_0x009b:
            r6 = -1
            if (r4 == 0) goto L_0x00e0
            android.view.ViewParent r7 = r4.getParent()
            boolean r7 = r7 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x00af
            android.view.ViewParent r7 = r4.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.removeView(r4)
        L_0x00af:
            if (r0 == 0) goto L_0x00b8
            r5.removeAllViews()
            r5.addView(r4)
            goto L_0x00d9
        L_0x00b8:
            com.google.android.gms.ads.formats.AdChoicesView r0 = new com.google.android.gms.ads.formats.AdChoicesView
            android.view.View r5 = r10.zzagm()
            android.content.Context r5 = r5.getContext()
            r0.<init>(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r6, r6)
            r0.setLayoutParams(r5)
            r0.addView(r4)
            android.widget.FrameLayout r5 = r10.zzale()
            if (r5 == 0) goto L_0x00d9
            r5.addView(r0)
        L_0x00d9:
            java.lang.String r0 = r10.zzalj()
            r10.zza(r0, r4, r2)
        L_0x00e0:
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzzx.zzcrb
            com.google.android.gms.internal.ads.zzzt r2 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r0 = r2.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00f5
            r9.zzc(r10)
        L_0x00f5:
            java.lang.String[] r0 = com.google.android.gms.internal.ads.zzbzt.zzfqk
            int r2 = r0.length
        L_0x00f8:
            if (r1 >= r2) goto L_0x010b
            r4 = r0[r1]
            android.view.View r4 = r10.zzgc(r4)
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x0108
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x010c
        L_0x0108:
            int r1 = r1 + 1
            goto L_0x00f8
        L_0x010b:
            r0 = r3
        L_0x010c:
            java.util.concurrent.Executor r1 = r9.executor
            com.google.android.gms.internal.ads.zzbzx r2 = new com.google.android.gms.internal.ads.zzbzx
            r2.<init>(r9, r0)
            r1.execute(r2)
            if (r0 == 0) goto L_0x01c4
            boolean r1 = r9.zza((android.view.ViewGroup) r0)
            if (r1 == 0) goto L_0x0135
            com.google.android.gms.internal.ads.zzbyz r1 = r9.zzfne
            com.google.android.gms.internal.ads.zzbdv r1 = r1.zzakj()
            if (r1 == 0) goto L_0x01c4
            com.google.android.gms.internal.ads.zzbyz r1 = r9.zzfne
            com.google.android.gms.internal.ads.zzbdv r1 = r1.zzakj()
            com.google.android.gms.internal.ads.zzbzw r2 = new com.google.android.gms.internal.ads.zzbzw
            r2.<init>(r9, r10, r0)
            r1.zza((com.google.android.gms.internal.ads.zzacf) r2)
            return
        L_0x0135:
            r0.removeAllViews()
            android.view.View r1 = r10.zzagm()
            if (r1 == 0) goto L_0x0143
            android.content.Context r1 = r1.getContext()
            goto L_0x0144
        L_0x0143:
            r1 = r3
        L_0x0144:
            if (r1 == 0) goto L_0x01c4
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.zzzx.zzcmz
            com.google.android.gms.internal.ads.zzzt r4 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r2 = r4.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x016b
            com.google.android.gms.internal.ads.zzbyu r2 = r9.zzfon
            com.google.android.gms.internal.ads.zzacm r2 = r2.zzrv()
            if (r2 == 0) goto L_0x01c4
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzri()     // Catch:{ RemoteException -> 0x0165 }
            goto L_0x0177
        L_0x0165:
            java.lang.String r10 = "Could not get main image drawable"
            com.google.android.gms.internal.ads.zzawf.zzfa(r10)
            return
        L_0x016b:
            com.google.android.gms.internal.ads.zzbyz r2 = r9.zzfne
            com.google.android.gms.internal.ads.zzacr r2 = r2.zzakg()
            if (r2 == 0) goto L_0x01c4
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzrg()     // Catch:{ RemoteException -> 0x01bf }
        L_0x0177:
            if (r2 == 0) goto L_0x01c4
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            if (r2 == 0) goto L_0x01c4
            android.widget.ImageView r4 = new android.widget.ImageView
            r4.<init>(r1)
            r4.setImageDrawable(r2)
            if (r10 == 0) goto L_0x018f
            com.google.android.gms.dynamic.IObjectWrapper r3 = r10.zzalk()
        L_0x018f:
            if (r3 == 0) goto L_0x01ae
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r10 = com.google.android.gms.internal.ads.zzzx.zzcrd
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r10 = r1.zzd(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x01a4
            goto L_0x01ae
        L_0x01a4:
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r3)
            android.widget.ImageView$ScaleType r10 = (android.widget.ImageView.ScaleType) r10
            r4.setScaleType(r10)
            goto L_0x01b3
        L_0x01ae:
            android.widget.ImageView$ScaleType r10 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r4.setScaleType(r10)
        L_0x01b3:
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r10.<init>(r6, r6)
            r4.setLayoutParams(r10)
            r0.addView(r4)
            goto L_0x01c4
        L_0x01bf:
            java.lang.String r10 = "Could not get drawable from image"
            com.google.android.gms.internal.ads.zzawf.zzfa(r10)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzv.zzd(com.google.android.gms.internal.ads.zzcal):void");
    }
}
