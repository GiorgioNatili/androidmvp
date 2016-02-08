package io.webplatform.todolist.login;
/**
 * Created by Giorgio_Natili on 1/28/16.
 */
public interface LoginPresenter {

    void validateCredentials(String username, String password);
    void onDestroy();

}
