package test.jiyun.testcom.jiyun.com.login.presenter;

/**
 * date: 2017/5/16.
 * author: 王艺凯 (lenovo )
 * function:登陆事件监听
 */
public interface OnLoginFinishedListener {
    //三个抽象方法
    void onUsernameError();

    void onPasswordError();

    void onSuccess();


}
