package com.air.testjni;

import android.util.Log;

public class NativeHelper {
    private static final String TAG = "NativeHelper";

    // Used to load the 'testjni' library on application startup.
    static {
        System.loadLibrary("testjni_test");
    }

    public static void command1(float a){
        Log.d(TAG, "command1: " + a);
    }

    public static void commond2(String s) {
        Log.i(TAG, "commond2: ---------" + s);
    }

    public static void commond3(int a, String s) {
        Log.i(TAG, "commond3: ----S:" + s + "--A:" + a);
    }

    public void commond4(int a) {
        Log.i(TAG, "commond4: ------A:" + a);
    }

    /**
     * A native method that is implemented by the 'testjni' native library,
     * which is packaged with this application.
     */
    public static native String stringFromJNI();

    public static native void callJava();
}
