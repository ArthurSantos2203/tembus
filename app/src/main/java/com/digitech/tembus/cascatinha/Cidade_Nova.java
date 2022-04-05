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

public class Cidade_Nova extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");   //SE QUISER COPIAR O CODIGO AMOR, É SÓ COPIAR A PARTIR DESSA LINHA
        onibusTestes.add(e);                                    //ATÉ ESSA AQUI! ;)

        e = new TemBusLayoutAdapter("05:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10            20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:35", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10            20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:35", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40            09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40            17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:30", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_cidade__nova);

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