package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzeea extends zzeeb {
    private Logger logger;

    public zzeea(String str) {
        this.logger = Logger.getLogger(str);
    }

    public final void zzhs(String str) {
        this.logger.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
