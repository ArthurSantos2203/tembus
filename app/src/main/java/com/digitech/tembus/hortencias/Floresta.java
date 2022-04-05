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

public class Floresta extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Centro                Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15                  06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro                Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15                  06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:55                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:35                   N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro                Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00                  06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00                  07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00                  08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00                  09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00                  10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00                  11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00                  12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00                  13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00                  14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00                  15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00                  16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00                  17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00                  18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00                  19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00                  20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00                  21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00                  22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Bairro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_floresta);

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



        ListView lista = (ListView) findViewById(R.id.listViewid);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
