package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@KeepName
@KeepForSdk
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zac();
    private static final Builder zamd = new zab(new String[0], (String) null);
    private boolean mClosed;
    @SafeParcelable.VersionField(id = 1000)
    private final int zalk;
    @SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] zalv;
    private Bundle zalw;
    @SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] zalx;
    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zaly;
    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final Bundle zalz;
    private int[] zama;
    private int zamb;
    private boolean zamc;

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public static class zaa extends RuntimeException {
        public zaa(String str) {
            super(str);
        }
    }

    @SafeParcelable.Constructor
    DataHolder(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.mClosed = false;
        this.zamc = true;
        this.zalk = i;
        this.zalv = strArr;
        this.zalx = cursorWindowArr;
        this.zaly = i2;
        this.zalz = bundle;
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public static class Builder {
        /* access modifiers changed from: private */
        public final String[] zalv;
        /* access modifiers changed from: private */
        public final ArrayList<HashMap<String, Object>> zame;
        private final String zamf;
        private final HashMap<Object, Integer> zamg;
        private boolean zamh;
        private String zami;

        private Builder(String[] strArr, String str) {
            this.zalv = (String[]) Preconditions.checkNotNull(strArr);
            this.zame = new ArrayList<>();
            this.zamf = str;
            this.zamg = new HashMap<>();
            this.zamh = false;
            this.zami = null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.common.data.DataHolder.Builder zaa(java.util.HashMap<java.lang.String, java.lang.Object> r5) {
            /*
                r4 = this;
                com.google.android.gms.common.internal.Asserts.checkNotNull(r5)
                java.lang.String r0 = r4.zamf
                r1 = -1
                if (r0 != 0) goto L_0x000a
            L_0x0008:
                r0 = -1
                goto L_0x002f
            L_0x000a:
                java.lang.Object r0 = r5.get(r0)
                if (r0 != 0) goto L_0x0011
                goto L_0x0008
            L_0x0011:
                java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r4.zamg
                java.lang.Object r2 = r2.get(r0)
                java.lang.Integer r2 = (java.lang.Integer) r2
                if (r2 != 0) goto L_0x002b
                java.util.HashMap<java.lang.Object, java.lang.Integer> r2 = r4.zamg
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r3 = r4.zame
                int r3 = r3.size()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.put(r0, r3)
                goto L_0x0008
            L_0x002b:
                int r0 = r2.intValue()
            L_0x002f:
                if (r0 != r1) goto L_0x0037
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r4.zame
                r0.add(r5)
                goto L_0x0041
            L_0x0037:
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r4.zame
                r1.remove(r0)
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r4.zame
                r1.add(r0, r5)
            L_0x0041:
                r5 = 0
                r4.zamh = r5
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.Builder.zaa(java.util.HashMap):com.google.android.gms.common.data.DataHolder$Builder");
        }

        @KeepForSdk
        public Builder withRow(ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap hashMap = new HashMap(contentValues.size());
            for (Map.Entry next : contentValues.valueSet()) {
                hashMap.put((String) next.getKey(), next.getValue());
            }
            return zaa((HashMap<String, Object>) hashMap);
        }

        @KeepForSdk
        public DataHolder build(int i) {
            return new DataHolder(this, i, (Bundle) null, (zab) null);
        }

        @KeepForSdk
        public DataHolder build(int i, Bundle bundle) {
            return new DataHolder(this, i, bundle, -1, (zab) null);
        }

        /* synthetic */ Builder(String[] strArr, String str, zab zab) {
            this(strArr, (String) null);
        }
    }

    @KeepForSdk
    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.mClosed = false;
        this.zamc = true;
        this.zalk = 1;
        this.zalv = (String[]) Preconditions.checkNotNull(strArr);
        this.zalx = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zaly = i;
        this.zalz = bundle;
        zaby();
    }

    private DataHolder(CursorWrapper cursorWrapper, int i, Bundle bundle) {
        this(cursorWrapper.getColumnNames(), zaa(cursorWrapper), i, bundle);
    }

    @KeepForSdk
    public DataHolder(Cursor cursor, int i, Bundle bundle) {
        this(new CursorWrapper(cursor), i, bundle);
    }

    private DataHolder(Builder builder, int i, Bundle bundle) {
        this(builder.zalv, zaa(builder, -1), i, (Bundle) null);
    }

    private DataHolder(Builder builder, int i, Bundle bundle, int i2) {
        this(builder.zalv, zaa(builder, -1), i, bundle);
    }

    public final void zaby() {
        this.zalw = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.zalv;
            if (i2 >= strArr.length) {
                break;
            }
            this.zalw.putInt(strArr[i2], i2);
            i2++;
        }
        this.zama = new int[this.zalx.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zalx;
            if (i < cursorWindowArr.length) {
                this.zama[i] = i3;
                i3 += this.zalx[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.zamb = i3;
                return;
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.zalv, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zalx, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zalk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    @KeepForSdk
    public final int getStatusCode() {
        return this.zaly;
    }

    @KeepForSdk
    public final Bundle getMetadata() {
        return this.zalz;
    }

    /* JADX INFO: finally extract failed */
    private static CursorWindow[] zaa(CursorWrapper cursorWrapper) {
        int i;
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow((CursorWindow) null);
                arrayList.add(window);
                i = window.getNumRows();
            }
            while (i < count && cursorWrapper.moveToPosition(i)) {
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow((CursorWindow) null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(i);
                    cursorWrapper.fillWindow(i, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                i = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
            return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    private static CursorWindow[] zaa(Builder builder, int i) {
        List list;
        if (builder.zalv.length == 0) {
            return new CursorWindow[0];
        }
        if (i < 0 || i >= builder.zame.size()) {
            list = builder.zame;
        } else {
            list = builder.zame.subList(0, i);
        }
        int size = list.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zalv.length);
        CursorWindow cursorWindow2 = cursorWindow;
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            try {
                if (!cursorWindow2.allocRow()) {
                    StringBuilder sb = new StringBuilder(72);
                    sb.append("Allocating additional cursor window for large data set (row ");
                    sb.append(i2);
                    sb.append(")");
                    Log.d("DataHolder", sb.toString());
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i2);
                    cursorWindow2.setNumColumns(builder.zalv.length);
                    arrayList.add(cursorWindow2);
                    if (!cursorWindow2.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList.remove(cursorWindow2);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) list.get(i2);
                boolean z2 = true;
                for (int i3 = 0; i3 < builder.zalv.length && z2; i3++) {
                    String str = builder.zalv[i3];
                    Object obj = map.get(str);
                    if (obj == null) {
                        z2 = cursorWindow2.putNull(i2, i3);
                    } else if (obj instanceof String) {
                        z2 = cursorWindow2.putString((String) obj, i2, i3);
                    } else if (obj instanceof Long) {
                        z2 = cursorWindow2.putLong(((Long) obj).longValue(), i2, i3);
                    } else if (obj instanceof Integer) {
                        z2 = cursorWindow2.putLong((long) ((Integer) obj).intValue(), i2, i3);
                    } else if (obj instanceof Boolean) {
                        z2 = cursorWindow2.putLong(((Boolean) obj).booleanValue() ? 1 : 0, i2, i3);
                    } else if (obj instanceof byte[]) {
                        z2 = cursorWindow2.putBlob((byte[]) obj, i2, i3);
                    } else if (obj instanceof Double) {
                        z2 = cursorWindow2.putDouble(((Double) obj).doubleValue(), i2, i3);
                    } else if (obj instanceof Float) {
                        z2 = cursorWindow2.putDouble((double) ((Float) obj).floatValue(), i2, i3);
                    } else {
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(valueOf).length());
                        sb2.append("Unsupported object for column ");
                        sb2.append(str);
                        sb2.append(": ");
                        sb2.append(valueOf);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                if (z2) {
                    z = false;
                } else if (!z) {
                    StringBuilder sb3 = new StringBuilder(74);
                    sb3.append("Couldn't populate window data for row ");
                    sb3.append(i2);
                    sb3.append(" - allocating new window.");
                    Log.d("DataHolder", sb3.toString());
                    cursorWindow2.freeLastRow();
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i2);
                    cursorWindow2.setNumColumns(builder.zalv.length);
                    arrayList.add(cursorWindow2);
                    i2--;
                    z = true;
                } else {
                    throw new zaa("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                }
                i2++;
            } catch (RuntimeException e) {
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((CursorWindow) arrayList.get(i4)).close();
                }
                throw e;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    private final void zaa(String str, int i) {
        Bundle bundle = this.zalw;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.zamb) {
            throw new CursorIndexOutOfBoundsException(i, this.zamb);
        }
    }

    @KeepForSdk
    public final boolean hasColumn(String str) {
        return this.zalw.containsKey(str);
    }

    @KeepForSdk
    public final long getLong(String str, int i, int i2) {
        zaa(str, i);
        return this.zalx[i2].getLong(i, this.zalw.getInt(str));
    }

    @KeepForSdk
    public final int getInteger(String str, int i, int i2) {
        zaa(str, i);
        return this.zalx[i2].getInt(i, this.zalw.getInt(str));
    }

    @KeepForSdk
    public final String getString(String str, int i, int i2) {
        zaa(str, i);
        return this.zalx[i2].getString(i, this.zalw.getInt(str));
    }

    @KeepForSdk
    public final boolean getBoolean(String str, int i, int i2) {
        zaa(str, i);
        return Long.valueOf(this.zalx[i2].getLong(i, this.zalw.getInt(str))).longValue() == 1;
    }

    public final float zaa(String str, int i, int i2) {
        zaa(str, i);
        return this.zalx[i2].getFloat(i, this.zalw.getInt(str));
    }

    public final double zab(String str, int i, int i2) {
        zaa(str, i);
        return this.zalx[i2].getDouble(i, this.zalw.getInt(str));
    }

    @KeepForSdk
    public final byte[] getByteArray(String str, int i, int i2) {
        zaa(str, i);
        return this.zalx[i2].getBlob(i, this.zalw.getInt(str));
    }

    public final void zaa(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        zaa(str, i);
        this.zalx[i2].copyStringToBuffer(i, this.zalw.getInt(str), charArrayBuffer);
    }

    @KeepForSdk
    public final boolean hasNull(String str, int i, int i2) {
        zaa(str, i);
        return this.zalx[i2].isNull(i, this.zalw.getInt(str));
    }

    @KeepForSdk
    public final int getCount() {
        return this.zamb;
    }

    @KeepForSdk
    public final int getWindowIndex(int i) {
        int i2 = 0;
        Preconditions.checkState(i >= 0 && i < this.zamb);
        while (true) {
            int[] iArr = this.zama;
            if (i2 >= iArr.length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == this.zama.length ? i2 - 1 : i2;
    }

    @KeepForSdk
    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mClosed;
        }
        return z;
    }

    @KeepForSdk
    public final void close() {
        synchronized (this) {
            if (!this.mClosed) {
                this.mClosed = true;
                for (CursorWindow close : this.zalx) {
                    close.close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.zamc && this.zalx.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, (String) null, (zab) null);
    }

    @KeepForSdk
    public static DataHolder empty(int i) {
        return new DataHolder(zamd, i, (Bundle) null);
    }

    /* synthetic */ DataHolder(Builder builder, int i, Bundle bundle, zab zab) {
        this(builder, i, (Bundle) null);
    }

    /* synthetic */ DataHolder(Builder builder, int i, Bundle bundle, int i2, zab zab) {
        this(builder, i, bundle, -1);
    }
}
