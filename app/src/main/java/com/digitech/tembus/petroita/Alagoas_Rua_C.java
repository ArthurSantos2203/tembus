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

public class Alagoas_Rua_C extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             22:10", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10             21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50             06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50             07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50             08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50             09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05             10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15             11:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25             13:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20             13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45             15:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55             16:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05             17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15             18:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25             20:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:35             21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45             22:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:55             23:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_alagoas__rua__c);

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