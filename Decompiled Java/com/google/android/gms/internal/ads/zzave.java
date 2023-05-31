package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzave extends zzge implements zzavb {
    public zzave() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
        /*
            r3 = this;
            r7 = 1
            if (r4 == r7) goto L_0x004b
            r0 = 2
            if (r4 == r0) goto L_0x003c
            r0 = 3
            if (r4 == r0) goto L_0x0021
            r0 = 4
            if (r4 == r0) goto L_0x000e
            r4 = 0
            return r4
        L_0x000e:
            android.os.IBinder r4 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            com.google.android.gms.dynamic.IObjectWrapper r4 = r3.zzao(r4)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r6, (android.os.IInterface) r4)
            goto L_0x007d
        L_0x0021:
            android.os.IBinder r4 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            android.os.IBinder r5 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r5)
            com.google.android.gms.dynamic.IObjectWrapper r4 = r3.zzb(r4, r5)
            r6.writeNoException()
            com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r6, (android.os.IInterface) r4)
            goto L_0x007d
        L_0x003c:
            android.os.IBinder r4 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            r3.zzan(r4)
            r6.writeNoException()
            goto L_0x007d
        L_0x004b:
            android.os.IBinder r4 = r5.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzavh> r0 = com.google.android.gms.internal.ads.zzavh.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r5, r0)
            com.google.android.gms.internal.ads.zzavh r0 = (com.google.android.gms.internal.ads.zzavh) r0
            android.os.IBinder r5 = r5.readStrongBinder()
            if (r5 != 0) goto L_0x0063
            r5 = 0
            goto L_0x0077
        L_0x0063:
            java.lang.String r1 = "com.google.android.gms.ads.internal.signals.ISignalCallback"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzava
            if (r2 == 0) goto L_0x0071
            r5 = r1
            com.google.android.gms.internal.ads.zzava r5 = (com.google.android.gms.internal.ads.zzava) r5
            goto L_0x0077
        L_0x0071:
            com.google.android.gms.internal.ads.zzavc r1 = new com.google.android.gms.internal.ads.zzavc
            r1.<init>(r5)
            r5 = r1
        L_0x0077:
            r3.zza(r4, r0, r5)
            r6.writeNoException()
        L_0x007d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzave.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
