package com.answer.logutil.util;

import android.os.Environment;
import android.util.Log;

import com.answer.logutil.BuildConfig;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by jianhaohong on 2/9/15.
 */
public class LogUtils {

    public static String LOG_FILE_NAME = "LogUtils.log";

    public static void LOGD(String tag, String message) {
        if (canLog()) {
            Log.d(tag, avoidNullString(message));
        }
    }

    public static void LOGV(String tag, String message) {
        if (canLog()) {
            Log.v(tag, avoidNullString(message));
        }
    }

    public static void LOGI(String tag, String message) {
        if (canLog()) {
            Log.i(tag, avoidNullString(message));
        }
    }

    public static void LOGW(String tag, String message) {
        if (canLog()) {
            Log.w(tag, avoidNullString(message));
        }
    }


    public static void LOGE(String tag, String message) {
        if (canLog()) {
            Log.e(tag, avoidNullString(message));
        }
    }


    public static void LOGD(final String tag, String message, Throwable cause) {
        if (canLog()) {
            Log.d(tag, avoidNullString(message), cause);
        }
    }


    public static void LOGV(final String tag, String message, Throwable cause) {
        if (canLog()) {
            Log.v(tag, avoidNullString(message), cause);
        }
    }


    public static void LOGI(final String tag, String message, Throwable cause) {
        if (canLog()) {
            Log.i(tag, avoidNullString(message), cause);
        }
    }


    public static void LOGW(final String tag, String message, Throwable cause) {
        if (canLog()) {
            Log.w(tag, avoidNullString(message), cause);
        }
    }


    public static void LOGE(final String tag, String message, Throwable cause) {
        if (canLog()) {
            Log.e(tag, avoidNullString(message), cause);
        }
    }


    public static void LOGV(String message) {
        if (canLog()) {
            StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
            Log.v(stackTraceElements[0].getClassName(), avoidNullString(message));
        }
    }


    public static void LOGD(String message) {
        if (canLog()) {
            StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
            Log.d(stackTraceElements[0].getClassName(), avoidNullString(message));
        }
    }

    public static void LOGW(String message) {
        if (canLog()) {
            StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
            Log.w(stackTraceElements[0].getClassName(), avoidNullString(message));
        }
    }


    public static void LOGI(String message) {
        if (canLog()) {
            StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
            Log.i(stackTraceElements[0].getClassName(), avoidNullString(message));
        }
    }

    public static void LOGE(String message) {
        if (canLog()) {
            StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
            Log.e(stackTraceElements[0].getClassName(), avoidNullString(message));
        }
    }


    public static void LOGD(String message, Throwable cause) {
        if (canLog()) {
            StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
            Log.d(stackTraceElements[0].getClassName(), avoidNullString(message), cause);
        }
    }

    public static void LOGV(String message, Throwable cause) {
        if (canLog()) {
            StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
            Log.v(stackTraceElements[0].getClassName(), avoidNullString(message), cause);
        }
    }

    public static void LOGI(String message, Throwable cause) {
        if (canLog()) {
            StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
            Log.i(stackTraceElements[0].getClassName(), avoidNullString(message), cause);
        }
    }

    public static void LOGW(String message, Throwable cause) {
        if (canLog()) {
            StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
            Log.w(stackTraceElements[0].getClassName(), avoidNullString(message), cause);
        }
    }


    public static void LOGE(String message, Throwable cause) {
        if (canLog()) {
            StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
            Log.e(stackTraceElements[0].getClassName(), avoidNullString(message), cause);
        }
    }

    public static void LogToFile(String message) {
        String path = Environment.getExternalStorageDirectory().getAbsolutePath()
                + File.separator + LOG_FILE_NAME;
        try {
            FileWriter writer = new FileWriter(path, true);
            writer.write(avoidNullString(message) + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void deleteLogFile() {
        String path = Environment.getExternalStorageDirectory().getAbsolutePath()
                + File.separator + LOG_FILE_NAME;
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
    }

    private static String avoidNullString(String string) {
        if (string == null) {
            return "null";
        }
        return string;
    }

    private static boolean canLog() {
        return BuildConfig.DEBUG;
    }

    private LogUtils() {
    }
}
