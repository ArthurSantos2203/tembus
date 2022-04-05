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

public class Atilio_Marotti_Ademir extends AppCompatActivity {

    private AdView mAdView;


    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro           Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:50              21:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro           Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:50              21:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Domingos e Feriados", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro             Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:40              08:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:40              09:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:40              10:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:40              11:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:40              12:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:40              13:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:40              14:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:40              15:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:40              16:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:40              17:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:40              18:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:40              19:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:40              20:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: N/A* = Não fica parado no Centro. Chega e sai.", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_atilio_marotti_ademir);

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
