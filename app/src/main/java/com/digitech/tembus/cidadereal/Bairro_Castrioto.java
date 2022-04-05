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

public class Bairro_Castrioto extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Centro       T.Bingen", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            04:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15            05:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45            05:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15            06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15            07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45            07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40            08:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20            09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20            10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            13:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20            14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40            16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40            17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:30            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:50            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A              21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A              22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A              22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A              23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A              23:30", "");
        onibusTestes.add(e);







        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("T.Centro       T.Bingen", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15            04:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45            05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15            05:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            07:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05            07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55            08:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20            09:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10            09:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:35            10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:25            11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            11:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            12:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:05            12:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:55            13:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20            14:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10            14:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35            15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:25            16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            16:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            17:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05            17:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:55            18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            19:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            19:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05            20:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:30            23:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:50                  ", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Centro       T.Bingen", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15            04:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45            05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15            05:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45            07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15            07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45            08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45            09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15            09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45            10:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45            11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15            11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15            12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45            13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45            14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15            14:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15            15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45            17:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15            17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15            18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:05            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:05            22:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:30            23:00", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_bairro__castrioto);

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