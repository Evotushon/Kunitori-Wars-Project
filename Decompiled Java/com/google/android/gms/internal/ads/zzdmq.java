package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzdmq implements FilenameFilter {
    private final Pattern zzhbi;

    public zzdmq(Pattern pattern) {
        this.zzhbi = (Pattern) zzdlg.checkNotNull(pattern);
    }

    public final boolean accept(@NullableDecl File file, String str) {
        return this.zzhbi.matcher(str).matches();
    }
}
