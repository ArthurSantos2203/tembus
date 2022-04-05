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

public class BonfimPinheiral extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro       T. Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            05:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35            10:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45            11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            11:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:55            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55            13:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25            13:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:55            14:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:05            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15            16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            17:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            17:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35            17:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50            18:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50            18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50            19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50            20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50            21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 23:40", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro       T. Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            05:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35            10:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45            11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            11:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:55            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55            13:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25            13:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:55            14:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:05            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15            16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            17:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            17:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35            17:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50            18:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50            18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50            19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50            20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50            21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 23:40", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro       T. Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10            10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:55            11:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:05            13:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            13:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15            14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50            14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25            15:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35            16:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10            17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45            17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:55            18:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05            20:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15            21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50            21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:25            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:05            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 23:40", "");
        onibusTestes.add(e);



        return onibusTestes;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_bonfim_pinheiral);

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
