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

public class Alcides_Carneiro extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00B            06:20C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40C            06:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10B            07:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40C            07:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10B            08:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40C            08:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10B            09:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40C            09:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10B            10:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40C            10:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10B            11:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40C            11:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10B            12:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40C            12:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10B            13:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40C            13:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10B            14:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40C            14:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10B            15:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40C            15:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10B            16:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40C            16:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10B            17:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40C            17:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10B            18:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40C            18:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10B            19:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40C            19:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10B            20:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40C            21:00B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20B            21:40C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00B            22:15B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00B            23:10C", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00B            06:20C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40C            06:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10B            07:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40C            07:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10B            08:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40C            08:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10B            09:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40C            09:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10B            10:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40C            10:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10B            11:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40C            11:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10B            12:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40C            12:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10B            13:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40C            13:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10B            14:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40C            14:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10B            15:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40C            15:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10B            16:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40C            16:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10B            17:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40C            17:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10B            18:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40C            18:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10B            19:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40C            19:55B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10B            20:25C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40C            21:00B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20B            21:40C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00B            22:15B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00B            23:10C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: B = Via Ponte Branca", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: C = Via Praça de Corrêas", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            06:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10            07:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            07:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10            08:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40            08:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            09:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            09:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10            10:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            10:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10            11:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            11:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10            12:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            12:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10            13:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            13:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10            14:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            14:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10            15:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            15:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10            16:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40            16:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10            17:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            17:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10            18:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40            18:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            19:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40            19:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10            20:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            20:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:10", "");
        onibusTestes.add(e);

        return onibusTestes;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_alcides__carneiro);

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