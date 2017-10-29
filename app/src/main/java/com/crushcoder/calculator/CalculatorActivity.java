package com.crushcoder.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CalculatorActivity extends AppCompatActivity implements ClickListener {

    DisplayFragment displayFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        displayFragment = (DisplayFragment) getFragmentManager().findFragmentById(R.id.display_fragment);
    }


    @Override
    public void onClick(String text) {
        displayFragment.setDisplay(text);
    }
}
