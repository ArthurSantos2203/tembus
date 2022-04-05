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

public class Alto_Morin_Sargento_Noturno extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro          Bairros", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:30             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro          Bairros", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:30             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro          Bairros", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:30             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:40             N/A", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_alto__morin__sargento__noturno);

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
