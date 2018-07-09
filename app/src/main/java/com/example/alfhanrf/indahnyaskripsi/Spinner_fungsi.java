package com.example.alfhanrf.indahnyaskripsi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Spinner_fungsi extends AppCompatActivity implements AdapterView.OnItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_fungsi);

        Button btnNext = (Button) findViewById(R.id.btnNext);


        final Spinner fungsigedung = (Spinner) findViewById(R.id.Spinnerfungsigedung);
        fungsigedung.setOnItemSelectedListener(this);

         ArrayAdapter<CharSequence> datafungsi = ArrayAdapter.createFromResource(this, R.array.fungsi_gedung,
                android.R.layout.simple_list_item_1);

        datafungsi.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fungsigedung.setAdapter(datafungsi);

        final Spinner Spinnerfungsigedung1 = (Spinner) findViewById(R.id.Spinnerfungsigedung1);
        final Spinner Spinnerfungsigedung2 = (Spinner) findViewById(R.id.Spinnerfungsigedung2);


        final ArrayAdapter<CharSequence> datafungsibag1hunian = ArrayAdapter.createFromResource(this,
                R.array.fungsi_gedung_hunian, android.R.layout.simple_list_item_1);
        final ArrayAdapter<CharSequence> datafungsibag1usaha = ArrayAdapter.createFromResource(this,
                R.array.fungsi_gedung_usaha, android.R.layout.simple_list_item_1);
        final ArrayAdapter<CharSequence> datafungsibag1keagamaan = ArrayAdapter.createFromResource(this,
                R.array.fungsi_gedung_keagamaan, android.R.layout.simple_list_item_1);
        final ArrayAdapter<CharSequence> datafungsibag1budaya = ArrayAdapter.createFromResource(this,
                R.array.fungsi_gedung_budaya, android.R.layout.simple_list_item_1);


        final ArrayAdapter<CharSequence> datafungsibag2usahaperkantoran= ArrayAdapter.createFromResource(this,
                R.array.fungsi_gedung_usaha_perkantoran, android.R.layout.simple_list_item_1);
        final ArrayAdapter<CharSequence> datafungsibag2usahaperdagangan= ArrayAdapter.createFromResource(this,
                R.array.fungsi_gedung_usaha_perdagangan,android.R.layout.simple_list_item_1);
        final ArrayAdapter<CharSequence> datafungsibag2usahaperindustrian= ArrayAdapter.createFromResource(this,
                R.array.fungsi_gedung_usaha_perindustrian, android.R.layout.simple_list_item_1);
        final ArrayAdapter<CharSequence> datafungsibag2usahaperhotelan= ArrayAdapter.createFromResource(this,
                R.array.fungsi_gedung_usaha_perhotelan, android.R.layout.simple_list_item_1);
        final ArrayAdapter<CharSequence> datafungsibag2usahawisatarekreasi= ArrayAdapter.createFromResource(this,
                R.array.fungsi_gedung_usaha_wisatarekreasi, android.R.layout.simple_list_item_1);
        final ArrayAdapter<CharSequence> datafungsibag2usahaterminal= ArrayAdapter.createFromResource(this,
                R.array.fungsi_gedung_usaha_terminal, android.R.layout.simple_list_item_1);
        final ArrayAdapter<CharSequence> datafungsibag2usahatepatpenyimpanan= ArrayAdapter.createFromResource(this,
                R.array.fungsi_gedung_usaha_penyimpanan, android.R.layout.simple_list_item_1);
        final ArrayAdapter<CharSequence> datafungsibag2usahapenyimpanan = ArrayAdapter.createFromResource(this,
                R.array.fungsi_gedung_usaha_penyimpanan, android.R.layout.simple_list_item_1);
        final ArrayAdapter<CharSequence> datafungsibag2budayapendidikan= ArrayAdapter.createFromResource(this,
                R.array.fungsi_gedung_budaya_pendidikan, android.R.layout.simple_list_item_1);
        final ArrayAdapter<CharSequence> datafungsibag2budayakesehatan= ArrayAdapter.createFromResource(this,
                R.array.fungsi_gedung_budaya_kesehatan, android.R.layout.simple_list_item_1);
        final ArrayAdapter<CharSequence> datafungsibag2budayakebudayaan= ArrayAdapter.createFromResource(this,
                R.array.fungsi_gedung_budaya_budaya, android.R.layout.simple_list_item_1);


        datafungsibag1hunian.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        datafungsibag1usaha.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        datafungsibag1keagamaan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        datafungsibag1budaya.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        datafungsibag2usahaperkantoran.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        datafungsibag2usahaperdagangan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        datafungsibag2usahaperindustrian.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        datafungsibag2usahaperhotelan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        datafungsibag2usahawisatarekreasi.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        datafungsibag2usahaterminal.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        datafungsibag2usahapenyimpanan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        datafungsibag2budayapendidikan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        datafungsibag2budayakesehatan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        datafungsibag2budayakebudayaan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        Spinnerfungsigedung1.setEnabled(true);
        Spinnerfungsigedung2.setEnabled(false);


        fungsigedung.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Spinnerfungsigedung1.setEnabled(true);
                    Spinnerfungsigedung1.setAdapter(datafungsibag1hunian);
                    Spinnerfungsigedung2.setEnabled(false);
                } else if(position == 1){
                    Spinnerfungsigedung1.setEnabled(true);
                    Spinnerfungsigedung1.setAdapter(datafungsibag1keagamaan);
                    Spinnerfungsigedung2.setEnabled(false);
                } else if(position == 2) {
                    Spinnerfungsigedung1.setEnabled(true);
                    Spinnerfungsigedung1.setAdapter(datafungsibag1usaha);
                    Spinnerfungsigedung2.setEnabled(true);
                } else if (position == 3){
                    Spinnerfungsigedung1.setEnabled(true);
                    Spinnerfungsigedung1.setAdapter(datafungsibag1budaya);
                    Spinnerfungsigedung2.setEnabled(true);
                }else if (position == 4) {
                    Spinnerfungsigedung1.setEnabled(false);
                    Spinnerfungsigedung2.setEnabled(false);
                } else{
                    Spinnerfungsigedung1.setEnabled(false);
                    Spinnerfungsigedung2.setEnabled(false);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Spinnerfungsigedung1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String kantor = "Bangunan Perkantoran";
                String dagang = "Bangunan Perdagangan";
                String industri = "Bangunan Industri";
                String hotel = "Bangunan Perhotelan";
                String wisata = "B. Wisata dan Rekreasi";
                String terminal = "Bangunan Terminal";
                String penyimpanan = "B. Tepat Penyimpanan";
                String pendidikan = "Bangunan Pendidikan";
                String kesehatan = "B. Pelayanan Kesehatan";
                String kebudayaan = "Bangunan Kebudayaan";
                String text = Spinnerfungsigedung1.getSelectedItem().toString();
                if( text.equals(kantor)){
                    Spinnerfungsigedung2.setEnabled(true);
                    Spinnerfungsigedung2.setAdapter(datafungsibag2usahaperkantoran);
                } else if (text.equals(dagang)){
                    Spinnerfungsigedung2.setEnabled(true);
                    Spinnerfungsigedung2.setAdapter(datafungsibag2usahaperdagangan);
                } else if (text.equals(industri)){
                    Spinnerfungsigedung2.setEnabled(true);
                    Spinnerfungsigedung2.setAdapter(datafungsibag2usahaperindustrian);
                }else if (text.equals(hotel)){
                    Spinnerfungsigedung2.setEnabled(true);
                    Spinnerfungsigedung2.setAdapter(datafungsibag2usahaperhotelan);
                }else if (text.equals(wisata)) {
                    Spinnerfungsigedung2.setEnabled(true);
                    Spinnerfungsigedung2.setAdapter(datafungsibag2usahawisatarekreasi);
                }else if (text.equals(terminal)) {
                    Spinnerfungsigedung2.setEnabled(true);
                    Spinnerfungsigedung2.setAdapter(datafungsibag2usahaterminal);
                }else if (text.equals(penyimpanan)) {
                    Spinnerfungsigedung2.setEnabled(true);
                    Spinnerfungsigedung2.setAdapter(datafungsibag2usahapenyimpanan);
                }else if (text.equals(pendidikan)) {
                    Spinnerfungsigedung2.setEnabled(true);
                    Spinnerfungsigedung2.setAdapter(datafungsibag2budayapendidikan);
                }else if (text.equals(kesehatan)) {
                    Spinnerfungsigedung2.setEnabled(true);
                    Spinnerfungsigedung2.setAdapter(datafungsibag2budayakesehatan);
                }else if (text.equals(kebudayaan)) {
                    Spinnerfungsigedung2.setEnabled(true);
                    Spinnerfungsigedung2.setAdapter(datafungsibag2budayakebudayaan);
                }
            }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //-----------------------------------------------------Button Next
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hunian = "Fungsi Hunian";
                String agama = "Fungsi Keagamaan";
                String usaha = "Fungsi Usaha";
                String budaya = "Fungsi Budaya";
                String text = fungsigedung.getSelectedItem().toString();
                if(text.equals(hunian)){
                    Intent formhunian = new Intent(Spinner_fungsi.this, Act_form_survey.class);
                    Spinner_fungsi.this.startActivity(formhunian);
                } else if(text.equals(agama)){
                    Intent formagama = new Intent(Spinner_fungsi.this,  Act_form_survey.class);
                    Spinner_fungsi.this.startActivity(formagama);
                }else if(text.equals(usaha)){
                    Intent formusaha = new Intent(Spinner_fungsi.this, Act_form_usaha.class);
                    Spinner_fungsi.this.startActivity(formusaha);
                }else if(text.equals(budaya)) {
                    Intent formbudaya = new Intent(Spinner_fungsi.this, Act_form_survey.class);
                    Spinner_fungsi.this.startActivity(formbudaya);
                }

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
