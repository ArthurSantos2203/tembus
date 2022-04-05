package com.digitech.tembus.hortencias;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

public class BairroEsperancaExtra extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro      T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45          06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15          06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45          07:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25          07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05          08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45          17:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30          18:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25          19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 19:50", "");
        onibusTestes.add(e);


        return onibusTestes;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_bairro_esperanca_extra);

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

