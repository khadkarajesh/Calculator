package com.crushcoder.calculator;


import android.widget.EditText;

import com.crushcoder.calculator.support.ResourceLocator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static com.crushcoder.calculator.support.Assert.assertViewIsVisible;
import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.robolectric.util.FragmentTestUtil.startFragment;

@RunWith(RobolectricTestRunner.class)
public class DisplayFragmentTest {

    private DisplayFragment displayFragment;
    private EditText display;

    @Before
    public void setUp() throws Exception {
        displayFragment = DisplayFragment.newInstance();
        startFragment(displayFragment);
        display = displayFragment.getView().findViewById(R.id.calculator_display);
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(displayFragment);
    }

    @Test
    public void shouldHaveDisplay() throws Exception {
        assertViewIsVisible(display);
    }

    @Test
    public void shouldHaveDefaultDisplay() throws Exception {
        assertThat(display.getText().toString(), equalTo(ResourceLocator.getString(R.string.default_display)));
    }
}
