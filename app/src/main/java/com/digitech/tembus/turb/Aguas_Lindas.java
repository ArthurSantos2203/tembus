package com.digitech.tembus.turb;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class Aguas_Lindas extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50            22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20            23:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10            22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50            23:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20            23:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10            22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20            23:50", "");
        onibusTestes.add(e);

        return onibusTestes;
    }
    ImageButton bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_aguas__lindas);
        bt=(ImageButton)findViewById(R.id.shareBtn);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                myIntent.putExtra(Intent.EXTRA_TEXT, "Em Breve");
                myIntent.putExtra(Intent.EXTRA_TEXT, "Em Breve");
                startActivity(Intent.createChooser(myIntent, "Compartilhar Usando"));
            }
        });

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        AdView adView = new AdView(this);

        adView.setAdSize(AdSize.SMART_BANNER);

        adView.setAdUnitId("ca-app-pub-5546010065820975/6101274775");

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}