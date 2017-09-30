package com.android_project_mvp_framework.mvp.login;

import android.os.Bundle;
import android.support.constraint.Guideline;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android_project_mvp_framework.R;
import com.android_project_mvp_framework.app.App;
import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.mvp.login.presenter.LoginPresenterImpl;
import com.android_project_mvp_framework.mvp.login.view.ILoginView;
import com.android_project_mvp_framework.service.ApiService;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements ILoginView{
    @BindView(R.id.text)
    TextView textView;
    @Inject
    ApiService authService;
    @BindView(R.id.login)
    Button login;
    @BindView(R.id.guideline)
    Guideline guideline;
    @BindView(R.id.register)
    Button register;
    @BindView(R.id.username)
    EditText username;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    private LoginPresenterImpl mLoginPresenterImpl;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        App.cmptActivity(this).inject(this);
        initData();
    }

    private void initData(){
        mLoginPresenterImpl = new LoginPresenterImpl(this);
    }


    @OnClick({R.id.login, R.id.register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.login:
                mLoginPresenterImpl.login(getUserName(),getPassword());
                break;
            case R.id.register:
                break;
        }
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public String getUserName() {
        return username.getText().toString();
    }

    @Override
    public String getPassword() {
        return password.getText().toString();
    }

    @Override
    public void setDate(LoginBean loginBean) {
        textView.setText(loginBean.getTicket());
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}