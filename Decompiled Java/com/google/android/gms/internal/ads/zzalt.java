package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzalt extends zzge implements zzalq {
    public zzalt() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzalq zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof zzalq) {
            return (zzalq) queryLocalInterface;
        }
        return new zzals(iBinder);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x00ad;
                case 2: goto L_0x00a9;
                case 3: goto L_0x00a1;
                case 4: goto L_0x009d;
                case 5: goto L_0x0099;
                case 6: goto L_0x0095;
                case 7: goto L_0x0075;
                case 8: goto L_0x0071;
                case 9: goto L_0x0065;
                case 10: goto L_0x0055;
                case 11: goto L_0x0051;
                case 12: goto L_0x0049;
                case 13: goto L_0x0044;
                case 14: goto L_0x0037;
                case 15: goto L_0x0032;
                case 16: goto L_0x0025;
                case 17: goto L_0x001c;
                case 18: goto L_0x0017;
                case 19: goto L_0x000a;
                case 20: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            r0.onVideoPlay()
            goto L_0x00b0
        L_0x000a:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.zzb((android.os.Bundle) r1)
            goto L_0x00b0
        L_0x0017:
            r0.zzsy()
            goto L_0x00b0
        L_0x001c:
            int r1 = r2.readInt()
            r0.zzco(r1)
            goto L_0x00b0
        L_0x0025:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzass r1 = com.google.android.gms.internal.ads.zzasr.zzan(r1)
            r0.zza((com.google.android.gms.internal.ads.zzass) r1)
            goto L_0x00b0
        L_0x0032:
            r0.onVideoPause()
            goto L_0x00b0
        L_0x0037:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzasq> r1 = com.google.android.gms.internal.ads.zzasq.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzasq r1 = (com.google.android.gms.internal.ads.zzasq) r1
            r0.zzb((com.google.android.gms.internal.ads.zzasq) r1)
            goto L_0x00b0
        L_0x0044:
            r0.zzsx()
            goto L_0x00b0
        L_0x0049:
            java.lang.String r1 = r2.readString()
            r0.zzdk(r1)
            goto L_0x00b0
        L_0x0051:
            r0.onVideoEnd()
            goto L_0x00b0
        L_0x0055:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.zzadn r1 = com.google.android.gms.internal.ads.zzadm.zzr(r1)
            java.lang.String r2 = r2.readString()
            r0.zza(r1, r2)
            goto L_0x00b0
        L_0x0065:
            java.lang.String r1 = r2.readString()
            java.lang.String r2 = r2.readString()
            r0.onAppEvent(r1, r2)
            goto L_0x00b0
        L_0x0071:
            r0.onAdImpression()
            goto L_0x00b0
        L_0x0075:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x007d
            r1 = 0
            goto L_0x0091
        L_0x007d:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.zzalv
            if (r4 == 0) goto L_0x008b
            r1 = r2
            com.google.android.gms.internal.ads.zzalv r1 = (com.google.android.gms.internal.ads.zzalv) r1
            goto L_0x0091
        L_0x008b:
            com.google.android.gms.internal.ads.zzalu r2 = new com.google.android.gms.internal.ads.zzalu
            r2.<init>(r1)
            r1 = r2
        L_0x0091:
            r0.zza((com.google.android.gms.internal.ads.zzalv) r1)
            goto L_0x00b0
        L_0x0095:
            r0.onAdLoaded()
            goto L_0x00b0
        L_0x0099:
            r0.onAdOpened()
            goto L_0x00b0
        L_0x009d:
            r0.onAdLeftApplication()
            goto L_0x00b0
        L_0x00a1:
            int r1 = r2.readInt()
            r0.onAdFailedToLoad(r1)
            goto L_0x00b0
        L_0x00a9:
            r0.onAdClosed()
            goto L_0x00b0
        L_0x00ad:
            r0.onAdClicked()
        L_0x00b0:
            r3.writeNoException()
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalt.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
