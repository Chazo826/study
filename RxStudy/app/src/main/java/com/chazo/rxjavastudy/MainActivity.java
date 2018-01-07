package com.chazo.rxjavastudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Observable.timer(1, TimeUnit.SECONDS)
                .repeat(10)
                .subscribe(TestLog::it);

//        CommonUtils.exampleStart();
//        TestLog.it("start");
//        t.start();
    }
    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            for(int i = 0; i < 10; i++){
                TestLog.it(i);
                CommonUtils.sleep(1000);
            }
        }
    });
}
