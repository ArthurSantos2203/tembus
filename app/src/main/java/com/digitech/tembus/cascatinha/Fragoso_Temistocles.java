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

public class Fragoso_Temistocles extends AppCompatActivity {

    private AdView mAdView;


    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro          Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:00            05:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:30            06:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00            06:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:30            07:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:00            07:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:30            08:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:00            08:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:30            09:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:00            09:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30            10:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:00            10:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:30            11:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:00            11:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30            12:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:00            12:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:30            13:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:00            13:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30            14:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:00            14:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:30            15:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:00            15:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:30            16:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:00            16:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:30            17:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:00            17:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:30            18:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:00            18:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:30            19:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:00            19:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:30            20:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:00            20:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:30            21:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:00            21:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30            22:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:00            22:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:30            23:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("23:00            23:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro          Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:00            05:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:30            06:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00            06:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:30            07:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:00            07:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:30            08:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:00            08:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:30            09:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:00            09:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30            10:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:00            10:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:30            11:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:00            11:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30            12:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:00            12:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:30            13:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:00            13:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30            14:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:00            14:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:30            15:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:00            15:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:30            16:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:00            16:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:30            17:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:00            17:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:30            18:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:00            18:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:30            19:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:00            19:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:30            20:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:00            20:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:30            21:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:00            21:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30            22:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:00            22:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:30            23:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("23:00            23:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Domingos e Feriados", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro          Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:30            07:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:30            08:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:30            09:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30            10:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:30            11:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30            12:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:30            13:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30            14:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:30            15:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:30            16:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:30            17:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:30            18:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:30            19:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:30            20:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:30            21:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30            22:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:30            23:00", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_fragoso__temistocles);

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
