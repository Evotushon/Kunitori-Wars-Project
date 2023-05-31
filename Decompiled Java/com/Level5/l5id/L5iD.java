package com.level5.l5id;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.level5.l5id.HttpConnect;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class L5iD {
    public static final int L5iDERROR_CONNECT_FAILURE = -1000;
    public static final int L5iDERROR_JSON_PARSE_ERROR = -1002;
    public static final int L5iDERROR_MISSING_PARAM = -1003;
    public static final int L5iDERROR_NONE = 0;
    public static final int L5iDERROR_OTHER = -1999;
    public static final int L5iDERROR_RETURN_PARAM_SHORTAGE = -1001;
    public static final int WEBVIEW_UI_TYPE_DEFAULT = 0;
    public static final int WEBVIEW_UI_TYPE_POPUPWINDOW = 1;
    private static String s_AndroidRequestVersion = "";
    private static String s_api_server_url = null;
    /* access modifiers changed from: private */
    public static String s_application_key = null;
    private static String s_application_version = null;
    private static String s_auth_server_url = null;
    /* access modifiers changed from: private */
    public static String s_cloudSaveData = "";
    /* access modifiers changed from: private */
    public static String s_cloudSaveLastModified = "";
    /* access modifiers changed from: private */
    public static int s_complete_request_id = 0;
    private static Activity s_current_activity = null;
    private static String s_device_model = "";
    private static int s_gdkey_max_num = 0;
    private static String s_iOSRequestVersion = "";
    private static boolean s_isEnableDebug = false;
    /* access modifiers changed from: private */
    public static boolean s_isLinked = false;
    /* access modifiers changed from: private */
    public static boolean s_isLoggedIn = false;
    /* access modifiers changed from: private */
    public static boolean s_isNeedMultiResponse = false;
    /* access modifiers changed from: private */
    public static boolean s_isNeedSignature = false;
    /* access modifiers changed from: private */
    public static int s_last_connect_status_code = 0;
    private static int s_requested_request_id = 0;
    private static String s_save_server_url = null;
    private static int s_status_code = 0;
    private static String s_status_name = "";
    private static int s_status_point = 0;
    /* access modifiers changed from: private */
    public static ArrayList<UDKeyInfo> s_udkeys = null;
    /* access modifiers changed from: private */
    public static String s_useUdkey = null;
    private static String s_web_close_button_text = "Close";
    /* access modifiers changed from: private */
    public static WebViewUIBase s_web_view_ui;

    private enum APIEnum {
        active,
        create_gdkey,
        link_account,
        delete_gdkey,
        l5id_status,
        select_udkey,
        save,
        show,
        last_modified
    }

    public static void PutLog(String str) {
        if (s_isEnableDebug) {
            Log.i("L5iD", str);
        }
    }

    public static class KeyInfo {
        public String key;
        public String sign_nonce;
        public long sign_time_stamp = 0;
        public String signature;

        public KeyInfo() {
            Reset();
        }

        public void Reset() {
            this.key = "";
            this.signature = "";
            this.sign_nonce = "";
            this.sign_time_stamp = 0;
        }

        public void Set(String str) {
            Reset();
            this.key = str;
        }

        public void Set(String str, String str2, String str3, long j) {
            this.key = str;
            this.signature = str2;
            this.sign_nonce = str3;
            this.sign_time_stamp = j;
        }

        public boolean IsSigning() {
            return this.sign_time_stamp > 0;
        }
    }

    public static class UDKeyInfo {
        public ArrayList<KeyInfo> gdkeys;
        public KeyInfo udkey;

        public KeyInfo SearchGDKey(String str) {
            int size = this.gdkeys.size();
            for (int i = 0; i < size; i++) {
                KeyInfo keyInfo = this.gdkeys.get(i);
                if (keyInfo.key.equals(str)) {
                    return keyInfo;
                }
            }
            return null;
        }
    }

    public static void SetEnableDebug(boolean z) {
        s_isEnableDebug = z;
        HttpConnect.SetEnableDebug(z);
    }

    public static void Init(Activity activity, String str, String str2, String str3, String str4, String str5) {
        ResetParameter();
        HttpConnect.Initialize("L5iD", activity);
        s_current_activity = activity;
        s_auth_server_url = str;
        s_api_server_url = str2;
        s_save_server_url = str3;
        s_application_key = str4;
        s_application_version = str5;
        s_udkeys = new ArrayList<>();
        s_device_model = Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static void Destroy() {
        ResetParameter();
        WebViewUIBase webViewUIBase = s_web_view_ui;
        if (webViewUIBase != null) {
            webViewUIBase.destroy();
            s_web_view_ui = null;
        }
        s_current_activity = null;
        s_udkeys = null;
    }

    private static void ResetParameter() {
        s_udkeys = new ArrayList<>();
        s_isLinked = false;
        s_isLoggedIn = false;
        s_gdkey_max_num = 0;
        s_status_code = 0;
        s_status_name = "";
        s_status_point = 0;
        s_cloudSaveData = "";
        s_cloudSaveLastModified = "";
        s_iOSRequestVersion = "";
        s_AndroidRequestVersion = "";
    }

    public static boolean IsOpenWebView() {
        WebViewUIBase webViewUIBase = s_web_view_ui;
        if (webViewUIBase != null) {
            return webViewUIBase.IsOpenWebView();
        }
        return false;
    }

    public static void SetUdkey(String str) {
        s_useUdkey = str;
        ResetParameter();
    }

    public static void NeedSignature(boolean z) {
        s_isNeedSignature = z;
    }

    public static void NeedMultiResponse(boolean z) {
        s_isNeedMultiResponse = z;
    }

    public static void SetWebViewCloseButtonText(String str) {
        s_web_close_button_text = str;
    }

    public static boolean Login() {
        if (!IsEndRequest()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("apkey=");
        sb.append(s_application_key);
        sb.append("&udkey=");
        sb.append(!StringIsNullOrEmpty(s_useUdkey) ? s_useUdkey : "");
        sb.append("&version=");
        sb.append(s_application_version);
        String str = sb.toString() + "&device_cd=" + EncodeString(s_device_model) + "&device_type_cd=Android";
        if (s_isNeedSignature) {
            str = str + "&sign=true";
        }
        if (s_isNeedMultiResponse) {
            str = str + "&response_style=1";
        }
        SendRequest(APIEnum.active, str);
        return true;
    }

    public static boolean CreateGdkey(boolean z) {
        int i = 0;
        if (!IsEndRequest() || !IsLoggedIn()) {
            return false;
        }
        String str = s_useUdkey;
        if (z) {
            int GetUdkeyCount = GetUdkeyCount();
            while (true) {
                if (i < GetUdkeyCount) {
                    if (GetGdkeysCount(i) > 0) {
                        str = GetUdkey(i);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        String str2 = "apkey=" + s_application_key + "&udkey=" + str;
        if (s_isNeedSignature) {
            str2 = str2 + "&sign=true";
        }
        SendRequest(APIEnum.create_gdkey, str2);
        return true;
    }

    public static boolean DeleteGdkey(String str) {
        if (!IsEndRequest() || !IsLoggedIn()) {
            return false;
        }
        SendRequest(APIEnum.delete_gdkey, "apkey=" + s_application_key + "&udkey=" + s_useUdkey + "&gdkey=" + str);
        return true;
    }

    public static boolean SelectUdkey(String str) {
        if (!IsEndRequest() || !IsLoggedIn()) {
            return false;
        }
        SendRequest(APIEnum.select_udkey, "apkey=" + s_application_key + "&udkey=" + str);
        return true;
    }

    public static boolean LinkAccount(String str) {
        if (!IsEndRequest() || !IsLoggedIn()) {
            return false;
        }
        String str2 = "apkey=" + s_application_key + "&udkey=" + s_useUdkey + "&code=" + str;
        if (s_isNeedSignature) {
            str2 = str2 + "&sign=true";
        }
        if (s_isNeedMultiResponse) {
            str2 = str2 + "&response_style=1";
        }
        SendRequest(APIEnum.link_account, str2);
        return true;
    }

    public static boolean StartAutoLinkDevice(int i) {
        if (!IsEndRequest() || !IsLoggedIn()) {
            return false;
        }
        s_last_connect_status_code = 0;
        String str = (s_api_server_url + "/api/v1/link_account") + "?" + ("apkey=" + s_application_key + "&udkey=" + s_useUdkey);
        WebViewUIBase webViewUIBase = s_web_view_ui;
        if (webViewUIBase != null) {
            webViewUIBase.destroy();
            s_web_view_ui = null;
        }
        L5iDWebViewClient l5iDWebViewClient = new L5iDWebViewClient();
        if (i == 1) {
            WebViewPopupWindow webViewPopupWindow = new WebViewPopupWindow();
            webViewPopupWindow.Init(s_current_activity, l5iDWebViewClient, s_web_close_button_text);
            webViewPopupWindow.loadURL(str);
            webViewPopupWindow.setVisibility(true);
            s_web_view_ui = webViewPopupWindow;
        } else {
            WebViewPlugin webViewPlugin = new WebViewPlugin();
            webViewPlugin.Init(s_current_activity, l5iDWebViewClient, s_web_close_button_text);
            webViewPlugin.loadURL(str);
            webViewPlugin.setVisibility(true);
            s_web_view_ui = webViewPlugin;
        }
        int GetRequestIdOnly = HttpConnect.HttpTaskRunnable.GetRequestIdOnly();
        s_requested_request_id = GetRequestIdOnly;
        l5iDWebViewClient.request_id = GetRequestIdOnly;
        return true;
    }

    public static boolean StartAutoLinkDevice() {
        if (Build.VERSION.SDK_INT < 21) {
            PutLog("Open WebView on Default Activity.");
            return StartAutoLinkDevice(0);
        }
        PutLog("Open WebView on Pouup Window.");
        return StartAutoLinkDevice(1);
    }

    public static boolean L5iDStatus(String str) {
        return L5iDStatus();
    }

    public static boolean L5iDStatus() {
        if (!IsEndRequest()) {
            return false;
        }
        SendRequest(APIEnum.l5id_status, "apkey=" + s_application_key + "&udkey=" + s_useUdkey);
        return true;
    }

    public static boolean UploadCloudSave(String str, String str2) {
        if (!IsEndRequest()) {
            return false;
        }
        KeyInfo SearchGDKeyInfo = SearchGDKeyInfo(str);
        if (SearchGDKeyInfo == null) {
            SendRequest(APIEnum.save, "apkey=" + s_application_key + "&gdkey=" + str + "&content=" + str2);
            return true;
        }
        SendRequest(APIEnum.save, "apkey=" + s_application_key + "&gdkey=" + str + "&nonce=" + SearchGDKeyInfo.sign_nonce + "&time=" + SearchGDKeyInfo.sign_time_stamp + "&signature=" + SearchGDKeyInfo.signature + "&content=" + str2);
        return true;
    }

    public static boolean UploadCloudSaveUDKey(String str, String str2) {
        if (!IsEndRequest()) {
            return false;
        }
        UDKeyInfo SearchUDKeyInfo = SearchUDKeyInfo(str);
        if (SearchUDKeyInfo == null) {
            SendRequest(APIEnum.save, "apkey=" + s_application_key + "&udkey=" + str + "&content=" + str2);
            return true;
        }
        SendRequest(APIEnum.save, "apkey=" + s_application_key + "&udkey=" + str + "&nonce=" + SearchUDKeyInfo.udkey.sign_nonce + "&time=" + SearchUDKeyInfo.udkey.sign_time_stamp + "&signature=" + SearchUDKeyInfo.udkey.signature + "&content=" + str2);
        return true;
    }

    public static boolean DownloadCloudSave(String str) {
        return DownloadCloudSaveBase(str, false);
    }

    public static boolean RequestCloudLastModified(String str) {
        return DownloadCloudSaveBase(str, true);
    }

    public static boolean DownloadCloudSaveBase(String str, boolean z) {
        if (!IsEndRequest()) {
            return false;
        }
        KeyInfo SearchGDKeyInfo = SearchGDKeyInfo(str);
        if (SearchGDKeyInfo == null) {
            SendRequest(!z ? APIEnum.show : APIEnum.last_modified, "apkey=" + s_application_key + "&gdkey=" + str);
            return true;
        }
        SendRequest(!z ? APIEnum.show : APIEnum.last_modified, "apkey=" + s_application_key + "&gdkey=" + str + "&nonce=" + SearchGDKeyInfo.sign_nonce + "&time=" + SearchGDKeyInfo.sign_time_stamp + "&signature=" + SearchGDKeyInfo.signature);
        return true;
    }

    public static boolean DownloadCloudSaveUDKey(String str) {
        return DownloadCloudSaveUDKeyBase(str, false);
    }

    public static boolean RequestCloudLastModifiedUdkey(String str) {
        return DownloadCloudSaveUDKeyBase(str, true);
    }

    public static boolean DownloadCloudSaveUDKeyBase(String str, boolean z) {
        if (!IsEndRequest()) {
            return false;
        }
        UDKeyInfo SearchUDKeyInfo = SearchUDKeyInfo(str);
        if (SearchUDKeyInfo == null) {
            SendRequest(!z ? APIEnum.show : APIEnum.last_modified, "apkey=" + s_application_key + "&udkey=" + str);
            return true;
        }
        SendRequest(!z ? APIEnum.show : APIEnum.last_modified, "apkey=" + s_application_key + "&udkey=" + str + "&nonce=" + SearchUDKeyInfo.udkey.sign_nonce + "&time=" + SearchUDKeyInfo.udkey.sign_time_stamp + "&signature=" + SearchUDKeyInfo.udkey.signature);
        return true;
    }

    private static String EncodeString(String str) {
        try {
            return Uri.encode(str, Constants.ENCODING);
        } catch (Exception unused) {
            return "";
        }
    }

    /* access modifiers changed from: private */
    public static void SendRequest(final APIEnum aPIEnum, final String str) {
        String str2;
        s_last_connect_status_code = 0;
        if (aPIEnum == APIEnum.show || aPIEnum == APIEnum.save || aPIEnum == APIEnum.last_modified) {
            str2 = s_save_server_url;
        } else {
            str2 = s_api_server_url;
        }
        String str3 = str2 + "/api/v1/" + aPIEnum.toString();
        String str4 = null;
        if (aPIEnum == APIEnum.save) {
            String[] split = str.split("&");
            StringBuilder sb = new StringBuilder();
            for (String str5 : split) {
                if (!sb.toString().isEmpty()) {
                    sb.append("&");
                }
                String[] split2 = str5.split("=", 2);
                if (split2.length >= 2) {
                    try {
                        sb.append(URLEncoder.encode(split2[0], Constants.ENCODING));
                        sb.append("=");
                        sb.append(URLEncoder.encode(split2[1], Constants.ENCODING));
                    } catch (Exception unused) {
                    }
                }
            }
            str4 = sb.toString();
            PutLog("[Request(POST)]" + str3);
            PutLog("[DATA]" + str4);
        } else {
            str3 = str3 + "?" + str;
            PutLog("[Request(GET)]" + str3);
        }
        try {
            s_requested_request_id = HttpConnect.Send(str3, str4, new HttpConnect.ResponseCallback() {
                public void onExecute(int i, boolean z, int i2, String str) {
                    if (L5iD.s_complete_request_id < i) {
                        if (!z || str.isEmpty()) {
                            int unused = L5iD.s_last_connect_status_code = i2;
                            if (L5iD.s_last_connect_status_code <= 0) {
                                int unused2 = L5iD.s_last_connect_status_code = -1000;
                            }
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.getBoolean("result")) {
                                    switch (AnonymousClass2.$SwitchMap$com$level5$l5id$L5iD$APIEnum[aPIEnum.ordinal()]) {
                                        case 1:
                                            if (!(!L5iD.StoreDataFromJson(jSONObject, aPIEnum, str))) {
                                                boolean unused3 = L5iD.s_isLoggedIn = true;
                                                break;
                                            } else {
                                                int unused4 = L5iD.s_last_connect_status_code = -1001;
                                                break;
                                            }
                                        case 2:
                                            if (!L5iD.StoreDataFromJson(jSONObject, aPIEnum, str)) {
                                                int unused5 = L5iD.s_last_connect_status_code = -1001;
                                                break;
                                            }
                                            break;
                                        case 3:
                                            Map<String, String> GetQueryMap = L5iD.GetQueryMap(str);
                                            if (GetQueryMap.containsKey("gdkey")) {
                                                L5iD.DeleteGdkeyFromList(GetQueryMap.get("gdkey"));
                                                break;
                                            }
                                            break;
                                        case 4:
                                            Map<String, String> GetQueryMap2 = L5iD.GetQueryMap(str);
                                            if (GetQueryMap2.containsKey("udkey")) {
                                                String str2 = GetQueryMap2.get("udkey");
                                                int size = L5iD.s_udkeys.size();
                                                for (int i3 = 0; i3 < size; i3++) {
                                                    UDKeyInfo uDKeyInfo = (UDKeyInfo) L5iD.s_udkeys.get(i3);
                                                    if (!uDKeyInfo.udkey.equals(str2)) {
                                                        uDKeyInfo.gdkeys.clear();
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                        case 5:
                                            if (!(!L5iD.StoreDataFromJson(jSONObject, aPIEnum, str))) {
                                                boolean unused6 = L5iD.s_isLinked = true;
                                                break;
                                            } else {
                                                int unused7 = L5iD.s_last_connect_status_code = -1001;
                                                break;
                                            }
                                        case 6:
                                            boolean unused8 = L5iD.StoreDataFromJson(jSONObject, aPIEnum, str);
                                            break;
                                        case 7:
                                            break;
                                        case 8:
                                        case 9:
                                            if (jSONObject.has(FirebaseAnalytics.Param.CONTENT)) {
                                                String unused9 = L5iD.s_cloudSaveData = jSONObject.getString(FirebaseAnalytics.Param.CONTENT);
                                                if (L5iD.s_cloudSaveData.equals("null")) {
                                                    String unused10 = L5iD.s_cloudSaveData = "";
                                                }
                                            } else {
                                                String unused11 = L5iD.s_cloudSaveData = "";
                                            }
                                            if (!jSONObject.has("last_modified")) {
                                                String unused12 = L5iD.s_cloudSaveLastModified = "";
                                                break;
                                            } else {
                                                String unused13 = L5iD.s_cloudSaveLastModified = jSONObject.getString("last_modified");
                                                if (L5iD.s_cloudSaveLastModified.equals("null")) {
                                                    String unused14 = L5iD.s_cloudSaveLastModified = "";
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    int unused15 = L5iD.s_last_connect_status_code = jSONObject.getInt("code");
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                                int unused16 = L5iD.s_last_connect_status_code = -1002;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                int unused17 = L5iD.s_last_connect_status_code = L5iD.L5iDERROR_OTHER;
                            }
                        }
                        if (L5iD.s_complete_request_id >= i) {
                            i = L5iD.s_complete_request_id;
                        }
                        int unused18 = L5iD.s_complete_request_id = i;
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            s_last_connect_status_code = L5iDERROR_OTHER;
        }
    }

    /* renamed from: com.level5.l5id.L5iD$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$level5$l5id$L5iD$APIEnum = new int[APIEnum.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.level5.l5id.L5iD$APIEnum[] r0 = com.level5.l5id.L5iD.APIEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$level5$l5id$L5iD$APIEnum = r0
                int[] r0 = $SwitchMap$com$level5$l5id$L5iD$APIEnum     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.level5.l5id.L5iD$APIEnum r1 = com.level5.l5id.L5iD.APIEnum.active     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$level5$l5id$L5iD$APIEnum     // Catch:{ NoSuchFieldError -> 0x001f }
                com.level5.l5id.L5iD$APIEnum r1 = com.level5.l5id.L5iD.APIEnum.create_gdkey     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$level5$l5id$L5iD$APIEnum     // Catch:{ NoSuchFieldError -> 0x002a }
                com.level5.l5id.L5iD$APIEnum r1 = com.level5.l5id.L5iD.APIEnum.delete_gdkey     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$level5$l5id$L5iD$APIEnum     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.level5.l5id.L5iD$APIEnum r1 = com.level5.l5id.L5iD.APIEnum.select_udkey     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = $SwitchMap$com$level5$l5id$L5iD$APIEnum     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.level5.l5id.L5iD$APIEnum r1 = com.level5.l5id.L5iD.APIEnum.link_account     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = $SwitchMap$com$level5$l5id$L5iD$APIEnum     // Catch:{ NoSuchFieldError -> 0x004b }
                com.level5.l5id.L5iD$APIEnum r1 = com.level5.l5id.L5iD.APIEnum.l5id_status     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = $SwitchMap$com$level5$l5id$L5iD$APIEnum     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.level5.l5id.L5iD$APIEnum r1 = com.level5.l5id.L5iD.APIEnum.save     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = $SwitchMap$com$level5$l5id$L5iD$APIEnum     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.level5.l5id.L5iD$APIEnum r1 = com.level5.l5id.L5iD.APIEnum.last_modified     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = $SwitchMap$com$level5$l5id$L5iD$APIEnum     // Catch:{ NoSuchFieldError -> 0x006e }
                com.level5.l5id.L5iD$APIEnum r1 = com.level5.l5id.L5iD.APIEnum.show     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.level5.l5id.L5iD.AnonymousClass2.<clinit>():void");
        }
    }

    private static UDKeyInfo ParseKeys(JSONObject jSONObject, String str, long j) {
        return ParseKeys(jSONObject, str, j, (UDKeyInfo) null);
    }

    private static UDKeyInfo ParseKeys(JSONObject jSONObject, String str, long j, UDKeyInfo uDKeyInfo) {
        JSONObject jSONObject2 = jSONObject;
        UDKeyInfo uDKeyInfo2 = uDKeyInfo == null ? new UDKeyInfo() : uDKeyInfo;
        if (uDKeyInfo == null) {
            uDKeyInfo2.udkey = new KeyInfo();
        }
        uDKeyInfo2.gdkeys = new ArrayList<>();
        int i = 0;
        if (s_isNeedSignature) {
            if (uDKeyInfo == null) {
                try {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("udkey");
                    String string = jSONObject3.getString("value");
                    String string2 = jSONObject3.getString("signature");
                    PutLog("[UDKEY]value=" + string + " signature=" + string2);
                    if (StringIsNullOrEmpty(string)) {
                        return null;
                    }
                    uDKeyInfo2.udkey.Set(string, string2, str, j);
                } catch (Exception e) {
                    PutLog(e.getMessage());
                    return null;
                }
            }
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("gdkeys");
                int length = jSONArray.length();
                while (i < length) {
                    try {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                        String string3 = jSONObject4.getString("value");
                        String string4 = jSONObject4.getString("signature");
                        if (!StringIsNullOrEmpty(string3)) {
                            KeyInfo keyInfo = new KeyInfo();
                            keyInfo.Set(string3, string4, str, j);
                            uDKeyInfo2.gdkeys.add(keyInfo);
                        }
                    } catch (Exception unused) {
                    }
                    i++;
                }
            } catch (Exception e2) {
                PutLog(e2.getMessage());
                return null;
            }
        } else {
            if (uDKeyInfo == null) {
                try {
                    uDKeyInfo2.udkey.key = jSONObject.getString("udkey");
                    if (StringIsNullOrEmpty(uDKeyInfo2.udkey.key)) {
                        return null;
                    }
                } catch (Exception e3) {
                    PutLog(e3.getMessage());
                    return null;
                }
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("gdkeys");
            int length2 = jSONArray2.length();
            while (i < length2) {
                try {
                    KeyInfo keyInfo2 = new KeyInfo();
                    keyInfo2.key = jSONArray2.getString(i);
                    if (!StringIsNullOrEmpty(keyInfo2.key)) {
                        uDKeyInfo2.gdkeys.add(keyInfo2);
                    }
                } catch (Exception unused2) {
                }
                i++;
            }
        }
        return uDKeyInfo2;
    }

    private static UDKeyInfo SearchUDKeyInfo(String str) {
        int size = s_udkeys.size();
        for (int i = 0; i < size; i++) {
            UDKeyInfo uDKeyInfo = s_udkeys.get(i);
            if (uDKeyInfo.udkey.key.equals(str)) {
                return uDKeyInfo;
            }
        }
        return null;
    }

    static KeyInfo SearchGDKeyInfo(String str) {
        int size = s_udkeys.size();
        for (int i = 0; i < size; i++) {
            KeyInfo SearchGDKey = s_udkeys.get(i).SearchGDKey(str);
            if (SearchGDKey != null) {
                return SearchGDKey;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static boolean StoreDataFromJson(JSONObject jSONObject, APIEnum aPIEnum, String str) {
        long j;
        String str2;
        UDKeyInfo ParseKeys;
        if (s_isNeedSignature && (aPIEnum == APIEnum.active || aPIEnum == APIEnum.create_gdkey || aPIEnum == APIEnum.link_account)) {
            try {
                j = jSONObject.getLong("sign_timestamp");
                str2 = jSONObject.getString("sign_nonce");
            } catch (Exception e) {
                PutLog(e.getMessage());
                return false;
            }
        } else {
            j = 0;
            str2 = "";
        }
        String str3 = str2;
        long j2 = j;
        if (aPIEnum == APIEnum.active || aPIEnum == APIEnum.link_account) {
            if (s_isNeedMultiResponse) {
                s_udkeys.clear();
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("keys");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (!(jSONObject2 == null || (ParseKeys = ParseKeys(jSONObject2, str3, j2)) == null)) {
                            s_udkeys.add(ParseKeys);
                        }
                    }
                } catch (Exception unused) {
                    return false;
                }
            } else {
                UDKeyInfo uDKeyInfo = null;
                if (aPIEnum == APIEnum.active) {
                    s_udkeys.clear();
                } else {
                    uDKeyInfo = SearchUDKeyInfo(s_useUdkey);
                    if (uDKeyInfo == null) {
                        return false;
                    }
                }
                UDKeyInfo ParseKeys2 = ParseKeys(jSONObject, str3, j2, uDKeyInfo);
                if (uDKeyInfo == null && ParseKeys2 != null) {
                    s_udkeys.add(ParseKeys2);
                }
            }
            if (aPIEnum == APIEnum.active) {
                try {
                    s_isLinked = jSONObject.getBoolean("is_linked");
                } catch (Exception unused2) {
                }
                try {
                    s_gdkey_max_num = jSONObject.getInt("max_gdkeys");
                } catch (Exception unused3) {
                }
                try {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("rc_client_version");
                    if (jSONObject3 != null) {
                        s_iOSRequestVersion = jSONObject3.getString("1");
                        s_AndroidRequestVersion = jSONObject3.getString("2");
                    }
                } catch (Exception unused4) {
                }
            }
            if (aPIEnum == APIEnum.link_account) {
                s_isLinked = true;
            }
            if (StringIsNullOrEmpty(s_useUdkey) && s_udkeys.size() > 0) {
                s_useUdkey = s_udkeys.get(0).udkey.key;
            }
        }
        if (aPIEnum == APIEnum.create_gdkey) {
            String str4 = s_useUdkey;
            Map<String, String> GetQueryMap = GetQueryMap(str);
            if (GetQueryMap.containsKey("udkey")) {
                str4 = GetQueryMap.get("udkey");
            }
            UDKeyInfo SearchUDKeyInfo = SearchUDKeyInfo(str4);
            if (SearchUDKeyInfo != null) {
                if (s_isNeedSignature) {
                    try {
                        JSONObject jSONObject4 = jSONObject.getJSONObject("gdkey");
                        String string = jSONObject4.getString("value");
                        String string2 = jSONObject4.getString("signature");
                        if (!StringIsNullOrEmpty(string)) {
                            KeyInfo keyInfo = new KeyInfo();
                            keyInfo.Set(string, string2, str3, j2);
                            SearchUDKeyInfo.gdkeys.add(keyInfo);
                        }
                    } catch (Exception e2) {
                        PutLog(e2.getMessage());
                        return false;
                    }
                } else {
                    try {
                        KeyInfo keyInfo2 = new KeyInfo();
                        keyInfo2.key = jSONObject.getString("gdkey");
                        if (!StringIsNullOrEmpty(keyInfo2.key)) {
                            SearchUDKeyInfo.gdkeys.add(keyInfo2);
                        }
                    } catch (Exception e3) {
                        PutLog(e3.getMessage());
                        return false;
                    }
                }
            }
        }
        if (aPIEnum == APIEnum.l5id_status) {
            try {
                JSONObject jSONObject5 = jSONObject.getJSONObject(NotificationCompat.CATEGORY_STATUS);
                s_status_code = jSONObject5.getInt("code");
                s_status_name = jSONObject5.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                s_status_point = jSONObject5.getInt("point");
            } catch (Exception e4) {
                PutLog(e4.getMessage());
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static void DeleteGdkeyFromList(String str) {
        boolean z;
        int GetUdkeyCount = GetUdkeyCount();
        for (int i = 0; i < GetUdkeyCount; i++) {
            UDKeyInfo uDKeyInfo = s_udkeys.get(i);
            if (uDKeyInfo != null) {
                int size = uDKeyInfo.gdkeys.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    } else if (uDKeyInfo.gdkeys.get(i2).key.equals(str)) {
                        uDKeyInfo.gdkeys.remove(i2);
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    return;
                }
            }
        }
    }

    public static void Cancel() {
        s_complete_request_id = s_requested_request_id;
    }

    public static boolean IsEndRequest() {
        return s_complete_request_id >= s_requested_request_id;
    }

    public static boolean IsLoggedIn() {
        return s_isLoggedIn;
    }

    public static String GetiOSRequestVersion() {
        return s_iOSRequestVersion;
    }

    public static String GetAndroidRequestVersion() {
        return s_AndroidRequestVersion;
    }

    public static String GetUdkey() {
        return s_useUdkey;
    }

    public static String GetUdkey(int i) {
        if (i < 0) {
            return GetUdkey();
        }
        if (s_udkeys.size() <= i) {
            return null;
        }
        return s_udkeys.get(i).udkey.key;
    }

    public static String GetUdkeySignature() {
        UDKeyInfo SearchUDKeyInfo = SearchUDKeyInfo(s_useUdkey);
        if (SearchUDKeyInfo != null) {
            return SearchUDKeyInfo.udkey.signature;
        }
        return null;
    }

    public static String GetUdkeySignature(int i) {
        if (i < 0) {
            return GetUdkeySignature();
        }
        if (s_udkeys.size() <= i) {
            return null;
        }
        return s_udkeys.get(i).udkey.signature;
    }

    public static String GetUdkeySignNonce() {
        UDKeyInfo SearchUDKeyInfo = SearchUDKeyInfo(s_useUdkey);
        if (SearchUDKeyInfo != null) {
            return SearchUDKeyInfo.udkey.sign_nonce;
        }
        return null;
    }

    public static String GetUdkeySignNonce(int i) {
        if (i < 0) {
            return GetUdkeySignNonce();
        }
        if (s_udkeys.size() <= i) {
            return null;
        }
        return s_udkeys.get(i).udkey.sign_nonce;
    }

    public static long GetUdkeySignTimeStamp() {
        UDKeyInfo SearchUDKeyInfo = SearchUDKeyInfo(s_useUdkey);
        if (SearchUDKeyInfo != null) {
            return SearchUDKeyInfo.udkey.sign_time_stamp;
        }
        return 0;
    }

    public static long GetUdkeySignTimeStamp(int i) {
        if (i < 0) {
            return GetUdkeySignTimeStamp();
        }
        if (s_udkeys.size() <= i) {
            return 0;
        }
        return s_udkeys.get(i).udkey.sign_time_stamp;
    }

    public static int GetUdkeyCount() {
        return s_udkeys.size();
    }

    public static String GetGdkey(int i) {
        UDKeyInfo SearchUDKeyInfo = SearchUDKeyInfo(s_useUdkey);
        if (SearchUDKeyInfo == null || SearchUDKeyInfo.gdkeys.size() <= i) {
            return null;
        }
        return SearchUDKeyInfo.gdkeys.get(i).key;
    }

    public static String GetGdkey(int i, int i2) {
        if (i2 < 0) {
            return GetGdkey(i);
        }
        if (s_udkeys.size() <= i2) {
            return null;
        }
        UDKeyInfo uDKeyInfo = s_udkeys.get(i2);
        if (uDKeyInfo.gdkeys.size() <= i) {
            return null;
        }
        return uDKeyInfo.gdkeys.get(i).key;
    }

    public static String GetGdkeySignature(int i) {
        UDKeyInfo SearchUDKeyInfo = SearchUDKeyInfo(s_useUdkey);
        if (SearchUDKeyInfo == null || SearchUDKeyInfo.gdkeys.size() <= i) {
            return null;
        }
        return SearchUDKeyInfo.gdkeys.get(i).signature;
    }

    public static String GetGdkeySignature(int i, int i2) {
        if (i2 < 0) {
            return GetGdkeySignature(i);
        }
        if (s_udkeys.size() <= i2) {
            return null;
        }
        UDKeyInfo uDKeyInfo = s_udkeys.get(i2);
        if (uDKeyInfo.gdkeys.size() <= i) {
            return null;
        }
        return uDKeyInfo.gdkeys.get(i).signature;
    }

    public static String GetGdkeySignNonce(int i) {
        UDKeyInfo SearchUDKeyInfo = SearchUDKeyInfo(s_useUdkey);
        if (SearchUDKeyInfo == null || SearchUDKeyInfo.gdkeys.size() <= i) {
            return null;
        }
        return SearchUDKeyInfo.gdkeys.get(i).sign_nonce;
    }

    public static String GetGdkeySignNonce(int i, int i2) {
        if (i2 < 0) {
            return GetGdkeySignNonce(i);
        }
        if (s_udkeys.size() <= i2) {
            return null;
        }
        UDKeyInfo uDKeyInfo = s_udkeys.get(i2);
        if (uDKeyInfo.gdkeys.size() <= i) {
            return null;
        }
        return uDKeyInfo.gdkeys.get(i).sign_nonce;
    }

    public static long GetGdkeySignTimeStamp(int i) {
        UDKeyInfo SearchUDKeyInfo = SearchUDKeyInfo(s_useUdkey);
        if (SearchUDKeyInfo == null || SearchUDKeyInfo.gdkeys.size() <= i) {
            return 0;
        }
        return SearchUDKeyInfo.gdkeys.get(i).sign_time_stamp;
    }

    public static long GetGdkeySignTimeStamp(int i, int i2) {
        if (i2 < 0) {
            return GetGdkeySignTimeStamp(i);
        }
        if (s_udkeys.size() <= i2) {
            return 0;
        }
        UDKeyInfo uDKeyInfo = s_udkeys.get(i2);
        if (uDKeyInfo.gdkeys.size() <= i) {
            return 0;
        }
        return uDKeyInfo.gdkeys.get(i).sign_time_stamp;
    }

    public static KeyInfo[] GetGdkeysKeyInfo() {
        UDKeyInfo SearchUDKeyInfo = SearchUDKeyInfo(s_useUdkey);
        if (SearchUDKeyInfo == null) {
            return null;
        }
        KeyInfo[] keyInfoArr = new KeyInfo[SearchUDKeyInfo.gdkeys.size()];
        SearchUDKeyInfo.gdkeys.toArray(keyInfoArr);
        return keyInfoArr;
    }

    public static String[] GetGdkeys() {
        UDKeyInfo SearchUDKeyInfo = SearchUDKeyInfo(s_useUdkey);
        if (SearchUDKeyInfo == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = SearchUDKeyInfo.gdkeys.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(SearchUDKeyInfo.gdkeys.get(i).key);
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static String[] GetGdkeys(int i) {
        UDKeyInfo uDKeyInfo;
        if (i < 0) {
            return GetGdkeys();
        }
        if (s_udkeys.size() <= i || (uDKeyInfo = s_udkeys.get(i)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = uDKeyInfo.gdkeys.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(uDKeyInfo.gdkeys.get(i2).key);
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public static int GetGdkeysCount() {
        UDKeyInfo SearchUDKeyInfo = SearchUDKeyInfo(s_useUdkey);
        if (SearchUDKeyInfo != null) {
            return SearchUDKeyInfo.gdkeys.size();
        }
        return 0;
    }

    public static int GetGdkeysCount(int i) {
        UDKeyInfo uDKeyInfo;
        if (i < 0) {
            return GetGdkeysCount();
        }
        if (s_udkeys.size() > i && (uDKeyInfo = s_udkeys.get(i)) != null) {
            return uDKeyInfo.gdkeys.size();
        }
        return 0;
    }

    public static int GetMaxGdkeyNum() {
        return s_gdkey_max_num;
    }

    public static boolean IsLinkedAccount() {
        return s_isLinked;
    }

    public static int GetLastStatusCode() {
        return s_last_connect_status_code;
    }

    public static int GetL5iDStatusCode() {
        return s_status_code;
    }

    public static String GetL5iDStatusName() {
        return s_status_name;
    }

    public static int GetL5iDStatusPoint() {
        return s_status_point;
    }

    public static String GetCloudSaveData() {
        return s_cloudSaveData;
    }

    public static String GetCloudSaveLastModified() {
        return s_cloudSaveLastModified;
    }

    private static boolean StringIsNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static Map<String, String> GetQueryMap(String str) {
        String[] split = str.split("&");
        HashMap hashMap = new HashMap();
        for (String split2 : split) {
            String[] split3 = split2.split("=", 2);
            hashMap.put(split3[0], split3[1]);
        }
        return hashMap;
    }

    public static class L5iDWebViewClient extends WebViewClient {
        public int request_id = 0;

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            try {
                Map<String, String> GetQueryMap = L5iD.GetQueryMap(new URI(str).getQuery());
                if (!GetQueryMap.containsKey("code")) {
                    return false;
                }
                if (L5iD.s_web_view_ui == null) {
                    return true;
                }
                String str2 = "apkey=" + L5iD.s_application_key + "&udkey=" + L5iD.s_useUdkey + "&code=" + GetQueryMap.get("code");
                if (L5iD.s_isNeedSignature) {
                    str2 = str2 + "&sign=true";
                }
                if (L5iD.s_isNeedMultiResponse) {
                    str2 = str2 + "&response_style=1";
                }
                L5iD.SendRequest(APIEnum.link_account, str2);
                L5iD.s_web_view_ui.destroy();
                WebViewUIBase unused = L5iD.s_web_view_ui = null;
                return true;
            } catch (Exception unused2) {
                return false;
            }
        }

        public void OnClickCloseWebView() {
            if (L5iD.s_web_view_ui != null) {
                L5iD.s_web_view_ui.destroy();
                WebViewUIBase unused = L5iD.s_web_view_ui = null;
            }
            int access$000 = L5iD.s_complete_request_id;
            int i = this.request_id;
            if (access$000 < i) {
                int unused2 = L5iD.s_complete_request_id = i;
            }
        }
    }
}
