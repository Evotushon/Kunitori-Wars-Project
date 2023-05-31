package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public enum zzdyu {
    DOUBLE(0, zzdyw.SCALAR, zzdzj.DOUBLE),
    FLOAT(1, zzdyw.SCALAR, zzdzj.FLOAT),
    INT64(2, zzdyw.SCALAR, zzdzj.LONG),
    UINT64(3, zzdyw.SCALAR, zzdzj.LONG),
    INT32(4, zzdyw.SCALAR, zzdzj.INT),
    FIXED64(5, zzdyw.SCALAR, zzdzj.LONG),
    FIXED32(6, zzdyw.SCALAR, zzdzj.INT),
    BOOL(7, zzdyw.SCALAR, zzdzj.BOOLEAN),
    STRING(8, zzdyw.SCALAR, zzdzj.STRING),
    MESSAGE(9, zzdyw.SCALAR, zzdzj.MESSAGE),
    BYTES(10, zzdyw.SCALAR, zzdzj.BYTE_STRING),
    UINT32(11, zzdyw.SCALAR, zzdzj.INT),
    ENUM(12, zzdyw.SCALAR, zzdzj.ENUM),
    SFIXED32(13, zzdyw.SCALAR, zzdzj.INT),
    SFIXED64(14, zzdyw.SCALAR, zzdzj.LONG),
    SINT32(15, zzdyw.SCALAR, zzdzj.INT),
    SINT64(16, zzdyw.SCALAR, zzdzj.LONG),
    GROUP(17, zzdyw.SCALAR, zzdzj.MESSAGE),
    DOUBLE_LIST(18, zzdyw.VECTOR, zzdzj.DOUBLE),
    FLOAT_LIST(19, zzdyw.VECTOR, zzdzj.FLOAT),
    INT64_LIST(20, zzdyw.VECTOR, zzdzj.LONG),
    UINT64_LIST(21, zzdyw.VECTOR, zzdzj.LONG),
    INT32_LIST(22, zzdyw.VECTOR, zzdzj.INT),
    FIXED64_LIST(23, zzdyw.VECTOR, zzdzj.LONG),
    FIXED32_LIST(24, zzdyw.VECTOR, zzdzj.INT),
    BOOL_LIST(25, zzdyw.VECTOR, zzdzj.BOOLEAN),
    STRING_LIST(26, zzdyw.VECTOR, zzdzj.STRING),
    MESSAGE_LIST(27, zzdyw.VECTOR, zzdzj.MESSAGE),
    BYTES_LIST(28, zzdyw.VECTOR, zzdzj.BYTE_STRING),
    UINT32_LIST(29, zzdyw.VECTOR, zzdzj.INT),
    ENUM_LIST(30, zzdyw.VECTOR, zzdzj.ENUM),
    SFIXED32_LIST(31, zzdyw.VECTOR, zzdzj.INT),
    SFIXED64_LIST(32, zzdyw.VECTOR, zzdzj.LONG),
    SINT32_LIST(33, zzdyw.VECTOR, zzdzj.INT),
    SINT64_LIST(34, zzdyw.VECTOR, zzdzj.LONG),
    DOUBLE_LIST_PACKED(35, zzdyw.PACKED_VECTOR, zzdzj.DOUBLE),
    FLOAT_LIST_PACKED(36, zzdyw.PACKED_VECTOR, zzdzj.FLOAT),
    INT64_LIST_PACKED(37, zzdyw.PACKED_VECTOR, zzdzj.LONG),
    UINT64_LIST_PACKED(38, zzdyw.PACKED_VECTOR, zzdzj.LONG),
    INT32_LIST_PACKED(39, zzdyw.PACKED_VECTOR, zzdzj.INT),
    FIXED64_LIST_PACKED(40, zzdyw.PACKED_VECTOR, zzdzj.LONG),
    FIXED32_LIST_PACKED(41, zzdyw.PACKED_VECTOR, zzdzj.INT),
    BOOL_LIST_PACKED(42, zzdyw.PACKED_VECTOR, zzdzj.BOOLEAN),
    UINT32_LIST_PACKED(43, zzdyw.PACKED_VECTOR, zzdzj.INT),
    ENUM_LIST_PACKED(44, zzdyw.PACKED_VECTOR, zzdzj.ENUM),
    SFIXED32_LIST_PACKED(45, zzdyw.PACKED_VECTOR, zzdzj.INT),
    SFIXED64_LIST_PACKED(46, zzdyw.PACKED_VECTOR, zzdzj.LONG),
    SINT32_LIST_PACKED(47, zzdyw.PACKED_VECTOR, zzdzj.INT),
    SINT64_LIST_PACKED(48, zzdyw.PACKED_VECTOR, zzdzj.LONG),
    GROUP_LIST(49, zzdyw.VECTOR, zzdzj.MESSAGE),
    MAP(50, zzdyw.MAP, zzdzj.VOID);
    
    private static final zzdyu[] zzhsg = null;
    private static final Type[] zzhsh = null;
    private final int id;
    private final zzdzj zzhsc;
    private final zzdyw zzhsd;
    private final Class<?> zzhse;
    private final boolean zzhsf;

    private zzdyu(int i, zzdyw zzdyw, zzdzj zzdzj) {
        int i2;
        this.id = i;
        this.zzhsd = zzdyw;
        this.zzhsc = zzdzj;
        int i3 = zzdyt.zzhqb[zzdyw.ordinal()];
        if (i3 == 1) {
            this.zzhse = zzdzj.zzbdr();
        } else if (i3 != 2) {
            this.zzhse = null;
        } else {
            this.zzhse = zzdzj.zzbdr();
        }
        boolean z = false;
        if (!(zzdyw != zzdyw.SCALAR || (i2 = zzdyt.zzhqc[zzdzj.ordinal()]) == 1 || i2 == 2 || i2 == 3)) {
            z = true;
        }
        this.zzhsf = z;
    }

    public final int id() {
        return this.id;
    }

    static {
        int i;
        zzhsh = new Type[0];
        zzdyu[] values = values();
        zzhsg = new zzdyu[values.length];
        for (zzdyu zzdyu : values) {
            zzhsg[zzdyu.id] = zzdyu;
        }
    }
}
