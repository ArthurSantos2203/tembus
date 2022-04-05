package com.digitech.tembus.hortencias;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

public class BelaVistaGregorio extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Itamarati      Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20          05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20          06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20          07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20          08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20          09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20          10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20          11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20          12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20          13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20          14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20          15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20          16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20          17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20          18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20          19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20          20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20          21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20          22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00                 ", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Itamarati      Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20          06:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20          07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20          08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20          09:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20          10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20          11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20          12:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20          13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20          14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20          15:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20          16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20          17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20          18:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20          19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20          20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20          21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20          22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00                 ", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Itamarati      Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40          05:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40          06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40          07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40          08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40          09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40          10:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40          11:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40          12:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40          13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40          14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40          15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40          16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40          17:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40          18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40          19:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40          20:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40          21:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40          22:55", "");
        onibusTestes.add(e);



        return onibusTestes;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_bela_vista_gregorio);

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

