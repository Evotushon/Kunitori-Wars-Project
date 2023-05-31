package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class MediationAdRequest {
    private final Date zzmg;
    private final AdRequest.Gender zzmh;
    private final Set<String> zzmi;
    private final boolean zzmj;
    private final Location zzmk;

    public MediationAdRequest(Date date, AdRequest.Gender gender, Set<String> set, boolean z, Location location) {
        this.zzmg = date;
        this.zzmh = gender;
        this.zzmi = set;
        this.zzmj = z;
        this.zzmk = location;
    }

    public Integer getAgeInYears() {
        if (this.zzmg == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(this.zzmg);
        Integer valueOf = Integer.valueOf(instance2.get(1) - instance.get(1));
        return (instance2.get(2) < instance.get(2) || (instance2.get(2) == instance.get(2) && instance2.get(5) < instance.get(5))) ? Integer.valueOf(valueOf.intValue() - 1) : valueOf;
    }

    public Date getBirthday() {
        return this.zzmg;
    }

    public AdRequest.Gender getGender() {
        return this.zzmh;
    }

    public Set<String> getKeywords() {
        return this.zzmi;
    }

    public Location getLocation() {
        return this.zzmk;
    }

    public boolean isTesting() {
        return this.zzmj;
    }
}
