package com.crushcoder.calculator.support;


import android.graphics.drawable.Drawable;

import org.robolectric.RuntimeEnvironment;

public class ResourceLocator {
    public static String getString(int id) {
        return RuntimeEnvironment.application.getString(id);
    }

    public static Drawable getDrawable(int id) {
        return RuntimeEnvironment.application.getResources().getDrawable(id);
    }
}
