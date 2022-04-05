package com.digitech.tembus.petroita;

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

public class BingenQuitandinha extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){



        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("  T. Bingen          Quitandinha","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("  04:30C                05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:25C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:05C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:55C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:25C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15C                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45                  N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:05C                N/A", "");
        onibusTestes.add(e);


        return onibusTestes;




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_bingen_quitandinha);

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
