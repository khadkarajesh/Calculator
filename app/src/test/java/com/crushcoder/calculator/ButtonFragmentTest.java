package com.crushcoder.calculator;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static com.crushcoder.calculator.support.Assert.assertViewIsVisible;
import static junit.framework.Assert.assertNotNull;
import static org.robolectric.util.FragmentTestUtil.startFragment;

@RunWith(RobolectricTestRunner.class)
public class ButtonFragmentTest {

    private ButtonFragment buttonFragment;

    @Before
    public void setUp() throws Exception {
        buttonFragment = ButtonFragment.newInstance();
    }

    @Test
    public void shouldBeNotNull() throws Exception {
        assertNotNull(buttonFragment);
        startFragment(buttonFragment);
        assertViewIsVisible(buttonFragment.getView().findViewById(R.id.calculator_buttons));
    }
}
