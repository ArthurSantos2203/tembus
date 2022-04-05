package com.digitech.tembus.turb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
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

public class Calembe extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:25            05:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15            07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15            08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15            11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15            12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15            14:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15            15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15            17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15            18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15            20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15            21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15            22:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20                   ", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:25            05:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15            07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15            08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15            11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15            12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15            14:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15            15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15            17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15            18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15            20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15            21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15            22:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20                   ", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15            05:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15            07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15            09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15            11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15            12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15            14:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15            15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15            17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15            18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15            20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15            21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20            22:45", "");
        onibusTestes.add(e);


        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_calembe);

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