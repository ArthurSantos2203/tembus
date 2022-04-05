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

public class Candido_Portinari_Campo extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Centro          Cândido Portinari", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50                06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10                07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30                09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50                10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10                11:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30                13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50                14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10                15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30                17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50                18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10                19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30                21:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50                22:30", "");
        onibusTestes.add(e);


        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_candido__portinari__campo);

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
