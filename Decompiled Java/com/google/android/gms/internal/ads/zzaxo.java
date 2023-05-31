package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaxo implements Runnable {
    final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzduu;
    private final /* synthetic */ boolean zzduv;
    private final /* synthetic */ boolean zzduw;

    zzaxo(zzaxl zzaxl, Context context, String str, boolean z, boolean z2) {
        this.val$context = context;
        this.zzduu = str;
        this.zzduv = z;
        this.zzduw = z2;
    }

    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.val$context);
        builder.setMessage(this.zzduu);
        if (this.zzduv) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.zzduw) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new zzaxn(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
