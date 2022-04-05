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

public class Alto_Independencia_Cacilda_Rua_O extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10T            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10T            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10T            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15             16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50T            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40T            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10T            20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50             20:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50             22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50             23:10", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40             22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40             23:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00             06:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20             07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40             09:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00             10:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20             11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40             13:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00             14:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20             15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40             17:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00             18:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20             19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40             21:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00             22:25", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_alto__independencia__cacilda__rua__o);

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