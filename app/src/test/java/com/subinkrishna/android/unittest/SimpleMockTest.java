package com.subinkrishna.android.unittest;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

/**
 * Mock test sample using mockito.
 *
 * @author Subinkrishna Gopi
 */
public class SimpleMockTest {

    @Test
    public void hideKeyboardTest() {
        // Step 1: Creating mock objects
        Activity activity = mock(Activity.class);
        View view = mock(View.class);
        IBinder binder = mock(IBinder.class);
        InputMethodManager imm = mock(InputMethodManager.class);

        // Wire them together
        when(activity.getCurrentFocus()).thenReturn(view);
        when(activity.getSystemService(Context.INPUT_METHOD_SERVICE)).thenReturn(imm);
        when(view.getWindowToken()).thenReturn(binder);

        // Step 2: Call
        Util.hideKeyboard(activity);

        // Step 3: Verify
        verify(imm).hideSoftInputFromWindow(view.getWindowToken(), 0); // Verifies call to hideSoftInputFromWindow()
        verifyNoMoreInteractions(imm);  // Verifies no more interaction with imm
    }

    @Test
    public void hideKeyboardWithNoViewTest() {
        //Creating mock objects
        Activity activity = mock(Activity.class);
        IBinder binder = mock(IBinder.class);
        InputMethodManager imm = mock(InputMethodManager.class);

        // Wire them together
        when(activity.getCurrentFocus()).thenReturn(null); // No view
        when(activity.getSystemService(Context.INPUT_METHOD_SERVICE)).thenReturn(imm);

        // Call
        Util.hideKeyboard(activity);

        // Verify
        verifyZeroInteractions(imm); // Verifies no interaction with imm
    }

}
