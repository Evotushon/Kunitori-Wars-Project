package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdyq {
    private static final zzdyo<?> zzhpy = new zzdyn();
    private static final zzdyo<?> zzhpz = zzbck();

    private static zzdyo<?> zzbck() {
        try {
            return (zzdyo) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static zzdyo<?> zzbcl() {
        return zzhpy;
    }

    static zzdyo<?> zzbcm() {
        zzdyo<?> zzdyo = zzhpz;
        if (zzdyo != null) {
            return zzdyo;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
