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

public class Espirito_Santo extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20Y             20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:30 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00              22:30C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50              23:15C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20Y             20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:30 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00              22:30C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50              23:15C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Y = Não opera durante as Férias Escolares.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("C = Atende a Rua Ceará", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_espirito__santo);

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