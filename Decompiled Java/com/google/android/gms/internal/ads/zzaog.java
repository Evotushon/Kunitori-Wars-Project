package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzb;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaog implements MediationInterstitialAdapter {
    private Uri uri;
    /* access modifiers changed from: private */
    public Activity zzdfz;
    /* access modifiers changed from: private */
    public MediationInterstitialListener zzdga;

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzdga = mediationInterstitialListener;
        if (this.zzdga == null) {
            zzazh.zzfa("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            zzazh.zzfa("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzdga.onAdFailedToLoad(this, 0);
        } else {
            if (!(PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzaau.zzl(context))) {
                zzazh.zzfa("Default browser does not support custom tabs. Bailing out.");
                this.zzdga.onAdFailedToLoad(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                zzazh.zzfa("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.zzdga.onAdFailedToLoad(this, 0);
                return;
            }
            this.zzdfz = (Activity) context;
            this.uri = Uri.parse(string);
            this.zzdga.onAdLoaded(this);
        }
    }

    public final void showInterstitial() {
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        build.intent.setData(this.uri);
        zzawo.zzdtx.post(new zzaoi(this, new AdOverlayInfoParcel(new zzb(build.intent), (zztz) null, new zzaoj(this), (zzv) null, new zzazo(0, 0, false))));
        zzq.zzkz().zzvg();
    }

    public final void onDestroy() {
        zzazh.zzeb("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        zzazh.zzeb("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        zzazh.zzeb("Resuming AdMobCustomTabsAdapter adapter.");
    }
}
