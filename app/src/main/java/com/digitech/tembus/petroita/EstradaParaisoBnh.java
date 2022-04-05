package com.digitech.tembus.petroita;

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

public class EstradaParaisoBnh extends AppCompatActivity {

    private AdView mAdView;


    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40            09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            12:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            17:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            21:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40            09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            12:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            17:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            21:10", "");
        onibusTestes.add(e);

        return onibusTestes;





    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_estrada_paraiso_bnh);

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