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

public class Comunidade_do_Alemao extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro         T.Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:50             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:50             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:00            19:35", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:10            20:35", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:00            21:25", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:50            22:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro         T.Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:50             06:05", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:40             06:55", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:35             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:20            21:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:10            22:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: N/A* = Não fica parado no Centro. Chega e sai.", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_comunidade_do__alemao);

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
