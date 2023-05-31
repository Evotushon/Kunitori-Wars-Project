package jp.co.koeitecmo.ktgl.android.http.client.request;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jp.co.koeitecmo.ktgl.android.util.Log;

public final class Body {
    List<Part> parts_;

    public static final class Part {
        private byte[] content_ = null;
        Map<String, String> headers_ = null;

        public Part(byte[] bArr) {
            this.content_ = bArr;
            this.headers_ = new HashMap();
        }

        public final void header(String str, String str2) {
            try {
                this.headers_.put(str, str2);
            } catch (UnsupportedOperationException e) {
                Log.e((Throwable) e);
            } catch (ClassCastException e2) {
                Log.e((Throwable) e2);
            } catch (IllegalArgumentException e3) {
                Log.e((Throwable) e3);
            } catch (NullPointerException e4) {
                Log.e((Throwable) e4);
            } catch (Exception e5) {
                Log.e((Throwable) e5);
            }
        }

        public final byte[] content() {
            return this.content_;
        }

        public final Set<String> headerKeys() {
            return this.headers_.keySet();
        }

        public final String headerValue(String str) {
            return this.headers_.get(str);
        }
    }

    public Body() {
        this.parts_ = null;
        this.parts_ = new ArrayList();
    }

    public final void append(Part part) {
        this.parts_.add(part);
    }

    public final byte[] entity(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        String str2 = new String("\r\n");
        String str3 = new String("--");
        try {
            for (Part next : this.parts_) {
                byte[] content = next.content();
                dataOutputStream.writeBytes(str3 + str + str2);
                for (String next2 : next.headerKeys()) {
                    dataOutputStream.writeBytes(String.format("%s: %s", new Object[]{next2, next.headerValue(next2)}));
                    dataOutputStream.writeBytes(str2);
                }
                dataOutputStream.writeBytes(str2);
                if (content != null) {
                    dataOutputStream.write(content);
                }
                dataOutputStream.writeBytes(str2);
            }
            dataOutputStream.writeBytes(str3 + str + str3 + str2);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            Log.e((Throwable) e);
            return null;
        }
    }

    public final byte[] entity() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            for (Part content : this.parts_) {
                byte[] content2 = content.content();
                if (content2 != null) {
                    dataOutputStream.write(content2);
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            Log.e((Throwable) e);
            return null;
        }
    }
}
