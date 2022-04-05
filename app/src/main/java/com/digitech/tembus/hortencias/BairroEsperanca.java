package com.digitech.tembus.hortencias;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

public class BairroEsperanca extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro                  Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20F                    N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro                  Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20F                    N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro                  Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30                    05:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     10:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     17:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     22:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A*                     23:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não Fica parado no Bairro. Chega e sai.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("F = Via Floresta", "");
        onibusTestes.add(e);



        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_bairro_esperanca);

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
