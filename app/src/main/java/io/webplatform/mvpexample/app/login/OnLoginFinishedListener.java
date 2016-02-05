package io.webplatform.mvpexample.app.login;
/**
 * Created by Giorgio_Natili on 1/28/16.
 */
public interface OnLoginFinishedListener {

    void onUsernameError();
    void onPasswordError();
    void onSuccess();

}
