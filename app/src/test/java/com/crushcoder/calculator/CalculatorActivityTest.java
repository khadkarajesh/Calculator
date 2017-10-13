package com.crushcoder.calculator;


import android.app.Fragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static junit.framework.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
public class CalculatorActivityTest {
    CalculatorActivity calculatorActivity;
    private Fragment displayFragment;

    @Before
    public void setUp() throws Exception {
        calculatorActivity = Robolectric.setupActivity(CalculatorActivity.class);
        displayFragment = calculatorActivity.getFragmentManager().findFragmentById(R.id.display_fragment);
    }

    @Test
    public void shouldHaveDisplayFragment() throws Exception {
        assertNotNull(displayFragment);
    }
}