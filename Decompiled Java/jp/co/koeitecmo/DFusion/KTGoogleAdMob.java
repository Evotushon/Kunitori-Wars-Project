package jp.co.koeitecmo.DFusion;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import java.util.Timer;
import java.util.TimerTask;

public class KTGoogleAdMob {
    private static final String AD_UNIT_ID = "ca-app-pub-8773347685197336/1436719147";
    private static final String AD_UNIT_TEST_ID = "ca-app-pub-3940256099942544/5224354917";
    private static final int REWARD_CACHE_NUM = 1;
    private static final String TAG = "KTGoogleAdMob";
    private static KTGoogleAdMob m_instance;
    /* access modifiers changed from: private */
    public KTBaseActivity m_activity;
    /* access modifiers changed from: private */
    public int m_error_cnt = 0;
    /* access modifiers changed from: private */
    public int m_error_wait = 0;
    private boolean m_isMaster = false;
    /* access modifiers changed from: private */
    public RewardedAd m_playingAd;
    /* access modifiers changed from: private */
    public RewardedAd[] m_rewardedAd = new RewardedAd[1];
    /* access modifiers changed from: private */
    public int[] m_rewardedOrder = new int[1];
    /* access modifiers changed from: private */
    public int m_rewardedOrderCurrent = 0;
    /* access modifiers changed from: private */
    public RewardAdStatus[] m_rewardedStatus = new RewardAdStatus[1];
    /* access modifiers changed from: private */
    public Status m_status = Status.Idle;
    private Timer m_timer;

    private enum RewardAdStatus {
        None,
        Loading,
        Loaded
    }

    private enum Status {
        Idle,
        Loading,
        Error
    }

    static /* synthetic */ int access$208(KTGoogleAdMob kTGoogleAdMob) {
        int i = kTGoogleAdMob.m_rewardedOrderCurrent;
        kTGoogleAdMob.m_rewardedOrderCurrent = i + 1;
        return i;
    }

    public KTGoogleAdMob(KTBaseActivity kTBaseActivity, boolean z) {
        m_instance = this;
        this.m_isMaster = z;
        this.m_activity = kTBaseActivity;
        for (int i = 0; i < 1; i++) {
            this.m_rewardedStatus[i] = RewardAdStatus.None;
            this.m_rewardedOrder[i] = 0;
        }
        AnonymousClass1 r3 = new TimerTask() {
            public void run() {
                KTGoogleAdMob.this.Process();
            }
        };
        this.m_timer = new Timer();
        this.m_timer.scheduleAtFixedRate(r3, 0, 1000);
    }

    /* renamed from: jp.co.koeitecmo.DFusion.KTGoogleAdMob$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$jp$co$koeitecmo$DFusion$KTGoogleAdMob$Status = new int[Status.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                jp.co.koeitecmo.DFusion.KTGoogleAdMob$Status[] r0 = jp.co.koeitecmo.DFusion.KTGoogleAdMob.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$jp$co$koeitecmo$DFusion$KTGoogleAdMob$Status = r0
                int[] r0 = $SwitchMap$jp$co$koeitecmo$DFusion$KTGoogleAdMob$Status     // Catch:{ NoSuchFieldError -> 0x0014 }
                jp.co.koeitecmo.DFusion.KTGoogleAdMob$Status r1 = jp.co.koeitecmo.DFusion.KTGoogleAdMob.Status.Idle     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$jp$co$koeitecmo$DFusion$KTGoogleAdMob$Status     // Catch:{ NoSuchFieldError -> 0x001f }
                jp.co.koeitecmo.DFusion.KTGoogleAdMob$Status r1 = jp.co.koeitecmo.DFusion.KTGoogleAdMob.Status.Loading     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$jp$co$koeitecmo$DFusion$KTGoogleAdMob$Status     // Catch:{ NoSuchFieldError -> 0x002a }
                jp.co.koeitecmo.DFusion.KTGoogleAdMob$Status r1 = jp.co.koeitecmo.DFusion.KTGoogleAdMob.Status.Error     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jp.co.koeitecmo.DFusion.KTGoogleAdMob.AnonymousClass4.<clinit>():void");
        }
    }

    public void Process() {
        int i = AnonymousClass4.$SwitchMap$jp$co$koeitecmo$DFusion$KTGoogleAdMob$Status[this.m_status.ordinal()];
        if (i == 1) {
            Process_Idle();
        } else if (i != 2 && i == 3) {
            Process_Error();
        }
    }

    private void Process_Idle() {
        final int i = 0;
        while (true) {
            if (i >= 1) {
                i = -1;
                break;
            } else if (this.m_rewardedStatus[i] == RewardAdStatus.None) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            this.m_status = Status.Loading;
            this.m_rewardedStatus[i] = RewardAdStatus.Loading;
            this.m_rewardedAd[i] = new RewardedAd(this.m_activity, this.m_isMaster ? AD_UNIT_ID : AD_UNIT_TEST_ID);
            final KTBaseActivity kTBaseActivity = this.m_activity;
            kTBaseActivity.runOnUiThread(new Runnable() {
                public void run() {
                    AnonymousClass1 r0 = new RewardedAdLoadCallback() {
                        public void onRewardedAdLoaded() {
                            this.m_rewardedStatus[i] = RewardAdStatus.Loaded;
                            this.m_rewardedOrder[i] = this.m_rewardedOrderCurrent;
                            KTGoogleAdMob.access$208(this);
                            Status unused = this.m_status = Status.Idle;
                            int unused2 = this.m_error_wait = 0;
                            int unused3 = this.m_error_cnt = 0;
                            Log.i(KTGoogleAdMob.TAG, "onRewardedAdLoaded was called " + i);
                        }

                        public void onRewardedAdFailedToLoad(int i) {
                            this.m_rewardedStatus[i] = RewardAdStatus.None;
                            Status unused = this.m_status = Status.Error;
                            Log.i(KTGoogleAdMob.TAG, "onRewardedAdFailedToLoad was called " + i);
                            if (i == 0) {
                                Log.i(KTGoogleAdMob.TAG, "ErrorCode=ERROR_CODE_INTERNAL_ERROR");
                            } else if (i == 1) {
                                Log.i(KTGoogleAdMob.TAG, "ErrorCode=ERROR_CODE_INVALID_REQUEST");
                            } else if (i == 2) {
                                Log.i(KTGoogleAdMob.TAG, "ErrorCode=ERROR_CODE_NETWORK_ERROR");
                            } else if (i == 3) {
                                Log.i(KTGoogleAdMob.TAG, "ErrorCode=ERROR_CODE_NO_FILL");
                            } else {
                                Log.i(KTGoogleAdMob.TAG, "ErrorCode=UNKNOWN");
                            }
                        }
                    };
                    AdRequest build = new AdRequest.Builder().build();
                    if (build.isTestDevice(kTBaseActivity)) {
                        Log.i(KTGoogleAdMob.TAG, "This is TestDevice");
                    }
                    this.m_rewardedAd[i].loadAd(build, (RewardedAdLoadCallback) r0);
                    Log.i(KTGoogleAdMob.TAG, "StartLoadAdMovie " + i);
                }
            });
        }
    }

    private void Process_Error() {
        Log.i(TAG, "ProcessError " + this.m_error_cnt + " " + this.m_error_wait);
        int i = this.m_error_wait;
        if (i > 0) {
            this.m_error_wait = i - 1;
            if (this.m_error_wait <= 0) {
                this.m_status = Status.Idle;
                return;
            }
            return;
        }
        this.m_error_cnt++;
        if (this.m_error_cnt > 3) {
            this.m_error_wait = 60;
        } else {
            this.m_error_wait = 5;
        }
    }

    private int GetLoadedIndex() {
        for (int i = 0; i < 1; i++) {
            if (this.m_rewardedStatus[i] == RewardAdStatus.Loaded) {
                return i;
            }
        }
        return -1;
    }

    public synchronized void Init(int i) {
        m_instance = new KTGoogleAdMob(KTBaseActivity.GetActivity(), i > 0);
        Log.i(TAG, "init " + i);
    }

    public synchronized int IsLoaded() {
        return m_instance.GetLoadedIndex() >= 0 ? 1 : 0;
    }

    public synchronized void Play() {
        m_instance.PlayImpl();
    }

    public void PlayImpl() {
        Log.i(TAG, "PlayImpl");
        this.m_activity.runOnUiThread(new Runnable() {
            public void run() {
                int i = -1;
                for (int i2 = 0; i2 < 1; i2++) {
                    if (KTGoogleAdMob.this.m_rewardedStatus[i2] == RewardAdStatus.Loaded && (i < 0 || KTGoogleAdMob.this.m_rewardedOrder[i] > KTGoogleAdMob.this.m_rewardedOrder[i2])) {
                        i = i2;
                    }
                }
                if (i >= 0) {
                    Log.i(KTGoogleAdMob.TAG, "StartPlayAdMovie " + i);
                    AnonymousClass1 r1 = new RewardedAdCallback() {
                        public void onRewardedAdOpened() {
                            Log.i(KTGoogleAdMob.TAG, "onRewardedAdOpened was classed");
                            KTGoogleAdMob.this.m_activity.GetView().GetJni().onAdMovieOpened();
                        }

                        public void onRewardedAdClosed() {
                            Log.i(KTGoogleAdMob.TAG, "onRewardedAdClosed was classed");
                            RewardedAd unused = KTGoogleAdMob.this.m_playingAd = null;
                            KTGoogleAdMob.this.m_activity.GetView().GetJni().onAdMovieClosed();
                        }

                        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                            Log.i(KTGoogleAdMob.TAG, "onUserEarnedReward was classed");
                            KTGoogleAdMob.this.m_activity.GetView().GetJni().onAdMovieFinished();
                        }

                        public void onRewardedAdFailedToShow(int i) {
                            Log.i(KTGoogleAdMob.TAG, "onRewardedAdFailedToShow " + i);
                            KTGoogleAdMob.this.m_activity.GetView().GetJni().onAdMovieFailed(i);
                        }
                    };
                    KTGoogleAdMob kTGoogleAdMob = KTGoogleAdMob.this;
                    RewardedAd unused = kTGoogleAdMob.m_playingAd = kTGoogleAdMob.m_rewardedAd[i];
                    KTGoogleAdMob.this.m_playingAd.show(KTGoogleAdMob.this.m_activity, r1);
                    KTGoogleAdMob.this.m_rewardedAd[i] = null;
                    KTGoogleAdMob.this.m_rewardedStatus[i] = RewardAdStatus.None;
                    return;
                }
                Log.d("TAG", "The rewarded ad wasn't loaded yet.");
            }
        });
    }
}
