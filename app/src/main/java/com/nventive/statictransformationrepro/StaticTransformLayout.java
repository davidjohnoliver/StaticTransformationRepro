package com.nventive.statictransformationrepro;

import android.content.Context;
import android.graphics.Matrix;
import android.view.View;
import android.view.animation.Transformation;
import android.widget.LinearLayout;

public class StaticTransformLayout extends LinearLayout {

    StaticTransformLayout(Context context) {
        super(context);
        setStaticTransformationsEnabled(true);
    }

    @Override
    protected boolean getChildStaticTransformation(View child, Transformation t) {
        int halfWidth = child.getWidth()/2;
        Matrix translate = new Matrix();
        translate.setTranslate(halfWidth,0);
        t.getMatrix().set(translate);
        return true;
    }
}
