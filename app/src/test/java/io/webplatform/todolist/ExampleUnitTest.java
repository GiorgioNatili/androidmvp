package io.webplatform.todolist;

import org.junit.Test;

import io.webplatform.todolist.login.utils.UserUtils;
import io.webplatform.todolist.login.utils.UserUtilsImpl;
import model.identities.User;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void notAuthenticatedByDefault() {

        final User user = new User();
        final UserUtils userUtils = (UserUtils) new UserUtilsImpl(user);

        assertFalse(userUtils.isAuthenticated());

    }
}