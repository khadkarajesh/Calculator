package com.crushcoder.calculator;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static junit.framework.Assert.assertNotNull;
import static org.robolectric.util.FragmentTestUtil.startFragment;

@RunWith(RobolectricTestRunner.class)
public class DisplayFragmentTest {
    @Test
    public void shouldNotBeNull() throws Exception {
        DisplayFragment displayFragment = new DisplayFragment();
        startFragment(displayFragment);
        assertNotNull(displayFragment);
    }
}
