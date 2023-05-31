package com.google.android.gms.internal.ads;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final class zzdme<K, V> extends zzdlv<K, V> {
    private static final zzdlv<Object, Object> zzhau = new zzdme((Object) null, new Object[0], 0);
    private final transient int size;
    private final transient Object[] zzhas;
    private final transient Object zzhav;

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r10v5 ?, r10v4 ?, r10v7 ?, r10v9 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    static <K, V> com.google.android.gms.internal.ads.zzdme<K, V> zzc(int r10, java.lang.Object[] r11) {
        /*
            int r10 = r11.length
            int r10 = r10 >> 1
            r0 = 5
            com.google.android.gms.internal.ads.zzdlg.zzt(r0, r10)
            int r10 = com.google.android.gms.internal.ads.zzdly.zzdx(r0)
            int r1 = r10 + -1
            r2 = 0
            r3 = -1
            r4 = 128(0x80, float:1.794E-43)
            if (r10 > r4) goto L_0x004b
            byte[] r10 = new byte[r10]
            java.util.Arrays.fill(r10, r3)
        L_0x0018:
            if (r2 >= r0) goto L_0x00bd
            int r3 = r2 * 2
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            com.google.android.gms.internal.ads.zzdll.zzb(r4, r5)
            int r6 = r4.hashCode()
            int r6 = com.google.android.gms.internal.ads.zzdln.zzdv(r6)
        L_0x002d:
            r6 = r6 & r1
            byte r7 = r10[r6]
            r8 = 255(0xff, float:3.57E-43)
            r7 = r7 & r8
            if (r7 != r8) goto L_0x003b
            byte r3 = (byte) r3
            r10[r6] = r3
            int r2 = r2 + 1
            goto L_0x0018
        L_0x003b:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0046
            int r6 = r6 + 1
            goto L_0x002d
        L_0x0046:
            java.lang.IllegalArgumentException r10 = zza(r4, r5, r11, r7)
            throw r10
        L_0x004b:
            r4 = 32768(0x8000, float:4.5918E-41)
            if (r10 > r4) goto L_0x0089
            short[] r10 = new short[r10]
            java.util.Arrays.fill(r10, r3)
        L_0x0055:
            if (r2 >= r0) goto L_0x00bd
            int r3 = r2 * 2
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            com.google.android.gms.internal.ads.zzdll.zzb(r4, r5)
            int r6 = r4.hashCode()
            int r6 = com.google.android.gms.internal.ads.zzdln.zzdv(r6)
        L_0x006a:
            r6 = r6 & r1
            short r7 = r10[r6]
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            if (r7 != r8) goto L_0x0079
            short r3 = (short) r3
            r10[r6] = r3
            int r2 = r2 + 1
            goto L_0x0055
        L_0x0079:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0084
            int r6 = r6 + 1
            goto L_0x006a
        L_0x0084:
            java.lang.IllegalArgumentException r10 = zza(r4, r5, r11, r7)
            throw r10
        L_0x0089:
            int[] r10 = new int[r10]
            java.util.Arrays.fill(r10, r3)
        L_0x008e:
            if (r2 >= r0) goto L_0x00bd
            int r4 = r2 * 2
            r5 = r11[r4]
            r6 = r4 ^ 1
            r6 = r11[r6]
            com.google.android.gms.internal.ads.zzdll.zzb(r5, r6)
            int r7 = r5.hashCode()
            int r7 = com.google.android.gms.internal.ads.zzdln.zzdv(r7)
        L_0x00a3:
            r7 = r7 & r1
            r8 = r10[r7]
            if (r8 != r3) goto L_0x00ad
            r10[r7] = r4
            int r2 = r2 + 1
            goto L_0x008e
        L_0x00ad:
            r9 = r11[r8]
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x00b8
            int r7 = r7 + 1
            goto L_0x00a3
        L_0x00b8:
            java.lang.IllegalArgumentException r10 = zza(r5, r6, r11, r8)
            throw r10
        L_0x00bd:
            com.google.android.gms.internal.ads.zzdme r1 = new com.google.android.gms.internal.ads.zzdme
            r1.<init>(r10, r11, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdme.zzc(int, java.lang.Object[]):com.google.android.gms.internal.ads.zzdme");
    }

    private static IllegalArgumentException zza(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    private zzdme(Object obj, Object[] objArr, int i) {
        this.zzhav = obj;
        this.zzhas = objArr;
        this.size = i;
    }

    public final int size() {
        return this.size;
    }

    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.zzhav;
        V[] vArr = this.zzhas;
        int i = this.size;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (vArr[0].equals(obj)) {
                return vArr[1];
            }
            return null;
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int zzdv = zzdln.zzdv(obj.hashCode());
                while (true) {
                    int i2 = zzdv & length;
                    byte b = bArr[i2] & 255;
                    if (b == 255) {
                        return null;
                    }
                    if (vArr[b].equals(obj)) {
                        return vArr[b ^ 1];
                    }
                    zzdv = i2 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int zzdv2 = zzdln.zzdv(obj.hashCode());
                while (true) {
                    int i3 = zzdv2 & length2;
                    short s = sArr[i3] & 65535;
                    if (s == 65535) {
                        return null;
                    }
                    if (vArr[s].equals(obj)) {
                        return vArr[s ^ 1];
                    }
                    zzdv2 = i3 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int zzdv3 = zzdln.zzdv(obj.hashCode());
                while (true) {
                    int i4 = zzdv3 & length3;
                    int i5 = iArr[i4];
                    if (i5 == -1) {
                        return null;
                    }
                    if (vArr[i5].equals(obj)) {
                        return vArr[i5 ^ 1];
                    }
                    zzdv3 = i4 + 1;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzdly<Map.Entry<K, V>> zzaud() {
        return new zzdmd(this, this.zzhas, 0, this.size);
    }

    /* access modifiers changed from: package-private */
    public final zzdly<K> zzaue() {
        return new zzdmf(this, new zzdmi(this.zzhas, 0, this.size));
    }

    /* access modifiers changed from: package-private */
    public final zzdlq<V> zzauf() {
        return new zzdmi(this.zzhas, 1, this.size);
    }
}
