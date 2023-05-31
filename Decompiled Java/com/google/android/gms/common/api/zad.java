package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public abstract class zad {
    private static final Object sLock = new Object();
    @GuardedBy("sLock")
    private static final Map<Object, zad> zaco = new WeakHashMap();

    public abstract void remove(int i);
}
