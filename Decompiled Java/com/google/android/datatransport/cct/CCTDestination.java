package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class CCTDestination implements EncodedDestination {
    private static final String DEFAULT_API_KEY = StringMerger.mergeStrings("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
    static final String DEFAULT_END_POINT = StringMerger.mergeStrings("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    static final String DESTINATION_NAME = "cct";
    private static final String EXTRAS_DELIMITER = "\\";
    private static final String EXTRAS_VERSION_MARKER = "1$";
    public static final CCTDestination INSTANCE = new CCTDestination(DEFAULT_END_POINT, (String) null);
    static final String LEGACY_END_POINT = StringMerger.mergeStrings("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
    public static final CCTDestination LEGACY_INSTANCE = new CCTDestination(LEGACY_END_POINT, DEFAULT_API_KEY);
    private static final Set<Encoding> SUPPORTED_ENCODINGS = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Encoding[]{Encoding.of("proto"), Encoding.of("json")})));
    @Nullable
    private final String apiKey;
    @NonNull
    private final String endPoint;

    @NonNull
    public String getName() {
        return DESTINATION_NAME;
    }

    public CCTDestination(@NonNull String str, @Nullable String str2) {
        this.endPoint = str;
        this.apiKey = str2;
    }

    @Nullable
    public byte[] getExtras() {
        return asByteArray();
    }

    public Set<Encoding> getSupportedEncodings() {
        return SUPPORTED_ENCODINGS;
    }

    @Nullable
    public String getAPIKey() {
        return this.apiKey;
    }

    @NonNull
    public String getEndPoint() {
        return this.endPoint;
    }

    @Nullable
    public byte[] asByteArray() {
        if (this.apiKey == null && this.endPoint == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = EXTRAS_VERSION_MARKER;
        objArr[1] = this.endPoint;
        objArr[2] = EXTRAS_DELIMITER;
        String str = this.apiKey;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName(Constants.ENCODING));
    }

    @NonNull
    public static CCTDestination fromByteArray(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName(Constants.ENCODING));
        if (str.startsWith(EXTRAS_VERSION_MARKER)) {
            String[] split = str.substring(2).split(Pattern.quote(EXTRAS_DELIMITER), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new CCTDestination(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @NonNull
    static byte[] encodeString(@NonNull String str) {
        return str.getBytes(Charset.forName(Constants.ENCODING));
    }

    @NonNull
    static String decodeExtras(@NonNull byte[] bArr) {
        return new String(bArr, Charset.forName(Constants.ENCODING));
    }
}
