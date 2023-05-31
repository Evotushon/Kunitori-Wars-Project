package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzxr {
    private final int zzabv;
    private final int zzabw;
    private final String zzabx;
    private final boolean zzbkp;
    private final int zzccn;
    private final String zzccq;
    private final String zzccs;
    private final Bundle zzccu;
    private final String zzccw;
    private final boolean zzccy;
    private final List<String> zzccz;
    private final Bundle zzcet;
    private final AdInfo zzcex;
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> zzcey;
    private final SearchAdRequest zzcez;
    private final Set<String> zzcfa;
    private final Set<String> zzcfb;
    private final Date zzmg;
    private final Set<String> zzmi;
    private final Location zzmk;

    public zzxr(zzxq zzxq) {
        this(zzxq, (SearchAdRequest) null);
    }

    public zzxr(zzxq zzxq, SearchAdRequest searchAdRequest) {
        this.zzmg = zzxq.zzmg;
        this.zzccs = zzxq.zzccs;
        this.zzccz = zzxq.zzccz;
        this.zzccn = zzxq.zzccn;
        this.zzmi = Collections.unmodifiableSet(zzxq.zzces);
        this.zzmk = zzxq.zzmk;
        this.zzbkp = zzxq.zzbkp;
        this.zzcet = zzxq.zzcet;
        this.zzcey = Collections.unmodifiableMap(zzxq.zzceu);
        this.zzccq = zzxq.zzccq;
        this.zzccw = zzxq.zzccw;
        this.zzcez = searchAdRequest;
        this.zzabv = zzxq.zzabv;
        this.zzcfa = Collections.unmodifiableSet(zzxq.zzcev);
        this.zzccu = zzxq.zzccu;
        this.zzcfb = Collections.unmodifiableSet(zzxq.zzcew);
        this.zzccy = zzxq.zzccy;
        this.zzcex = zzxq.zzcex;
        this.zzabw = zzxq.zzabw;
        this.zzabx = zzxq.zzabx;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zzmg;
    }

    public final String getContentUrl() {
        return this.zzccs;
    }

    public final List<String> zzpp() {
        return new ArrayList(this.zzccz);
    }

    @Deprecated
    public final int getGender() {
        return this.zzccn;
    }

    public final Set<String> getKeywords() {
        return this.zzmi;
    }

    public final Location getLocation() {
        return this.zzmk;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzbkp;
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (NetworkExtras) this.zzcey.get(cls);
    }

    public final Bundle getNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls) {
        return this.zzcet.getBundle(cls.getName());
    }

    public final Bundle getCustomEventExtrasBundle(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.zzcet.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final String getPublisherProvidedId() {
        return this.zzccq;
    }

    public final String zzpq() {
        return this.zzccw;
    }

    public final SearchAdRequest zzpr() {
        return this.zzcez;
    }

    public final boolean isTestDevice(Context context) {
        RequestConfiguration requestConfiguration = zzxu.zzpy().getRequestConfiguration();
        zzvh.zzoz();
        String zzbl = zzayx.zzbl(context);
        return this.zzcfa.contains(zzbl) || requestConfiguration.getTestDeviceIds().contains(zzbl);
    }

    public final Map<Class<? extends NetworkExtras>, NetworkExtras> zzps() {
        return this.zzcey;
    }

    public final Bundle zzpt() {
        return this.zzcet;
    }

    public final int zzpu() {
        return this.zzabv;
    }

    public final Bundle getCustomTargeting() {
        return this.zzccu;
    }

    public final Set<String> zzpv() {
        return this.zzcfb;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzccy;
    }

    @Nullable
    public final AdInfo zzpw() {
        return this.zzcex;
    }

    public final int zzpx() {
        return this.zzabw;
    }

    @Nullable
    public final String getMaxAdContentRating() {
        return this.zzabx;
    }
}
