package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;
import com.google.android.gms.internal.ads.zzdyz.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzdyz<MessageType extends zzdyz<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdxd<MessageType, BuilderType> {
    private static Map<Object, zzdyz<?, ?>> zzhsy = new ConcurrentHashMap();
    protected zzeby zzhsw = zzeby.zzbff();
    private int zzhsx = -1;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static class zzc<T extends zzdyz<T, ?>> extends zzdxi<T> {
        private final T zzhst;

        public zzc(T t) {
            this.zzhst = t;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static class zzd<ContainingType extends zzeah, Type> extends zzdyk<ContainingType, Type> {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static final class zze implements zzdyr<zze> {
        public final int zzaf() {
            throw new NoSuchMethodError();
        }

        public final zzecm zzbcn() {
            throw new NoSuchMethodError();
        }

        public final zzecp zzbco() {
            throw new NoSuchMethodError();
        }

        public final boolean zzbcp() {
            throw new NoSuchMethodError();
        }

        public final boolean zzbcq() {
            throw new NoSuchMethodError();
        }

        public final zzeak zza(zzeak zzeak, zzeah zzeah) {
            throw new NoSuchMethodError();
        }

        public final zzeaq zza(zzeaq zzeaq, zzeaq zzeaq2) {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static final class zzf {
        public static final int zzhtc = 1;
        public static final int zzhtd = 2;
        public static final int zzhte = 3;
        public static final int zzhtf = 4;
        public static final int zzhtg = 5;
        public static final int zzhth = 6;
        public static final int zzhti = 7;
        private static final /* synthetic */ int[] zzhtj = {zzhtc, zzhtd, zzhte, zzhtf, zzhtg, zzhth, zzhti};
        public static final int zzhtk = 1;
        public static final int zzhtl = 2;
        private static final /* synthetic */ int[] zzhtm = {zzhtk, zzhtl};
        public static final int zzhtn = 1;
        public static final int zzhto = 2;
        private static final /* synthetic */ int[] zzhtp = {zzhtn, zzhto};

        public static int[] zzbdh() {
            return (int[]) zzhtj.clone();
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzdyz<MessageType, BuilderType> implements zzeaj {
        protected zzdyp<zze> zzhsz = zzdyp.zzbci();

        /* access modifiers changed from: package-private */
        public final zzdyp<zze> zzbdf() {
            if (this.zzhsz.isImmutable()) {
                this.zzhsz = (zzdyp) this.zzhsz.clone();
            }
            return this.zzhsz;
        }
    }

    public String toString() {
        return zzeam.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzhnp != 0) {
            return this.zzhnp;
        }
        this.zzhnp = zzeaw.zzbem().zzba(this).hashCode(this);
        return this.zzhnp;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static abstract class zza<MessageType extends zzdyz<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdxg<MessageType, BuilderType> {
        private final MessageType zzhst;
        protected MessageType zzhsu;
        protected boolean zzhsv = false;

        protected zza(MessageType messagetype) {
            this.zzhst = messagetype;
            this.zzhsu = (zzdyz) messagetype.zza(zzf.zzhtf, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        public void zzbct() {
            MessageType messagetype = (zzdyz) this.zzhsu.zza(zzf.zzhtf, (Object) null, (Object) null);
            zza(messagetype, this.zzhsu);
            this.zzhsu = messagetype;
        }

        public final boolean isInitialized() {
            return zzdyz.zza(this.zzhsu, false);
        }

        /* renamed from: zzbcu */
        public MessageType zzbcw() {
            if (this.zzhsv) {
                return this.zzhsu;
            }
            MessageType messagetype = this.zzhsu;
            zzeaw.zzbem().zzba(messagetype).zzan(messagetype);
            this.zzhsv = true;
            return this.zzhsu;
        }

        /* renamed from: zzbcv */
        public final MessageType zzbcx() {
            MessageType messagetype = (zzdyz) zzbcw();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new zzebw(messagetype);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            zza(this.zzhsu, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzeaw.zzbem().zzba(messagetype).zzf(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzdym zzdym) throws zzdzh {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            try {
                zzeaw.zzbem().zzba(this.zzhsu).zza(this.zzhsu, bArr, 0, i2 + 0, new zzdxm(zzdym));
                return this;
            } catch (zzdzh e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw zzdzh.zzbdi();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: zzb */
        public final BuilderType zza(zzdxz zzdxz, zzdym zzdym) throws IOException {
            if (this.zzhsv) {
                zzbct();
                this.zzhsv = false;
            }
            try {
                zzeaw.zzbem().zzba(this.zzhsu).zza(this.zzhsu, zzdyg.zza(zzdxz), zzdym);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        public final /* synthetic */ zzdxg zza(byte[] bArr, int i, int i2, zzdym zzdym) throws zzdzh {
            return zzb(bArr, 0, i2, zzdym);
        }

        public final /* synthetic */ zzdxg zzbal() {
            return (zza) clone();
        }

        public final /* synthetic */ zzeah zzbcy() {
            return this.zzhst;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zza = (zza) ((zzdyz) this.zzhst).zza(zzf.zzhtg, (Object) null, (Object) null);
            zza.zza((zzdyz) zzbcw());
            return zza;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((zzdyz) zza(zzf.zzhth, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return zzeaw.zzbem().zzba(this).equals(this, (zzdyz) obj);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzdyz<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzbcz() {
        return (zza) zza(zzf.zzhtg, (Object) null, (Object) null);
    }

    public final boolean isInitialized() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    /* access modifiers changed from: package-private */
    public final int zzbaj() {
        return this.zzhsx;
    }

    /* access modifiers changed from: package-private */
    public final void zzfa(int i) {
        this.zzhsx = i;
    }

    public final void zzb(zzdyi zzdyi) throws IOException {
        zzeaw.zzbem().zzba(this).zza(this, zzdyj.zza(zzdyi));
    }

    public final int zzbda() {
        if (this.zzhsx == -1) {
            this.zzhsx = zzeaw.zzbem().zzba(this).zzax(this);
        }
        return this.zzhsx;
    }

    static <T extends zzdyz<?, ?>> T zzf(Class<T> cls) {
        T t = (zzdyz) zzhsy.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzdyz) zzhsy.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzdyz) ((zzdyz) zzecb.zzj(cls)).zza(zzf.zzhth, (Object) null, (Object) null);
            if (t != null) {
                zzhsy.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends zzdyz<?, ?>> void zza(Class<T> cls, T t) {
        zzhsy.put(cls, t);
    }

    protected static Object zza(zzeah zzeah, String str, Object[] objArr) {
        return new zzeay(zzeah, str, objArr);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends zzdyz<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzf.zzhtc, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzaz = zzeaw.zzbem().zzba(t).zzaz(t);
        if (z) {
            t.zza(zzf.zzhtd, (Object) zzaz ? t : null, (Object) null);
        }
        return zzaz;
    }

    protected static zzdzg zzbdb() {
        return zzdza.zzbdg();
    }

    protected static zzdzg zza(zzdzg zzdzg) {
        int size = zzdzg.size();
        return zzdzg.zzgk(size == 0 ? 10 : size << 1);
    }

    protected static <E> zzdzi<E> zzbdc() {
        return zzeav.zzbel();
    }

    protected static <E> zzdzi<E> zza(zzdzi<E> zzdzi) {
        int size = zzdzi.size();
        return zzdzi.zzfd(size == 0 ? 10 : size << 1);
    }

    private static <T extends zzdyz<T, ?>> T zza(T t, zzdxz zzdxz, zzdym zzdym) throws zzdzh {
        T t2 = (zzdyz) t.zza(zzf.zzhtf, (Object) null, (Object) null);
        try {
            zzebd zzba = zzeaw.zzbem().zzba(t2);
            zzba.zza(t2, zzdyg.zza(zzdxz), zzdym);
            zzba.zzan(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof zzdzh) {
                throw ((zzdzh) e.getCause());
            }
            throw new zzdzh(e.getMessage()).zzl(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzdzh) {
                throw ((zzdzh) e2.getCause());
            }
            throw e2;
        }
    }

    private static <T extends zzdyz<T, ?>> T zza(T t, byte[] bArr, int i, int i2, zzdym zzdym) throws zzdzh {
        T t2 = (zzdyz) t.zza(zzf.zzhtf, (Object) null, (Object) null);
        try {
            zzebd zzba = zzeaw.zzbem().zzba(t2);
            zzba.zza(t2, bArr, 0, i2, new zzdxm(zzdym));
            zzba.zzan(t2);
            if (t2.zzhnp == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzdzh) {
                throw ((zzdzh) e.getCause());
            }
            throw new zzdzh(e.getMessage()).zzl(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzdzh.zzbdi().zzl(t2);
        }
    }

    private static <T extends zzdyz<T, ?>> T zzb(T t) throws zzdzh {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw new zzdzh(new zzebw(t).getMessage()).zzl(t);
    }

    protected static <T extends zzdyz<T, ?>> T zza(T t, zzdxn zzdxn) throws zzdzh {
        return zzb(zzb(zzb(t, zzdxn, zzdym.zzbcg())));
    }

    protected static <T extends zzdyz<T, ?>> T zza(T t, zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        return zzb(zzb(t, zzdxn, zzdym));
    }

    private static <T extends zzdyz<T, ?>> T zzb(T t, zzdxn zzdxn, zzdym zzdym) throws zzdzh {
        T zza2;
        try {
            zzdxz zzbau = zzdxn.zzbau();
            zza2 = zza(t, zzbau, zzdym);
            zzbau.zzfh(0);
            return zza2;
        } catch (zzdzh e) {
            throw e.zzl(zza2);
        } catch (zzdzh e2) {
            throw e2;
        }
    }

    protected static <T extends zzdyz<T, ?>> T zza(T t, byte[] bArr) throws zzdzh {
        return zzb(zza(t, bArr, 0, bArr.length, zzdym.zzbcg()));
    }

    protected static <T extends zzdyz<T, ?>> T zza(T t, byte[] bArr, zzdym zzdym) throws zzdzh {
        return zzb(zza(t, bArr, 0, bArr.length, zzdym));
    }

    public final /* synthetic */ zzeak zzbdd() {
        zza zza2 = (zza) zza(zzf.zzhtg, (Object) null, (Object) null);
        zza2.zza(this);
        return zza2;
    }

    public final /* synthetic */ zzeak zzbde() {
        return (zza) zza(zzf.zzhtg, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzeah zzbcy() {
        return (zzdyz) zza(zzf.zzhth, (Object) null, (Object) null);
    }
}
