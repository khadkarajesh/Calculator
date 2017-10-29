package com.crushcoder.calculator;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class DisplayFragment extends Fragment {
    EditText mEdtDisplay;

    public DisplayFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display, container, false);
        mEdtDisplay = view.findViewById(R.id.calculator_display);
        return view;
    }

    public static DisplayFragment newInstance() {
        return new DisplayFragment();
    }

    public void setDisplay(String text) {
        String displayText = mEdtDisplay.getText().toString().trim();
        String[] v;
        String result = null;
        if (mEdtDisplay.getText().toString().equalsIgnoreCase("display")) {
            mEdtDisplay.setText("");
        }

        if (!isEqualOperator(text)) {
            mEdtDisplay.getText().append(text);
        } else {
            if (displayText.contains("+")) {
                v = displayText.split("\\+");
                int value = Integer.parseInt(v[0]) + Integer.parseInt(v[1]);
                result = String.valueOf(value);
            } else if (displayText.contains("*")) {
                v = displayText.split("\\*");
                int value = Integer.parseInt(v[0]) * Integer.parseInt(v[1]);
                result = String.valueOf(value);
            } else if (displayText.contains("/")) {
                v = displayText.split("\\/");
                float value = (float) Integer.parseInt(v[0]) / Integer.parseInt(v[1]);
                result = String.valueOf(value);
            } else if (displayText.contains("-")) {
                v = displayText.split("-");
                int value = Integer.parseInt(v[0]) - Integer.parseInt(v[1]);
                result = String.valueOf(value);
            }
            mEdtDisplay.setText("" + result);
        }
    }

    private boolean isEqualOperator(String text) {
        return text.equalsIgnoreCase("=");
    }
}
