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

public class Alto_Moinho_Preto extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Centro         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50OS            05:20O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50OS            06:20O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10OS            07:30O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40OS            08:50O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20OS            10:30O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00OS            12:10O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40OS            13:50O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20OS            15:30O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00OS            17:10O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30OS            18:50O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50OS            20:10O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10OS            21:30O", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("T.Centro         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50OS            05:20O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50OS            06:20O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10OS            07:30O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40OS            08:50O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20OS            10:30O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00OS            12:10O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40OS            13:50O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20OS            15:30O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00OS            17:10O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30OS            18:50O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50OS            20:10O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10OS            21:30O", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Centro         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50              05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50              06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10              07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30              08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50              10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10              11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30              12:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50              14:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10              15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30              16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50              18:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10              19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("O = Via Alberto de Oliveira.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("S = Via Hospital Santa Teresa.", "");
        onibusTestes.add(e);






        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_alto__moinho__preto);

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