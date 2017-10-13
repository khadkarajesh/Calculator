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

    @Before
    public void setUp() throws Exception {
        calculatorActivity = Robolectric.setupActivity(CalculatorActivity.class);
    }

    @Test
    public void shouldHaveDisplayFragment() throws Exception {
        assertNotNull(getFragmentById(R.id.display_fragment));
    }

    @Test
    public void shouldHaveButtonFragment() throws Exception {
        assertNotNull(getFragmentById(R.id.button_fragment));
    }

    public Fragment getFragmentById(int id){
        return calculatorActivity.getFragmentManager().findFragmentById(id);
    }
}