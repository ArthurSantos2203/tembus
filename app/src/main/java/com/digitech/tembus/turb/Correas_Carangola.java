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

public class Correas_Carangola extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            23:00", "");
        onibusTestes.add(e);








        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            23:00", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00A            06:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00A            08:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00A            10:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00A            12:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00A            13:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00A            14:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00A            16:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00A            18:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10A            20:35A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30A                   ", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("OBS: A = Atendido pela Linha 660", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_correas__carangola);

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
