package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzccp extends zzadm {
    private final zzbyz zzfne;
    /* access modifiers changed from: private */
    public zzbyo zzfqg;
    private zzbzv zzftg;
    private final Context zzyz;

    public zzccp(Context context, zzbyz zzbyz, zzbzv zzbzv, zzbyo zzbyo) {
        this.zzyz = context;
        this.zzfne = zzbyz;
        this.zzftg = zzbzv;
        this.zzfqg = zzbyo;
    }

    public final IObjectWrapper zzrj() {
        return null;
    }

    public final String zzcu(String str) {
        return this.zzfne.zzako().get(str);
    }

    public final zzacr zzcv(String str) {
        return this.zzfne.zzakm().get(str);
    }

    public final List<String> getAvailableAssetNames() {
        SimpleArrayMap<String, zzacd> zzakm = this.zzfne.zzakm();
        SimpleArrayMap<String, String> zzako = this.zzfne.zzako();
        String[] strArr = new String[(zzakm.size() + zzako.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < zzakm.size()) {
            strArr[i3] = zzakm.keyAt(i2);
            i2++;
            i3++;
        }
        while (i < zzako.size()) {
            strArr[i3] = zzako.keyAt(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    public final String getCustomTemplateId() {
        return this.zzfne.getCustomTemplateId();
    }

    public final void performClick(String str) {
        zzbyo zzbyo = this.zzfqg;
        if (zzbyo != null) {
            zzbyo.zzfv(str);
        }
    }

    public final void recordImpression() {
        zzbyo zzbyo = this.zzfqg;
        if (zzbyo != null) {
            zzbyo.zzajs();
        }
    }

    public final zzxj getVideoController() {
        return this.zzfne.getVideoController();
    }

    public final void destroy() {
        zzbyo zzbyo = this.zzfqg;
        if (zzbyo != null) {
            zzbyo.destroy();
        }
        this.zzfqg = null;
        this.zzftg = null;
    }

    public final IObjectWrapper zzro() {
        return ObjectWrapper.wrap(this.zzyz);
    }

    public final boolean zzp(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup)) {
            return false;
        }
        zzbzv zzbzv = this.zzftg;
        if (!(zzbzv != null && zzbzv.zza((ViewGroup) unwrap))) {
            return false;
        }
        this.zzfne.zzakj().zza((zzacf) new zzcco(this));
        return true;
    }

    public final boolean zzrp() {
        zzbyo zzbyo = this.zzfqg;
        if ((zzbyo == null || zzbyo.zzaka()) && this.zzfne.zzakk() != null && this.zzfne.zzakj() == null) {
            return true;
        }
        return false;
    }

    public final boolean zzrq() {
        IObjectWrapper zzakl = this.zzfne.zzakl();
        if (zzakl != null) {
            zzq.zzlk().zzab(zzakl);
            return true;
        }
        zzawf.zzfa("Trying to start OMID session before creation.");
        return false;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) {
        zzbyo zzbyo;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof View) && this.zzfne.zzakl() != null && (zzbyo = this.zzfqg) != null) {
            zzbyo.zzz((View) unwrap);
        }
    }

    public final void zzrr() {
        String zzakn = this.zzfne.zzakn();
        if ("Google".equals(zzakn)) {
            zzawf.zzfa("Illegal argument specified for omid partner name.");
            return;
        }
        zzbyo zzbyo = this.zzfqg;
        if (zzbyo != null) {
            zzbyo.zzg(zzakn, false);
        }
    }
}
