package io.webplatform.todolist.login;

import android.os.Handler;
import android.text.TextUtils;
/**
 * Created by Giorgio_Natili on 1/28/16.
 */
public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {

                boolean error = false;

                if (TextUtils.isEmpty(username)){

                    listener.onUsernameError();
                    error = true;

                }

                if (TextUtils.isEmpty(password)){

                    listener.onPasswordError();
                    error = true;
                }

                if (!error){
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
