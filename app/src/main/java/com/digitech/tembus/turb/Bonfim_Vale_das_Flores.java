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

public class Bonfim_Vale_das_Flores extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            12:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20B           20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20B                  ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15B                  ", "");
        onibusTestes.add(e);








        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            12:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20B           20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20B                  ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15B                  ", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("OBS: B = Atendido pelo carro da Linha 611 - Bonfim", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40             09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30             13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40             17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50             21:10", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_bonfim__vale_das__flores);

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
