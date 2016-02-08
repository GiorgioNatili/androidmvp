package io.webplatform.todolist;

/**
 * Created by Giorgio_Natili on 2/8/16.
 */

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.widget.ProgressBar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import io.webplatform.todolist.BuildConfig;
import io.webplatform.todolist.R;
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

}
