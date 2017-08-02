package com.july.welcomeguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by July on 2017/8/1.
 */

public class FirstActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        // 根据需要，做些初始化操作
        // init();
        // 模拟跳转MainActivity时机
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                startActivity(new Intent(FirstActivity.this, MainActivity.class));
                finish();
            }
        }, 1000);

    }
}
