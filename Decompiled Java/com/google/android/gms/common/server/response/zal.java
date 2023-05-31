package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new zam();
    @SafeParcelable.VersionField(id = 1)
    private final int zalk;
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> zarm;
    @SafeParcelable.Field(getter = "getSerializedDictionary", id = 2)
    private final ArrayList<zak> zarn;
    @SafeParcelable.Field(getter = "getRootClassName", id = 3)
    private final String zaro;

    @SafeParcelable.Constructor
    zal(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<zak> arrayList, @SafeParcelable.Param(id = 3) String str) {
        this.zalk = i;
        this.zarn = null;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zak zak = arrayList.get(i2);
            String str2 = zak.className;
            HashMap hashMap2 = new HashMap();
            int size2 = zak.zarl.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zan zan = zak.zarl.get(i3);
                hashMap2.put(zan.zarp, zan.zarq);
            }
            hashMap.put(str2, hashMap2);
        }
        this.zarm = hashMap;
        this.zaro = (String) Preconditions.checkNotNull(str);
        zacp();
    }

    public final void zacp() {
        for (String str : this.zarm.keySet()) {
            Map map = this.zarm.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).zaa(this);
            }
        }
    }

    public final void zacq() {
        for (String next : this.zarm.keySet()) {
            Map map = this.zarm.get(next);
            HashMap hashMap = new HashMap();
            for (String str : map.keySet()) {
                hashMap.put(str, ((FastJsonResponse.Field) map.get(str)).zacj());
            }
            this.zarm.put(next, hashMap);
        }
    }

    public zal(Class<? extends FastJsonResponse> cls) {
        this.zalk = 1;
        this.zarn = null;
        this.zarm = new HashMap<>();
        this.zaro = cls.getCanonicalName();
    }

    public final void zaa(Class<? extends FastJsonResponse> cls, Map<String, FastJsonResponse.Field<?, ?>> map) {
        this.zarm.put(cls.getCanonicalName(), map);
    }

    public final Map<String, FastJsonResponse.Field<?, ?>> zai(String str) {
        return this.zarm.get(str);
    }

    public final boolean zaa(Class<? extends FastJsonResponse> cls) {
        return this.zarm.containsKey(cls.getCanonicalName());
    }

    public final String zacr() {
        return this.zaro;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String next : this.zarm.keySet()) {
            sb.append(next);
            sb.append(":\n");
            Map map = this.zarm.get(next);
            for (String str : map.keySet()) {
                sb.append("  ");
                sb.append(str);
                sb.append(": ");
                sb.append(map.get(str));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zalk);
        ArrayList arrayList = new ArrayList();
        for (String next : this.zarm.keySet()) {
            arrayList.add(new zak(next, this.zarm.get(next)));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.writeString(parcel, 3, this.zaro, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
