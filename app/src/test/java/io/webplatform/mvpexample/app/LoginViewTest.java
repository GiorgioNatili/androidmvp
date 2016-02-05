package io.webplatform.mvpexample.app;

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

import io.webplatform.mvpexample.app.login.LoginActivity;
import io.webplatform.mvpexample.app.login.LoginView;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Giorgio_Natili on 1/28/16.
 */


@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class LoginViewTest {

    private LoginView loginView;
    private Activity currentActivity;

    @Before
    public void setUp() {

        loginView = (LoginView) Robolectric.setupActivity(LoginActivity.class);
        currentActivity = (Activity) loginView;

    }

    @After
    public void tearDown() {

        loginView = null;
        currentActivity = null;
    }

    @Test
    public void testProgressIndicatorIsHidden() {

        final ProgressBar progressBar = (ProgressBar) currentActivity.findViewById(R.id.progress);

        assertNotNull("checking that the progress bar exists", progressBar);
        assertTrue("checking the progress bar visibility", progressBar.getVisibility() == View.VISIBLE);

        loginView.hideProgress();

        assertTrue("checking the progress bar is not visible", progressBar.getVisibility() == View.GONE);

    }

    // Test that the progress base is shown correctly
    //  - You first hide the progress bar
    //  - You show the progress bar
    //  - You verify the value returned by getVisibility()

}
