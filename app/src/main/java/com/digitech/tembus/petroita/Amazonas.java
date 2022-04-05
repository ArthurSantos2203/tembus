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

public class Amazonas extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20              22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40              N/A*", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10              06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10              07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10              08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20              10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30              11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40              12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50              13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10              15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20              17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30              18:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40              19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50              20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_amazonas);

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
