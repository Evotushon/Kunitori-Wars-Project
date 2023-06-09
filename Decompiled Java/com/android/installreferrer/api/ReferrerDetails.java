package com.android.installreferrer.api;

import android.os.Bundle;

public class ReferrerDetails {
    private static final String KEY_INSTALL_BEGIN_TIMESTAMP = "install_begin_timestamp_seconds";
    private static final String KEY_INSTALL_REFERRER = "install_referrer";
    private static final String KEY_REFERRER_CLICK_TIMESTAMP = "referrer_click_timestamp_seconds";
    private final Bundle mOriginalBundle;

    public ReferrerDetails(Bundle bundle) {
        this.mOriginalBundle = bundle;
    }

    public String getInstallReferrer() {
        return this.mOriginalBundle.getString("install_referrer");
    }

    public long getReferrerClickTimestampSeconds() {
        return this.mOriginalBundle.getLong(KEY_REFERRER_CLICK_TIMESTAMP);
    }

    public long getInstallBeginTimestampSeconds() {
        return this.mOriginalBundle.getLong(KEY_INSTALL_BEGIN_TIMESTAMP);
    }
}
