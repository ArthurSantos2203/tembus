package com.digitech.tembus.turb;

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

public class Bairro_Gloria extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T. Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:50            05:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:05            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45            08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15            08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45            09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45            10:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45            11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15            11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15            12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45            13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45            14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15            14:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15            15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            17:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05            17:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:25            17:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05            18:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25            18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45            19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:05            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25            20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15            21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45            21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15            22:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45            22:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15            23:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45            23:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:30                   ", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T. Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:50            05:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45            08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15            08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45            09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45            10:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45            11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15            11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15            12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45            13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45            14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15            14:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15            15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            17:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05            17:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05            18:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45            19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:05            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15            20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45            21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15            21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45            22:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15            22:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45            23:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:30            23:45", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T. Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45            06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15            07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45            08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15            08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45            09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45            10:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45            11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15            11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15            12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45            13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45            14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15            14:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15            15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            17:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15            17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15            18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45            19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15            20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45            21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15            21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45            22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:30            23:30", "");
        onibusTestes.add(e);


        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_bairro__gloria);

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