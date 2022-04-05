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

public class Comunidade_Vitoria extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Bingen          Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20            22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            23:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40                  ", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("T.Bingen          Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20            22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            23:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40                  ", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Bingen          Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45            08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            08:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45            11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            11:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15            12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45            14:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            14:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            17:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15            18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            20:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15            21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45            23:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:30                  ", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_comunidade__vitoria);

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
