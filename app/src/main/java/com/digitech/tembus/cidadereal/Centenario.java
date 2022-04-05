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

public class Centenario extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Bingen         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            05:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10            10:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55            11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            11:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25            12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10            13:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:55            14:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            14:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10            16:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55            17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            17:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25            18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            19:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55            20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            20:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:25            21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10            22:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:55            23:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20                  ", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("T.Bingen         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            05:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10            10:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55            11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            11:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25            12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10            13:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:55            14:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            14:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10            16:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55            17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            17:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25            18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            19:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55            20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            20:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:25            21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10            22:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:55            23:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20                  ", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Bingen         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            18:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            19:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            21:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 23:20", "");
        onibusTestes.add(e);




        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_centenario);

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
