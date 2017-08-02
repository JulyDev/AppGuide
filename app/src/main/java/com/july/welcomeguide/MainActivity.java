package com.july.welcomeguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * 首页
 */
public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 如果没有显示过引导图，则显示之（为了方便查看效果，此处把判断条件注释掉了）
        // if (ConfigUtil.needShowGuide(this))
        {
            startActivity(new Intent(this, WelcomeGuideActivity.class));
        }
        // 首页其他部分该怎么显示就怎么显示
        // ……
    }
}
