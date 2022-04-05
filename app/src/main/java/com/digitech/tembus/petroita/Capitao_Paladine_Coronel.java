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

public class Capitao_Paladine_Coronel extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:35O            21:05O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40             22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45             23:15", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40             22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40             23:10", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00             06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00             07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00             08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00             09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00             10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00             11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00             12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00             13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00             14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00             15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00             16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00             17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00             18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00             20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00             21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00             22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00             23:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("O = via Olga Castrioto.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_capitao__paladine__coronel);

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