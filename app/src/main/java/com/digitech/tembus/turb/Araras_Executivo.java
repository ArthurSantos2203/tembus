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

public class Araras_Executivo extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Araras         Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05            14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            16:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45            17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 20:00", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Araras         Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05            14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            16:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45            17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 20:00", "");
        onibusTestes.add(e);





        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_araras__executivo);

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
