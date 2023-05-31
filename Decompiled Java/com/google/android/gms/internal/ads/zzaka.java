package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaka implements zzaii, zzakb {
    private final zzajy zzdbn;
    private final HashSet<AbstractMap.SimpleEntry<String, zzafz<? super zzajy>>> zzdbo = new HashSet<>();

    public zzaka(zzajy zzajy) {
        this.zzdbn = zzajy;
    }

    public final void zza(String str, Map map) {
        zzail.zza((zzaii) this, str, map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        zzail.zzb(this, str, jSONObject);
    }

    public final void zzb(String str, JSONObject jSONObject) {
        zzail.zza((zzaii) this, str, jSONObject);
    }

    public final void zzj(String str, String str2) {
        zzail.zza((zzaii) this, str, str2);
    }

    public final void zzcz(String str) {
        this.zzdbn.zzcz(str);
    }

    public final void zza(String str, zzafz<? super zzajy> zzafz) {
        this.zzdbn.zza(str, zzafz);
        this.zzdbo.add(new AbstractMap.SimpleEntry(str, zzafz));
    }

    public final void zzb(String str, zzafz<? super zzajy> zzafz) {
        this.zzdbn.zzb(str, zzafz);
        this.zzdbo.remove(new AbstractMap.SimpleEntry(str, zzafz));
    }

    public final void zzsl() {
        Iterator<AbstractMap.SimpleEntry<String, zzafz<? super zzajy>>> it = this.zzdbo.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry next = it.next();
            String valueOf = String.valueOf(((zzafz) next.getValue()).toString());
            zzawf.zzee(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.zzdbn.zzb((String) next.getKey(), (zzafz) next.getValue());
        }
        this.zzdbo.clear();
    }
}
