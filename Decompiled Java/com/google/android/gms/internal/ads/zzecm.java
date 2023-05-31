package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public enum zzecm {
    DOUBLE(zzecp.DOUBLE, 1),
    FLOAT(zzecp.FLOAT, 5),
    INT64(zzecp.LONG, 0),
    UINT64(zzecp.LONG, 0),
    INT32(zzecp.INT, 0),
    FIXED64(zzecp.LONG, 1),
    FIXED32(zzecp.INT, 5),
    BOOL(zzecp.BOOLEAN, 0),
    STRING(zzecp.STRING, 2),
    GROUP(zzecp.MESSAGE, 3),
    MESSAGE(zzecp.MESSAGE, 2),
    BYTES(zzecp.BYTE_STRING, 2),
    UINT32(zzecp.INT, 0),
    ENUM(zzecp.ENUM, 0),
    SFIXED32(zzecp.INT, 5),
    SFIXED64(zzecp.LONG, 1),
    SINT32(zzecp.INT, 0),
    SINT64(zzecp.LONG, 0);
    
    private final zzecp zzhzf;
    private final int zzhzg;

    private zzecm(zzecp zzecp, int i) {
        this.zzhzf = zzecp;
        this.zzhzg = i;
    }

    public final zzecp zzbfo() {
        return this.zzhzf;
    }

    public final int zzbfp() {
        return this.zzhzg;
    }
}
