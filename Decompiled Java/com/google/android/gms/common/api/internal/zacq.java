package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.zad;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zacq implements IBinder.DeathRecipient, zacs {
    private final WeakReference<BasePendingResult<?>> zalg;
    private final WeakReference<zad> zalh;
    private final WeakReference<IBinder> zali;

    private zacq(BasePendingResult<?> basePendingResult, zad zad, IBinder iBinder) {
        this.zalh = new WeakReference<>(zad);
        this.zalg = new WeakReference<>(basePendingResult);
        this.zali = new WeakReference<>(iBinder);
    }

    public final void zac(BasePendingResult<?> basePendingResult) {
        zabw();
    }

    public final void binderDied() {
        zabw();
    }

    private final void zabw() {
        BasePendingResult basePendingResult = (BasePendingResult) this.zalg.get();
        zad zad = (zad) this.zalh.get();
        if (!(zad == null || basePendingResult == null)) {
            zad.remove(basePendingResult.zal().intValue());
        }
        IBinder iBinder = (IBinder) this.zali.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    /* synthetic */ zacq(BasePendingResult basePendingResult, zad zad, IBinder iBinder, zacr zacr) {
        this(basePendingResult, (zad) null, iBinder);
    }
}
