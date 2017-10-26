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
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private Button buttonZero;
    private Button buttonEqual, buttonPlus, buttonDivide, buttonMinus, buttonMultiply, buttonClear, buttonModulus;

    @Before
    public void setUp() throws Exception {
        buttonFragment = ButtonFragment.newInstance();
        startFragment(buttonFragment);
        buttonContainer = buttonFragment.getView().findViewById(R.id.calculator_buttons);
        buttonOne = getButtonById(R.id.button_1);
        buttonTwo = getButtonById(R.id.button_2);
        buttonThree = getButtonById(R.id.button_3);
        buttonFour = getButtonById(R.id.button_4);
        buttonFive = getButtonById(R.id.button_5);
        buttonSix = getButtonById(R.id.button_6);
        buttonSeven = getButtonById(R.id.button_7);
        buttonEight = getButtonById(R.id.button_8);
        buttonNine = getButtonById(R.id.button_9);
        buttonZero = getButtonById(R.id.button_zero);
        buttonEqual = getButtonById(R.id.button_equal);
        buttonPlus = getButtonById(R.id.button_plus);
        buttonMinus = getButtonById(R.id.button_minus);
        buttonMultiply = getButtonById(R.id.button_multiply);
        buttonClear = getButtonById(R.id.button_clear);
        buttonDivide = getButtonById(R.id.button_divide);
        buttonModulus = getButtonById(R.id.button_modulus);
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
        assertViewIsVisible(buttonFour);
        assertThat(buttonFour.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_four)));
    }

    @Test
    public void shouldHaveFiveButton() throws Exception {
        assertViewIsVisible(buttonFive);
        assertThat(buttonFive.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_five)));
    }

    @Test
    public void shouldHaveSixButton() throws Exception {
        assertViewIsVisible(buttonSix);
        assertThat(buttonSix.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_six)));
    }

    @Test
    public void shouldHaveSevenButton() throws Exception {
        assertViewIsVisible(buttonSeven);
        assertThat(buttonSeven.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_seven)));
    }


    @Test
    public void shouldHaveEightButton() throws Exception {
        assertViewIsVisible(buttonEight);
        assertThat(buttonEight.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_eight)));
    }

    @Test
    public void shouldHaveNineButton() throws Exception {
        assertViewIsVisible(buttonNine);
        assertThat(buttonNine.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_nine)));
    }


    @Test
    public void shouldHavePlusButton() throws Exception {
        assertViewIsVisible(buttonPlus);
        assertThat(buttonPlus.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_plus)));
    }

    @Test
    public void shouldHaveMinusButton() throws Exception {
        assertViewIsVisible(buttonMinus);
        assertThat(buttonMinus.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_minus)));
    }

    @Test
    public void shouldHaveMultiplyButton() throws Exception {
        assertViewIsVisible(buttonMultiply);
        assertThat(buttonMultiply.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_multiply)));
    }

    @Test
    public void shouldHaveDivideButton() throws Exception {
        assertViewIsVisible(buttonDivide);
        assertThat(buttonDivide.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_divide)));
    }


    @Test
    public void shouldHaveModulusButton() throws Exception {
        assertViewIsVisible(buttonModulus);
        assertThat(buttonModulus.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_modulus)));
    }

    @Test
    public void shouldHaveEqualButton() throws Exception {
        assertViewIsVisible(buttonEqual);
        assertThat(buttonEqual.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_equal)));
    }

    @Test
    public void shouldHaveClearButton() throws Exception {
        assertViewIsVisible(buttonClear);
        assertThat(buttonClear.getText().toString(), equalTo(ResourceLocator.getString(R.string.button_clear)));
    }

    @Test
    public void shouldHaveZeroButton() throws Exception {
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

    @Test
    public void fourButtonShouldShowToast() throws Exception {
        verifyToastAfterButtonClick(buttonFour);
    }

    @Test
    public void fiveButtonShouldShowToast() throws Exception {
        verifyToastAfterButtonClick(buttonFive);
    }

    @Test
    public void sixButtonShouldShowToast() throws Exception {
        verifyToastAfterButtonClick(buttonSix);
    }

    @Test
    public void sevenButtonShouldShowToast() throws Exception {
        verifyToastAfterButtonClick(buttonSeven);
    }

    @Test
    public void eightButtonShouldShowToast() throws Exception {
        verifyToastAfterButtonClick(buttonEight);
    }

    @Test
    public void shouldShowToast() throws Exception {
        verifyToastAfterButtonClick(buttonNine);
        verifyToastAfterButtonClick(buttonZero);
        verifyToastAfterButtonClick(buttonClear);
        verifyToastAfterButtonClick(buttonDivide);
        verifyToastAfterButtonClick(buttonEqual);
        verifyToastAfterButtonClick(buttonMinus);
        verifyToastAfterButtonClick(buttonMultiply);
        verifyToastAfterButtonClick(buttonModulus);

    }

    private void verifyToastAfterButtonClick(Button button) {
        button.performClick();
        assertThat(ShadowToast.getTextOfLatestToast(), equalTo(button.getText()));
    }
}
