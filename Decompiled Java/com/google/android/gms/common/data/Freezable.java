package com.google.android.gms.common.data;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public interface Freezable<T> {
    T freeze();

    boolean isDataValid();
}
