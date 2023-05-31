package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzze {
    private final Context zzur;

    public zzze(Context context) {
        Preconditions.checkNotNull(context, "Context can not be null");
        this.zzur = context;
    }

    public final boolean zzqe() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return zza(intent);
    }

    public final boolean zzqf() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return zza(intent);
    }

    public final boolean zzqg() {
        return ((Boolean) zzayp.zza(this.zzur, new zzzh())).booleanValue() && Wrappers.packageManager(this.zzur).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    public final boolean zzqh() {
        return zza(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    private final boolean zza(Intent intent) {
        Preconditions.checkNotNull(intent, "Intent can not be null");
        if (!this.zzur.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return true;
        }
        return false;
    }
}
