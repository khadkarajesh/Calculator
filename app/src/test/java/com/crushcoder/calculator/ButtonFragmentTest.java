package com.crushcoder.calculator;


import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.crushcoder.calculator.support.ResourceLocator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowToast;

import static com.crushcoder.calculator.support.Assert.assertViewIsVisible;
import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.robolectric.util.FragmentTestUtil.startFragment;

@RunWith(RobolectricTestRunner.class)
public class ButtonFragmentTest {

    private ButtonFragment buttonFragment;
    private RelativeLayout buttonContainer;
    private Button buttonOne, buttonTwo;
    private Button buttonThree;

    @Before
    public void setUp() throws Exception {
        buttonFragment = ButtonFragment.newInstance();
        startFragment(buttonFragment);
        buttonContainer = buttonFragment.getView().findViewById(R.id.calculator_buttons);
        buttonOne = getButtonById(R.id.button_1);
        buttonTwo = getButtonById(R.id.button_2);
        buttonThree = getButtonById(R.id.button_3);
    }

    @Test
    public void shouldBeNotNull() throws Exception {
        assertNotNull(buttonFragment);
        assertViewIsVisible(buttonContainer);
    }

    @Test
    public void shouldHaveOneButton() throws Exception {
        assertViewIsVisible(buttonOne);
        assertThat(buttonOne.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_one)));
    }

    @Test
    public void shouldHaveTwoButton() throws Exception {
        assertViewIsVisible(buttonTwo);
        assertThat(buttonTwo.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_two)));
    }

    @Test
    public void shouldHaveThreeButton() throws Exception {
        assertViewIsVisible(buttonThree);
        assertThat(buttonThree.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_three)));
    }

    @Test
    public void shouldHaveFourButton() throws Exception {
        Button buttonFour = getButtonById(R.id.button_4);
        assertViewIsVisible(buttonFour);
        assertThat(buttonFour.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_four)));
    }

    @Test
    public void shouldHaveFiveButton() throws Exception {
        Button buttonFive = getButtonById(R.id.button_5);
        assertViewIsVisible(buttonFive);
        assertThat(buttonFive.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_five)));
    }

    @Test
    public void shouldHaveSixButton() throws Exception {
        Button buttonSix = getButtonById(R.id.button_6);
        assertViewIsVisible(buttonSix);
        assertThat(buttonSix.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_six)));
    }

    @Test
    public void shouldHaveSevenButton() throws Exception {
        Button buttonSeven = getButtonById(R.id.button_7);
        assertViewIsVisible(buttonSeven);
        assertThat(buttonSeven.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_seven)));
    }


    @Test
    public void shouldHaveEightButton() throws Exception {
        Button buttonEight = getButtonById(R.id.button_8);
        assertViewIsVisible(buttonEight);
        assertThat(buttonEight.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_eight)));
    }

    @Test
    public void shouldHaveNineButton() throws Exception {
        Button buttonNine = getButtonById(R.id.button_9);
        assertViewIsVisible(buttonNine);
        assertThat(buttonNine.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_nine)));
    }


    @Test
    public void shouldHavePlusButton() throws Exception {
        Button buttonPlus = getButtonById(R.id.button_plus);
        assertViewIsVisible(buttonPlus);
        assertThat(buttonPlus.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_plus)));
    }

    @Test
    public void shouldHaveMinusButton() throws Exception {
        Button buttonMinus = getButtonById(R.id.button_minus);
        assertViewIsVisible(buttonMinus);
        assertThat(buttonMinus.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_minus)));
    }

    @Test
    public void shouldHaveMultiplyButton() throws Exception {
        Button buttonMultiply = getButtonById(R.id.button_multiply);
        assertViewIsVisible(buttonMultiply);
        assertThat(buttonMultiply.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_multiply)));
    }

    @Test
    public void shouldHaveDivideButton() throws Exception {
        Button buttonDivide = getButtonById(R.id.button_divide);
        assertViewIsVisible(buttonDivide);
        assertThat(buttonDivide.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_divide)));
    }


    @Test
    public void shouldHaveModulusButton() throws Exception {
        Button buttonModulus = getButtonById(R.id.button_modulus);
        assertViewIsVisible(buttonModulus);
        assertThat(buttonModulus.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_modulus)));
    }

    @Test
    public void shouldHaveEqualButton() throws Exception {
        Button buttonEqual = getButtonById(R.id.button_equal);
        assertViewIsVisible(buttonEqual);
        assertThat(buttonEqual.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_equal)));
    }

    @Test
    public void shouldHaveClearButton() throws Exception {
        Button buttonClear = getButtonById(R.id.button_clear);
        assertViewIsVisible(buttonClear);
        assertThat(buttonClear.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_clear)));
    }

    @Test
    public void shouldHaveZeroButton() throws Exception {
        Button buttonZero = getButtonById(R.id.button_zero);
        assertViewIsVisible(buttonZero);
        assertThat(buttonZero.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_zero)));
    }

    public View getViewById(int id) {
        return buttonFragment.getView().findViewById(id);
    }

    public Button getButtonById(int id) {
        return (Button) getViewById(id);
    }

    @Test
    public void oneButtonShouldShowToast() throws Exception {
        verifyToastAfterButtonClick(buttonOne);
    }

    @Test
    public void twoButtonShouldShowToast() {
        verifyToastAfterButtonClick(buttonTwo);
    }

    @Test
    public void threeButtonShouldShowToast() throws Exception {
        verifyToastAfterButtonClick(buttonThree);
    }

    private void verifyToastAfterButtonClick(Button button) {
        button.performClick();
        assertThat(ShadowToast.getTextOfLatestToast(), equalTo(button.getText()));
    }
}
