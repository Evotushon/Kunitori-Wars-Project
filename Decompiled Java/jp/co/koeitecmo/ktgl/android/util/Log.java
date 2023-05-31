package jp.co.koeitecmo.ktgl.android.util;

import android.util.LogPrinter;
import jp.co.koeitecmo.ktgl.BuildConfig;

public final class Log {
    static final int DEBUG = 3;
    static final int ERROR = 6;
    static final int INFO = 4;
    static final int VERBOSE = 2;
    static final int WARN = 5;
    static boolean suppress_ = true;

    public static void suppress(boolean z) {
        suppress_ = z;
    }

    public static void v(Throwable th) {
        print(2, th);
    }

    public static void d(Throwable th) {
        print(3, th);
    }

    public static void i(Throwable th) {
        print(4, th);
    }

    public static void w(Throwable th) {
        print(5, th);
    }

    public static void e(Throwable th) {
        print(6, th);
    }

    public static void v(String str) {
        print(2, str);
    }

    public static void d(String str) {
        print(3, str);
    }

    public static void i(String str) {
        print(4, str);
    }

    public static void w(String str) {
        print(5, str);
    }

    public static void e(String str) {
        print(6, str);
    }

    private static void print(int i, Throwable th) {
        if (!suppress_) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String message = th.getMessage();
            String str = "";
            if (stackTrace == null || 5 > stackTrace.length) {
                LogPrinter logPrinter = new LogPrinter(i, BuildConfig.APPLICATION_ID);
                if (message == null) {
                    message = str;
                }
                logPrinter.println(message);
                return;
            }
            StackTraceElement stackTraceElement = stackTrace[4];
            th.printStackTrace();
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            int lineNumber = stackTraceElement.getLineNumber();
            LogPrinter logPrinter2 = new LogPrinter(i, className != null ? className : str);
            if (message == null) {
                message = str;
            }
            logPrinter2.println(message);
            StringBuilder sb = new StringBuilder();
            sb.append("at ");
            if (className == null) {
                className = str;
            }
            sb.append(className);
            sb.append(".");
            if (methodName == null) {
                methodName = str;
            }
            sb.append(methodName);
            sb.append("(");
            if (fileName != null) {
                str = fileName;
            }
            sb.append(str);
            sb.append(":");
            sb.append(lineNumber);
            sb.append(")");
            logPrinter2.println(sb.toString());
        }
    }

    private static void print(int i, String str) {
        if (!suppress_) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String str2 = "";
            if (stackTrace == null || 5 > stackTrace.length) {
                LogPrinter logPrinter = new LogPrinter(i, BuildConfig.APPLICATION_ID);
                if (str == null) {
                    str = str2;
                }
                logPrinter.println(str);
                return;
            }
            StackTraceElement stackTraceElement = stackTrace[4];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            int lineNumber = stackTraceElement.getLineNumber();
            LogPrinter logPrinter2 = new LogPrinter(i, className != null ? className : str2);
            if (str == null) {
                str = str2;
            }
            logPrinter2.println(str);
            StringBuilder sb = new StringBuilder();
            sb.append("at ");
            if (className == null) {
                className = str2;
            }
            sb.append(className);
            sb.append(".");
            if (methodName == null) {
                methodName = str2;
            }
            sb.append(methodName);
            sb.append("(");
            if (fileName != null) {
                str2 = fileName;
            }
            sb.append(str2);
            sb.append(":");
            sb.append(lineNumber);
            sb.append(")");
            logPrinter2.println(sb.toString());
        }
    }
}
