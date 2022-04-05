package com.digitech.tembus.cidadereal;

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

public class Contorno extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro       T.Bingen", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45            05:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:35            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25            07:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            08:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20            10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20            14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:25            17:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15            18:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40            18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:05            19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20            22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            23:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:35                  ", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Bairro       T.Bingen", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45            05:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:35            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25            07:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            08:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20            10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20            14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:25            17:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15            18:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40            18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:05            19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20            22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            23:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:35                  ", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Centro       T.Bingen", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            10:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            11:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            12:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            17:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:05            22:50", "");
        onibusTestes.add(e);


        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_contorno);

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