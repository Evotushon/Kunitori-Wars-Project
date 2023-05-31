package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzecb {
    private static final Logger logger = Logger.getLogger(zzecb.class.getName());
    private static final Unsafe zzhbt = zzbfk();
    private static final Class<?> zzhnw = zzdxk.zzbaq();
    private static final boolean zzhpd = zzbfl();
    private static final boolean zzhxq = zzm(Long.TYPE);
    private static final boolean zzhxr = zzm(Integer.TYPE);
    private static final zzd zzhxs;
    private static final boolean zzhxt = zzbfm();
    static final long zzhxu = ((long) zzk(byte[].class));
    private static final long zzhxv = ((long) zzk(boolean[].class));
    private static final long zzhxw = ((long) zzl(boolean[].class));
    private static final long zzhxx = ((long) zzk(int[].class));
    private static final long zzhxy = ((long) zzl(int[].class));
    private static final long zzhxz = ((long) zzk(long[].class));
    private static final long zzhya = ((long) zzl(long[].class));
    private static final long zzhyb = ((long) zzk(float[].class));
    private static final long zzhyc = ((long) zzl(float[].class));
    private static final long zzhyd = ((long) zzk(double[].class));
    private static final long zzhye = ((long) zzl(double[].class));
    private static final long zzhyf = ((long) zzk(Object[].class));
    private static final long zzhyg = ((long) zzl(Object[].class));
    private static final long zzhyh;
    private static final int zzhyi = ((int) (zzhxu & 7));
    static final boolean zzhyj = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    private zzecb() {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(long j, byte b) {
            this.zzhym.putByte(j, b);
        }

        public final byte zzy(Object obj, long j) {
            return this.zzhym.getByte(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            this.zzhym.putByte(obj, j, b);
        }

        public final boolean zzm(Object obj, long j) {
            return this.zzhym.getBoolean(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            this.zzhym.putBoolean(obj, j, z);
        }

        public final float zzn(Object obj, long j) {
            return this.zzhym.getFloat(obj, j);
        }

        public final void zza(Object obj, long j, float f) {
            this.zzhym.putFloat(obj, j, f);
        }

        public final double zzo(Object obj, long j) {
            return this.zzhym.getDouble(obj, j);
        }

        public final void zza(Object obj, long j, double d) {
            this.zzhym.putDouble(obj, j, d);
        }

        public final void zza(byte[] bArr, long j, long j2, long j3) {
            this.zzhym.copyMemory(bArr, zzecb.zzhxu + j, (Object) null, j2, j3);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        public final byte zzy(Object obj, long j) {
            if (zzecb.zzhyj) {
                return zzecb.zzq(obj, j);
            }
            return zzecb.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzecb.zzhyj) {
                zzecb.zza(obj, j, b);
            } else {
                zzecb.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzecb.zzhyj) {
                return zzecb.zzs(obj, j);
            }
            return zzecb.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzecb.zzhyj) {
                zzecb.zzb(obj, j, z);
            } else {
                zzecb.zzc(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        public final void zza(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    static boolean zzbfi() {
        return zzhpd;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static abstract class zzd {
        Unsafe zzhym;

        zzd(Unsafe unsafe) {
            this.zzhym = unsafe;
        }

        public abstract void zza(long j, byte b);

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zza(byte[] bArr, long j, long j2, long j3);

        public abstract void zze(Object obj, long j, byte b);

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);

        public final int zzk(Object obj, long j) {
            return this.zzhym.getInt(obj, j);
        }

        public final void zzb(Object obj, long j, int i) {
            this.zzhym.putInt(obj, j, i);
        }

        public final long zzl(Object obj, long j) {
            return this.zzhym.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zzhym.putLong(obj, j, j2);
        }
    }

    static boolean zzbfj() {
        return zzhxt;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        public final byte zzy(Object obj, long j) {
            if (zzecb.zzhyj) {
                return zzecb.zzq(obj, j);
            }
            return zzecb.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzecb.zzhyj) {
                zzecb.zza(obj, j, b);
            } else {
                zzecb.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzecb.zzhyj) {
                return zzecb.zzs(obj, j);
            }
            return zzecb.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzecb.zzhyj) {
                zzecb.zzb(obj, j, z);
            } else {
                zzecb.zzc(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        public final void zza(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }
    }

    static <T> T zzj(Class<T> cls) {
        try {
            return zzhbt.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzk(Class<?> cls) {
        if (zzhpd) {
            return zzhxs.zzhym.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzl(Class<?> cls) {
        if (zzhpd) {
            return zzhxs.zzhym.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zzk(Object obj, long j) {
        return zzhxs.zzk(obj, j);
    }

    static void zzb(Object obj, long j, int i) {
        zzhxs.zzb(obj, j, i);
    }

    static long zzl(Object obj, long j) {
        return zzhxs.zzl(obj, j);
    }

    static void zza(Object obj, long j, long j2) {
        zzhxs.zza(obj, j, j2);
    }

    static boolean zzm(Object obj, long j) {
        return zzhxs.zzm(obj, j);
    }

    static void zza(Object obj, long j, boolean z) {
        zzhxs.zza(obj, j, z);
    }

    static float zzn(Object obj, long j) {
        return zzhxs.zzn(obj, j);
    }

    static void zza(Object obj, long j, float f) {
        zzhxs.zza(obj, j, f);
    }

    static double zzo(Object obj, long j) {
        return zzhxs.zzo(obj, j);
    }

    static void zza(Object obj, long j, double d) {
        zzhxs.zza(obj, j, d);
    }

    static Object zzp(Object obj, long j) {
        return zzhxs.zzhym.getObject(obj, j);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzhxs.zzhym.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzhxs.zzy(bArr, zzhxu + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzhxs.zze(bArr, zzhxu + j, b);
    }

    static void zza(byte[] bArr, long j, long j2, long j3) {
        zzhxs.zza(bArr, j, j2, j3);
    }

    static void zza(long j, byte b) {
        zzhxs.zza(j, b);
    }

    static long zzn(ByteBuffer byteBuffer) {
        return zzhxs.zzl(byteBuffer, zzhyh);
    }

    static Unsafe zzbfk() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzecd());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzbfl() {
        Unsafe unsafe = zzhbt;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (zzdxk.zzbap()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzbfm() {
        Unsafe unsafe = zzhbt;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (zzbfn() == null) {
                return false;
            }
            if (zzdxk.zzbap()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzm(Class<?> cls) {
        if (!zzdxk.zzbap()) {
            return false;
        }
        try {
            Class<?> cls2 = zzhnw;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field zzbfn() {
        Field zzb2;
        if (zzdxk.zzbap() && (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) != null) {
            return zzb2;
        }
        Field zzb3 = zzb(Buffer.class, "address");
        if (zzb3 == null || zzb3.getType() != Long.TYPE) {
            return null;
        }
        return zzb3;
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static byte zzq(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte zzr(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static void zza(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    public static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean zzt(Object obj, long j) {
        return zzr(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00dc, code lost:
        r1 = zzhxs;
     */
    static {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.zzecb> r0 = com.google.android.gms.internal.ads.zzecb.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            logger = r0
            sun.misc.Unsafe r0 = zzbfk()
            zzhbt = r0
            java.lang.Class r0 = com.google.android.gms.internal.ads.zzdxk.zzbaq()
            zzhnw = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = zzm(r0)
            zzhxq = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = zzm(r0)
            zzhxr = r0
            sun.misc.Unsafe r0 = zzhbt
            r1 = 0
            if (r0 != 0) goto L_0x002e
            goto L_0x0053
        L_0x002e:
            boolean r0 = com.google.android.gms.internal.ads.zzdxk.zzbap()
            if (r0 == 0) goto L_0x004c
            boolean r0 = zzhxq
            if (r0 == 0) goto L_0x0040
            com.google.android.gms.internal.ads.zzecb$zzc r1 = new com.google.android.gms.internal.ads.zzecb$zzc
            sun.misc.Unsafe r0 = zzhbt
            r1.<init>(r0)
            goto L_0x0053
        L_0x0040:
            boolean r0 = zzhxr
            if (r0 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.zzecb$zza r1 = new com.google.android.gms.internal.ads.zzecb$zza
            sun.misc.Unsafe r0 = zzhbt
            r1.<init>(r0)
            goto L_0x0053
        L_0x004c:
            com.google.android.gms.internal.ads.zzecb$zzb r1 = new com.google.android.gms.internal.ads.zzecb$zzb
            sun.misc.Unsafe r0 = zzhbt
            r1.<init>(r0)
        L_0x0053:
            zzhxs = r1
            boolean r0 = zzbfm()
            zzhxt = r0
            boolean r0 = zzbfl()
            zzhpd = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = zzk(r0)
            long r0 = (long) r0
            zzhxu = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            int r0 = zzk(r0)
            long r0 = (long) r0
            zzhxv = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            int r0 = zzl(r0)
            long r0 = (long) r0
            zzhxw = r0
            java.lang.Class<int[]> r0 = int[].class
            int r0 = zzk(r0)
            long r0 = (long) r0
            zzhxx = r0
            java.lang.Class<int[]> r0 = int[].class
            int r0 = zzl(r0)
            long r0 = (long) r0
            zzhxy = r0
            java.lang.Class<long[]> r0 = long[].class
            int r0 = zzk(r0)
            long r0 = (long) r0
            zzhxz = r0
            java.lang.Class<long[]> r0 = long[].class
            int r0 = zzl(r0)
            long r0 = (long) r0
            zzhya = r0
            java.lang.Class<float[]> r0 = float[].class
            int r0 = zzk(r0)
            long r0 = (long) r0
            zzhyb = r0
            java.lang.Class<float[]> r0 = float[].class
            int r0 = zzl(r0)
            long r0 = (long) r0
            zzhyc = r0
            java.lang.Class<double[]> r0 = double[].class
            int r0 = zzk(r0)
            long r0 = (long) r0
            zzhyd = r0
            java.lang.Class<double[]> r0 = double[].class
            int r0 = zzl(r0)
            long r0 = (long) r0
            zzhye = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzk(r0)
            long r0 = (long) r0
            zzhyf = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzl(r0)
            long r0 = (long) r0
            zzhyg = r0
            java.lang.reflect.Field r0 = zzbfn()
            if (r0 == 0) goto L_0x00e8
            com.google.android.gms.internal.ads.zzecb$zzd r1 = zzhxs
            if (r1 != 0) goto L_0x00e1
            goto L_0x00e8
        L_0x00e1:
            sun.misc.Unsafe r1 = r1.zzhym
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00ea
        L_0x00e8:
            r0 = -1
        L_0x00ea:
            zzhyh = r0
            long r0 = zzhxu
            r2 = 7
            long r0 = r0 & r2
            int r1 = (int) r0
            zzhyi = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00fe
            r0 = 1
            goto L_0x00ff
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            zzhyj = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecb.<clinit>():void");
    }
}
