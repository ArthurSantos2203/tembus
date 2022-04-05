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

public class Comunidade_Neylor extends AppCompatActivity {

    private AdView mAdView;


    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro           Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:30             16:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00             19:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:20             23:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:40             23:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:05              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:20              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:05              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:20              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:20              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:20              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:05              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:35              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:05              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:35              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:05              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:45              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:25              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro           Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:30             20:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00             20:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:35             21:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:10             22:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:45             23:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:20              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:55              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Domingos e Feriados", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro           Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:30             06:05", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:40             07:15", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:50             08:25", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:00             09:35", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:10             10:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:20             11:55", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:30             13:05", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:40             14:15", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:50             15:25", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:00             16:35", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:10             17:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:20             18:55", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:30             20:05", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:40             21:15", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:50             22:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: N/A* = Não fica parado no Centro. Chega e sai.", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_comunidade__neylor);

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
