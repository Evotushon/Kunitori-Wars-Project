package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class zzdzh extends IOException {
    private zzeah zzhtt = null;

    public zzdzh(String str) {
        super(str);
    }

    public final zzdzh zzl(zzeah zzeah) {
        this.zzhtt = zzeah;
        return this;
    }

    static zzdzh zzbdi() {
        return new zzdzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzdzh zzbdj() {
        return new zzdzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzdzh zzbdk() {
        return new zzdzh("CodedInputStream encountered a malformed varint.");
    }

    static zzdzh zzbdl() {
        return new zzdzh("Protocol message contained an invalid tag (zero).");
    }

    static zzdzh zzbdm() {
        return new zzdzh("Protocol message end-group tag did not match expected tag.");
    }

    static zzdzk zzbdn() {
        return new zzdzk("Protocol message tag had invalid wire type.");
    }

    static zzdzh zzbdo() {
        return new zzdzh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzdzh zzbdp() {
        return new zzdzh("Failed to parse the message.");
    }

    static zzdzh zzbdq() {
        return new zzdzh("Protocol message had invalid UTF-8.");
    }
}
