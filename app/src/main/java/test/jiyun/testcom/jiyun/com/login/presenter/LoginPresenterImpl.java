package test.jiyun.testcom.jiyun.com.login.presenter;

import test.jiyun.testcom.jiyun.com.login.model.LoginModel;
import test.jiyun.testcom.jiyun.com.login.model.LoginModelImpl;
import test.jiyun.testcom.jiyun.com.login.view.LoginView;

/**
 * date: 2017/5/16.
 * author: 王艺凯 (lenovo )
 * function:
 */

public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishedListener {


    private LoginModel mLoginModel;
    private LoginView mLoginView;

    public LoginPresenterImpl(LoginView loginView) {
        mLoginView = loginView;
        this.mLoginModel = new LoginModelImpl();
    }

    //LoginPresenter
    @Override
    public void validateCredentials(String username, String password) {

        mLoginModel.login(username, password, this);


    }

    @Override
    public void onDestroy() {

        mLoginView = null;
    }

    //OnLoginFinishedListener
    @Override
    public void onUsernameError() {
        if (mLoginView != null) {
            mLoginView.setUsernameError();
            mLoginView.ToastHahaha("账号错误");
        }
    }

    @Override
    public void onPasswordError() {
        if (mLoginView != null) {
            mLoginView.setPasswordError();
            mLoginView.ToastError("密码错误");
        }
    }

    @Override
    public void onSuccess() {
        if (mLoginView != null) {
            mLoginView.navigateToHome();
        }
    }
}