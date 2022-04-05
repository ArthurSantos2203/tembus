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

public class Duarte_da_Silveira_Bartolomeu extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Centro         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:45S            00:15S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:45B            01:00B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:15S            01:40S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:00B            02:10B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:20S            02:40S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:00B            03:10B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:15S            03:40S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:00B            04:10B", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("T.Centro         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:45S            00:15S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:45B            01:00B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:15S            01:40S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:00B            02:10B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:20S            02:40S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:00B            03:10B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:15S            03:40S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:00B            04:10B", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Centro         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:45S            00:15S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:45B            01:00B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:15S            01:40S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:00B            02:10B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:20S            02:40S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:00B            03:10B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:15S            03:40S", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:00B            04:10B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("B = Atende o Bartolomeu de Gusmão.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("S = Via Duarte da Silveira.", "");
        onibusTestes.add(e);






        return onibusTestes;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_duarte_da__silveira__bartolomeu);

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