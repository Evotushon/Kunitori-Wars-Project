package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.zzq;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaol extends zzaow {
    private final Map<String, String> zzcsz;
    private String zzdge = zzdr("description");
    private long zzdgf = zzds("start_ticks");
    private long zzdgg = zzds("end_ticks");
    private String zzdgh = zzdr("summary");
    private String zzdgi = zzdr(FirebaseAnalytics.Param.LOCATION);
    /* access modifiers changed from: private */
    public final Context zzur;

    public zzaol(zzbdv zzbdv, Map<String, String> map) {
        super(zzbdv, "createCalendarEvent");
        this.zzcsz = map;
        this.zzur = zzbdv.zzys();
    }

    private final String zzdr(String str) {
        return TextUtils.isEmpty(this.zzcsz.get(str)) ? "" : this.zzcsz.get(str);
    }

    private final long zzds(String str) {
        String str2 = this.zzcsz.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final void execute() {
        if (this.zzur == null) {
            zzdt("Activity context is not available.");
            return;
        }
        zzq.zzkv();
        if (!zzawo.zzau(this.zzur).zzqh()) {
            zzdt("This feature is not available on the device.");
            return;
        }
        zzq.zzkv();
        AlertDialog.Builder zzat = zzawo.zzat(this.zzur);
        Resources resources = zzq.zzkz().getResources();
        zzat.setTitle(resources != null ? resources.getString(R.string.s5) : "Create calendar event");
        zzat.setMessage(resources != null ? resources.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        zzat.setPositiveButton(resources != null ? resources.getString(R.string.s3) : "Accept", new zzaok(this));
        zzat.setNegativeButton(resources != null ? resources.getString(R.string.s4) : "Decline", new zzaon(this));
        zzat.create().show();
    }

    /* access modifiers changed from: package-private */
    @TargetApi(14)
    public final Intent createIntent() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzdge);
        data.putExtra("eventLocation", this.zzdgi);
        data.putExtra("description", this.zzdgh);
        long j = this.zzdgf;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zzdgg;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }
}
