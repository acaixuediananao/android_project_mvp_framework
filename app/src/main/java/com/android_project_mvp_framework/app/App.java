package com.android_project_mvp_framework.app;

import android.app.Activity;
import com.android_project_mvp_framework.AndroidApplication;

/**
 * Created by xiaolong.wei on 2017/9/14.
 */

public class App {

    public static <T extends Activity> ModuleInjector cmptActivity(T activity){
        return ((AndroidApplication) ((Activity) activity).getApplication()).component();
    }

//    public static <T extends IModule> ModuleInjector cmptIModule(T module){
//        return ((AndroidApplication) ((Activity) module).getApplication()).component();
//    }
}
