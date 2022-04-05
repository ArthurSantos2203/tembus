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

public class FlorestaFrancisco extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro      Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10          05:30F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  06:00S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20          06:35F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  07:15S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35          07:55F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  08:35S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55          09:15F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  09:55S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15          10:35F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  11:15S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35          11:55F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  12:35S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55          13:15F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  13:55S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15          14:35F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  15:15S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35          15:55F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  16:35S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55          17:15F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  17:55S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15          18:35F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  19:15S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35          19:55F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  20:35S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:55          21:15F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  21:55S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10          22:30F", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro      Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10          05:30F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  06:00S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20          06:35F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  07:15S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35          07:55F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  08:35S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55          09:15F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  09:55S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15          10:35F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  11:15S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35          11:55F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  12:35S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55          13:15F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  13:55S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15          14:35F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  15:15S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35          15:55F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  16:35S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55          17:15F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  17:55S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15          18:35F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  19:15S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35          19:55F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  20:35S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:55          21:15F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  21:55S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10          22:30F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: F = Via Floresta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: F = Via Francisco Scali", "");
        onibusTestes.add(e);



        return onibusTestes;
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_floresta_francisco);

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
