package io.webplatform.mvpexample.app.login;
/**
 * Created by Giorgio_Natili on 1/28/16.
 */
public interface LoginInteractor {
    void login(String username, String password, OnLoginFinishedListener listener);
}
