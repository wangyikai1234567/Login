package test.jiyun.testcom.jiyun.com.login.model;

import android.os.Handler;
import android.text.TextUtils;

import test.jiyun.testcom.jiyun.com.login.presenter.OnLoginFinishedListener;

/**
 * date: 2017/5/16.
 * author: 王艺凯 (lenovo )
 * function::延时模拟登陆（2s），如果名字或者密码为空则登陆失败，否则登陆成功
 */

public class LoginModelImpl implements LoginModel {
    @Override
    public void login(final String userName, final String passWord, final OnLoginFinishedListener listener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                //如果username为空
                if (TextUtils.isEmpty(userName)) {
                    //？？？？
                    listener.onUsernameError();

                    error = true;
                }
                //如果密码为空
                if (TextUtils.isEmpty(passWord)) {
                    // ??
                    listener.onPasswordError();
                    error = true;
                }
                if (!error) {
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
