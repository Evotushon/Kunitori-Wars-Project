package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzear {
    private static final zzeap zzhvw = zzbek();
    private static final zzeap zzhvx = new zzeas();

    static zzeap zzbei() {
        return zzhvw;
    }

    static zzeap zzbej() {
        return zzhvx;
    }

    private static zzeap zzbek() {
        try {
            return (zzeap) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
