package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzzo {
    private final Collection<zzzi<?>> zzcgm = new ArrayList();
    private final Collection<zzzi<String>> zzcgn = new ArrayList();
    private final Collection<zzzi<String>> zzcgo = new ArrayList();

    public final void zza(zzzi zzzi) {
        this.zzcgm.add(zzzi);
    }

    public final void zzb(zzzi<String> zzzi) {
        this.zzcgn.add(zzzi);
    }

    public final void zzc(zzzi<String> zzzi) {
        this.zzcgo.add(zzzi);
    }

    public final void zza(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzzi next : this.zzcgm) {
            if (next.getSource() == 1) {
                next.zza(editor, next.zzb(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzazh.zzey("Flag Json is null.");
        }
    }

    public final List<String> zzqj() {
        ArrayList arrayList = new ArrayList();
        for (zzzi<String> zzd : this.zzcgn) {
            String str = (String) zzvh.zzpd().zzd(zzd);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzzy.zzqn());
        return arrayList;
    }

    public final List<String> zzqk() {
        List<String> zzqj = zzqj();
        for (zzzi<String> zzd : this.zzcgo) {
            String str = (String) zzvh.zzpd().zzd(zzd);
            if (!TextUtils.isEmpty(str)) {
                zzqj.add(str);
            }
        }
        zzqj.addAll(zzzy.zzqo());
        return zzqj;
    }
}
