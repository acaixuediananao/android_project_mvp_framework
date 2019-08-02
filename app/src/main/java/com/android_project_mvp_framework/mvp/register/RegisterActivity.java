package com.android_project_mvp_framework.mvp.register;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.android_project_mvp_framework.R;
import com.android_project_mvp_framework.service.ApiService;
import javax.inject.Inject;
import dagger.android.support.DaggerAppCompatActivity;

public class RegisterActivity extends DaggerAppCompatActivity {
    private static final String TAG = "RegisterActivity";
    @Inject
    ApiService apiService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        if (apiService == null){
            Log.d(TAG, "onCreate: api service is null");
        }else {
            Log.d(TAG, "onCreate: api service is not null");
        }
    }
}
