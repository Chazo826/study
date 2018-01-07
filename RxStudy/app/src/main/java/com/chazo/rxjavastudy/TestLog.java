package com.chazo.rxjavastudy;

import android.util.Log;

/**
 * Created by Choi Jaeung on 2018-01-07.
 */

public class TestLog {
    public static final String TAG = "TestLog";
    public static void it(Object obj){
        long time = System.currentTimeMillis()- CommonUtils.startTime;
        Log.d(TAG, Thread.currentThread().getName() + " | " + time + " | " + "value = " + obj);
    }
}
