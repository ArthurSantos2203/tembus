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

public class Bairro_Maua extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20X              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20P              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20               N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40P              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00               N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10P              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20               N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              15:05A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40               N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50              17:30A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10              18:50A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30              20:10 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50              21:20A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50              22:20A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20X              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20P              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20               N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40P              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00               N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10P              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20               N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              15:05A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40               N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50              17:30A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10              18:50A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30              20:10 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50              21:20A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50              22:20A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("X = Via Emilio Zaluar", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("P = Via Emilio Zaluar", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("A = Via Emilio Zaluar", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_bairro_maua);

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