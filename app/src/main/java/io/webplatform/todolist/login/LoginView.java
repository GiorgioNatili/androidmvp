package io.webplatform.todolist.login;

/**
 * Created by Giorgio_Natili on 1/28/16.
 */
public interface LoginView {

    void showProgress();
    void hideProgress();

    void setUsernameError();
    void setPasswordError();

    void navigateToHome();
    void showForgotPassword();


}
