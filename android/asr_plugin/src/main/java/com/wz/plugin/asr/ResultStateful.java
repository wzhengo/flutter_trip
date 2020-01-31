package com.wz.plugin.asr;

import android.util.Log;

import io.flutter.plugin.common.MethodChannel;

/**
 * @author wangzhen
 * @date 2020/01/23
 */
public class ResultStateful implements MethodChannel.Result {

    private final static String TAG = "ResultStateful";
    private MethodChannel.Result result;
    private boolean called;

    public static ResultStateful of(MethodChannel.Result result) {
        return new ResultStateful(result);
    }

    private ResultStateful(MethodChannel.Result result) {
        this.result = result;
    }

    @Override
    public void success(Object o) {
        if (called) {
            printError();
            return;
        }
        called = true;
        result.success(o);
    }

    @Override
    public void error(String errorCode, String errorMessage, Object errorDetails) {
        if (called) {
            printError();
            return;
        }
        called = true;
        result.error(errorCode, errorMessage, errorDetails);
    }

    @Override
    public void notImplemented() {
        if (called) {
            printError();
            return;
        }
        called = true;
        result.notImplemented();
    }

    private void printError() {
        Log.e(TAG, "error:result called");
    }
}
