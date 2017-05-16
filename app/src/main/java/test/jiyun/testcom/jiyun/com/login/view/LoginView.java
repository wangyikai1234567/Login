package test.jiyun.testcom.jiyun.com.login.view;

/**
 * date: 2017/5/16.
 * author: 王艺凯 (lenovo )
 * function:登陆View的接口，实现类也就是登陆的activity
 */


public interface LoginView {

    void ToastHahaha(String toast);

    void ToastError(String toast);

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();


}
