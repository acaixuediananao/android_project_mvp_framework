package com.android_project_mvp_framework.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * @author xiaolong.wei
 */
@Module
public class RxAndroidModule {

    @Provides
    @Singleton
    CompositeDisposable provideCompositeDisposable(){
        return new CompositeDisposable();
    }
}
