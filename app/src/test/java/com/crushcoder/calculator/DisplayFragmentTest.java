package com.crushcoder.calculator;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static com.crushcoder.calculator.support.Assert.assertViewIsVisible;
import static junit.framework.Assert.assertNotNull;
import static org.robolectric.util.FragmentTestUtil.startFragment;

@RunWith(RobolectricTestRunner.class)
public class DisplayFragmentTest {

    private DisplayFragment displayFragment;

    @Before
    public void setUp() throws Exception {
        displayFragment = DisplayFragment.newInstance();
        startFragment(displayFragment);
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(displayFragment);
    }

    @Test
    public void shouldHaveDisplay() throws Exception {
        assertViewIsVisible(displayFragment.getView().findViewById(R.id.calculator_display));
    }
}
