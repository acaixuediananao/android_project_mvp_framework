package com.android_project_mvp_framework;

import android.app.Application;

import com.android_project_mvp_framework.app.DaggerModuleInjector;
import com.android_project_mvp_framework.app.ModuleInjector;


/**
 * Created by xiaolong.wei on 2017/9/14.
 */

public class AndroidApplication extends Application {
    private ModuleInjector moduleInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        moduleInjector = DaggerModuleInjector.create();
        moduleInjector.inject(this);

    }

    public ModuleInjector component(){
        return moduleInjector;
    }


}
