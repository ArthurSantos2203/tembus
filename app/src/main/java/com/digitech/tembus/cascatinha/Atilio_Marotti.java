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

public class Atilio_Marotti extends AppCompatActivity {

    private AdView mAdView;


    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro           Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:10             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:30C            N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:10             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:30C            N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:50             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:10             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:30C            N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:10             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:30C            N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:10             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30C            N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:10             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:30C            N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:10             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30C            N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:10             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:30C            N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:10             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30C            N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:10             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:30C            N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:10             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:30C            N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:10             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:30C            N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:40C            N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:00            17:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:00C           18:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:00            19:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:20C           21:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:10           22:05C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30C           22:25", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:00           23:00C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:30C           23:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("23:00C                  ", ""));
        onibusTestes.add(new TemBusLayoutAdapter("23:00                   ", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro           Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:10             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:30C             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:30C             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:30C             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:30C             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30C             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:30C             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30C             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:30C             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30C             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:30C             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:30C             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:30C             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:20              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:40C             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:00C             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:20C             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:10             21:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30C           22:05C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:00             22:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:30C           23:00C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("23:00             23:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Domingos e Feriados", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro           Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:45             06:25", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:15C            06:45C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:00              07:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:20C            07:50C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:00              08:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:20C            08:50C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:00              09:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:20C            09:50C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:00              10:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:20C            10:50C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:00              11:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:20C            11:50C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:00              12:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:20C            12:50C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:00              13:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:20C            13:50C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:00              14:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:20C            14:50C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:00              15:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:20C            15:50C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:00              16:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:20C            16:50C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:00              17:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:20C            17:50C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:00              18:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:20C            18:50C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:00              19:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:20C            19:50C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:00              20:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:30C            21:00C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:00             21:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30C           22:00C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:00             22:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:30C           23:00C", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: N/A* = Não fica parado no Bairro. Chega e sai.", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS 2: C = Via Cantinho da Esperança.", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_atilio__marotti);

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
