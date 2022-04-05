package com.digitech.tembus.turb;

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

public class Caitetu extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:05            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            20:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:10            23:20", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:05            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            20:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:10            23:15", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_caitetu);

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