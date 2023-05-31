package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdew {
    /* access modifiers changed from: private */
    public boolean zzbkp;
    /* access modifiers changed from: private */
    public zzuk zzblv;
    /* access modifiers changed from: private */
    public zzach zzdff;
    /* access modifiers changed from: private */
    public zzahl zzdlk;
    /* access modifiers changed from: private */
    public int zzggu = 1;
    /* access modifiers changed from: private */
    public zzwl zzgqo;
    /* access modifiers changed from: private */
    public zzzc zzgqp;
    /* access modifiers changed from: private */
    public zzuh zzgqq;
    /* access modifiers changed from: private */
    public String zzgqr;
    /* access modifiers changed from: private */
    public ArrayList<String> zzgqs;
    /* access modifiers changed from: private */
    public ArrayList<String> zzgqt;
    /* access modifiers changed from: private */
    public zzur zzgqu;
    /* access modifiers changed from: private */
    public PublisherAdViewOptions zzgqv;
    /* access modifiers changed from: private */
    @Nullable
    public zzwf zzgqw;
    public final Set<String> zzgqx = new HashSet();

    public final zzdew zzg(zzuh zzuh) {
        this.zzgqq = zzuh;
        return this;
    }

    public final zzuh zzaqz() {
        return this.zzgqq;
    }

    public final zzdew zzd(zzuk zzuk) {
        this.zzblv = zzuk;
        return this;
    }

    public final zzuk zzke() {
        return this.zzblv;
    }

    public final zzdew zzc(zzwl zzwl) {
        this.zzgqo = zzwl;
        return this;
    }

    public final zzdew zzgn(String str) {
        this.zzgqr = str;
        return this;
    }

    public final String zzara() {
        return this.zzgqr;
    }

    public final zzdew zzc(zzzc zzzc) {
        this.zzgqp = zzzc;
        return this;
    }

    public final zzdew zzbo(boolean z) {
        this.zzbkp = z;
        return this;
    }

    public final zzdew zzdl(int i) {
        this.zzggu = i;
        return this;
    }

    public final zzdew zzb(ArrayList<String> arrayList) {
        this.zzgqs = arrayList;
        return this;
    }

    public final zzdew zzc(ArrayList<String> arrayList) {
        this.zzgqt = arrayList;
        return this;
    }

    public final zzdew zzb(zzach zzach) {
        this.zzdff = zzach;
        return this;
    }

    public final zzdew zzb(zzur zzur) {
        this.zzgqu = zzur;
        return this;
    }

    public final zzdew zzb(zzahl zzahl) {
        this.zzdlk = zzahl;
        this.zzgqp = new zzzc(false, true, false);
        return this;
    }

    public final zzdew zzb(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzgqv = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zzbkp = publisherAdViewOptions.getManualImpressionsEnabled();
            this.zzgqw = publisherAdViewOptions.zzjr();
        }
        return this;
    }

    public final zzdeu zzarb() {
        Preconditions.checkNotNull(this.zzgqr, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzblv, "ad size must not be null");
        Preconditions.checkNotNull(this.zzgqq, "ad request must not be null");
        return new zzdeu(this);
    }
}
