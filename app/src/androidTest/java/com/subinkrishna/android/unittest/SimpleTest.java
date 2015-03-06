package com.subinkrishna.android.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLog;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(shadows = {ShadowLog.class},
        manifest = "src/main/AndroidManifest.xml")
public class SimpleTest {

    @Test
    public void test() {
        assertTrue(true);    // Pass
        assertTrue(false);   // Fail
    }

}