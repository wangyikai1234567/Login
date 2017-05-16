package test.jiyun.testcom.jiyun.com.login.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import test.jiyun.testcom.jiyun.com.login.R;
import test.jiyun.testcom.jiyun.com.login.presenter.LoginPresenter;
import test.jiyun.testcom.jiyun.com.login.presenter.LoginPresenterImpl;

import static android.R.attr.maxItemsPerRow;
import static android.R.attr.password;
import static android.R.attr.start;

public class MainActivity extends AppCompatActivity implements LoginView, View.OnClickListener {

    private EditText mEd_username;
    private EditText mEd_password;
    private Button mBut_login;
    private LoginPresenterImpl mPresenter;
    private LoginPresenter mL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        mEd_username = (EditText) findViewById(R.id.ed_username);
        mEd_password = (EditText) findViewById(R.id.ed_password);
        mBut_login = (Button) findViewById(R.id.but_login);
        mL = new LoginPresenterImpl(this);
        mBut_login.setOnClickListener(this);
    }


    @Override
    public void ToastHahaha(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void ToastError(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setUsernameError() {
        mEd_username.setError("hhh");

    }

    @Override
    public void setPasswordError() {
        mEd_password.setError("www");
    }

    @Override
    public void navigateToHome() {
// TODO       startActivity(new Intent(this, MainActivity.class));
        Toast.makeText(this, "login success", Toast.LENGTH_SHORT).show();
//        finish()
    }


    @Override
    public void onClick(View v) {
        mL.validateCredentials(mEd_username.getText().toString(), mEd_password.getText().toString());

    }
}
