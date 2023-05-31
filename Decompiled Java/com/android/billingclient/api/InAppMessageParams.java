package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@zzd
/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final class InAppMessageParams {
    private final ArrayList<Integer> mInAppMessageCategories;

    @zzd
    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    public static final class Builder {
        private final Set<Integer> mInAppMessageCategories = new HashSet();

        @NonNull
        public Builder addAllInAppMessageCategoriesToShow() {
            this.mInAppMessageCategories.add(2);
            return this;
        }

        @NonNull
        public Builder addInAppMessageCategoryToShow(int i) {
            this.mInAppMessageCategories.add(Integer.valueOf(i));
            return this;
        }

        @NonNull
        public InAppMessageParams build() {
            return new InAppMessageParams(this.mInAppMessageCategories);
        }
    }

    @zzd
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    public @interface InAppMessageCategoryId {
        public static final int TRANSACTIONAL = 2;
        public static final int UNKNOWN_IN_APP_MESSAGE_CATEGORY_ID = 0;
    }

    private InAppMessageParams(Set<Integer> set) {
        this.mInAppMessageCategories = new ArrayList<>(Collections.unmodifiableList(new ArrayList(set)));
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    /* access modifiers changed from: package-private */
    public ArrayList<Integer> getInAppMessageCategoriesToShow() {
        return this.mInAppMessageCategories;
    }
}
