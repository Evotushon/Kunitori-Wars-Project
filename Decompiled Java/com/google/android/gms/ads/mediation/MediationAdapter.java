package com.google.android.gms.ads.mediation;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public interface MediationAdapter extends MediationExtrasReceiver {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static class zza {
        private int zzejq;

        public final zza zzdf(int i) {
            this.zzejq = 1;
            return this;
        }

        public final Bundle zzacd() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.zzejq);
            return bundle;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
