package com.crushcoder.calculator;


import android.widget.EditText;

import com.crushcoder.calculator.support.ResourceLocator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static com.crushcoder.calculator.support.Assert.assertViewIsVisible;
import static junit.framework.Assert.assertEquals;
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

    @Test
    public void shouldShowText() throws Exception {
        displayFragment.setDisplay("1");
        displayFragment.setDisplay("+");
        displayFragment.setDisplay("2");
        assertEquals("1+2", display.getText().toString());
    }

    @Test
    public void shouldMultiply() throws Exception {
        displayFragment.setDisplay("1");
        displayFragment.setDisplay("*");
        displayFragment.setDisplay("2");
        displayFragment.setDisplay("=");
        assertEquals("2", display.getText().toString());
    }

    @Test
    public void shouldDivide() throws Exception {
        displayFragment.setDisplay("6");
        displayFragment.setDisplay("/");
        displayFragment.setDisplay("2");
        displayFragment.setDisplay("=");
        assertEquals("3.0", display.getText().toString());
    }

    @Test
    public void shouldDivideFloatValue() throws Exception {
        displayFragment.setDisplay("1");
        displayFragment.setDisplay("/");
        displayFragment.setDisplay("2");
        displayFragment.setDisplay("=");
        assertEquals("0.5", display.getText().toString());
    }

    @Test
    public void shouldMinusValue() throws Exception {
        displayFragment.setDisplay("2");
        displayFragment.setDisplay("-");
        displayFragment.setDisplay("2");
        displayFragment.setDisplay("=");
        assertEquals("0", display.getText().toString());

        displayFragment.setDisplay("3");
        displayFragment.setDisplay("-");
        displayFragment.setDisplay("2");
        displayFragment.setDisplay("=");
        assertEquals("1", display.getText().toString());
    }

    @Test
    public void shouldAddDigits() throws Exception {
        displayFragment.setDisplay("1");
        displayFragment.setDisplay("+");
        displayFragment.setDisplay("2");
        displayFragment.setDisplay("=");
        assertEquals("3", display.getText().toString());
    }
}
