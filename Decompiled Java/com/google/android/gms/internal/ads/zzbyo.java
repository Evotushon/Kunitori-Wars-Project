package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbyo extends zzbnf {
    private final zzazo zzblu;
    private final zzdq zzehb;
    private final Executor zzfeo;
    private final zzbzg zzfge;
    private final zzauf zzfhr;
    private final zzbyz zzfne;
    private final zzbzh zzfod;
    private final zzbzv zzfoe;
    private final zzbzd zzfof;
    private final zzeed<zzccn> zzfog;
    private final zzeed<zzccl> zzfoh;
    private final zzeed<zzccq> zzfoi;
    private final zzeed<zzcch> zzfoj;
    private final zzeed<zzccp> zzfok;
    private zzcal zzfol;
    private boolean zzfom;
    private final zzbyu zzfon;
    private final zzcsf zzfoo;
    private final Context zzur;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbyo(zzbne zzbne, Executor executor, zzbyz zzbyz, zzbzh zzbzh, zzbzv zzbzv, zzbzd zzbzd, zzbzg zzbzg, zzeed<zzccn> zzeed, zzeed<zzccl> zzeed2, zzeed<zzccq> zzeed3, zzeed<zzcch> zzeed4, zzeed<zzccp> zzeed5, zzauf zzauf, zzdq zzdq, zzazo zzazo, Context context, zzbyu zzbyu, zzcsf zzcsf) {
        super(zzbne);
        this.zzfeo = executor;
        this.zzfne = zzbyz;
        this.zzfod = zzbzh;
        this.zzfoe = zzbzv;
        this.zzfof = zzbzd;
        this.zzfge = zzbzg;
        this.zzfog = zzeed;
        this.zzfoh = zzeed2;
        this.zzfoi = zzeed3;
        this.zzfoj = zzeed4;
        this.zzfok = zzeed5;
        this.zzfhr = zzauf;
        this.zzehb = zzdq;
        this.zzblu = zzazo;
        this.zzur = context;
        this.zzfon = zzbyu;
        this.zzfoo = zzcsf;
    }

    @AnyThread
    public final void zzags() {
        this.zzfeo.execute(new zzbyr(this));
        if (this.zzfne.zzake() != 7) {
            Executor executor = this.zzfeo;
            zzbzh zzbzh = this.zzfod;
            zzbzh.getClass();
            executor.execute(zzbyq.zza(zzbzh));
        }
        super.zzags();
    }

    public final synchronized void zzfv(String str) {
        this.zzfod.zzfv(str);
    }

    public final synchronized void zzajs() {
        if (!this.zzfom) {
            this.zzfod.zzajs();
        }
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zzfod.zzf(bundle);
    }

    public final synchronized boolean zzh(Bundle bundle) {
        if (this.zzfom) {
            return true;
        }
        boolean zzh = this.zzfod.zzh(bundle);
        this.zzfom = zzh;
        return zzh;
    }

    public final synchronized void zzg(Bundle bundle) {
        this.zzfod.zzg(bundle);
    }

    public final synchronized void destroy() {
        this.zzfeo.execute(new zzbyt(this));
        super.destroy();
    }

    public final synchronized void zza(zzcal zzcal) {
        zzdg zzcb;
        this.zzfol = zzcal;
        this.zzfoe.zza(zzcal);
        this.zzfod.zza(zzcal.zzagm(), zzcal.zzalh(), zzcal.zzali(), (View.OnTouchListener) zzcal, (View.OnClickListener) zzcal);
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzclw)).booleanValue() && (zzcb = this.zzehb.zzcb()) != null) {
            zzcb.zzb(zzcal.zzagm());
        }
        if (zzcal.zzalf() != null) {
            zzcal.zzalf().zza((zzpt) this.zzfhr);
        }
    }

    public final synchronized void zzb(zzcal zzcal) {
        this.zzfod.zza(zzcal.zzagm(), zzcal.zzalg());
        if (zzcal.zzale() != null) {
            zzcal.zzale().setClickable(false);
            zzcal.zzale().removeAllViews();
        }
        if (zzcal.zzalf() != null) {
            zzcal.zzalf().zzb(this.zzfhr);
        }
        this.zzfol = null;
    }

    public final synchronized void zza(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcrb)).booleanValue()) {
            this.zzfoe.zzc(this.zzfol);
        }
        this.zzfod.zza(view, view2, map, map2, z);
    }

    public final synchronized void zza(View view, MotionEvent motionEvent, View view2) {
        this.zzfod.zza(view, motionEvent, view2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzb(android.view.View r3, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5, boolean r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzfom     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            r0 = 1
            if (r6 == 0) goto L_0x0013
            com.google.android.gms.internal.ads.zzbzh r6 = r2.zzfod     // Catch:{ all -> 0x005c }
            r6.zza((android.view.View) r3, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r4, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r5)     // Catch:{ all -> 0x005c }
            r2.zzfom = r0     // Catch:{ all -> 0x005c }
            monitor-exit(r2)
            return
        L_0x0013:
            if (r6 != 0) goto L_0x005a
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.zzzx.zzcne     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ all -> 0x005c }
            java.lang.Object r6 = r1.zzd(r6)     // Catch:{ all -> 0x005c }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x005c }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x005c }
            if (r6 == 0) goto L_0x005a
            if (r4 == 0) goto L_0x005a
            java.util.Set r6 = r4.entrySet()     // Catch:{ all -> 0x005c }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x005c }
        L_0x0031:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x005c }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x005c }
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x005c }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x0031
            boolean r1 = zzy(r1)     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzbzh r6 = r2.zzfod     // Catch:{ all -> 0x005c }
            r6.zza((android.view.View) r3, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r4, (java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>) r5)     // Catch:{ all -> 0x005c }
            r2.zzfom = r0     // Catch:{ all -> 0x005c }
            monitor-exit(r2)
            return
        L_0x005a:
            monitor-exit(r2)
            return
        L_0x005c:
            r3 = move-exception
            monitor-exit(r2)
            goto L_0x0060
        L_0x005f:
            throw r3
        L_0x0060:
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyo.zzb(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void setClickConfirmingView(View view) {
        this.zzfod.setClickConfirmingView(view);
    }

    public final synchronized void zza(zzaem zzaem) {
        this.zzfod.zza(zzaem);
    }

    public final synchronized void cancelUnconfirmedClick() {
        this.zzfod.cancelUnconfirmedClick();
    }

    public final synchronized void zza(@Nullable zzwu zzwu) {
        this.zzfod.zza(zzwu);
    }

    public final synchronized void zza(zzwq zzwq) {
        this.zzfod.zza(zzwq);
    }

    public final synchronized void zzru() {
        this.zzfod.zzru();
    }

    public final synchronized void recordCustomClickGesture() {
        if (this.zzfol == null) {
            zzawf.zzeb("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            this.zzfeo.execute(new zzbys(this, this.zzfol instanceof zzbzq));
        }
    }

    public final synchronized boolean isCustomClickGestureEnabled() {
        return this.zzfod.isCustomClickGestureEnabled();
    }

    public static boolean zzy(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), (Point) null);
    }

    public final boolean zzajz() {
        return this.zzfof.zzakr();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(java.lang.String r11, boolean r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzbzd r0 = r10.zzfof
            boolean r0 = r0.zzaka()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.google.android.gms.internal.ads.zzbyz r0 = r10.zzfne
            com.google.android.gms.internal.ads.zzbdv r0 = r0.zzakk()
            com.google.android.gms.internal.ads.zzbyz r1 = r10.zzfne
            com.google.android.gms.internal.ads.zzbdv r1 = r1.zzakj()
            if (r0 != 0) goto L_0x001a
            if (r1 != 0) goto L_0x001a
            return
        L_0x001a:
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0020
            r4 = 1
            goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            r3 = 0
            if (r4 == 0) goto L_0x002a
        L_0x0028:
            r8 = r3
            goto L_0x0032
        L_0x002a:
            if (r2 == 0) goto L_0x0030
            java.lang.String r3 = "javascript"
            r0 = r1
            goto L_0x0028
        L_0x0030:
            r0 = r3
            r8 = r0
        L_0x0032:
            android.webkit.WebView r3 = r0.getWebView()
            if (r3 != 0) goto L_0x0039
            return
        L_0x0039:
            com.google.android.gms.internal.ads.zzaoy r3 = com.google.android.gms.ads.internal.zzq.zzlk()
            android.content.Context r4 = r10.zzur
            boolean r3 = r3.zzq(r4)
            if (r3 == 0) goto L_0x0097
            com.google.android.gms.internal.ads.zzazo r3 = r10.zzblu
            int r3 = r3.zzdxf
            com.google.android.gms.internal.ads.zzazo r4 = r10.zzblu
            int r4 = r4.zzdxg
            r5 = 23
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r6.append(r3)
            java.lang.String r3 = "."
            r6.append(r3)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.google.android.gms.internal.ads.zzaoy r3 = com.google.android.gms.ads.internal.zzq.zzlk()
            android.webkit.WebView r5 = r0.getWebView()
            java.lang.String r6 = ""
            java.lang.String r7 = "javascript"
            r9 = r11
            com.google.android.gms.dynamic.IObjectWrapper r11 = r3.zza(r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L_0x0077
            return
        L_0x0077:
            com.google.android.gms.internal.ads.zzbyz r3 = r10.zzfne
            r3.zzas(r11)
            r0.zzap(r11)
            if (r2 == 0) goto L_0x008e
            android.view.View r0 = r1.getView()
            if (r0 == 0) goto L_0x008e
            com.google.android.gms.internal.ads.zzaoy r1 = com.google.android.gms.ads.internal.zzq.zzlk()
            r1.zza(r11, r0)
        L_0x008e:
            if (r12 == 0) goto L_0x0097
            com.google.android.gms.internal.ads.zzaoy r12 = com.google.android.gms.ads.internal.zzq.zzlk()
            r12.zzab(r11)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyo.zzg(java.lang.String, boolean):void");
    }

    public final boolean zzaka() {
        return this.zzfof.zzaka();
    }

    public final void zzz(View view) {
        IObjectWrapper zzakl = this.zzfne.zzakl();
        boolean z = this.zzfne.zzakk() != null;
        if (this.zzfof.zzaka() && zzakl != null && z && view != null) {
            zzq.zzlk().zza(zzakl, view);
        }
    }

    public final void zzaa(View view) {
        IObjectWrapper zzakl = this.zzfne.zzakl();
        if (this.zzfof.zzaka() && zzakl != null && view != null) {
            zzq.zzlk().zzb(zzakl, view);
        }
    }

    public final zzbyu zzakb() {
        return this.zzfon;
    }

    public final synchronized void zza(zzxd zzxd) {
        this.zzfoo.zzb(zzxd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzbj(boolean z) {
        this.zzfod.zza(this.zzfol.zzagm(), this.zzfol.zzalg(), this.zzfol.zzalh(), z);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzakc() {
        this.zzfod.destroy();
        this.zzfne.destroy();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzakd() {
        try {
            int zzake = this.zzfne.zzake();
            if (zzake != 1) {
                if (zzake != 2) {
                    if (zzake != 3) {
                        if (zzake != 6) {
                            if (zzake != 7) {
                                zzawf.zzey("Wrong native template id!");
                            } else if (this.zzfge.zzakx() != null) {
                                this.zzfge.zzakx().zza(this.zzfoj.get());
                            }
                        } else if (this.zzfge.zzakv() != null) {
                            zzg("Google", true);
                            this.zzfge.zzakv().zza(this.zzfoi.get());
                        }
                    } else if (this.zzfge.zzga(this.zzfne.getCustomTemplateId()) != null) {
                        if (this.zzfne.zzakj() != null) {
                            zzg("Google", true);
                        }
                        this.zzfge.zzga(this.zzfne.getCustomTemplateId()).zzb(this.zzfok.get());
                    }
                } else if (this.zzfge.zzaku() != null) {
                    zzg("Google", true);
                    this.zzfge.zzaku().zza(this.zzfoh.get());
                }
            } else if (this.zzfge.zzakt() != null) {
                zzg("Google", true);
                this.zzfge.zzakt().zza(this.zzfog.get());
            }
        } catch (RemoteException e) {
            zzawf.zzc("RemoteException when notifyAdLoad is called", e);
        }
    }
}
