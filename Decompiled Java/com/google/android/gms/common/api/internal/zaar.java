package com.google.android.gms.common.api.internal;

import androidx.annotation.BinderThread;
import com.google.android.gms.signin.internal.zad;
import com.google.android.gms.signin.internal.zam;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaar extends zad {
    private final WeakReference<zaai> zagn;

    zaar(zaai zaai) {
        this.zagn = new WeakReference<>(zaai);
    }

    @BinderThread
    public final void zab(zam zam) {
        zaai zaai = (zaai) this.zagn.get();
        if (zaai != null) {
            zaai.zafy.zaa((zabf) new zaaq(this, zaai, zaai, zam));
        }
    }
}
