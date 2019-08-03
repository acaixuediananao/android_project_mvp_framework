package com.android_project_mvp_framework.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * @author xiaolong.wei
 */
public abstract class BaseActivity extends DaggerAppCompatActivity implements IView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        init();
    }

    /**
     * 返回布局文件的id
     * @return
     */
    public abstract int getLayoutId();


    /**
     * 初始化数据
     */
    public abstract void init();

    @Override
    public void showToast(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
