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

public class Comunidade_Ventura extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro           Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00            06:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             07:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             08:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             09:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             10:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             11:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             12:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             13:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             14:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             15:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             16:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             17:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             18:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             19:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             20:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             21:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             22:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro           Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00            06:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             07:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             08:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             09:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             10:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             11:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             12:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             13:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             14:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             15:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             16:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             17:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             18:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             19:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             20:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             21:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             22:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Domingos e Feriados", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro           Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00            06:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             07:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             08:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             09:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             10:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             11:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             12:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             13:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             14:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             15:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             16:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             17:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             18:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             19:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             20:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             21:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("N/A*             22:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: N/A* = Não fica parado no Bairro. Chega e sai.", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_comunidade__ventura);

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
