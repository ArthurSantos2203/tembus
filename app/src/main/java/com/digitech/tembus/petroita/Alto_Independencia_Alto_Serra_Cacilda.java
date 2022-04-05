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

public class Alto_Independencia_Alto_Serra_Cacilda extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20             21:55", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30             16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30             18:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_alto__independencia__alto__serra__cacilda);

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