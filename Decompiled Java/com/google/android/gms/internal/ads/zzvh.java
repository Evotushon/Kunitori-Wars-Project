package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import java.util.Random;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzvh {
    private static zzvh zzcef = new zzvh();
    private final zzayx zzceg;
    private final zzus zzceh;
    private final String zzcei;
    private final zzzo zzcej;
    private final zzzq zzcek;
    private final zzzt zzcel;
    private final zzazo zzcem;
    private final Random zzcen;
    private final WeakHashMap<QueryInfo, String> zzceo;

    protected zzvh() {
        this(new zzayx(), new zzus(new zzuf(), new zzuc(), new zzyh(), new zzaev(), new zzasf(), new zzatj(), new zzapc(), new zzaeu()), new zzzo(), new zzzq(), new zzzt(), zzayx.zzxk(), new zzazo(0, 20089000, true), new Random(), new WeakHashMap());
    }

    private zzvh(zzayx zzayx, zzus zzus, zzzo zzzo, zzzq zzzq, zzzt zzzt, String str, zzazo zzazo, Random random, WeakHashMap<QueryInfo, String> weakHashMap) {
        this.zzceg = zzayx;
        this.zzceh = zzus;
        this.zzcej = zzzo;
        this.zzcek = zzzq;
        this.zzcel = zzzt;
        this.zzcei = str;
        this.zzcem = zzazo;
        this.zzcen = random;
        this.zzceo = weakHashMap;
    }

    public static zzayx zzoz() {
        return zzcef.zzceg;
    }

    public static zzus zzpa() {
        return zzcef.zzceh;
    }

    public static zzzq zzpb() {
        return zzcef.zzcek;
    }

    public static zzzo zzpc() {
        return zzcef.zzcej;
    }

    public static zzzt zzpd() {
        return zzcef.zzcel;
    }

    public static String zzpe() {
        return zzcef.zzcei;
    }

    public static zzazo zzpf() {
        return zzcef.zzcem;
    }

    public static Random zzpg() {
        return zzcef.zzcen;
    }

    public static WeakHashMap<QueryInfo, String> zzph() {
        return zzcef.zzceo;
    }
}
