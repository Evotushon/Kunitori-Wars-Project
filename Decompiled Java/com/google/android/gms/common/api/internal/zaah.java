package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zaah implements zabd {
    /* access modifiers changed from: private */
    public final zabc zafy;
    private boolean zafz = false;

    public zaah(zabc zabc) {
        this.zafy = zabc;
    }

    public final void begin() {
    }

    public final void onConnected(Bundle bundle) {
    }

    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        return execute(t);
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t) {
        try {
            this.zafy.zaej.zahj.zab(t);
            zaau zaau = this.zafy.zaej;
            Api.Client client = zaau.zahd.get(t.getClientKey());
            Preconditions.checkNotNull(client, "Appropriate Api was not requested.");
            if (client.isConnected() || !this.zafy.zaht.containsKey(t.getClientKey())) {
                boolean z = client instanceof SimpleClientAdapter;
                Api.AnyClient anyClient = client;
                if (z) {
                    anyClient = ((SimpleClientAdapter) client).getClient();
                }
                t.run(anyClient);
                return t;
            }
            t.setFailedResult(new Status(17));
            return t;
        } catch (DeadObjectException unused) {
            this.zafy.zaa((zabf) new zaag(this, this));
        }
    }

    public final boolean disconnect() {
        if (this.zafz) {
            return false;
        }
        if (this.zafy.zaej.zaav()) {
            this.zafz = true;
            for (zacn zabt : this.zafy.zaej.zahi) {
                zabt.zabt();
            }
            return false;
        }
        this.zafy.zaf((ConnectionResult) null);
        return true;
    }

    public final void connect() {
        if (this.zafz) {
            this.zafz = false;
            this.zafy.zaa((zabf) new zaaj(this, this));
        }
    }

    public final void onConnectionSuspended(int i) {
        this.zafy.zaf((ConnectionResult) null);
        this.zafy.zahx.zab(i, this.zafz);
    }

    /* access modifiers changed from: package-private */
    public final void zaal() {
        if (this.zafz) {
            this.zafz = false;
            this.zafy.zaej.zahj.release();
            disconnect();
        }
    }
}
