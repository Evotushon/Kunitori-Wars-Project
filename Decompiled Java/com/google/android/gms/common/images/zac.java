package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zac {
    public final Uri uri;

    public zac(Uri uri2) {
        this.uri = uri2;
    }

    public final int hashCode() {
        return Objects.hashCode(this.uri);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zac)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Objects.equal(((zac) obj).uri, this.uri);
    }
}
