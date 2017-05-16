package test.jiyun.testcom.jiyun.com.login.model;

import test.jiyun.testcom.jiyun.com.login.presenter.OnLoginFinishedListener;

/**
 * date: 2017/5/16.
 * author: 王艺凯 (lenovo )
 * function:
 */
//接口
public interface LoginModel {

    void login(String userName,String passWord, OnLoginFinishedListener listener);

}
