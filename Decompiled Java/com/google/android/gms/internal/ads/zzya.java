package com.google.android.gms.internal.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzya extends ContentProvider {
    public final int delete(@NonNull Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Nullable
    public final String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    public final Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return false;
    }

    @Nullable
    public final Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        Bundle zzi = zzi(context);
        zzalc zzso = zzalc.zzso();
        if (zzi == null) {
            zzazh.zzey("Metadata was null.");
        } else {
            try {
                String str = (String) zzi.get("com.google.android.gms.ads.APPLICATION_ID");
                try {
                    Boolean bool = (Boolean) zzi.get("com.google.android.gms.ads.AD_MANAGER_APP");
                    try {
                        Boolean bool2 = (Boolean) zzi.get("com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT");
                        if (str == null || str.matches("^/\\d+~.+$")) {
                            if (bool == null || !bool.booleanValue()) {
                                throw new IllegalStateException("\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here:                                       *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n");
                            } else if (bool2 == null || !bool2.booleanValue()) {
                                zzso.zzn(context);
                            }
                        } else if (str.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                            String valueOf = String.valueOf(str);
                            zzazh.zzeb(valueOf.length() != 0 ? "Publisher provided Google AdMob App ID in manifest: ".concat(valueOf) : new String("Publisher provided Google AdMob App ID in manifest: "));
                            if (bool2 == null || !bool2.booleanValue()) {
                                zzso.zzc(context, str);
                            }
                        } else {
                            throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n******************************************************************************\n\n");
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value.", e);
                    }
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("The com.google.android.gms.ads.AD_MANAGER_APP metadata must have a boolean value.", e2);
                }
            } catch (ClassCastException e3) {
                throw new IllegalStateException("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value.", e3);
            }
        }
        super.attachInfo(context, providerInfo);
    }

    @Nullable
    private static Bundle zzi(Context context) {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (NullPointerException e) {
            zzazh.zzc("Failed to load metadata: Null pointer exception.", e);
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            zzazh.zzc("Failed to load metadata: Package name not found.", e2);
            return null;
        }
    }
}
