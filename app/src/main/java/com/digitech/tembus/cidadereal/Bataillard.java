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

public class Bataillard extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro         T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15            05:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20             N/A", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro         T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20            23:00", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingo", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro         T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            05:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50             21:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00             22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00             N/A", "");
        onibusTestes.add(e);

        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_bataillard);

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