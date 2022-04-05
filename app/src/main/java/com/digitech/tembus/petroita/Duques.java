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

public class Duques extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20A             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20A             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              N/A**", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35A             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00A             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30A             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00A             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30A             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00A              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05A              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50A             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10              21:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50A             21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30              22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00              22:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30              23:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:10              23:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:35            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:35            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10            21:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45            21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10            22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45            23:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:45                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40              06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20              07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40              08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20              09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40              10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20              11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40              12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20              13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              13:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40              14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00              15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40              16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20              17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40              18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20              19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00              19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30              20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30              21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30              22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30              23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("A = VIA CASTELÂNEA.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_duques);

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