package com.nventive.statictransformationrepro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StaticTransformLayout parent = new StaticTransformLayout(this);

        // parent.setLayerType(View.LAYER_TYPE_SOFTWARE, null); // Circumvents bug

        ProgressBar bar = new ProgressBar(this); //ProgressBar will be cut off outside untransformed bounds
        parent.addView(bar);
        setContentView(parent);
    }
}
