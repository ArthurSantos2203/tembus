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

public class Bataillard_Hospital extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro         T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40N           23:20N", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Bairro         T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40N         23:20N", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro         T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10            07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40N         23:20N", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado. Chega e sai.", "");
        onibusTestes.add(e);




        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_bataillard__hospital);

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