package com.chazo.rxjavastudy;

/**
 * Created by Choi Jaeung on 2018-01-07.
 */

public class CommonUtils {
    public static long startTime;

    public static void exampleStart(){
        startTime = System.currentTimeMillis();
    }

    public static void sleep(int millis){
        try{
            Thread.sleep(millis);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
