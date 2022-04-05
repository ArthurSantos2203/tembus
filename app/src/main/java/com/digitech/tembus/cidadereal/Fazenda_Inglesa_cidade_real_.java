package com.digitech.tembus.cidadereal;

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
import java.util.List;

public class Fazenda_Inglesa_cidade_real_ extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:50             04:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40             05:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10             21:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00             22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:55             23:20", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30             04:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20             05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00             06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00             07:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45             07:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45             08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40             09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35             10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30             11:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25             12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20             13:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15             14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10             15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05             16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00             17:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:55             18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50             18:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45             19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10             21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00             22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:55             23:20", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30             04:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20             05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00             06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00             07:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45             07:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45             08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40             09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35             10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30             11:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25             12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20             13:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15             14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10             15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05             16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00             17:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:55             18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50             18:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45             19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10             21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00             22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:55             23:20", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real__fazenda__inglesa);

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
