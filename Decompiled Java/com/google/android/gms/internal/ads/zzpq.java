package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.WeakHashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzpq {
    private final Object lock = new Object();
    private final zzazo zzblu;
    private final WeakHashMap<Object, Object> zzboc = new WeakHashMap<>();
    private final ArrayList<Object> zzbod = new ArrayList<>();
    private final zzaja zzboe;
    private final Context zzyz;

    public zzpq(Context context, zzazo zzazo) {
        this.zzyz = context.getApplicationContext();
        this.zzblu = zzazo;
        this.zzboe = new zzaja(context.getApplicationContext(), zzazo, (String) zzvh.zzpd().zzd(zzzx.zzchb));
    }
}
