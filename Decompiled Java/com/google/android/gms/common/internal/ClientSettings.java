package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@KeepForSdk
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class ClientSettings {
    public static final String KEY_CLIENT_SESSION_ID = "com.google.android.gms.common.internal.ClientSettings.sessionId";
    private final Account account;
    private final Map<Api<?>, OptionalApiSettings> zaoi;
    private final int zaoj;
    private final View zaok;
    private final String zaol;
    private final String zaom;
    private final SignInOptions zaon;
    private final Set<Scope> zaop;
    private final Set<Scope> zaoq;
    private final boolean zaor;
    private Integer zaos;

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public static final class OptionalApiSettings {
        public final Set<Scope> mScopes;

        public OptionalApiSettings(Set<Scope> set) {
            Preconditions.checkNotNull(set);
            this.mScopes = Collections.unmodifiableSet(set);
        }
    }

    @KeepForSdk
    public static ClientSettings createDefault(Context context) {
        return new GoogleApiClient.Builder(context).buildClientSettings();
    }

    @KeepForSdk
    public ClientSettings(Account account2, Set<Scope> set, Map<Api<?>, OptionalApiSettings> map, int i, View view, String str, String str2, SignInOptions signInOptions) {
        this(account2, set, map, i, view, str, str2, signInOptions, false);
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public static final class Builder {
        private Account account;
        private ArraySet<Scope> zaoh;
        private Map<Api<?>, OptionalApiSettings> zaoi;
        private int zaoj = 0;
        private View zaok;
        private String zaol;
        private String zaom;
        private SignInOptions zaon = SignInOptions.DEFAULT;
        private boolean zaoo;

        public final Builder setAccount(Account account2) {
            this.account = account2;
            return this;
        }

        public final Builder addRequiredScope(Scope scope) {
            if (this.zaoh == null) {
                this.zaoh = new ArraySet<>();
            }
            this.zaoh.add(scope);
            return this;
        }

        public final Builder addAllRequiredScopes(Collection<Scope> collection) {
            if (this.zaoh == null) {
                this.zaoh = new ArraySet<>();
            }
            this.zaoh.addAll(collection);
            return this;
        }

        public final Builder setOptionalApiSettingsMap(Map<Api<?>, OptionalApiSettings> map) {
            this.zaoi = map;
            return this;
        }

        public final Builder setGravityForPopups(int i) {
            this.zaoj = i;
            return this;
        }

        public final Builder setViewForPopups(View view) {
            this.zaok = view;
            return this;
        }

        @KeepForSdk
        public final Builder setRealClientPackageName(String str) {
            this.zaol = str;
            return this;
        }

        public final Builder setRealClientClassName(String str) {
            this.zaom = str;
            return this;
        }

        public final Builder setSignInOptions(SignInOptions signInOptions) {
            this.zaon = signInOptions;
            return this;
        }

        public final Builder enableSignInClientDisconnectFix() {
            this.zaoo = true;
            return this;
        }

        @KeepForSdk
        public final ClientSettings build() {
            return new ClientSettings(this.account, this.zaoh, this.zaoi, this.zaoj, this.zaok, this.zaol, this.zaom, this.zaon, this.zaoo);
        }
    }

    public ClientSettings(Account account2, Set<Scope> set, Map<Api<?>, OptionalApiSettings> map, int i, View view, String str, String str2, SignInOptions signInOptions, boolean z) {
        this.account = account2;
        this.zaop = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.zaoi = map == null ? Collections.emptyMap() : map;
        this.zaok = view;
        this.zaoj = i;
        this.zaol = str;
        this.zaom = str2;
        this.zaon = signInOptions;
        this.zaor = z;
        HashSet hashSet = new HashSet(this.zaop);
        for (OptionalApiSettings optionalApiSettings : this.zaoi.values()) {
            hashSet.addAll(optionalApiSettings.mScopes);
        }
        this.zaoq = Collections.unmodifiableSet(hashSet);
    }

    @KeepForSdk
    @Deprecated
    @Nullable
    public final String getAccountName() {
        Account account2 = this.account;
        if (account2 != null) {
            return account2.name;
        }
        return null;
    }

    @KeepForSdk
    @Nullable
    public final Account getAccount() {
        return this.account;
    }

    @KeepForSdk
    public final Account getAccountOrDefault() {
        Account account2 = this.account;
        if (account2 != null) {
            return account2;
        }
        return new Account("<<default account>>", AccountType.GOOGLE);
    }

    @KeepForSdk
    public final int getGravityForPopups() {
        return this.zaoj;
    }

    @KeepForSdk
    public final Set<Scope> getRequiredScopes() {
        return this.zaop;
    }

    @KeepForSdk
    public final Set<Scope> getAllRequestedScopes() {
        return this.zaoq;
    }

    public final Map<Api<?>, OptionalApiSettings> getOptionalApiSettings() {
        return this.zaoi;
    }

    @KeepForSdk
    @Nullable
    public final String getRealClientPackageName() {
        return this.zaol;
    }

    @Nullable
    public final String getRealClientClassName() {
        return this.zaom;
    }

    @KeepForSdk
    @Nullable
    public final View getViewForPopups() {
        return this.zaok;
    }

    @Nullable
    public final SignInOptions getSignInOptions() {
        return this.zaon;
    }

    @Nullable
    public final Integer getClientSessionId() {
        return this.zaos;
    }

    public final void setClientSessionId(Integer num) {
        this.zaos = num;
    }

    @KeepForSdk
    public final Set<Scope> getApplicableScopes(Api<?> api) {
        OptionalApiSettings optionalApiSettings = this.zaoi.get(api);
        if (optionalApiSettings == null || optionalApiSettings.mScopes.isEmpty()) {
            return this.zaop;
        }
        HashSet hashSet = new HashSet(this.zaop);
        hashSet.addAll(optionalApiSettings.mScopes);
        return hashSet;
    }

    public final boolean isSignInClientDisconnectFixEnabled() {
        return this.zaor;
    }
}
