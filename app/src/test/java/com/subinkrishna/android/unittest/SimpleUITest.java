package com.subinkrishna.android.unittest;

import android.app.Activity;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

@RunWith (RobolectricTestRunner.class)
@Config  (emulateSdk = 18,
          reportSdk = 18)
public class SimpleUITest {

    /*
    http://tools.android.com/tech-docs/unit-testing-support
    http://blog.blundell-apps.com/android-gradle-app-with-robolectric-junit-tests/
     */

    @Test
    public void testMainActivityLabel() {
        // NOTE: This many not work until 3.0
        // https://github.com/robolectric/robolectric/issues/1446

        //Activity activity = Robolectric.setupActivity(MainActivity.class);
        //TextView label = (TextView) activity.findViewById(R.id.label);
        //assertEquals(label.getText().toString(), "Hello world!");
    }

}
