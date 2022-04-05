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

public class Araras_Vista_Alegre extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:05            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40            16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30           19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40            16:40", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:05            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40            16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30           19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40            16:40", "");
        onibusTestes.add(e);





        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_araras__vista__alegre);

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
