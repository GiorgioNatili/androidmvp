package io.webplatform.todolist;

import android.os.Build;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.Shadows;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;

import io.webplatform.todolist.forgotpassword.ForgotPasswordActivity;
import io.webplatform.todolist.forgotpassword.ForgotPasswordView;

import static junit.framework.Assert.assertTrue;

/**
 * Created by jillianforde on 2/15/16.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class ForgotPasswordActivityInteractorTest {

    private ForgotPasswordActivity mForgotPasswordActivity;
    private ForgotPasswordView mForgotPasswordView;

    @Before
    public void setup(){

        mForgotPasswordActivity = Robolectric.setupActivity(ForgotPasswordActivity.class);
        mForgotPasswordView = (ForgotPasswordView) mForgotPasswordActivity;
    }
    @Test
    public void testBackToLogin() {

        ShadowActivity shadowActivity = Shadows.shadowOf(mForgotPasswordActivity);


        mForgotPasswordView.goBackToPreviousActivity();
        assertTrue("verifying activity is dismissed", shadowActivity.isFinishing());
    }


}
