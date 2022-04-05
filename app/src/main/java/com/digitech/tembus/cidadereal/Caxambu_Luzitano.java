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

public class Caxambu_Luzitano extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            04:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:35            06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50            06:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:05            06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35            07:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05            07:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:35            08:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:05            08:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35            09:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05            09:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:35            10:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:05            10:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35            11:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:05            11:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:35            12:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:05            12:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:35            13:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:05            13:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35            14:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:05            14:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35            15:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05            15:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35            16:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05            16:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35            17:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05            17:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35            18:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:05            18:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35            19:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05            19:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:35            20:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:05            20:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:35            21:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15            21:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 23:30", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            04:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50            06:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35            07:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:35            08:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35            09:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:35            10:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35            11:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:35            12:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:35            13:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35            14:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35            15:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35            16:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35            17:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35            18:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35            19:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:35            20:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:35            21:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50            22:35", "");
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
        setContentView(R.layout.cidade_real_caxambu__luzitano);

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