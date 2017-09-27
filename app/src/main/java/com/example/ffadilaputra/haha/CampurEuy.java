package com.example.ffadilaputra.haha;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by ffadilaputra on 27/09/17.
 */

public class CampurEuy extends Activity implements View.OnClickListener {


    private ListView listView;
    private String[] makan = new String[]{
            "Pecel","Soto","Sate","Nasi Goreng","Nasi Kucing","Nasi Uduk","Nasi Rames"
    };

    Spinner spin;
    Button sm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.campuran);

        //List

        listView = (ListView)findViewById(R.id.list_view);

        ArrayAdapter<String> a = new ArrayAdapter<String>(CampurEuy.this,android.R.layout.simple_list_item_1,android.R.id.text1,makan);

        listView.setAdapter(a);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CampurEuy.this, "Makanan Ditambahkan : "+makan[position], Toast.LENGTH_LONG).show();
            }
        });

        //Toast

        sm = (Button)findViewById(R.id.submit);
        sm.setOnClickListener(this);

        //Spinner
        spin = (Spinner) findViewById(R.id.jk);
        List<String> item = new ArrayList<String>();
        item.add("Pedas");
        item.add("Sedengan");
        item.add("Bacem");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(CampurEuy.this,android.R.layout.simple_spinner_dropdown_item,item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
    }

    //Toast
    @Override
    public void onClick(View view) {
        if (view == sm) {
            new AlertDialog.Builder(this)
                    .setTitle("Registered")
                    .setMessage("Succesfully Registered")
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
