package com.example.ffadilaputra.haha;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by ffadilaputra on 27/09/17.
 */

public class FontActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fontview);

        TextView textView = (TextView)findViewById(R.id.custom);

        Typeface f = Typeface.createFromAsset(getAssets(),"BROMO.otf");
        textView.setTypeface(f);

    }

}
