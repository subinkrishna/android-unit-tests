package com.subinkrishna.android.unittest;

import org.junit.Test;

import static com.subinkrishna.android.unittest.Util.isValidEmail;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Simple JUnit test.
 *
 * @author Subinkrishna Gopi
 */
public class SimpleTest {

    @Test
    public void testEmail() {
        assertTrue(isValidEmail("subin@domain.co.in"));
        assertTrue(isValidEmail("subin@domain"));
        assertTrue(isValidEmail("subin1982@domain.co"));

        assertFalse(isValidEmail("subin@@domain.com"));
        assertFalse(isValidEmail("subin.domain.com"));
        assertFalse(isValidEmail("subin@@domain..com"));
        assertFalse(isValidEmail("domain"));
        assertFalse(isValidEmail("@domain"));
        assertFalse(isValidEmail(""));
        assertFalse(isValidEmail(null));
    }

}