package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbfm extends MutableContextWrapper {
    private Activity zzdwu;
    private Context zzeiz;
    private Context zzyz;

    public zzbfm(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final void setBaseContext(Context context) {
        this.zzyz = context.getApplicationContext();
        this.zzdwu = context instanceof Activity ? (Activity) context : null;
        this.zzeiz = context;
        super.setBaseContext(this.zzyz);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.zzdwu;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.zzyz.startActivity(intent);
    }

    public final Activity zzys() {
        return this.zzdwu;
    }

    public final Object getSystemService(String str) {
        return this.zzeiz.getSystemService(str);
    }

    public final Context zzaaa() {
        return this.zzeiz;
    }
}
