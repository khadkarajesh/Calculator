package com.crushcoder.calculator;


import android.widget.Button;
import android.widget.RelativeLayout;

import com.crushcoder.calculator.support.ResourceLocator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static com.crushcoder.calculator.support.Assert.assertViewIsVisible;
import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.robolectric.util.FragmentTestUtil.startFragment;

@RunWith(RobolectricTestRunner.class)
public class ButtonFragmentTest {

    private ButtonFragment buttonFragment;
    private RelativeLayout buttonContainer;

    @Before
    public void setUp() throws Exception {
        buttonFragment = ButtonFragment.newInstance();
        startFragment(buttonFragment);
        buttonContainer = buttonFragment.getView().findViewById(R.id.calculator_buttons);
    }

    @Test
    public void shouldBeNotNull() throws Exception {
        assertNotNull(buttonFragment);
        assertViewIsVisible(buttonContainer);
    }

    @Test
    public void shouldHaveOneButton() throws Exception {
        Button buttonOne = buttonFragment.getView().findViewById(R.id.button_1);
        assertViewIsVisible(buttonOne);
        assertThat(buttonOne.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_one)));
    }

    @Test
    public void shouldHaveTwoButton() throws Exception {
        Button buttonTwo = buttonFragment.getView().findViewById(R.id.button_2);
        assertViewIsVisible(buttonTwo);
        assertThat(buttonTwo.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_two)));
    }
}
