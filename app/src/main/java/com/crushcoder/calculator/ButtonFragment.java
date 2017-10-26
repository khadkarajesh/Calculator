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


public class ButtonFragment extends Fragment {
    private Button mBtnThree;
    private Button mBtnFour;

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
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast((TextView) v);
            }
        });

        mBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast((TextView) v);
            }
        });

        mBtnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast((TextView) v);
            }
        });

        mBtnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast((TextView) v);
            }
        });

    }

    private void showToast(TextView v) {
        Toast.makeText(getActivity(), v.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
