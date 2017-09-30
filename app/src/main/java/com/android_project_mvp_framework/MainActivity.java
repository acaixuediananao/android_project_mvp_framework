package com.android_project_mvp_framework;

import android.os.Bundle;
import android.support.constraint.Guideline;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android_project_mvp_framework.app.App;
import com.android_project_mvp_framework.bean.ErrorBean;
import com.android_project_mvp_framework.bean.LoginBean;
import com.android_project_mvp_framework.net.ResponseCallBack;
import com.android_project_mvp_framework.net.ResponseResult;
import com.android_project_mvp_framework.service.ApiService;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
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

    String usernameString;
    String passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        App.cmptActivity(this).inject(this);
    }


//    @OnClick(R.id.login)
//    void click(View view) {
//        authService.getData("eda61a2c1dff70d56afb6348d5234627").enqueue(new ResponseCallBack<DataBean>() {
//            @Override
//            public void onSuccess(DataBean testBean) {
//                textView.setText(testBean.getActivity().getCategory());
//            }
//
//            @Override
//            public void onFailure(String msg) {
//                Toast.makeText(LoginActivity.this,msg,Toast.LENGTH_LONG).show();
//            }
//        });
//    }


    @OnClick({R.id.login, R.id.register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.login:

                usernameString = username.getText().toString();
                passwordString = password.getText().toString();

                authService.login(usernameString, passwordString, "/").enqueue(new ResponseCallBack<ResponseResult<LoginBean>>() {
                    @Override
                    public void onSuccess(ResponseResult<LoginBean> loginBeanResponseResult) {
                        Toast.makeText(MainActivity.this, loginBeanResponseResult.getData().getT(), Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onFailure(String s) {
                        Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onNoResponse(int code, String msg) {

                    }

                });
//                new ResponseCallBack<LoginBean>() {
//                    @Override
//                    public void onSuccess(LoginBean loginBean) {
//                        Toast.makeText(MainActivity.this, loginBean.getT(), Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onFailure(List<ErrorBean> errorBean , String msg) {
//                        if (errorBean != null){
//                            Toast.makeText(MainActivity.this, errorBean.get(0).getMsg(), Toast.LENGTH_LONG).show();
//                        }else {
//                            Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
//                        }
//
//                    }
//                }
                break;
            case R.id.register:
                break;
        }
    }
}
