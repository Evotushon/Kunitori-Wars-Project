package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbzg {
    public static final zzbzg zzfpz = new zzbzi().zzala();
    @Nullable
    private final zzads zzfps;
    @Nullable
    private final zzadr zzfpt;
    @Nullable
    private final zzaeg zzfpu;
    @Nullable
    private final zzaef zzfpv;
    @Nullable
    private final zzaht zzfpw;
    private final SimpleArrayMap<String, zzady> zzfpx;
    private final SimpleArrayMap<String, zzadx> zzfpy;

    @Nullable
    public final zzads zzakt() {
        return this.zzfps;
    }

    @Nullable
    public final zzadr zzaku() {
        return this.zzfpt;
    }

    @Nullable
    public final zzaeg zzakv() {
        return this.zzfpu;
    }

    @Nullable
    public final zzaef zzakw() {
        return this.zzfpv;
    }

    @Nullable
    public final zzaht zzakx() {
        return this.zzfpw;
    }

    @Nullable
    public final zzady zzga(String str) {
        return this.zzfpx.get(str);
    }

    @Nullable
    public final zzadx zzgb(String str) {
        return this.zzfpy.get(str);
    }

    public final ArrayList<String> zzaky() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.zzfpu != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzfps != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzfpt != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.zzfpx.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzfpw != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> zzakz() {
        ArrayList<String> arrayList = new ArrayList<>(this.zzfpx.size());
        for (int i = 0; i < this.zzfpx.size(); i++) {
            arrayList.add(this.zzfpx.keyAt(i));
        }
        return arrayList;
    }

    private zzbzg(zzbzi zzbzi) {
        this.zzfps = zzbzi.zzfps;
        this.zzfpt = zzbzi.zzfpt;
        this.zzfpu = zzbzi.zzfpu;
        this.zzfpx = new SimpleArrayMap<>(zzbzi.zzfpx);
        this.zzfpy = new SimpleArrayMap<>(zzbzi.zzfpy);
        this.zzfpv = zzbzi.zzfpv;
        this.zzfpw = zzbzi.zzfpw;
    }
}
