package com.digitech.tembus.cidadereal;

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

public class Corredor_Duarte extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Duarte da Silveira                  T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00                                 06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20                                 06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40                                 07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50                                 08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30                                 18:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40                                 18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10                                      ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40                                      ", "");
        onibusTestes.add(e);




        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_corredor__duarte);

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