package com.xmliu.steepstatusbar;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by diyangxia on 2015/10/11.
 */
public class CommonTools {

    /**
     *  为界面设置沉浸式状态栏效果
     *  activity 当前Activity
     *  res 颜色id或者图片资源id
     */
    public static void initSystemBar(Activity activity,int res) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window win = activity.getWindow();
            WindowManager.LayoutParams winParams = win.getAttributes();
            final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
            winParams.flags |= bits;
            win.setAttributes(winParams);
        }
        SystemBarTintManager tintManager = new SystemBarTintManager(activity);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setStatusBarTintResource(res);
    }
}
