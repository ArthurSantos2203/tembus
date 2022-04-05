package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

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


public class Alto_Boa_Vista extends AppCompatActivity {

    private AdView mAdView;


    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro          Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:10            05:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:40            06:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:10            06:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:40            07:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:10            07:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:40            08:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:10            08:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:40            09:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:10            09:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:40            10:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:10            10:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:40            11:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:10            11:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:40            12:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:10            12:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:40            13:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:10            13:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:40            14:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:10            14:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:40            15:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:10            15:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:45            16:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:20            16:55", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:55            17:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:30            18:05", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:05            18:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:40            19:15", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:15            19:55", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:55            20:35", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:35            21:15", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:05            21:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:45            22:15", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:45            23:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro          Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:10            05:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:40            06:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:10            06:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:40            07:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:10            07:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:40            08:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:10            08:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:40            09:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:10            09:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:40            10:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:10            10:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:40            11:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:10            11:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:40            12:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:10            12:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:40            13:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:10            13:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:40            14:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:10            14:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:40            15:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:10            15:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:45            16:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:20            16:55", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:55            17:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:30            18:05", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:05            18:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:40            19:15", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:15            19:55", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:55            20:35", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:35            21:15", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:05            21:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:45            22:15", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:45            23:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Domingos e Feriados", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro          Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:10            06:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:40            07:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:10            07:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:40            08:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:10            08:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:40            09:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:10            09:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:40            10:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:10            10:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:40            11:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:10            11:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:40            12:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:10            12:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:40            13:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:10            13:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:40            14:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:10            14:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:40            15:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:10            15:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:40            16:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:10            16:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:40            17:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:10            17:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:40            18:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:10            18:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:40            19:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:10            19:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:40            20:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:10            20:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:40            21:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:10            21:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:40            22:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:10            22:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:40            23:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:15                 ", ""));
        onibusTestes.add(new TemBusLayoutAdapter("                      ", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_alto__boa__vista);

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

        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);


    }
}
