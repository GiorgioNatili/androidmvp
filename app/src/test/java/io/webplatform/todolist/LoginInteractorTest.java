package io.webplatform.todolist;

/**
 * Created by Giorgio_Natili on 2/8/16.
 */

import android.os.Build;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import io.webplatform.todolist.login.LoginInteractor;
import io.webplatform.todolist.login.LoginInteractorImpl;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class LoginInteractorTest {

    private LoginInteractor mLoginInteractor;

    @Before
    public void setup() {

        mLoginInteractor = (LoginInteractor) new LoginInteractorImpl();

    }

    @After
    public void tearDown() {

        mLoginInteractor = null;

    }

    @Test
    public void testStoreCredentials() {

        mLoginInteractor.storeCredentials(true);
        assertTrue("checking user credentials are getting stored", mLoginInteractor.getCredentialsStatus());

        mLoginInteractor.storeCredentials(false);
        assertFalse("checking user credentials are NOT getting stored", mLoginInteractor.getCredentialsStatus());

    }

}
