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

public class Candido_Portinari extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro           Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30           21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30           22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20           22:50", "");
        onibusTestes.add(e);







        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro           Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30           21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30           22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20           22:50", "");
        onibusTestes.add(e);







        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_candido__portinari);

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