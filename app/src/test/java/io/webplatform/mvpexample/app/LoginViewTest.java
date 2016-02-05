package io.webplatform.mvpexample.app;

import android.app.Activity;
import android.os.Build;
import android.widget.ProgressBar;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import io.webplatform.mvpexample.app.login.LoginActivity;
import io.webplatform.mvpexample.app.login.LoginView;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by Giorgio_Natili on 1/28/16.
 */


@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class LoginViewTest {

    private LoginView loginView;

    @Before
    public void setUp() {

        loginView = (LoginView) Robolectric.setupActivity(LoginActivity.class);

    }

    @Test
    public void testProgressIndicatorIsHidden() {


        final Activity activity = (Activity) loginView;
        final ProgressBar progressBar = (ProgressBar) activity.findViewById(R.id.progress);

        assertNotNull("checking that the progress bar exists", progressBar);
//
//        loginView.hideProgress();
//
//        assertTrue("the progress bar is hidden", progressBar.isVisible());
//
    }

}
