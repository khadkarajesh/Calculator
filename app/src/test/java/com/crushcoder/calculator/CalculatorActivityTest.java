package com.crushcoder.calculator;

import android.widget.TextView;

import com.crushcoder.calculator.support.ResourceLocator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static com.crushcoder.calculator.support.Assert.assertViewIsVisible;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class CalculatorActivityTest {
    CalculatorActivity calculatorActivity;

    @Before
    public void setUp() throws Exception {
        calculatorActivity = Robolectric.setupActivity(CalculatorActivity.class);
    }

    @Test
    public void shouldShowGreetings() throws Exception {
        TextView textView = calculatorActivity.findViewById(R.id.calculator_tv_display);
        assertViewIsVisible(textView);
        assertThat(textView.getText().toString(), equalTo(ResourceLocator.getString(R.string.greeting_message)));
    }
}