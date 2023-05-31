package com.google.android.gms.signin;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zaa {
    public static final Api<SignInOptions> API = new Api<>("SignIn.API", zapx, CLIENT_KEY);
    private static final Api.ClientKey<SignInClientImpl> CLIENT_KEY = new Api.ClientKey<>();
    public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> zapx = new zac();
    private static final Scope zar = new Scope(Scopes.PROFILE);
    private static final Scope zas = new Scope("email");
    @ShowFirstParty
    private static final Api.ClientKey<SignInClientImpl> zasl = new Api.ClientKey<>();
    private static final Api.AbstractClientBuilder<SignInClientImpl, zae> zasm = new zab();
    private static final Api<zae> zasn = new Api<>("SignIn.INTERNAL_API", zasm, zasl);
}
