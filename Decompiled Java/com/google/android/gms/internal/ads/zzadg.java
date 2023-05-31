package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzadg extends NativeAppInstallAd {
    private final VideoController zzcfe = new VideoController();
    private final zzadf zzcwy;
    private final List<NativeAd.Image> zzcwz = new ArrayList();
    private final zzacs zzcxa;
    private final NativeAd.AdChoicesInfo zzcxb;

    /* JADX WARNING: type inference failed for: r3v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078 A[Catch:{ RemoteException -> 0x0085 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzadg(com.google.android.gms.internal.ads.zzadf r6) {
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
            r5.zzcwy = r6
            r6 = 0
            com.google.android.gms.internal.ads.zzadf r1 = r5.zzcwy     // Catch:{ RemoteException -> 0x0057 }
            java.util.List r1 = r1.getImages()     // Catch:{ RemoteException -> 0x0057 }
            if (r1 == 0) goto L_0x005b
            java.util.Iterator r1 = r1.iterator()     // Catch:{ RemoteException -> 0x0057 }
        L_0x0022:
            boolean r2 = r1.hasNext()     // Catch:{ RemoteException -> 0x0057 }
            if (r2 == 0) goto L_0x005b
            java.lang.Object r2 = r1.next()     // Catch:{ RemoteException -> 0x0057 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0057 }
            if (r3 == 0) goto L_0x0049
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0057 }
            if (r2 == 0) goto L_0x0049
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x0057 }
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.zzacr     // Catch:{ RemoteException -> 0x0057 }
            if (r4 == 0) goto L_0x0042
            r2 = r3
            com.google.android.gms.internal.ads.zzacr r2 = (com.google.android.gms.internal.ads.zzacr) r2     // Catch:{ RemoteException -> 0x0057 }
            goto L_0x004a
        L_0x0042:
            com.google.android.gms.internal.ads.zzact r3 = new com.google.android.gms.internal.ads.zzact     // Catch:{ RemoteException -> 0x0057 }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x0057 }
            r2 = r3
            goto L_0x004a
        L_0x0049:
            r2 = r6
        L_0x004a:
            if (r2 == 0) goto L_0x0022
            java.util.List<com.google.android.gms.ads.formats.NativeAd$Image> r3 = r5.zzcwz     // Catch:{ RemoteException -> 0x0057 }
            com.google.android.gms.internal.ads.zzacs r4 = new com.google.android.gms.internal.ads.zzacs     // Catch:{ RemoteException -> 0x0057 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0057 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0057 }
            goto L_0x0022
        L_0x0057:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzazh.zzc(r0, r1)
        L_0x005b:
            com.google.android.gms.internal.ads.zzadf r1 = r5.zzcwy     // Catch:{ RemoteException -> 0x0069 }
            com.google.android.gms.internal.ads.zzacr r1 = r1.zzrk()     // Catch:{ RemoteException -> 0x0069 }
            if (r1 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.zzacs r2 = new com.google.android.gms.internal.ads.zzacs     // Catch:{ RemoteException -> 0x0069 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x0069 }
            goto L_0x006e
        L_0x0069:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzazh.zzc(r0, r1)
        L_0x006d:
            r2 = r6
        L_0x006e:
            r5.zzcxa = r2
            com.google.android.gms.internal.ads.zzadf r1 = r5.zzcwy     // Catch:{ RemoteException -> 0x0085 }
            com.google.android.gms.internal.ads.zzacj r1 = r1.zzrl()     // Catch:{ RemoteException -> 0x0085 }
            if (r1 == 0) goto L_0x0089
            com.google.android.gms.internal.ads.zzack r1 = new com.google.android.gms.internal.ads.zzack     // Catch:{ RemoteException -> 0x0085 }
            com.google.android.gms.internal.ads.zzadf r2 = r5.zzcwy     // Catch:{ RemoteException -> 0x0085 }
            com.google.android.gms.internal.ads.zzacj r2 = r2.zzrl()     // Catch:{ RemoteException -> 0x0085 }
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x0085 }
            r6 = r1
            goto L_0x0089
        L_0x0085:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzazh.zzc(r0, r1)
        L_0x0089:
            r5.zzcxb = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadg.<init>(com.google.android.gms.internal.ads.zzadf):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: zzrj */
    public final IObjectWrapper zzjo() {
        try {
            return this.zzcwy.zzrj();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zzcwy.performClick(bundle);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zzcwy.recordImpression(bundle);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zzcwy.reportTouchEvent(bundle);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final CharSequence getHeadline() {
        try {
            return this.zzcwy.getHeadline();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzcwz;
    }

    public final CharSequence getBody() {
        try {
            return this.zzcwy.getBody();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final NativeAd.Image getIcon() {
        return this.zzcxa;
    }

    public final CharSequence getCallToAction() {
        try {
            return this.zzcwy.getCallToAction();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final Double getStarRating() {
        try {
            double starRating = this.zzcwy.getStarRating();
            if (starRating == -1.0d) {
                return null;
            }
            return Double.valueOf(starRating);
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final CharSequence getStore() {
        try {
            return this.zzcwy.getStore();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final CharSequence getPrice() {
        try {
            return this.zzcwy.getPrice();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.zzcwy.getVideoController() != null) {
                this.zzcfe.zza(this.zzcwy.getVideoController());
            }
        } catch (RemoteException e) {
            zzazh.zzc("Exception occurred while getting video controller", e);
        }
        return this.zzcfe;
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzcxb;
    }

    public final CharSequence getMediationAdapterClassName() {
        try {
            return this.zzcwy.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            return this.zzcwy.getExtras();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return null;
        }
    }

    public final void destroy() {
        try {
            this.zzcwy.destroy();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }
}
