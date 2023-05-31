package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzasw extends zzge implements zzast {
    public zzasw() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzast zzao(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof zzast) {
            return (zzast) queryLocalInterface;
        }
        return new zzasv(iBinder);
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.zzatb] */
    /* JADX WARNING: type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.zzasy] */
    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.zzatg] */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            r5 = 0
            switch(r2) {
                case 1: goto L_0x00d6;
                case 2: goto L_0x00b5;
                case 3: goto L_0x00aa;
                case 4: goto L_0x009f;
                case 5: goto L_0x0090;
                case 6: goto L_0x006e;
                case 7: goto L_0x005e;
                case 8: goto L_0x004e;
                case 9: goto L_0x0042;
                case 10: goto L_0x002e;
                case 11: goto L_0x0022;
                case 12: goto L_0x0016;
                case 13: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r2 = 0
            return r2
        L_0x0006:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzxd r2 = com.google.android.gms.internal.ads.zzxc.zzi(r2)
            r1.zza((com.google.android.gms.internal.ads.zzxd) r2)
            r4.writeNoException()
            goto L_0x00fd
        L_0x0016:
            com.google.android.gms.internal.ads.zzxe r2 = r1.zzkg()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r4, (android.os.IInterface) r2)
            goto L_0x00fd
        L_0x0022:
            com.google.android.gms.internal.ads.zzass r2 = r1.zzqc()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r4, (android.os.IInterface) r2)
            goto L_0x00fd
        L_0x002e:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            boolean r3 = com.google.android.gms.internal.ads.zzgd.zza(r3)
            r1.zza((com.google.android.gms.dynamic.IObjectWrapper) r2, (boolean) r3)
            r4.writeNoException()
            goto L_0x00fd
        L_0x0042:
            android.os.Bundle r2 = r1.getAdMetadata()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzgd.zzb(r4, r2)
            goto L_0x00fd
        L_0x004e:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzwy r2 = com.google.android.gms.internal.ads.zzxb.zzh(r2)
            r1.zza((com.google.android.gms.internal.ads.zzwy) r2)
            r4.writeNoException()
            goto L_0x00fd
        L_0x005e:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzato> r2 = com.google.android.gms.internal.ads.zzato.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r3, r2)
            com.google.android.gms.internal.ads.zzato r2 = (com.google.android.gms.internal.ads.zzato) r2
            r1.zza((com.google.android.gms.internal.ads.zzato) r2)
            r4.writeNoException()
            goto L_0x00fd
        L_0x006e:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x0075
            goto L_0x0088
        L_0x0075:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.zzatg
            if (r5 == 0) goto L_0x0083
            r5 = r3
            com.google.android.gms.internal.ads.zzatg r5 = (com.google.android.gms.internal.ads.zzatg) r5
            goto L_0x0088
        L_0x0083:
            com.google.android.gms.internal.ads.zzatf r5 = new com.google.android.gms.internal.ads.zzatf
            r5.<init>(r2)
        L_0x0088:
            r1.zza((com.google.android.gms.internal.ads.zzatg) r5)
            r4.writeNoException()
            goto L_0x00fd
        L_0x0090:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r2)
            r1.zzh(r2)
            r4.writeNoException()
            goto L_0x00fd
        L_0x009f:
            java.lang.String r2 = r1.getMediationAdapterClassName()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x00fd
        L_0x00aa:
            boolean r2 = r1.isLoaded()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzgd.writeBoolean(r4, r2)
            goto L_0x00fd
        L_0x00b5:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x00bc
            goto L_0x00cf
        L_0x00bc:
            java.lang.String r3 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.ads.zzasy
            if (r5 == 0) goto L_0x00ca
            r5 = r3
            com.google.android.gms.internal.ads.zzasy r5 = (com.google.android.gms.internal.ads.zzasy) r5
            goto L_0x00cf
        L_0x00ca:
            com.google.android.gms.internal.ads.zzata r5 = new com.google.android.gms.internal.ads.zzata
            r5.<init>(r2)
        L_0x00cf:
            r1.zza((com.google.android.gms.internal.ads.zzasy) r5)
            r4.writeNoException()
            goto L_0x00fd
        L_0x00d6:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzuh> r2 = com.google.android.gms.internal.ads.zzuh.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r3, r2)
            com.google.android.gms.internal.ads.zzuh r2 = (com.google.android.gms.internal.ads.zzuh) r2
            android.os.IBinder r3 = r3.readStrongBinder()
            if (r3 != 0) goto L_0x00e5
            goto L_0x00f7
        L_0x00e5:
            java.lang.String r5 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzatb
            if (r0 == 0) goto L_0x00f2
            com.google.android.gms.internal.ads.zzatb r5 = (com.google.android.gms.internal.ads.zzatb) r5
            goto L_0x00f7
        L_0x00f2:
            com.google.android.gms.internal.ads.zzatd r5 = new com.google.android.gms.internal.ads.zzatd
            r5.<init>(r3)
        L_0x00f7:
            r1.zza((com.google.android.gms.internal.ads.zzuh) r2, (com.google.android.gms.internal.ads.zzatb) r5)
            r4.writeNoException()
        L_0x00fd:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasw.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
