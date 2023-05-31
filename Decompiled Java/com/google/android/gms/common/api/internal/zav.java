package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zav<O extends Api.ApiOptions> extends GoogleApi<O> {
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> zaci;
    private final Api.Client zaev;
    private final zaq zaew;
    private final ClientSettings zaex;

    public zav(@NonNull Context context, Api<O> api, Looper looper, @NonNull Api.Client client, @NonNull zaq zaq, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder) {
        super(context, api, looper);
        this.zaev = client;
        this.zaew = zaq;
        this.zaex = clientSettings;
        this.zaci = abstractClientBuilder;
        this.zabp.zaa((GoogleApi<?>) this);
    }

    public final Api.Client zaz() {
        return this.zaev;
    }

    public final Api.Client zaa(Looper looper, GoogleApiManager.zaa<O> zaa) {
        this.zaew.zaa(zaa);
        return this.zaev;
    }

    public final zace zaa(Context context, Handler handler) {
        return new zace(context, handler, this.zaex, this.zaci);
    }
}
