package com.google.android.gms.signin;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class SignInOptions implements Api.ApiOptions.Optional {
    public static final SignInOptions DEFAULT = new SignInOptions(false, false, (String) null, false, (String) null, (String) null, false, (Long) null, (Long) null);
    private final boolean zaso = false;
    private final boolean zasp = false;
    private final String zasq = null;
    private final boolean zasr = false;
    private final String zass = null;
    private final String zast = null;
    private final boolean zasu = false;
    private final Long zasv = null;
    private final Long zasw = null;

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public static final class zaa {
    }

    private SignInOptions(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2) {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignInOptions)) {
            return false;
        }
        SignInOptions signInOptions = (SignInOptions) obj;
        return this.zaso == signInOptions.zaso && this.zasp == signInOptions.zasp && Objects.equal(this.zasq, signInOptions.zasq) && this.zasr == signInOptions.zasr && this.zasu == signInOptions.zasu && Objects.equal(this.zass, signInOptions.zass) && Objects.equal(this.zast, signInOptions.zast) && Objects.equal(this.zasv, signInOptions.zasv) && Objects.equal(this.zasw, signInOptions.zasw);
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zaso), Boolean.valueOf(this.zasp), this.zasq, Boolean.valueOf(this.zasr), Boolean.valueOf(this.zasu), this.zass, this.zast, this.zasv, this.zasw);
    }

    public final boolean isOfflineAccessRequested() {
        return this.zaso;
    }

    public final boolean isIdTokenRequested() {
        return this.zasp;
    }

    public final String getServerClientId() {
        return this.zasq;
    }

    public final boolean isForceCodeForRefreshToken() {
        return this.zasr;
    }

    @Nullable
    public final String getHostedDomain() {
        return this.zass;
    }

    @Nullable
    public final String getLogSessionId() {
        return this.zast;
    }

    public final boolean waitForAccessTokenRefresh() {
        return this.zasu;
    }

    @Nullable
    public final Long getAuthApiSignInModuleVersion() {
        return this.zasv;
    }

    @Nullable
    public final Long getRealClientLibraryVersion() {
        return this.zasw;
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", this.zaso);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", this.zasp);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", this.zasq);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", this.zasr);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", this.zass);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", this.zast);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", this.zasu);
        Long l = this.zasv;
        if (l != null) {
            bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", l.longValue());
        }
        Long l2 = this.zasw;
        if (l2 != null) {
            bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", l2.longValue());
        }
        return bundle;
    }

    static {
        new zaa();
    }
}
