package com.google.android.gms.ads.initialization;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public interface AdapterStatus {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public enum State {
        NOT_READY,
        READY
    }

    String getDescription();

    State getInitializationState();

    int getLatency();
}
