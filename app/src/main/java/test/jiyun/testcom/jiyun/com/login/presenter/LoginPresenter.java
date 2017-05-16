package test.jiyun.testcom.jiyun.com.login.presenter;

/**
 * date: 2017/5/16.
 * author: 王艺凯 (lenovo )
 * function:
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
