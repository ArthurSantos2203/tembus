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

public class Araras_Santa_Luzia extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:30            05:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:05            09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10            15:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05            16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            23:50", "");
        onibusTestes.add(e);







        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:30            05:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:05            09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10            15:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05            16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            23:50", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            23:50", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_araras__santa__luzia);

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
