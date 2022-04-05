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

public class Boa_Vista extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");   //SE QUISER COPIAR O CODIGO AMOR, É SÓ COPIAR A PARTIR DESSA LINHA
        onibusTestes.add(e);                                    //ATÉ ESSA AQUI! ;)

        e = new TemBusLayoutAdapter("05:05             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25R              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:35              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:05              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:55              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30              20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20              21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40              22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20              23:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00              23:35", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:05             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:35              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:05              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:55              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30              20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20               21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00               21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40              22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20              23:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00             23:35", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:45","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:40", "");
        onibusTestes.add(e);

        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_boa__vista);

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