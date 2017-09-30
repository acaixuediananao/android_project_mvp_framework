package com.android_project_mvp_framework.app;


import com.android_project_mvp_framework.AndroidApplication;
import com.android_project_mvp_framework.MainActivity;
import com.android_project_mvp_framework.module.AppModule;
import com.android_project_mvp_framework.module.NetWorkModule;
import com.android_project_mvp_framework.module.ServiceModule;
import com.android_project_mvp_framework.mvp.login.LoginActivity;
import com.android_project_mvp_framework.mvp.login.module.LoginModuleImpl;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by xiaolong.wei on 2017/9/14.
 */

@Singleton
@Component(modules = {ServiceModule.class,AppModule.class, NetWorkModule.class})
public interface ModuleInjector {

    void inject(AndroidApplication androidApplication);

    void inject(MainActivity mainActivity);

    void inject(LoginActivity loginActivity);

    void inject(LoginModuleImpl loginModuleImpl);
}
