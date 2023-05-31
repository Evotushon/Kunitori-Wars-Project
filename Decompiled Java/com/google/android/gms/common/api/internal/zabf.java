package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
abstract class zabf {
    private final zabd zahz;

    protected zabf(zabd zabd) {
        this.zahz = zabd;
    }

    /* access modifiers changed from: protected */
    public abstract void zaak();

    public final void zac(zabc zabc) {
        zabc.zaet.lock();
        try {
            if (zabc.zahu == this.zahz) {
                zaak();
                zabc.zaet.unlock();
            }
        } finally {
            zabc.zaet.unlock();
        }
    }
}
