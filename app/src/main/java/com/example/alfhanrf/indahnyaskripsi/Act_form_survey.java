package com.example.alfhanrf.indahnyaskripsi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;



public class Act_form_survey extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_form_survey);

        final Spinner jeniskepemilikantanah = (Spinner) findViewById(R.id.Spinnerjeniskepemilikantanah);
        final Spinner klasifikasibangunan = (Spinner) findViewById(R.id.Spinnerklasifikasigedung);
        jeniskepemilikantanah.setOnItemSelectedListener(this);
        klasifikasibangunan.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> datajeniskepemilikantanah = ArrayAdapter.createFromResource(this,R.array.jenis_kepimilikan_tanah,
                android.R.layout.simple_list_item_1);
        ArrayAdapter<CharSequence> dataklasifikasi = ArrayAdapter.createFromResource(this, R.array.klasifikasi_bangunan,
                android.R.layout.simple_list_item_1);

        datajeniskepemilikantanah.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataklasifikasi.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        jeniskepemilikantanah.setAdapter(datajeniskepemilikantanah);
        klasifikasibangunan.setAdapter(dataklasifikasi);

        klasifikasibangunan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        jeniskepemilikantanah.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

