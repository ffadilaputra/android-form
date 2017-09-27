package com.example.ffadilaputra.haha;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by ffadilaputra on 27/09/17.
 */

public class MessageActivity extends Activity implements View.OnClickListener {

    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_layout);

        btn1 = (Button)findViewById(R.id.tmbl1);
        btn1.setOnClickListener(this);
        btn2 = (Button)findViewById(R.id.tmbl2);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btn1) {
            new AlertDialog.Builder(this)
                    .setTitle("judul pesan")
                    .setMessage("ini adalah isi message box")
                    .setNeutralButton("close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int sumthin) {
                        }
                    })
                    .show();
        } else {
            Toast.makeText(this, "Ini isi message box toast", Toast.LENGTH_SHORT).show();
        }
    }
}

