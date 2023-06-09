package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public abstract class FastJsonResponse {

    @ShowFirstParty
    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public interface FieldConverter<I, O> {
        O convert(I i);

        I convertBack(O o);

        int zach();

        int zaci();
    }

    @KeepForSdk
    public abstract Map<String, Field<?, ?>> getFieldMappings();

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract Object getValueObject(String str);

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract boolean isPrimitiveFieldSet(String str);

    /* access modifiers changed from: protected */
    @KeepForSdk
    public boolean isFieldSet(Field field) {
        if (field.zaqj != 11) {
            return isPrimitiveFieldSet(field.zaql);
        }
        if (field.zaqk) {
            String str = field.zaql;
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        String str2 = field.zaql;
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    @ShowFirstParty
    @SafeParcelable.Class(creator = "FieldCreator")
    @VisibleForTesting
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();
        @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
        private final int zalk;
        @SafeParcelable.Field(getter = "getTypeIn", id = 2)
        protected final int zaqh;
        @SafeParcelable.Field(getter = "isTypeInArray", id = 3)
        protected final boolean zaqi;
        @SafeParcelable.Field(getter = "getTypeOut", id = 4)
        protected final int zaqj;
        @SafeParcelable.Field(getter = "isTypeOutArray", id = 5)
        protected final boolean zaqk;
        @SafeParcelable.Field(getter = "getOutputFieldName", id = 6)
        protected final String zaql;
        @SafeParcelable.Field(getter = "getSafeParcelableFieldId", id = 7)
        protected final int zaqm;
        protected final Class<? extends FastJsonResponse> zaqn;
        @SafeParcelable.Field(getter = "getConcreteTypeName", id = 8)
        private final String zaqo;
        private zal zaqp;
        /* access modifiers changed from: private */
        @SafeParcelable.Field(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        public FieldConverter<I, O> zaqq;

        @SafeParcelable.Constructor
        Field(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) int i4, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) zaa zaa) {
            this.zalk = i;
            this.zaqh = i2;
            this.zaqi = z;
            this.zaqj = i3;
            this.zaqk = z2;
            this.zaql = str;
            this.zaqm = i4;
            if (str2 == null) {
                this.zaqn = null;
                this.zaqo = null;
            } else {
                this.zaqn = SafeParcelResponse.class;
                this.zaqo = str2;
            }
            if (zaa == null) {
                this.zaqq = null;
            } else {
                this.zaqq = zaa.zacg();
            }
        }

        private Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends FastJsonResponse> cls, FieldConverter<I, O> fieldConverter) {
            this.zalk = 1;
            this.zaqh = i;
            this.zaqi = z;
            this.zaqj = i2;
            this.zaqk = z2;
            this.zaql = str;
            this.zaqm = i3;
            this.zaqn = cls;
            if (cls == null) {
                this.zaqo = null;
            } else {
                this.zaqo = cls.getCanonicalName();
            }
            this.zaqq = fieldConverter;
        }

        public final Field<I, O> zacj() {
            return new Field(this.zalk, this.zaqh, this.zaqi, this.zaqj, this.zaqk, this.zaql, this.zaqm, this.zaqo, zacm());
        }

        @KeepForSdk
        public int getSafeParcelableFieldId() {
            return this.zaqm;
        }

        private final String zack() {
            String str = this.zaqo;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final boolean zacl() {
            return this.zaqq != null;
        }

        public final void zaa(zal zal) {
            this.zaqp = zal;
        }

        private final zaa zacm() {
            FieldConverter<I, O> fieldConverter = this.zaqq;
            if (fieldConverter == null) {
                return null;
            }
            return zaa.zaa(fieldConverter);
        }

        public final FastJsonResponse zacn() throws InstantiationException, IllegalAccessException {
            Class<? extends FastJsonResponse> cls = this.zaqn;
            if (cls != SafeParcelResponse.class) {
                return (FastJsonResponse) cls.newInstance();
            }
            Preconditions.checkNotNull(this.zaqp, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.zaqp, this.zaqo);
        }

        public final Map<String, Field<?, ?>> zaco() {
            Preconditions.checkNotNull(this.zaqo);
            Preconditions.checkNotNull(this.zaqp);
            return this.zaqp.zai(this.zaqo);
        }

        public final O convert(I i) {
            return this.zaqq.convert(i);
        }

        public final I convertBack(O o) {
            return this.zaqq.convertBack(o);
        }

        @KeepForSdk
        @VisibleForTesting
        public static Field<Integer, Integer> forInteger(String str, int i) {
            return new Field(0, false, 0, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        @KeepForSdk
        public static Field<Long, Long> forLong(String str, int i) {
            return new Field(2, false, 2, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        @KeepForSdk
        public static Field<Float, Float> forFloat(String str, int i) {
            return new Field(3, false, 3, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        @KeepForSdk
        public static Field<Double, Double> forDouble(String str, int i) {
            return new Field(4, false, 4, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        @KeepForSdk
        public static Field<Boolean, Boolean> forBoolean(String str, int i) {
            return new Field(6, false, 6, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        @KeepForSdk
        public static Field<String, String> forString(String str, int i) {
            return new Field(7, false, 7, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        @KeepForSdk
        public static Field<ArrayList<String>, ArrayList<String>> forStrings(String str, int i) {
            return new Field(7, true, 7, true, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        @KeepForSdk
        @VisibleForTesting
        public static Field<byte[], byte[]> forBase64(String str, int i) {
            return new Field(8, false, 8, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        @KeepForSdk
        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(String str, int i) {
            return new Field(10, false, 10, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        @KeepForSdk
        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(String str, int i, Class<T> cls) {
            return new Field(11, false, 11, false, str, i, cls, (FieldConverter) null);
        }

        @KeepForSdk
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(String str, int i, Class<T> cls) {
            return new Field(11, true, 11, true, str, i, cls, (FieldConverter) null);
        }

        @KeepForSdk
        public static Field withConverter(String str, int i, FieldConverter<?, ?> fieldConverter, boolean z) {
            return new Field(fieldConverter.zach(), z, fieldConverter.zaci(), false, str, i, (Class<? extends FastJsonResponse>) null, fieldConverter);
        }

        public void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.zalk);
            SafeParcelWriter.writeInt(parcel, 2, this.zaqh);
            SafeParcelWriter.writeBoolean(parcel, 3, this.zaqi);
            SafeParcelWriter.writeInt(parcel, 4, this.zaqj);
            SafeParcelWriter.writeBoolean(parcel, 5, this.zaqk);
            SafeParcelWriter.writeString(parcel, 6, this.zaql, false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            SafeParcelWriter.writeString(parcel, 8, zack(), false);
            SafeParcelWriter.writeParcelable(parcel, 9, zacm(), i, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        public String toString() {
            Objects.ToStringHelper add = Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.zalk)).add("typeIn", Integer.valueOf(this.zaqh)).add("typeInArray", Boolean.valueOf(this.zaqi)).add("typeOut", Integer.valueOf(this.zaqj)).add("typeOutArray", Boolean.valueOf(this.zaqk)).add("outputFieldName", this.zaql).add("safeParcelFieldId", Integer.valueOf(this.zaqm)).add("concreteTypeName", zack());
            Class<? extends FastJsonResponse> cls = this.zaqn;
            if (cls != null) {
                add.add("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.zaqq;
            if (fieldConverter != null) {
                add.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return add.toString();
        }
    }

    private final <I, O> void zaa(Field<I, O> field, I i) {
        String str = field.zaql;
        O convert = field.convert(i);
        switch (field.zaqj) {
            case 0:
                if (zaa(str, convert)) {
                    setIntegerInternal(field, str, ((Integer) convert).intValue());
                    return;
                }
                return;
            case 1:
                zaa((Field<?, ?>) field, str, (BigInteger) convert);
                return;
            case 2:
                if (zaa(str, convert)) {
                    setLongInternal(field, str, ((Long) convert).longValue());
                    return;
                }
                return;
            case 4:
                if (zaa(str, convert)) {
                    zaa((Field<?, ?>) field, str, ((Double) convert).doubleValue());
                    return;
                }
                return;
            case 5:
                zaa((Field<?, ?>) field, str, (BigDecimal) convert);
                return;
            case 6:
                if (zaa(str, convert)) {
                    setBooleanInternal(field, str, ((Boolean) convert).booleanValue());
                    return;
                }
                return;
            case 7:
                setStringInternal(field, str, (String) convert);
                return;
            case 8:
            case 9:
                if (zaa(str, convert)) {
                    setDecodedBytesInternal(field, str, (byte[]) convert);
                    return;
                }
                return;
            default:
                int i2 = field.zaqj;
                StringBuilder sb = new StringBuilder(44);
                sb.append("Unsupported type for conversion: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    protected static <O, I> I zab(Field<I, O> field, Object obj) {
        return field.zaqq != null ? field.convertBack(obj) : obj;
    }

    public final <O> void zaa(Field<Integer, O> field, int i) {
        if (field.zaqq != null) {
            zaa(field, Integer.valueOf(i));
        } else {
            setIntegerInternal(field, field.zaql, i);
        }
    }

    public final <O> void zaa(Field<ArrayList<Integer>, O> field, ArrayList<Integer> arrayList) {
        if (field.zaqq != null) {
            zaa(field, arrayList);
        } else {
            zaa((Field<?, ?>) field, field.zaql, arrayList);
        }
    }

    public final <O> void zaa(Field<BigInteger, O> field, BigInteger bigInteger) {
        if (field.zaqq != null) {
            zaa(field, bigInteger);
        } else {
            zaa((Field<?, ?>) field, field.zaql, bigInteger);
        }
    }

    public final <O> void zab(Field<ArrayList<BigInteger>, O> field, ArrayList<BigInteger> arrayList) {
        if (field.zaqq != null) {
            zaa(field, arrayList);
        } else {
            zab(field, field.zaql, arrayList);
        }
    }

    public final <O> void zaa(Field<Long, O> field, long j) {
        if (field.zaqq != null) {
            zaa(field, Long.valueOf(j));
        } else {
            setLongInternal(field, field.zaql, j);
        }
    }

    public final <O> void zac(Field<ArrayList<Long>, O> field, ArrayList<Long> arrayList) {
        if (field.zaqq != null) {
            zaa(field, arrayList);
        } else {
            zac(field, field.zaql, arrayList);
        }
    }

    public final <O> void zaa(Field<Float, O> field, float f) {
        if (field.zaqq != null) {
            zaa(field, Float.valueOf(f));
        } else {
            zaa((Field<?, ?>) field, field.zaql, f);
        }
    }

    public final <O> void zad(Field<ArrayList<Float>, O> field, ArrayList<Float> arrayList) {
        if (field.zaqq != null) {
            zaa(field, arrayList);
        } else {
            zad(field, field.zaql, arrayList);
        }
    }

    public final <O> void zaa(Field<Double, O> field, double d) {
        if (field.zaqq != null) {
            zaa(field, Double.valueOf(d));
        } else {
            zaa((Field<?, ?>) field, field.zaql, d);
        }
    }

    public final <O> void zae(Field<ArrayList<Double>, O> field, ArrayList<Double> arrayList) {
        if (field.zaqq != null) {
            zaa(field, arrayList);
        } else {
            zae(field, field.zaql, arrayList);
        }
    }

    public final <O> void zaa(Field<BigDecimal, O> field, BigDecimal bigDecimal) {
        if (field.zaqq != null) {
            zaa(field, bigDecimal);
        } else {
            zaa((Field<?, ?>) field, field.zaql, bigDecimal);
        }
    }

    public final <O> void zaf(Field<ArrayList<BigDecimal>, O> field, ArrayList<BigDecimal> arrayList) {
        if (field.zaqq != null) {
            zaa(field, arrayList);
        } else {
            zaf(field, field.zaql, arrayList);
        }
    }

    public final <O> void zaa(Field<Boolean, O> field, boolean z) {
        if (field.zaqq != null) {
            zaa(field, Boolean.valueOf(z));
        } else {
            setBooleanInternal(field, field.zaql, z);
        }
    }

    public final <O> void zag(Field<ArrayList<Boolean>, O> field, ArrayList<Boolean> arrayList) {
        if (field.zaqq != null) {
            zaa(field, arrayList);
        } else {
            zag(field, field.zaql, arrayList);
        }
    }

    public final <O> void zaa(Field<String, O> field, String str) {
        if (field.zaqq != null) {
            zaa(field, str);
        } else {
            setStringInternal(field, field.zaql, str);
        }
    }

    public final <O> void zah(Field<ArrayList<String>, O> field, ArrayList<String> arrayList) {
        if (field.zaqq != null) {
            zaa(field, arrayList);
        } else {
            setStringsInternal(field, field.zaql, arrayList);
        }
    }

    public final <O> void zaa(Field<byte[], O> field, byte[] bArr) {
        if (field.zaqq != null) {
            zaa(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.zaql, bArr);
        }
    }

    public final <O> void zaa(Field<Map<String, String>, O> field, Map<String, String> map) {
        if (field.zaqq != null) {
            zaa(field, map);
        } else {
            setStringMapInternal(field, field.zaql, map);
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public void setIntegerInternal(Field<?, ?> field, String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    /* access modifiers changed from: protected */
    public void zaa(Field<?, ?> field, String str, ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    /* access modifiers changed from: protected */
    public void zaa(Field<?, ?> field, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    /* access modifiers changed from: protected */
    public void zab(Field<?, ?> field, String str, ArrayList<BigInteger> arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public void setLongInternal(Field<?, ?> field, String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    /* access modifiers changed from: protected */
    public void zac(Field<?, ?> field, String str, ArrayList<Long> arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    /* access modifiers changed from: protected */
    public void zaa(Field<?, ?> field, String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    /* access modifiers changed from: protected */
    public void zad(Field<?, ?> field, String str, ArrayList<Float> arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    /* access modifiers changed from: protected */
    public void zaa(Field<?, ?> field, String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    /* access modifiers changed from: protected */
    public void zae(Field<?, ?> field, String str, ArrayList<Double> arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    /* access modifiers changed from: protected */
    public void zaa(Field<?, ?> field, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    /* access modifiers changed from: protected */
    public void zaf(Field<?, ?> field, String str, ArrayList<BigDecimal> arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public void setBooleanInternal(Field<?, ?> field, String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    /* access modifiers changed from: protected */
    public void zag(Field<?, ?> field, String str, ArrayList<Boolean> arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public void setStringInternal(Field<?, ?> field, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public void setStringsInternal(Field<?, ?> field, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public void setDecodedBytesInternal(Field<?, ?> field, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public void setStringMapInternal(Field<?, ?> field, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    private static <O> boolean zaa(String str, O o) {
        if (o != null) {
            return true;
        }
        if (!Log.isLoggable("FastJsonResponse", 6)) {
            return false;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
        sb.append("Output field (");
        sb.append(str);
        sb.append(") has a null value, but expected a primitive");
        Log.e("FastJsonResponse", sb.toString());
        return false;
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeInternal(Field<?, ?> field, String str, T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(Field<?, ?> field, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String next : fieldMappings.keySet()) {
            Field field = fieldMappings.get(next);
            if (isFieldSet(field)) {
                Object zab = zab(field, getFieldValue(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(next);
                sb.append("\":");
                if (zab != null) {
                    switch (field.zaqj) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.encode((byte[]) zab));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.encodeUrlSafe((byte[]) zab));
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.writeStringMapToJson(sb, (HashMap) zab);
                            break;
                        default:
                            if (!field.zaqi) {
                                zaa(sb, field, zab);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) zab;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        zaa(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public Object getFieldValue(Field field) {
        String str = field.zaql;
        if (field.zaqn == null) {
            return getValueObject(field.zaql);
        }
        Preconditions.checkState(getValueObject(field.zaql) == null, "Concrete field shouldn't be value object: %s", field.zaql);
        boolean z = field.zaqk;
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void zaa(StringBuilder sb, Field field, Object obj) {
        if (field.zaqh == 11) {
            sb.append(((FastJsonResponse) field.zaqn.cast(obj)).toString());
        } else if (field.zaqh == 7) {
            sb.append("\"");
            sb.append(JsonUtils.escapeString((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }
}
