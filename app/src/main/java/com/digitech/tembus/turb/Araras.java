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

public class Araras extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro       T. Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:30            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:40            05:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:05            05:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:25            06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            07:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            07:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:05            07:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:55            08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45            09:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35            10:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:25            11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50            11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:25            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:05            12:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            14:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45            14:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35            15:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15            17:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05            17:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:55            18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25            19:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45            19:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35            20:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:25            21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40                   ", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro       T. Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:30            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:40            05:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:05            05:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:25            06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            07:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            07:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:05            07:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:55            08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45            09:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35            10:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:25            11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50            11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:05            12:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            14:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45            14:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35            15:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15            17:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05            17:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:55            18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25            19:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45            19:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35            20:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:25            21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40                   ", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro       T. Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:30            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20           05:30V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15V           06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45           07:00V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45V           08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15           08:35V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50            09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25V           09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00           10:20V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            10:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10V           11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45           12:05V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55            13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30           13:50V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:05            14:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40V           15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15           15:35V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:25V           16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00           17:20V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35            17:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10V           18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45           19:05V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55V           20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30           20:50V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:05            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40V          22:20V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: V = Via Vista Alegre - Araras", "");
        onibusTestes.add(e);

        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_araras);

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
