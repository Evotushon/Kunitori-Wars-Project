package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzeag {
    private static final zzeae zzhvc = zzbeh();
    private static final zzeae zzhvd = new zzead();

    static zzeae zzbef() {
        return zzhvc;
    }

    static zzeae zzbeg() {
        return zzhvd;
    }

    private static zzeae zzbeh() {
        try {
            return (zzeae) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
