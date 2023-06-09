package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.internal.cloudmessaging.zzf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.ServiceStarter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {
    private final ExecutorService zza = zza.zza().zza(new NamedThreadFactory("firebase-iid-executor"), zzf.zza);

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    public static final class IntentActionKeys {
        @NonNull
        public static final String NOTIFICATION_DISMISS = "com.google.firebase.messaging.NOTIFICATION_DISMISS";
        @NonNull
        public static final String NOTIFICATION_OPEN = "com.google.firebase.messaging.NOTIFICATION_OPEN";

        private IntentActionKeys() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    public static final class IntentKeys {
        @NonNull
        public static final String PENDING_INTENT = "pending_intent";
        @NonNull
        public static final String WRAPPED_INTENT = "wrapped_intent";

        private IntentKeys() {
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract int onMessageReceive(@NonNull Context context, @NonNull CloudMessage cloudMessage);

    /* access modifiers changed from: protected */
    @WorkerThread
    public void onNotificationDismissed(@NonNull Context context, @NonNull Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public void onNotificationOpen(@NonNull Context context, @NonNull Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    @NonNull
    public Executor getBroadcastExecutor() {
        return this.zza;
    }

    public final void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (intent != null) {
            getBroadcastExecutor().execute(new zzd(this, intent, context, isOrderedBroadcast(), goAsync()));
        }
    }

    @WorkerThread
    private final int zza(@NonNull Context context, @NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(IntentKeys.PENDING_INTENT);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove(IntentKeys.PENDING_INTENT);
        } else {
            extras = new Bundle();
        }
        if (IntentActionKeys.NOTIFICATION_OPEN.equals(intent.getAction())) {
            onNotificationOpen(context, extras);
            return -1;
        } else if (IntentActionKeys.NOTIFICATION_DISMISS.equals(intent.getAction())) {
            onNotificationDismissed(context, extras);
            return -1;
        } else {
            Log.e("CloudMessagingReceiver", "Unknown notification action");
            return ServiceStarter.ERROR_UNKNOWN;
        }
    }

    @WorkerThread
    private final int zzb(@NonNull Context context, @NonNull Intent intent) {
        Task<Void> task;
        if (intent.getExtras() == null) {
            return ServiceStarter.ERROR_UNKNOWN;
        }
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID);
        if (TextUtils.isEmpty(stringExtra)) {
            task = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(Constants.MessagePayloadKeys.MSGID, stringExtra);
            task = zze.zza(context).zza(2, bundle);
        }
        int onMessageReceive = onMessageReceive(context, new CloudMessage(intent));
        try {
            Tasks.await(task, TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            Log.w("CloudMessagingReceiver", sb.toString());
        }
        return onMessageReceive;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        int i;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra(IntentKeys.WRAPPED_INTENT);
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i = zza(context, intent2);
            } else {
                i = zzb(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(i);
            }
        } finally {
            pendingResult.finish();
        }
    }
}
