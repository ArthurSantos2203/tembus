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

public class Cap_Paladine_Castelanea extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00              22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10              22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_cap__paladine__castelanea);

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

