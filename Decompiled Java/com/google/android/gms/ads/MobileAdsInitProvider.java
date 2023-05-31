package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.internal.ads.zzya;

@KeepForSdkWithMembers
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class MobileAdsInitProvider extends ContentProvider {
    private final zzya zzabu = new zzya();

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        this.zzabu.attachInfo(context, providerInfo);
    }

    public boolean onCreate() {
        return this.zzabu.onCreate();
    }

    @Nullable
    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.zzabu.query(uri, strArr, str, strArr2, str2);
    }

    @Nullable
    public String getType(@NonNull Uri uri) {
        return this.zzabu.getType(uri);
    }

    @Nullable
    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        return this.zzabu.insert(uri, contentValues);
    }

    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        return this.zzabu.delete(uri, str, strArr);
    }

    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.zzabu.update(uri, contentValues, str, strArr);
    }
}
