package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzaes extends UnifiedNativeAd {
    private final VideoController zzcfe = new VideoController();
    private final List<NativeAd.Image> zzcwz = new ArrayList();
    private final zzacs zzcxa;
    private final NativeAd.AdChoicesInfo zzcxb;
    private final zzaer zzcxi;
    private final List<MuteThisAdReason> zzcxj = new ArrayList();

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2 A[Catch:{ RemoteException -> 0x00bf }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzaes(com.google.android.gms.internal.ads.zzaer r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzcwz = r1
            com.google.android.gms.ads.VideoController r1 = new com.google.android.gms.ads.VideoController
            r1.<init>()
            r5.zzcfe = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzcxj = r1
            r5.zzcxi = r6
            r6 = 0
            com.google.android.gms.internal.ads.zzaer r1 = r5.zzcxi     // Catch:{ RemoteException -> 0x005e }
            java.util.List r1 = r1.getImages()     // Catch:{ RemoteException -> 0x005e }
            if (r1 == 0) goto L_0x0062
            java.util.Iterator r1 = r1.iterator()     // Catch:{ RemoteException -> 0x005e }
        L_0x0029:
            boolean r2 = r1.hasNext()     // Catch:{ RemoteException -> 0x005e }
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r1.next()     // Catch:{ RemoteException -> 0x005e }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x005e }
            if (r3 == 0) goto L_0x0050
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x005e }
            if (r2 == 0) goto L_0x0050
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x005e }
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzacr     // Catch:{ RemoteException -> 0x005e }
            if (r4 == 0) goto L_0x0049
            r2 = r3
            com.google.android.gms.internal.ads.zzacr r2 = (com.google.android.gms.internal.ads.zzacr) r2     // Catch:{ RemoteException -> 0x005e }
            goto L_0x0051
        L_0x0049:
            com.google.android.gms.internal.ads.zzact r3 = new com.google.android.gms.internal.ads.zzact     // Catch:{ RemoteException -> 0x005e }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x005e }
            r2 = r3
            goto L_0x0051
        L_0x0050:
            r2 = r6
        L_0x0051:
            if (r2 == 0) goto L_0x0029
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r3 = r5.zzcwz     // Catch:{ RemoteException -> 0x005e }
            com.google.android.gms.internal.ads.zzacs r4 = new com.google.android.gms.internal.ads.zzacs     // Catch:{ RemoteException -> 0x005e }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x005e }
            r3.add(r4)     // Catch:{ RemoteException -> 0x005e }
            goto L_0x0029
        L_0x005e:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzazh.zzc(r0, r1)
        L_0x0062:
            com.google.android.gms.internal.ads.zzaer r1 = r5.zzcxi     // Catch:{ RemoteException -> 0x0091 }
            java.util.List r1 = r1.getMuteThisAdReasons()     // Catch:{ RemoteException -> 0x0091 }
            if (r1 == 0) goto L_0x0095
            java.util.Iterator r1 = r1.iterator()     // Catch:{ RemoteException -> 0x0091 }
        L_0x006e:
            boolean r2 = r1.hasNext()     // Catch:{ RemoteException -> 0x0091 }
            if (r2 == 0) goto L_0x0095
            java.lang.Object r2 = r1.next()     // Catch:{ RemoteException -> 0x0091 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0091 }
            if (r3 == 0) goto L_0x0083
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0091 }
            com.google.android.gms.internal.ads.zzwu r2 = com.google.android.gms.internal.ads.zzwx.zzg(r2)     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x0084
        L_0x0083:
            r2 = r6
        L_0x0084:
            if (r2 == 0) goto L_0x006e
            java.util.List<com.google.android.gms.ads.MuteThisAdReason> r3 = r5.zzcxj     // Catch:{ RemoteException -> 0x0091 }
            com.google.android.gms.internal.ads.zzwz r4 = new com.google.android.gms.internal.ads.zzwz     // Catch:{ RemoteException -> 0x0091 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0091 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x006e
        L_0x0091:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzazh.zzc(r0, r1)
        L_0x0095:
            com.google.android.gms.internal.ads.zzaer r1 = r5.zzcxi     // Catch:{ RemoteException -> 0x00a3 }
            com.google.android.gms.internal.ads.zzacr r1 = r1.zzrk()     // Catch:{ RemoteException -> 0x00a3 }
            if (r1 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.zzacs r2 = new com.google.android.gms.internal.ads.zzacs     // Catch:{ RemoteException -> 0x00a3 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x00a3 }
            goto L_0x00a8
        L_0x00a3:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzazh.zzc(r0, r1)
        L_0x00a7:
            r2 = r6
        L_0x00a8:
            r5.zzcxa = r2
            com.google.android.gms.internal.ads.zzaer r1 = r5.zzcxi     // Catch:{ RemoteException -> 0x00bf }
            com.google.android.gms.internal.ads.zzacj r1 = r1.zzrl()     // Catch:{ RemoteException -> 0x00bf }
            if (r1 == 0) goto L_0x00c3
            com.google.android.gms.internal.ads.zzack r1 = new com.google.android.gms.internal.ads.zzack     // Catch:{ RemoteException -> 0x00bf }
            com.google.android.gms.internal.ads.zzaer r2 = r5.zzcxi     // Catch:{ RemoteException -> 0x00bf }
            com.google.android.gms.internal.ads.zzacj r2 = r2.zzrl()     // Catch:{ RemoteException -> 0x00bf }
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x00bf }
            r6 = r1
            goto L_0x00c3
        L_0x00bf:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzazh.zzc(r0, r1)
        L_0x00c3:
            r5.zzcxb = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaes.<init>(com.google.android.gms.internal.ads.zzaer):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: zzrj */
    public final IObjectWrapper zzjo() {
        try {
            return this.zzcxi.zzrj();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final Object zzjt() {
        try {
            IObjectWrapper zzrm = this.zzcxi.zzrm();
            if (zzrm != null) {
                return ObjectWrapper.unwrap(zzrm);
            }
            return null;
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zzcxi.performClick(bundle);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzcxi.recordImpression(bundle);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzcxi.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final String getHeadline() {
        try {
            return this.zzcxi.getHeadline();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzcwz;
    }

    public final String getBody() {
        try {
            return this.zzcxi.getBody();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final NativeAd.Image getIcon() {
        return this.zzcxa;
    }

    public final String getCallToAction() {
        try {
            return this.zzcxi.getCallToAction();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final Double getStarRating() {
        try {
            double starRating = this.zzcxi.getStarRating();
            if (starRating == -1.0d) {
                return null;
            }
            return Double.valueOf(starRating);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final String getStore() {
        try {
            return this.zzcxi.getStore();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final String getPrice() {
        try {
            return this.zzcxi.getPrice();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.zzcxi.getVideoController() != null) {
                this.zzcfe.zza(this.zzcxi.getVideoController());
            }
        } catch (RemoteException e) {
            zzazh.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcfe;
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzcxb;
    }

    public final String getMediationAdapterClassName() {
        try {
            return this.zzcxi.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle extras = this.zzcxi.getExtras();
            if (extras != null) {
                return extras;
            }
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
        return new Bundle();
    }

    public final void enableCustomClickGesture() {
        try {
            this.zzcxi.zzru();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zzcxi.isCustomClickGestureEnabled();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return false;
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.zzcxi.recordCustomClickGesture();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.zzcxj;
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zzcxi.isCustomMuteThisAdEnabled();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return false;
        }
    }

    public final void destroy() {
        try {
            this.zzcxi.destroy();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.zzcxi.zza((zzaem) new zzafc(unconfirmedClickListener));
        } catch (RemoteException e) {
            zzazh.zzc("Failed to setUnconfirmedClickListener", e);
        }
    }

    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            if (!isCustomMuteThisAdEnabled()) {
                zzazh.zzey("Ad is not custom mute enabled");
            } else if (muteThisAdReason == null) {
                this.zzcxi.zza((zzwu) null);
            } else if (muteThisAdReason instanceof zzwz) {
                this.zzcxi.zza(((zzwz) muteThisAdReason).zzpn());
            } else {
                zzazh.zzey("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
            }
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.zzcxi.zza((zzwq) new zzwv(muteThisAdListener));
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.zzcxi.cancelUnconfirmedClick();
        } catch (RemoteException e) {
            zzazh.zzc("Failed to cancelUnconfirmedClick", e);
        }
    }

    public final String getAdvertiser() {
        try {
            return this.zzcxi.getAdvertiser();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final MediaContent getMediaContent() {
        try {
            if (this.zzcxi.zzrv() != null) {
                return new zzye(this.zzcxi.zzrv());
            }
            return null;
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzxe zzxe;
        try {
            zzxe = this.zzcxi.zzkg();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            zzxe = null;
        }
        return ResponseInfo.zza(zzxe);
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzcxi.zza((zzxd) new zzyx(onPaidEventListener));
        } catch (RemoteException e) {
            zzazh.zzc("Failed to setOnPaidEventListener", e);
        }
    }
}
