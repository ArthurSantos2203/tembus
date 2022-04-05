package com.digitech.tembus.petroita;

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

public class Espirito_Santo_Ceara extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15              20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25              21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              22:30E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              23:15E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15              20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25              21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              22:30E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              23:15E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:55              06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25              07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:05              07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35              08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15              08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45              09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25              10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05              10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45              11:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:25              12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:05              12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45              13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25              14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:05              14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45              15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25              16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05              16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45              17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:25              18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05              18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45              19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25              20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05              20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45              21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:25              22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30              23:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("E = Atendido pelo carro da linha 423.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_espirito__santo__ceara);

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