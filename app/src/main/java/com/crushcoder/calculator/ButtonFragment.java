package com.crushcoder.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class ButtonFragment extends Fragment implements View.OnClickListener {
    private Button mBtnThree;
    private Button mBtnFour;
    private Button mBtnFive;
    private Button mBtnSix, mBtnSeven, mBtnEight, mBtnNine, mBtnZero, mBtnModulus, mBtnPlus, mBtnDivide, mBtnClear, mBtnMinus, mBtnMultiply,mBtnEqual;

    public ButtonFragment() {
    }

    private Button mBtnOne, mBtnTwo;

    public static ButtonFragment newInstance() {
        return new ButtonFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_button, container, false);
        mBtnOne = view.findViewById(R.id.button_1);
        mBtnTwo = view.findViewById(R.id.button_2);
        mBtnThree = view.findViewById(R.id.button_3);
        mBtnFour = view.findViewById(R.id.button_4);
        mBtnFive = view.findViewById(R.id.button_5);
        mBtnSix = view.findViewById(R.id.button_6);
        mBtnSeven = view.findViewById(R.id.button_7);
        mBtnEight = view.findViewById(R.id.button_8);
        mBtnNine = view.findViewById(R.id.button_9);
        mBtnZero = view.findViewById(R.id.button_zero);
        mBtnModulus = view.findViewById(R.id.button_modulus);
        mBtnPlus = view.findViewById(R.id.button_plus);
        mBtnMinus = view.findViewById(R.id.button_minus);
        mBtnDivide = view.findViewById(R.id.button_divide);
        mBtnClear = view.findViewById(R.id.button_clear);
        mBtnMultiply = view.findViewById(R.id.button_multiply);
        mBtnEqual = view.findViewById(R.id.button_equal);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBtnOne.setOnClickListener(this);
        mBtnTwo.setOnClickListener(this);
        mBtnThree.setOnClickListener(this);
        mBtnFour.setOnClickListener(this);
        mBtnFive.setOnClickListener(this);
        mBtnSix.setOnClickListener(this);
        mBtnSeven.setOnClickListener(this);
        mBtnEight.setOnClickListener(this);
        mBtnNine.setOnClickListener(this);
        mBtnZero.setOnClickListener(this);
        mBtnDivide.setOnClickListener(this);
        mBtnMultiply.setOnClickListener(this);
        mBtnMinus.setOnClickListener(this);
        mBtnModulus.setOnClickListener(this);
        mBtnPlus.setOnClickListener(this);
        mBtnClear.setOnClickListener(this);
        mBtnEqual.setOnClickListener(this);
    }

    private void showToast(TextView v) {
        Toast.makeText(getActivity(), v.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        showToast((TextView) view);
    }
}
