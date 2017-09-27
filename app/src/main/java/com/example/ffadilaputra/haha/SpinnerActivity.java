package com.example.ffadilaputra.haha;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ffadilaputra on 27/09/17.
 */

public class SpinnerActivity extends Activity {

    Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_view);



        spin = (Spinner) findViewById(R.id.spiner);

        List<String> item = new ArrayList<String>();
        item.add("Malang");
        item.add("Magetan");
        item.add("Manado");
        item.add("Madura");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SpinnerActivity.this,android.R.layout.simple_spinner_dropdown_item,item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(adapter);

    }



}
