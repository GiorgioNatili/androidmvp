package io.webplatform.todolist;

/**
 * Created by Giorgio_Natili on 2/8/16.
 */

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;


import io.webplatform.todolist.login.LoginActivity;
import io.webplatform.todolist.login.LoginView;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class LoginViewTest {

    private LoginView loginView;
    private Activity currentActivity;
    private ProgressBar mProgressBar;

    @Before
    public void setUp() {

        loginView = (LoginView) Robolectric.setupActivity(LoginActivity.class);
        currentActivity = (Activity) loginView;

        mProgressBar = (ProgressBar) currentActivity.findViewById(R.id.progress);

    }

    @After
    public void tearDown() {

        loginView = null;
        currentActivity = null;
        mProgressBar = null;

    }

    @Test
    public void testProgressbarExistsAndIsHidden() {

        assertNotNull("checking that the progress bar exists", mProgressBar);
        assertTrue("checking the progress bar visibility", mProgressBar.getVisibility() == View.GONE);

    }

    @Test
    public void testProgressIndicatorShowsAndHide() {

        loginView.showProgress();
        loginView.hideProgress();

        assertTrue("checking progress bar is visible", mProgressBar.getVisibility() == View.GONE);

    }

    @Test
    public void testUsernameErrorExist() {

        final EditText username = (EditText) currentActivity.findViewById(R.id.username);

        assertNotNull("checking the username error EditText exist", username);

    }

    @Test
    public void testSetUsernameError() {

        final EditText username = (EditText) currentActivity.findViewById(R.id.username);

        loginView.setUsernameError();

        assertTrue("checking the error message exists", username.getError().toString().length() > 0);

        final String errorMessage = username.getError().toString();
        assertTrue("checking the error message is R.string.username_error", errorMessage.equals("Username cannot be empty"));

    }

    @Test
    public void testRecoverPasswordExist() {

        final Button recoverPassword = (Button) currentActivity.findViewById(R.id.forgot_password);
        assertNotNull("checking the recover password button exist", recoverPassword);

    }

    @Test
    public void testRecoverPasswordLabel() {

        final Button recoverPassword = (Button) currentActivity.findViewById(R.id.forgot_password);

        final String recoverLabel = recoverPassword.getText().toString();
        assertTrue("checking the recover password label is equal to R.string.recover_password", recoverLabel.equals("Recover Password"));

    }

}