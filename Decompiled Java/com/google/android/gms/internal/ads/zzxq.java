package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzxq {
    /* access modifiers changed from: private */
    public int zzabv = -1;
    /* access modifiers changed from: private */
    public int zzabw = -1;
    /* access modifiers changed from: private */
    public String zzabx;
    /* access modifiers changed from: private */
    public boolean zzbkp = false;
    /* access modifiers changed from: private */
    public int zzccn = -1;
    /* access modifiers changed from: private */
    public String zzccq;
    /* access modifiers changed from: private */
    public String zzccs;
    /* access modifiers changed from: private */
    public final Bundle zzccu = new Bundle();
    /* access modifiers changed from: private */
    public String zzccw;
    /* access modifiers changed from: private */
    public boolean zzccy;
    /* access modifiers changed from: private */
    public final List<String> zzccz = new ArrayList();
    /* access modifiers changed from: private */
    public final HashSet<String> zzces = new HashSet<>();
    /* access modifiers changed from: private */
    public final Bundle zzcet = new Bundle();
    /* access modifiers changed from: private */
    public final HashMap<Class<? extends NetworkExtras>, NetworkExtras> zzceu = new HashMap<>();
    /* access modifiers changed from: private */
    public final HashSet<String> zzcev = new HashSet<>();
    /* access modifiers changed from: private */
    public final HashSet<String> zzcew = new HashSet<>();
    /* access modifiers changed from: private */
    public AdInfo zzcex;
    /* access modifiers changed from: private */
    public Date zzmg;
    /* access modifiers changed from: private */
    public Location zzmk;

    public final void zzcg(String str) {
        this.zzces.add(str);
    }

    @Deprecated
    public final void zza(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            zza(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.zzceu.put(networkExtras.getClass(), networkExtras);
        }
    }

    public final void zza(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        this.zzcet.putBundle(cls.getName(), bundle);
    }

    public final void zzb(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.zzcet.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.zzcet.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.zzcet.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    public final void zzch(String str) {
        this.zzcev.add(str);
    }

    public final void zzci(String str) {
        this.zzcev.remove(str);
    }

    @Deprecated
    public final void zza(Date date) {
        this.zzmg = date;
    }

    public final void zzcj(String str) {
        this.zzccs = str;
    }

    public final void zzb(List<String> list) {
        this.zzccz.clear();
        for (String next : list) {
            if (TextUtils.isEmpty(next)) {
                zzazh.zzfa("neighboring content URL should not be null or empty");
            } else {
                this.zzccz.add(next);
            }
        }
    }

    @Deprecated
    public final void zzck(int i) {
        this.zzccn = i;
    }

    public final void zza(Location location) {
        this.zzmk = location;
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzbkp = z;
    }

    public final void zzck(String str) {
        this.zzccq = str;
    }

    public final void zzcl(String str) {
        this.zzccw = str;
    }

    @Deprecated
    public final void zzz(boolean z) {
        this.zzabv = z ? 1 : 0;
    }

    public final void zze(String str, String str2) {
        this.zzccu.putString(str, str2);
    }

    public final void zzcm(String str) {
        this.zzcew.add(str);
    }

    @Deprecated
    public final void zzaa(boolean z) {
        this.zzccy = z;
    }

    public final void zza(AdInfo adInfo) {
        this.zzcex = adInfo;
    }

    @Deprecated
    public final void zzcl(int i) {
        if (i == -1 || i == 0 || i == 1) {
            this.zzabw = i;
        }
    }

    @Deprecated
    public final void zzcn(String str) {
        if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
            this.zzabx = str;
        }
    }
}
