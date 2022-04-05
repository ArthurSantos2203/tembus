package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

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

public class Boa_Vista_Noturno extends AppCompatActivity {

    private AdView mAdView;


    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Centro           Bairro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("00:30V                N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("01:30A                N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("02:30V                N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("03:30A                N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("04:30                 N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Centro           Bairro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("00:30V                N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("01:30A                N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("02:30V                N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("03:30A                N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("04:30                 N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Domingos e Feriados", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Centro           Bairro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("00:30V                N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("01:30A                N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("02:30V                N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("03:30A                N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("04:30                 N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: V = Via Vale dos Esquilos.", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: A = Via Atilio Marotti.", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_boa__vista__noturno);

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

        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);
    }
}
