package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zap;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class ListenerHolder<L> {
    private final zaa zajo;
    private volatile L zajp;
    private volatile ListenerKey<L> zajq;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public interface Notifier<L> {
        @KeepForSdk
        void notifyListener(L l);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    @KeepForSdk
    ListenerHolder(@NonNull Looper looper, @NonNull L l, @NonNull String str) {
        this.zajo = new zaa(looper);
        this.zajp = Preconditions.checkNotNull(l, "Listener must not be null");
        this.zajq = new ListenerKey<>(l, Preconditions.checkNotEmpty(str));
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    private final class zaa extends zap {
        public zaa(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            Preconditions.checkArgument(z);
            ListenerHolder.this.notifyListenerInternal((Notifier) message.obj);
        }
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public static final class ListenerKey<L> {
        private final L zajp;
        private final String zajr;

        @KeepForSdk
        ListenerKey(L l, String str) {
            this.zajp = l;
            this.zajr = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.zajp == listenerKey.zajp && this.zajr.equals(listenerKey.zajr);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zajp) * 31) + this.zajr.hashCode();
        }
    }

    @KeepForSdk
    public final void notifyListener(Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.zajo.sendMessage(this.zajo.obtainMessage(1, notifier));
    }

    @KeepForSdk
    public final boolean hasListener() {
        return this.zajp != null;
    }

    @KeepForSdk
    public final void clear() {
        this.zajp = null;
        this.zajq = null;
    }

    @KeepForSdk
    @Nullable
    public final ListenerKey<L> getListenerKey() {
        return this.zajq;
    }

    /* access modifiers changed from: package-private */
    @KeepForSdk
    public final void notifyListenerInternal(Notifier<? super L> notifier) {
        L l = this.zajp;
        if (l == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(l);
        } catch (RuntimeException e) {
            notifier.onNotifyListenerFailed();
            throw e;
        }
    }
}
