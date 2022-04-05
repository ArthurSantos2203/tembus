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

public class Amazonas_Vila_Ipanema extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40             21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50             22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:05             23:40", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:35             23:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30             06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30             07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30             09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40             10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50             11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00             12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10             13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20             15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30             16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40             17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50             18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10             20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20             22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30             23:10", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_amazonas__vila__ipanema);

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
