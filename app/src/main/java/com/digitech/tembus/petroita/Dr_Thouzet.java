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

public class Dr_Thouzet extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30              22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:05              22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40              23:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30              22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:05              22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40              23:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30              06;55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              07:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25              08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15              08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40              09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30              10:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:55              10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45              11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10              11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              12:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25              13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15              13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40              14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              15:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:55              15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45              16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10              16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              17:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:25              18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15              18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40              19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30              20:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55              20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45              21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10              21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00              22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30              23:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_dr__thouzet);

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
