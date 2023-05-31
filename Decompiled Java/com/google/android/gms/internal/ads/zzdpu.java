package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdum;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdpu {
    private static final Logger logger = Logger.getLogger(zzdpu.class.getName());
    private static final ConcurrentMap<String, zza> zzhem = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzb> zzhen = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> zzheo = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzdpb<?>> zzhep = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, zzdpt<?>> zzheq = new ConcurrentHashMap();

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    interface zza {
        Set<Class<?>> zzavd();

        zzdpe<?> zzavm();

        Class<?> zzavn();

        Class<?> zzavo();

        <P> zzdpe<P> zzb(Class<P> cls) throws GeneralSecurityException;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    interface zzb {
    }

    private static <KeyProtoT extends zzeah> zza zza(zzdpj<KeyProtoT> zzdpj) {
        return new zzdpw(zzdpj);
    }

    private static <KeyProtoT extends zzeah> zzb zzb(zzdpj<KeyProtoT> zzdpj) {
        return new zzdpy(zzdpj);
    }

    private static synchronized zza zzha(String str) throws GeneralSecurityException {
        zza zza2;
        synchronized (zzdpu.class) {
            if (!zzhem.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            zza2 = (zza) zzhem.get(str);
        }
        return zza2;
    }

    @Deprecated
    public static zzdpb<?> zzhb(String str) throws GeneralSecurityException {
        if (str != null) {
            zzdpb<?> zzdpb = (zzdpb) zzhep.get(str.toLowerCase());
            if (zzdpb != null) {
                return zzdpb;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase().startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    private static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized <P> void zza(java.lang.String r8, java.lang.Class<?> r9, boolean r10) throws java.security.GeneralSecurityException {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.zzdpu> r0 = com.google.android.gms.internal.ads.zzdpu.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.android.gms.internal.ads.zzdpu$zza> r1 = zzhem     // Catch:{ all -> 0x0093 }
            boolean r1 = r1.containsKey(r8)     // Catch:{ all -> 0x0093 }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.android.gms.internal.ads.zzdpu$zza> r1 = zzhem     // Catch:{ all -> 0x0093 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x0093 }
            com.google.android.gms.internal.ads.zzdpu$zza r1 = (com.google.android.gms.internal.ads.zzdpu.zza) r1     // Catch:{ all -> 0x0093 }
            java.lang.Class r2 = r1.zzavn()     // Catch:{ all -> 0x0093 }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x0093 }
            if (r2 != 0) goto L_0x0065
            java.util.logging.Logger r10 = logger     // Catch:{ all -> 0x0093 }
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0093 }
            java.lang.String r3 = "com.google.crypto.tink.Registry"
            java.lang.String r4 = "ensureKeyManagerInsertable"
            java.lang.String r5 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0093 }
            int r7 = r6.length()     // Catch:{ all -> 0x0093 }
            if (r7 == 0) goto L_0x0038
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x0093 }
            goto L_0x003e
        L_0x0038:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0093 }
            r6.<init>(r5)     // Catch:{ all -> 0x0093 }
            r5 = r6
        L_0x003e:
            r10.logp(r2, r3, r4, r5)     // Catch:{ all -> 0x0093 }
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0093 }
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0093 }
            r4 = 0
            r3[r4] = r8     // Catch:{ all -> 0x0093 }
            r8 = 1
            java.lang.Class r1 = r1.zzavn()     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0093 }
            r3[r8] = r1     // Catch:{ all -> 0x0093 }
            r8 = 2
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x0093 }
            r3[r8] = r9     // Catch:{ all -> 0x0093 }
            java.lang.String r8 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0093 }
            r10.<init>(r8)     // Catch:{ all -> 0x0093 }
            throw r10     // Catch:{ all -> 0x0093 }
        L_0x0065:
            if (r10 == 0) goto L_0x0091
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r9 = zzheo     // Catch:{ all -> 0x0093 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x0093 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0093 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0093 }
            if (r9 != 0) goto L_0x0091
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0093 }
            java.lang.String r10 = "New keys are already disallowed for key type "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0093 }
            int r1 = r8.length()     // Catch:{ all -> 0x0093 }
            if (r1 == 0) goto L_0x0088
            java.lang.String r8 = r10.concat(r8)     // Catch:{ all -> 0x0093 }
            goto L_0x008d
        L_0x0088:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x0093 }
            r8.<init>(r10)     // Catch:{ all -> 0x0093 }
        L_0x008d:
            r9.<init>(r8)     // Catch:{ all -> 0x0093 }
            throw r9     // Catch:{ all -> 0x0093 }
        L_0x0091:
            monitor-exit(r0)
            return
        L_0x0093:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdpu.zza(java.lang.String, java.lang.Class, boolean):void");
    }

    public static synchronized <P> void zza(zzdpe<P> zzdpe, boolean z) throws GeneralSecurityException {
        synchronized (zzdpu.class) {
            if (zzdpe != null) {
                String keyType = zzdpe.getKeyType();
                zza(keyType, zzdpe.getClass(), z);
                if (!zzhem.containsKey(keyType)) {
                    zzhem.put(keyType, new zzdpx(zzdpe));
                }
                zzheo.put(keyType, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized <KeyProtoT extends zzeah> void zza(zzdpj<KeyProtoT> zzdpj, boolean z) throws GeneralSecurityException {
        synchronized (zzdpu.class) {
            String keyType = zzdpj.getKeyType();
            zza(keyType, zzdpj.getClass(), true);
            if (!zzhem.containsKey(keyType)) {
                zzhem.put(keyType, zza(zzdpj));
                zzhen.put(keyType, zzb(zzdpj));
            }
            zzheo.put(keyType, true);
        }
    }

    public static synchronized <KeyProtoT extends zzeah, PublicKeyProtoT extends zzeah> void zza(zzdpv<KeyProtoT, PublicKeyProtoT> zzdpv, zzdpj<PublicKeyProtoT> zzdpj, boolean z) throws GeneralSecurityException {
        Class<?> zzavo;
        synchronized (zzdpu.class) {
            String keyType = zzdpv.getKeyType();
            String keyType2 = zzdpj.getKeyType();
            zza(keyType, zzdpv.getClass(), true);
            zza(keyType2, zzdpj.getClass(), false);
            if (!keyType.equals(keyType2)) {
                if (zzhem.containsKey(keyType) && (zzavo = ((zza) zzhem.get(keyType)).zzavo()) != null) {
                    if (!zzavo.equals(zzdpj.getClass())) {
                        Logger logger2 = logger;
                        Level level = Level.WARNING;
                        StringBuilder sb = new StringBuilder(String.valueOf(keyType).length() + 96 + String.valueOf(keyType2).length());
                        sb.append("Attempted overwrite of a registered key manager for key type ");
                        sb.append(keyType);
                        sb.append(" with inconsistent public key type ");
                        sb.append(keyType2);
                        logger2.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb.toString());
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{zzdpv.getClass().getName(), zzavo.getName(), zzdpj.getClass().getName()}));
                    }
                }
                if (!zzhem.containsKey(keyType) || ((zza) zzhem.get(keyType)).zzavo() == null) {
                    zzhem.put(keyType, new zzdpz(zzdpv, zzdpj));
                    zzhen.put(keyType, zzb(zzdpv));
                }
                zzheo.put(keyType, true);
                if (!zzhem.containsKey(keyType2)) {
                    zzhem.put(keyType2, zza(zzdpj));
                }
                zzheo.put(keyType2, false);
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    public static synchronized <P> void zza(zzdpt<P> zzdpt) throws GeneralSecurityException {
        synchronized (zzdpu.class) {
            if (zzdpt != null) {
                Class<P> zzauy = zzdpt.zzauy();
                if (zzheq.containsKey(zzauy)) {
                    zzdpt zzdpt2 = (zzdpt) zzheq.get(zzauy);
                    if (!zzdpt.getClass().equals(zzdpt2.getClass())) {
                        Logger logger2 = logger;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(zzauy.toString());
                        logger2.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", valueOf.length() != 0 ? "Attempted overwrite of a registered SetWrapper for type ".concat(valueOf) : new String("Attempted overwrite of a registered SetWrapper for type "));
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{zzauy.getName(), zzdpt2.getClass().getName(), zzdpt.getClass().getName()}));
                    }
                }
                zzheq.put(zzauy, zzdpt);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    private static zzdpe<?> zzhc(String str) throws GeneralSecurityException {
        return zzha(str).zzavm();
    }

    private static <P> zzdpe<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zza zzha = zzha(str);
        if (cls == null) {
            return zzha.zzavm();
        }
        if (zzha.zzavd().contains(cls)) {
            return zzha.zzb(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzha.zzavn());
        Set<Class<?>> zzavd = zzha.zzavd();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class next : zzavd) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(next.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    public static synchronized zzduc zza(zzdui zzdui) throws GeneralSecurityException {
        zzduc zzo;
        synchronized (zzdpu.class) {
            zzdpe<?> zzhc = zzhc(zzdui.zzayh());
            if (((Boolean) zzheo.get(zzdui.zzayh())).booleanValue()) {
                zzo = zzhc.zzo(zzdui.zzayi());
            } else {
                String valueOf = String.valueOf(zzdui.zzayh());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzo;
    }

    public static synchronized zzeah zzb(zzdui zzdui) throws GeneralSecurityException {
        zzeah zzn;
        synchronized (zzdpu.class) {
            zzdpe<?> zzhc = zzhc(zzdui.zzayh());
            if (((Boolean) zzheo.get(zzdui.zzayh())).booleanValue()) {
                zzn = zzhc.zzn(zzdui.zzayi());
            } else {
                String valueOf = String.valueOf(zzdui.zzayh());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzn;
    }

    public static <P> P zza(String str, zzeah zzeah, Class<P> cls) throws GeneralSecurityException {
        return zza(str, (Class) checkNotNull(cls)).zza(zzeah);
    }

    private static <P> P zza(String str, zzdxn zzdxn, Class<P> cls) throws GeneralSecurityException {
        return zza(str, cls).zzm(zzdxn);
    }

    public static <P> P zza(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return zza(str, zzdxn.zzt(bArr), (Class) checkNotNull(cls));
    }

    public static <P> zzdpr<P> zza(zzdpk zzdpk, zzdpe<P> zzdpe, Class<P> cls) throws GeneralSecurityException {
        Class cls2 = (Class) checkNotNull(cls);
        zzdqb.zzc(zzdpk.zzavg());
        zzdpr<P> zza2 = zzdpr.zza(cls2);
        for (zzdum.zza next : zzdpk.zzavg().zzayv()) {
            if (next.zzavi() == zzdug.ENABLED) {
                zzdpq<P> zza3 = zza2.zza(zza(next.zzayz().zzayh(), next.zzayz().zzayi(), cls2), next);
                if (next.zzaza() == zzdpk.zzavg().zzayu()) {
                    zza2.zza(zza3);
                }
            }
        }
        return zza2;
    }

    public static <P> P zza(zzdpr<P> zzdpr) throws GeneralSecurityException {
        zzdpt zzdpt = (zzdpt) zzheq.get(zzdpr.zzauy());
        if (zzdpt != null) {
            return zzdpt.zza(zzdpr);
        }
        String valueOf = String.valueOf(zzdpr.zzauy().getName());
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
    }
}
