package jp.co.koeitecmo.DFusion;

import android.app.Activity;
import android.app.Application;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.text.ClipboardManager;
import android.text.InputFilter;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.Level5.YSG2.R;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.Constants;
import com.android.vending.billing.IInAppBillingService;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.level5.l5id.L5iD;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.Semaphore;
import jp.co.koeitecmo.ktgl.android.MediaPlayer;

public class KTBaseActivity extends Activity implements Runnable {
    private static final String TAG = "koeitecmo.KTBaseActivity";
    public static ClipboardManager m_ClipboardManager;
    protected static Activity m_activity;
    private final int PERMISSION_REQUEST_CODE_FOX = 10400;
    private final int REQUEST_GOOGLE_PLAY_SERVICES = 12321;
    Vector eventList = new Vector();
    private Handler handler = new Handler() {
        boolean isShowEditText = false;

        public void handleMessage(Message message) {
            try {
                KTBaseActivity.this.semaphore_EventList.acquire();
                int size = KTBaseActivity.this.eventList.size();
                if (size > 0) {
                    for (int i = 0; i < size; i++) {
                        Object obj = KTBaseActivity.this.eventList.get(i);
                        if (obj instanceof EventData_ShowEditText) {
                            KTBaseActivity.this.__showEditText((EventData_ShowEditText) obj);
                        } else if (obj instanceof EventData_HideEditText) {
                            KTBaseActivity.this.__hideEditText();
                        }
                    }
                    KTBaseActivity.this.eventList.clear();
                }
                KTBaseActivity.this.semaphore_EventList.release();
            } catch (Exception unused) {
            }
        }
    };
    private LinearLayout layout_;
    IInAppBillingService mService;
    ServiceConnection mServiceConn = new ServiceConnection() {
        public void onServiceDisconnected(ComponentName componentName) {
            KTBaseActivity.this.mService = null;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            KTBaseActivity.this.mService = IInAppBillingService.Stub.asInterface(iBinder);
        }
    };
    public ProgressDialog m_Indicator = null;
    private InputFilter[] m_aInputFilter = null;
    /* access modifiers changed from: private */
    public EditText m_cEdit = null;
    /* access modifiers changed from: private */
    public LinearLayout.LayoutParams m_cLpEdit = null;
    private LinearLayout.LayoutParams m_cLpWebView = null;
    /* access modifiers changed from: private */
    public boolean m_isCanGoBack = false;
    /* access modifiers changed from: private */
    public boolean m_isEditCR = false;
    private boolean m_isEditOpen = false;
    private boolean m_isInstalledApp = false;
    private String m_stInvite = null;
    private String m_stTreasureId = null;
    private MediaPlayer mediaPlayer_ = null;
    /* access modifiers changed from: private */
    public ProgressBar probressBar_;
    Semaphore semaphore_EventList = new Semaphore(1);
    private int sleepCount = 50;
    protected KTBaseView view_;
    public WebView webview_ = null;

    public KTBaseView createView(Application application, KTBaseActivity kTBaseActivity, boolean z, int i, int i2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void handleRun() {
    }

    public KTBaseJni createJni(Application application, KTBaseActivity kTBaseActivity, KTBaseView kTBaseView) {
        return new KTBaseJni(application, kTBaseActivity, kTBaseView);
    }

    public IAPJni createIAPJni(Application application, KTBaseActivity kTBaseActivity, KTBaseView kTBaseView) {
        return new IAPJni(application, kTBaseActivity, kTBaseView);
    }

    public IAPBCJni createIAPBCJni(Application application, KTBaseActivity kTBaseActivity, KTBaseView kTBaseView) {
        return new IAPBCJni(application, kTBaseActivity, kTBaseView);
    }

    public synchronized void startWebView(String str, String str2, int i, int i2, int i3, int i4) {
        KTBaseActivity kTBaseActivity = (KTBaseActivity) m_activity;
        kTBaseActivity.m_isCanGoBack = false;
        final KTBaseActivity kTBaseActivity2 = kTBaseActivity;
        final String str3 = str;
        final String str4 = str2;
        final int i5 = i3;
        final int i6 = i4;
        final int i7 = i;
        final int i8 = i2;
        kTBaseActivity.runOnUiThread(new Runnable() {
            public void run() {
                if (kTBaseActivity2.webview_ == null) {
                    Log.d("callbackShowBrowser", str3 + "is activity thread");
                    Log.d("callbackShowBrowser", kTBaseActivity2 + "is activity thread");
                    KTBaseActivity kTBaseActivity = kTBaseActivity2;
                    kTBaseActivity.webview_ = new WebView(kTBaseActivity);
                    kTBaseActivity2.webview_.setBackgroundColor(0);
                    int i = 1;
                    kTBaseActivity2.webview_.getSettings().setJavaScriptEnabled(true);
                    kTBaseActivity2.webview_.getSettings().setSaveFormData(false);
                    kTBaseActivity2.webview_.getSettings().setLoadWithOverviewMode(true);
                    kTBaseActivity2.webview_.getSettings().setUseWideViewPort(true);
                    kTBaseActivity2.webview_.getSettings().setCacheMode(2);
                    kTBaseActivity2.webview_.setWebViewClient(new WebViewClient() {
                        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                            super.onPageStarted(webView, str, bitmap);
                            kTBaseActivity2.view_.onWebViewPageStarted();
                        }

                        public void onPageFinished(WebView webView, String str) {
                            super.onPageFinished(webView, str);
                            kTBaseActivity2.view_.onWebViewPageFinished();
                        }

                        public void onReceivedError(WebView webView, int i, String str, String str2) {
                            Log.d("webviewError", "code:" + i);
                            webView.loadUrl("file:///android_asset/error.html");
                        }

                        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                            if (!str4.isEmpty() && str.startsWith(str4)) {
                                kTBaseActivity2.view_.onWebViewAction(str.substring(str4.length()));
                                return true;
                            } else if (str.startsWith("native://")) {
                                String[] split = str.split("://");
                                Log.d("WebViewClient.shouldOverrideUrlLoading", "string:" + split[1]);
                                if (split[1].equals("endWebView")) {
                                    kTBaseActivity2.removeWebView();
                                    kTBaseActivity2.getPlayerData();
                                }
                                return true;
                            } else if (str.endsWith("///")) {
                                webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str.substring(0, str.length() - 3))));
                                return true;
                            } else {
                                try {
                                    URI uri = new URI(str);
                                    if (uri.getHost().endsWith("api.level5-id.com") && uri.getPath().endsWith("link_account")) {
                                        Map<String, String> GetQueryMap = L5iD.GetQueryMap(uri.getQuery());
                                        if (GetQueryMap.containsKey("code")) {
                                            if (kTBaseActivity2.webview_ != null) {
                                                L5iD.LinkAccount(GetQueryMap.get("code"));
                                            }
                                            return true;
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                                return false;
                            }
                        }
                    });
                    kTBaseActivity2.webview_.setWebChromeClient(new WebChromeClient() {
                    });
                    LinearLayout linearLayout = new LinearLayout(kTBaseActivity2);
                    linearLayout.setBackgroundColor(ViewCompat.MEASURED_SIZE_MASK);
                    int i2 = i5;
                    if (i2 <= 0) {
                        i2 = 1;
                    }
                    int i3 = i6;
                    if (i3 > 0) {
                        i = i3;
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i);
                    layoutParams.setMargins(i7, i8, 0, 0);
                    kTBaseActivity2.webview_.setLayoutParams(layoutParams);
                    linearLayout.addView(kTBaseActivity2.webview_);
                    kTBaseActivity2.addContentView(linearLayout, new ViewGroup.LayoutParams(-2, -2));
                    kTBaseActivity2.webview_.loadUrl(str3);
                    if (i5 <= 0 || i6 <= 0) {
                        kTBaseActivity2.webview_.setVisibility(8);
                    }
                }
            }
        });
    }

    public synchronized void moveWebView(int i, int i2, int i3, int i4) {
        KTBaseActivity kTBaseActivity = (KTBaseActivity) m_activity;
        final KTBaseActivity kTBaseActivity2 = kTBaseActivity;
        final int i5 = i3;
        final int i6 = i4;
        final int i7 = i;
        final int i8 = i2;
        kTBaseActivity.runOnUiThread(new Runnable() {
            public void run() {
                int i;
                if (kTBaseActivity2.webview_ != null) {
                    int i2 = i5;
                    if (i2 <= 0 || (i = i6) <= 0) {
                        kTBaseActivity2.webview_.setVisibility(8);
                        return;
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i);
                    layoutParams.setMargins(i7, i8, 0, 0);
                    kTBaseActivity2.webview_.setLayoutParams(layoutParams);
                    kTBaseActivity2.webview_.setVisibility(0);
                }
            }
        });
    }

    public synchronized int getHttpHistoryPageCount() {
        KTBaseActivity kTBaseActivity = (KTBaseActivity) m_activity;
        if (kTBaseActivity.webview_ == null) {
            return 0;
        }
        kTBaseActivity.webview_.copyBackForwardList().getCurrentIndex();
        WebBackForwardList copyBackForwardList = kTBaseActivity.webview_.copyBackForwardList();
        int currentIndex = copyBackForwardList.getCurrentIndex();
        int i = 0;
        for (int i2 = 0; i2 < currentIndex; i2++) {
            String url = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - i2).getUrl();
            if (url.startsWith("http://") || url.startsWith("https://")) {
                break;
            }
            i++;
        }
        return currentIndex - i;
    }

    public synchronized void goBackWebView() {
        final KTBaseActivity kTBaseActivity = (KTBaseActivity) m_activity;
        kTBaseActivity.runOnUiThread(new Runnable() {
            public void run() {
                if (kTBaseActivity.webview_ != null) {
                    kTBaseActivity.webview_.goBackOrForward((KTBaseActivity.this.getHttpHistoryPageCount() - kTBaseActivity.webview_.copyBackForwardList().getCurrentIndex()) - 1);
                }
            }
        });
    }

    public synchronized void updateWebView() {
        final KTBaseActivity kTBaseActivity = (KTBaseActivity) m_activity;
        kTBaseActivity.runOnUiThread(new Runnable() {
            public void run() {
                if (kTBaseActivity.webview_ == null) {
                    return;
                }
                if (KTBaseActivity.this.getHttpHistoryPageCount() >= 1) {
                    boolean unused = kTBaseActivity.m_isCanGoBack = true;
                } else {
                    boolean unused2 = kTBaseActivity.m_isCanGoBack = false;
                }
            }
        });
    }

    public synchronized boolean isGoBackWebView() {
        return ((KTBaseActivity) m_activity).m_isCanGoBack;
    }

    @JavascriptInterface
    public synchronized void removeWebView() {
        final KTBaseActivity kTBaseActivity = (KTBaseActivity) m_activity;
        kTBaseActivity.runOnUiThread(new Runnable() {
            public void run() {
                if (kTBaseActivity.probressBar_ != null) {
                    kTBaseActivity.probressBar_.setVisibility(8);
                }
                if (kTBaseActivity.webview_ != null) {
                    kTBaseActivity.webview_.setWebChromeClient((WebChromeClient) null);
                    kTBaseActivity.webview_.setWebViewClient((WebViewClient) null);
                    ViewGroup viewGroup = (ViewGroup) kTBaseActivity.webview_.getParent();
                    viewGroup.removeView(kTBaseActivity.webview_);
                    ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
                    kTBaseActivity.webview_.destroy();
                    kTBaseActivity.webview_ = null;
                }
            }
        });
    }

    public synchronized void OpenURL(final String str) {
        final Activity activity = m_activity;
        activity.runOnUiThread(new Runnable() {
            public void run() {
                String str = str;
                if (str.startsWith("https://line.me/R/")) {
                    String[] split = str.split(",");
                    String str2 = null;
                    try {
                        str2 = URLEncoder.encode(split[1], Constants.ENCODING);
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    str = split[0] + str2;
                    Log.i(KTBaseActivity.TAG, "URLTest => " + str);
                } else if (!str.startsWith("http://") && !str.startsWith("https://") && !str.startsWith("market://")) {
                    str = "http://" + str;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    activity.startActivity(intent);
                }
            }
        });
    }

    public synchronized void OpenGameAppScheme(final String str) {
        final Activity activity = m_activity;
        activity.runOnUiThread(new Runnable() {
            public void run() {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    activity.startActivity(intent);
                }
            }
        });
    }

    public boolean IsInstalledGameApp(String str) {
        Activity activity = m_activity;
        KTBaseActivity kTBaseActivity = (KTBaseActivity) activity;
        if (new Intent("android.intent.action.VIEW", Uri.parse(str)).resolveActivity(activity.getPackageManager()) != null) {
            Log.i(TAG, "Installed =>" + str);
            return true;
        }
        Log.i(TAG, "NotInstalled =>" + str);
        return false;
    }

    public synchronized void killApplication() {
        final KTBaseActivity kTBaseActivity = (KTBaseActivity) m_activity;
        kTBaseActivity.runOnUiThread(new Runnable() {
            public void run() {
                kTBaseActivity.finish();
                Process.killProcess(Process.myPid());
            }
        });
    }

    public synchronized void keepScreenOn() {
        final KTBaseActivity kTBaseActivity = (KTBaseActivity) m_activity;
        kTBaseActivity.runOnUiThread(new Runnable() {
            public void run() {
                kTBaseActivity.getWindow().addFlags(128);
            }
        });
    }

    public synchronized void keepScreenOff() {
        final KTBaseActivity kTBaseActivity = (KTBaseActivity) m_activity;
        kTBaseActivity.runOnUiThread(new Runnable() {
            public void run() {
                kTBaseActivity.getWindow().clearFlags(128);
            }
        });
    }

    public synchronized void setFPS(int i) {
        ((KTBaseActivity) m_activity).view_.setFPS(i);
    }

    public synchronized String getVersionName() {
        KTBaseActivity kTBaseActivity;
        kTBaseActivity = (KTBaseActivity) m_activity;
        try {
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return new String("");
        }
        return new String(kTBaseActivity.getPackageManager().getPackageInfo(kTBaseActivity.getPackageName(), 128).versionName);
    }

    public synchronized int getLanguageId() {
        int i;
        i = 0;
        Locale locale = Locale.getDefault();
        locale.getLanguage();
        String country = locale.getCountry();
        if (locale.getLanguage().equals(new Locale("ja").getLanguage())) {
            i = 1;
        } else if (locale.getLanguage().equals(new Locale("en").getLanguage())) {
            i = 2;
        } else if (locale.getLanguage().equals(new Locale("zh").getLanguage()) && (country.equals("TW") || country.equals("HK"))) {
            i = 3;
        } else if (locale.getLanguage().equals(new Locale("zh").getLanguage()) && country.equals("CN")) {
            i = 4;
        } else if (country.equals("KR")) {
            i = 5;
        }
        return i;
    }

    public synchronized String getLanguageSTR() {
        String language;
        String country;
        Locale locale = Locale.getDefault();
        language = locale.getLanguage();
        country = locale.getCountry();
        return language + "-" + country;
    }

    public synchronized int getStorageAvailableSize() {
        StatFs statFs;
        KTBaseActivity kTBaseActivity = (KTBaseActivity) m_activity;
        statFs = new StatFs(Environment.getDataDirectory().getPath());
        return (int) ((((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())) / 1048576);
    }

    public synchronized String getInviteCode() {
        return ((KTBaseActivity) m_activity).m_stInvite;
    }

    public synchronized String getIdentifierCode() {
        Log.d(TAG, this.m_stTreasureId + "TreasureId");
        return ((KTBaseActivity) m_activity).m_stTreasureId;
    }

    public synchronized int getAppUseHeapSize() {
        Runtime runtime;
        KTBaseActivity kTBaseActivity = (KTBaseActivity) m_activity;
        runtime = Runtime.getRuntime();
        return (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024);
    }

    public synchronized void scanFile(String str) throws IOException {
        KTBaseActivity kTBaseActivity = (KTBaseActivity) m_activity;
        MediaScannerConnection.scanFile(kTBaseActivity, new String[]{new File(kTBaseActivity.getApplicationContext().getFilesDir(), str).getAbsolutePath()}, (String[]) null, (MediaScannerConnection.OnScanCompletedListener) null);
    }

    public static KTBaseActivity GetActivity() {
        return (KTBaseActivity) m_activity;
    }

    public void onCreate(Bundle bundle) {
        Uri data;
        Log.i(TAG, "onCreate was called");
        super.onCreate(bundle);
        m_activity = this;
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this);
        if (isGooglePlayServicesAvailable != 0) {
            GoogleApiAvailability.getInstance().showErrorDialogFragment(this, isGooglePlayServicesAvailable, 12321);
        }
        ApplicationInfo applicationInfo = getApplication().getApplicationInfo();
        Log.i(TAG, "backupAgentName => " + applicationInfo.backupAgentName);
        Log.i(TAG, "className => " + applicationInfo.className);
        Log.i(TAG, "dataDir => " + applicationInfo.dataDir);
        Log.i(TAG, "manageSpaceActivityName => " + applicationInfo.manageSpaceActivityName);
        Log.i(TAG, "permission => " + applicationInfo.permission);
        Log.i(TAG, "processName => " + applicationInfo.processName);
        Log.i(TAG, "publicSourceDir => " + applicationInfo.publicSourceDir);
        Log.i(TAG, "sourceDir show start");
        Log.i(TAG, "sourceDir => " + applicationInfo.sourceDir);
        Log.i(TAG, "taskAffinity => " + applicationInfo.taskAffinity);
        Log.i(TAG, "SDK_INT => " + Build.VERSION.SDK_INT);
        String[] strArr = applicationInfo.sharedLibraryFiles;
        if (strArr != null) {
            for (int i = 0; strArr.length > i; i++) {
                Log.i(TAG, "sharedLibraryFile[" + i + "] => " + strArr[i]);
            }
        }
        getWindow().getDecorView().setSystemUiVisibility(0);
        setContentView(R.layout.main);
        Intent intent = getIntent();
        if ("android.intent.action.VIEW".equals(intent.getAction()) && (data = intent.getData()) != null) {
            this.m_stInvite = data.getQueryParameter("u");
            Log.d(TAG, this.m_stInvite + "invite");
            this.m_stTreasureId = data.getQueryParameter("tid");
            Log.d(TAG, this.m_stTreasureId + "TreasureId");
        }
        this.layout_ = (LinearLayout) findViewById(R.id.layout);
        Log.i(TAG, "view construct start");
        this.view_ = createView(getApplication(), this, true, 16, 0);
        Log.i(TAG, "view construct end");
        this.layout_.addView(this.view_, new LinearLayout.LayoutParams(1, 1));
        this.probressBar_ = (ProgressBar) findViewById(R.id.progressbar);
        this.probressBar_.setVisibility(8);
        this.probressBar_.bringToFront();
        createEditText();
        new Thread(this).start();
        Log.i(TAG, "bind billing service start");
        Intent intent2 = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent2.setPackage("com.android.vending");
        bindService(intent2, this.mServiceConn, 1);
        Log.i(TAG, "bind billing service end");
        Log.i(TAG, "indicator create start");
        if (this.m_Indicator == null) {
            this.m_Indicator = new ProgressDialog(this);
            this.m_Indicator.setMessage("connecting...");
            this.m_Indicator.setProgressStyle(0);
            this.m_Indicator.setCanceledOnTouchOutside(false);
        }
        Log.i(TAG, "indicator create end");
        m_ClipboardManager = (ClipboardManager) getSystemService("clipboard");
        Adjust.appWillOpenUrl(intent.getData(), getApplicationContext());
        Log.i(TAG, "create finish");
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        Log.i(TAG, "onStart was called");
        super.onStart();
        this.view_.onStart();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        Log.i(TAG, "onResume was called");
        super.onResume();
        this.view_.onResume();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        Log.i(TAG, "onPause was called");
        super.onPause();
        this.view_.onPause();
        MediaPlayer mediaPlayer = this.mediaPlayer_;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        Log.i(TAG, "onStop was called");
        super.onStop();
        this.view_.onStop();
        MediaPlayer mediaPlayer = this.mediaPlayer_;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        Log.i(TAG, "onRestart was called");
        super.onRestart();
        this.view_.onRestart();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        Log.i(TAG, "onDestroy was called");
        super.onDestroy();
        MediaPlayer mediaPlayer = this.mediaPlayer_;
        if (mediaPlayer != null) {
            mediaPlayer.clear();
            this.mediaPlayer_ = null;
        }
        if (this.mService != null) {
            unbindService(this.mServiceConn);
        }
        Process.killProcess(Process.myPid());
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        Uri data;
        super.onNewIntent(intent);
        Uri data2 = intent.getData();
        if ("android.intent.action.VIEW".equals(intent.getAction()) && (data = intent.getData()) != null) {
            this.m_stInvite = data.getQueryParameter("u");
            Log.d(TAG, this.m_stInvite + "invite");
            this.m_stTreasureId = data.getQueryParameter("tid");
            Log.d(TAG, this.m_stTreasureId + "TreasureId");
        }
        Adjust.appWillOpenUrl(data2, getApplicationContext());
    }

    public void checkExStragePermissionForFOX() {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (ContextCompat.checkSelfPermission(m_activity, "android.permission.READ_EXTERNAL_STORAGE") != 0 || ContextCompat.checkSelfPermission(m_activity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(m_activity, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 10400);
        }
    }

    public void onSurfaceCreated() {
        setTheme(R.style.AppTheme);
        final KTBaseActivity kTBaseActivity = (KTBaseActivity) m_activity;
        kTBaseActivity.runOnUiThread(new Runnable() {
            public void run() {
                ViewGroup.LayoutParams layoutParams = kTBaseActivity.view_.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -1;
                kTBaseActivity.view_.setLayoutParams(layoutParams);
            }
        });
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.m_isEditOpen) {
            return false;
        }
        this.view_.onBackKeyDown();
        return false;
    }

    /* access modifiers changed from: protected */
    public void getPlayerData() {
        Log.i(TAG, "getPlayerData was called");
        this.view_.getPlayerData();
    }

    /* access modifiers changed from: protected */
    public void didSurfaceChanged() {
        Log.i(TAG, "didSurfaceChanged was called");
    }

    public KTBaseView GetView() {
        return this.view_;
    }

    /* access modifiers changed from: protected */
    public LinearLayout layout() {
        return this.layout_;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException unused) {
            }
            this.sleepCount--;
            if (this.sleepCount <= 0) {
                this.handler.sendEmptyMessage(0);
                this.sleepCount = 50;
            }
            handleRun();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        Log.d(TAG, "KTBaseJni onActivityResult requestCode " + i);
        Log.d(TAG, "KTBaseJni onActivityResult resultCode " + i2);
        Log.d(TAG, "KTBaseJni onActivityResult data " + intent);
        if (i != 12321) {
            if (!IAPJni.handleResult(i, i2, intent)) {
                super.onActivityResult(i, i2, intent);
            } else {
                Log.d(TAG, "KTBaseJni onActivityResult handled by IABUtil ");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void createEditText() {
        Log.i(TAG, "createEditText");
        this.m_cEdit = new EditText(getApplicationContext());
        Log.i("handler", "handleMessage");
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setBackgroundColor(ViewCompat.MEASURED_SIZE_MASK);
        this.m_cLpEdit = new LinearLayout.LayoutParams(-2, -2);
        this.m_cEdit.setLayoutParams(this.m_cLpEdit);
        this.m_cEdit.setInputType(1);
        linearLayout.addView(this.m_cEdit);
        addContentView(linearLayout, new ViewGroup.LayoutParams(-2, -2));
        final KTBaseActivity kTBaseActivity = (KTBaseActivity) m_activity;
        this.m_cEdit.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (kTBaseActivity.m_isEditCR || keyEvent.getAction() != 0 || i != 66) {
                    return false;
                }
                Log.i("EditText", "OnEnter");
                KTBaseActivity.this.view_.onEditTextEnd();
                return true;
            }
        });
        __hideEditText();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10400 && iArr.length > 1 && iArr[0] == 0) {
            int i2 = iArr[1];
        }
    }

    class EventData {
        EventData() {
        }
    }

    class EventData_ShowEditText extends EventData {
        public int bIsNumberPad = 0;
        public int bIsPassword = 0;
        public String cShowEditText;
        public int nFontHeight = 12;
        public int nShowEditTextLen = 0;
        public int nShowEditTextLine = 1;
        public int nShowEditTextWX = 0;
        public int nShowEditTextWY = 0;
        public int nShowEditTextX = 0;
        public int nShowEditTextY = 0;
        public int nShowFlag = 0;

        EventData_ShowEditText() {
            super();
        }
    }

    class EventData_HideEditText extends EventData {
        EventData_HideEditText() {
            super();
        }
    }

    /* access modifiers changed from: protected */
    public void AddThreadEvent(Object obj) {
        try {
            this.semaphore_EventList.acquire();
            this.eventList.add(obj);
            this.semaphore_EventList.release();
        } catch (Exception unused) {
        }
        this.sleepCount = 0;
    }

    public synchronized void showEditText(int i, int i2, int i3, int i4, int i5, int i6, String str, int i7, int i8, int i9, int i10) {
        EventData_ShowEditText eventData_ShowEditText = new EventData_ShowEditText();
        eventData_ShowEditText.nShowEditTextX = i;
        eventData_ShowEditText.nShowEditTextY = i2;
        eventData_ShowEditText.nShowEditTextWX = i3;
        eventData_ShowEditText.nShowEditTextWY = i4;
        eventData_ShowEditText.nFontHeight = i5;
        eventData_ShowEditText.nShowEditTextLen = i6;
        eventData_ShowEditText.cShowEditText = str;
        eventData_ShowEditText.nShowFlag = i7;
        eventData_ShowEditText.nShowEditTextLine = i8;
        eventData_ShowEditText.bIsNumberPad = i9;
        eventData_ShowEditText.bIsPassword = i10;
        ((KTBaseActivity) m_activity).AddThreadEvent(eventData_ShowEditText);
    }

    /* access modifiers changed from: protected */
    public synchronized void moveEditTextView(int i, int i2, int i3, int i4, int i5) {
        Log.i("EditText", "MoveEditText:x=" + i + "y:" + i2 + "wx:" + i3 + "wy:" + i4 + "TextHeight:" + i5);
        KTBaseActivity kTBaseActivity = (KTBaseActivity) m_activity;
        final KTBaseActivity kTBaseActivity2 = kTBaseActivity;
        final int i6 = i;
        final int i7 = i2;
        final int i8 = i5;
        kTBaseActivity.runOnUiThread(new Runnable() {
            public void run() {
                if (kTBaseActivity2.m_cLpEdit != null && kTBaseActivity2.m_cEdit != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kTBaseActivity2.m_cEdit.getLayoutParams();
                    marginLayoutParams.setMargins(i6, i7, 0, 0);
                    EditText access$400 = kTBaseActivity2.m_cEdit;
                    double d = (double) i8;
                    Double.isNaN(d);
                    access$400.setTextSize(0, (float) (d * 0.8d));
                    kTBaseActivity2.m_cEdit.setLayoutParams(marginLayoutParams);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void __showEditText(EventData_ShowEditText eventData_ShowEditText) {
        Log.i("EditText", "__showEditText:x=" + eventData_ShowEditText.nShowEditTextX + ",y=" + eventData_ShowEditText.nShowEditTextY + ",wx=" + eventData_ShowEditText.nShowEditTextWX + ",wy=" + eventData_ShowEditText.nShowEditTextWY + ",len=" + eventData_ShowEditText.nShowEditTextLen + "height=" + eventData_ShowEditText.nFontHeight);
        this.m_cLpEdit.setMargins(eventData_ShowEditText.nShowEditTextX, eventData_ShowEditText.nShowEditTextY, 0, 0);
        this.m_cEdit.setWidth(eventData_ShowEditText.nShowEditTextWX);
        this.m_cEdit.setHeight(eventData_ShowEditText.nShowEditTextWY);
        this.m_cEdit.setTextSize(0, ((float) eventData_ShowEditText.nFontHeight) * 0.8f);
        this.m_cEdit.setLayoutParams(this.m_cLpEdit);
        this.m_cEdit.getText().clear();
        if (eventData_ShowEditText.bIsNumberPad == 1) {
            this.m_cEdit.setInputType(2);
        } else if (eventData_ShowEditText.bIsPassword == 1) {
            this.m_cEdit.setInputType(129);
        } else {
            this.m_cEdit.setInputType(1);
        }
        this.m_aInputFilter = new InputFilter[1];
        this.m_aInputFilter[0] = new InputFilter.LengthFilter(eventData_ShowEditText.nShowEditTextLen);
        this.m_cEdit.setFilters(this.m_aInputFilter);
        if ((eventData_ShowEditText.nShowFlag & 1) != 0) {
            if (eventData_ShowEditText.bIsNumberPad == 1) {
                this.m_cEdit.setRawInputType(131074);
            } else if (eventData_ShowEditText.bIsPassword == 1) {
                this.m_cEdit.setInputType(129);
            } else {
                this.m_cEdit.setRawInputType(131073);
            }
            this.m_cEdit.setSingleLine(false);
            this.m_cEdit.setMaxLines(eventData_ShowEditText.nShowEditTextLine);
            if ((eventData_ShowEditText.nShowFlag & 4) != 0) {
                this.m_isEditCR = true;
            } else {
                this.m_isEditCR = false;
            }
        } else {
            if (eventData_ShowEditText.bIsNumberPad == 1) {
                this.m_cEdit.setRawInputType(2);
            } else if (eventData_ShowEditText.bIsPassword == 1) {
                this.m_cEdit.setInputType(129);
            } else {
                this.m_cEdit.setRawInputType(1);
            }
            this.m_cEdit.setSingleLine(true);
            this.m_cEdit.setMaxLines(1);
            this.m_isEditCR = false;
        }
        this.m_cEdit.setText(eventData_ShowEditText.cShowEditText.replace("\n", System.getProperty("line.separator")));
        EditText editText = this.m_cEdit;
        editText.setSelection(editText.getText().length());
        this.m_cEdit.setVisibility(0);
        this.m_cEdit.setBackgroundColor(0);
        this.m_cEdit.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.m_cEdit.setFocusable(true);
        this.m_cEdit.requestFocus();
        this.m_cEdit.setHorizontallyScrolling(false);
        ((InputMethodManager) getSystemService("input_method")).showSoftInput(this.m_cEdit, 1);
        EditText editText2 = this.m_cEdit;
        editText2.setPadding(editText2.getPaddingLeft(), 0, this.m_cEdit.getPaddingRight(), 0);
        this.m_cEdit.setGravity(19);
        this.m_cEdit.setCursorVisible(true);
        this.m_cEdit.requestLayout();
        this.m_isEditOpen = true;
    }

    public synchronized void hideEditText() {
        ((KTBaseActivity) m_activity).AddThreadEvent(new EventData_HideEditText());
        this.m_isEditOpen = false;
    }

    /* access modifiers changed from: protected */
    public void __hideEditText() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.m_cEdit.getWindowToken(), 2);
        this.m_cEdit.setVisibility(4);
        this.m_cEdit.setCursorVisible(false);
        this.m_isEditOpen = false;
    }

    public synchronized String getEditText() {
        return ((KTBaseActivity) m_activity).m_cEdit.getText().toString().replace(System.getProperty("line.separator"), "\n");
    }
}
