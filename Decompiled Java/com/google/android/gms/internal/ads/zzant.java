package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzant extends zzge implements zzanq {
    public zzant() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzanq zzaf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzanq) {
            return (zzanq) queryLocalInterface;
        }
        return new zzans(iBinder);
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [com.google.android.gms.internal.ads.zzane] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.ads.zzanl] */
    /* JADX WARNING: type inference failed for: r2v13, types: [com.google.android.gms.internal.ads.zzanj] */
    /* JADX WARNING: type inference failed for: r5v8, types: [com.google.android.gms.internal.ads.zzanj] */
    /* JADX WARNING: type inference failed for: r2v18, types: [com.google.android.gms.internal.ads.zzanr] */
    /* JADX WARNING: type inference failed for: r2v19, types: [com.google.android.gms.internal.ads.zzanp] */
    /* JADX WARNING: type inference failed for: r5v11, types: [com.google.android.gms.internal.ads.zzanp] */
    /* JADX WARNING: type inference failed for: r2v24, types: [com.google.android.gms.internal.ads.zzanm] */
    /* JADX WARNING: type inference failed for: r2v25, types: [com.google.android.gms.internal.ads.zzank] */
    /* JADX WARNING: type inference failed for: r5v14, types: [com.google.android.gms.internal.ads.zzank] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(int r14, android.os.Parcel r15, android.os.Parcel r16, int r17) throws android.os.RemoteException {
        /*
            r13 = this;
            r8 = r13
            r0 = r14
            r1 = r15
            r9 = r16
            r10 = 1
            r2 = 0
            if (r0 == r10) goto L_0x01cf
            r3 = 2
            if (r0 == r3) goto L_0x01c4
            r3 = 3
            if (r0 == r3) goto L_0x01b9
            r3 = 5
            if (r0 == r3) goto L_0x01ad
            r3 = 10
            if (r0 == r3) goto L_0x019d
            r3 = 11
            if (r0 == r3) goto L_0x0189
            switch(r0) {
                case 13: goto L_0x0134;
                case 14: goto L_0x00e9;
                case 15: goto L_0x00d5;
                case 16: goto L_0x008a;
                case 17: goto L_0x0076;
                case 18: goto L_0x002b;
                case 19: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = 0
            return r0
        L_0x001f:
            java.lang.String r0 = r15.readString()
            r13.zzdn(r0)
            r16.writeNoException()
            goto L_0x021e
        L_0x002b:
            java.lang.String r3 = r15.readString()
            java.lang.String r4 = r15.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzuh> r0 = com.google.android.gms.internal.ads.zzuh.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r15, r0)
            r5 = r0
            com.google.android.gms.internal.ads.zzuh r5 = (com.google.android.gms.internal.ads.zzuh) r5
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x004c
        L_0x004a:
            r7 = r2
            goto L_0x005f
        L_0x004c:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzank
            if (r7 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.zzank r2 = (com.google.android.gms.internal.ads.zzank) r2
            goto L_0x004a
        L_0x0059:
            com.google.android.gms.internal.ads.zzanm r2 = new com.google.android.gms.internal.ads.zzanm
            r2.<init>(r0)
            goto L_0x004a
        L_0x005f:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.internal.ads.zzalq r11 = com.google.android.gms.internal.ads.zzalt.zzad(r0)
            r0 = r13
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.zza((java.lang.String) r1, (java.lang.String) r2, (com.google.android.gms.internal.ads.zzuh) r3, (com.google.android.gms.dynamic.IObjectWrapper) r4, (com.google.android.gms.internal.ads.zzank) r5, (com.google.android.gms.internal.ads.zzalq) r6)
            r16.writeNoException()
            goto L_0x021e
        L_0x0076:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            boolean r0 = r13.zzaa(r0)
            r16.writeNoException()
            com.google.android.gms.internal.ads.zzgd.writeBoolean(r9, r0)
            goto L_0x021e
        L_0x008a:
            java.lang.String r3 = r15.readString()
            java.lang.String r4 = r15.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzuh> r0 = com.google.android.gms.internal.ads.zzuh.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r15, r0)
            r5 = r0
            com.google.android.gms.internal.ads.zzuh r5 = (com.google.android.gms.internal.ads.zzuh) r5
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x00ab
        L_0x00a9:
            r7 = r2
            goto L_0x00be
        L_0x00ab:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzanp
            if (r7 == 0) goto L_0x00b8
            com.google.android.gms.internal.ads.zzanp r2 = (com.google.android.gms.internal.ads.zzanp) r2
            goto L_0x00a9
        L_0x00b8:
            com.google.android.gms.internal.ads.zzanr r2 = new com.google.android.gms.internal.ads.zzanr
            r2.<init>(r0)
            goto L_0x00a9
        L_0x00be:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.internal.ads.zzalq r11 = com.google.android.gms.internal.ads.zzalt.zzad(r0)
            r0 = r13
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.zza((java.lang.String) r1, (java.lang.String) r2, (com.google.android.gms.internal.ads.zzuh) r3, (com.google.android.gms.dynamic.IObjectWrapper) r4, (com.google.android.gms.internal.ads.zzanp) r5, (com.google.android.gms.internal.ads.zzalq) r6)
            r16.writeNoException()
            goto L_0x021e
        L_0x00d5:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            boolean r0 = r13.zzz(r0)
            r16.writeNoException()
            com.google.android.gms.internal.ads.zzgd.writeBoolean(r9, r0)
            goto L_0x021e
        L_0x00e9:
            java.lang.String r3 = r15.readString()
            java.lang.String r4 = r15.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzuh> r0 = com.google.android.gms.internal.ads.zzuh.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r15, r0)
            r5 = r0
            com.google.android.gms.internal.ads.zzuh r5 = (com.google.android.gms.internal.ads.zzuh) r5
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x010a
        L_0x0108:
            r7 = r2
            goto L_0x011d
        L_0x010a:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzanj
            if (r7 == 0) goto L_0x0117
            com.google.android.gms.internal.ads.zzanj r2 = (com.google.android.gms.internal.ads.zzanj) r2
            goto L_0x0108
        L_0x0117:
            com.google.android.gms.internal.ads.zzanl r2 = new com.google.android.gms.internal.ads.zzanl
            r2.<init>(r0)
            goto L_0x0108
        L_0x011d:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.internal.ads.zzalq r11 = com.google.android.gms.internal.ads.zzalt.zzad(r0)
            r0 = r13
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.zza((java.lang.String) r1, (java.lang.String) r2, (com.google.android.gms.internal.ads.zzuh) r3, (com.google.android.gms.dynamic.IObjectWrapper) r4, (com.google.android.gms.internal.ads.zzanj) r5, (com.google.android.gms.internal.ads.zzalq) r6)
            r16.writeNoException()
            goto L_0x021e
        L_0x0134:
            java.lang.String r3 = r15.readString()
            java.lang.String r4 = r15.readString()
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzuh> r0 = com.google.android.gms.internal.ads.zzuh.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r15, r0)
            r5 = r0
            com.google.android.gms.internal.ads.zzuh r5 = (com.google.android.gms.internal.ads.zzuh) r5
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r6 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x0155
        L_0x0153:
            r7 = r2
            goto L_0x0168
        L_0x0155:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r7 = r2 instanceof com.google.android.gms.internal.ads.zzane
            if (r7 == 0) goto L_0x0162
            com.google.android.gms.internal.ads.zzane r2 = (com.google.android.gms.internal.ads.zzane) r2
            goto L_0x0153
        L_0x0162:
            com.google.android.gms.internal.ads.zzang r2 = new com.google.android.gms.internal.ads.zzang
            r2.<init>(r0)
            goto L_0x0153
        L_0x0168:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.internal.ads.zzalq r11 = com.google.android.gms.internal.ads.zzalt.zzad(r0)
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzuk> r0 = com.google.android.gms.internal.ads.zzuk.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r15, r0)
            r12 = r0
            com.google.android.gms.internal.ads.zzuk r12 = (com.google.android.gms.internal.ads.zzuk) r12
            r0 = r13
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r7 = r12
            r0.zza(r1, r2, r3, r4, r5, r6, r7)
            r16.writeNoException()
            goto L_0x021e
        L_0x0189:
            java.lang.String[] r0 = r15.createStringArray()
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            java.lang.Object[] r1 = r15.createTypedArray(r2)
            android.os.Bundle[] r1 = (android.os.Bundle[]) r1
            r13.zza(r0, r1)
            r16.writeNoException()
            goto L_0x021e
        L_0x019d:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            r13.zzy(r0)
            r16.writeNoException()
            goto L_0x021e
        L_0x01ad:
            com.google.android.gms.internal.ads.zzxj r0 = r13.getVideoController()
            r16.writeNoException()
            com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r9, (android.os.IInterface) r0)
            goto L_0x021e
        L_0x01b9:
            com.google.android.gms.internal.ads.zzaoe r0 = r13.zzti()
            r16.writeNoException()
            com.google.android.gms.internal.ads.zzgd.zzb(r9, r0)
            goto L_0x021e
        L_0x01c4:
            com.google.android.gms.internal.ads.zzaoe r0 = r13.zzth()
            r16.writeNoException()
            com.google.android.gms.internal.ads.zzgd.zzb(r9, r0)
            goto L_0x021e
        L_0x01cf:
            android.os.IBinder r0 = r15.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r0)
            java.lang.String r4 = r15.readString()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r15, r0)
            r5 = r0
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r15, r0)
            r6 = r0
            android.os.Bundle r6 = (android.os.Bundle) r6
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzuk> r0 = com.google.android.gms.internal.ads.zzuk.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.ads.zzgd.zza((android.os.Parcel) r15, r0)
            r7 = r0
            com.google.android.gms.internal.ads.zzuk r7 = (com.google.android.gms.internal.ads.zzuk) r7
            android.os.IBinder r0 = r15.readStrongBinder()
            if (r0 != 0) goto L_0x01fe
            r11 = r2
            goto L_0x0211
        L_0x01fe:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzanv
            if (r2 == 0) goto L_0x020b
            com.google.android.gms.internal.ads.zzanv r1 = (com.google.android.gms.internal.ads.zzanv) r1
            goto L_0x0210
        L_0x020b:
            com.google.android.gms.internal.ads.zzanx r1 = new com.google.android.gms.internal.ads.zzanx
            r1.<init>(r0)
        L_0x0210:
            r11 = r1
        L_0x0211:
            r0 = r13
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r11
            r0.zza((com.google.android.gms.dynamic.IObjectWrapper) r1, (java.lang.String) r2, (android.os.Bundle) r3, (android.os.Bundle) r4, (com.google.android.gms.internal.ads.zzuk) r5, (com.google.android.gms.internal.ads.zzanv) r6)
            r16.writeNoException()
        L_0x021e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzant.zza(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
