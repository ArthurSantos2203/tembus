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

public class AltoAlcobacinha extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50                   06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10                   06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30                   06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50                   07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10                   07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30                   07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00                   08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20                   08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50                   09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10                   09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40                   09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00                   10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30                   10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50                   11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20                   11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40                   11:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10                   12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30                   12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00                   13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20                   13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50                   14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10                   14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40                   14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00                   15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30                   15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50                   16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20                   16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40                   16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10                   17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30                   17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00                   18:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20                   18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50                   19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10                   19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40                   19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00                   20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30                   20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50                   21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10                   21:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45                   22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10                   22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40                   23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50                   06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10                   06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30                   06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50                   07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10                   07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30                   07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00                   08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20                   08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50                   09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10                   09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40                   09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00                   10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30                   10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50                   11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20                   11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40                   11:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10                   12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30                   12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00                   13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20                   13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50                   14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10                   14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40                   14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00                   15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30                   15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50                   16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20                   16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40                   16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10                   17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30                   17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00                   18:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20                   18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50                   19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10                   19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40                   19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00                   20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30                   20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50                   21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10                   21:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45                   22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10                   22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40                   23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30                   06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30                   07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30                   08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30                   09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30                   10:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30                   11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30                   12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30                   13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30                   14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30                   15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30                   16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30                   17:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30                   18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30                   19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:25                   20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:25                   20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:25                   21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                          22:40", "");
        onibusTestes.add(e);

        return onibusTestes;


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_alto_alcobacinha);

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

        ListView lista = (ListView) findViewById(R.id.listViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}


