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

public class Bartolomeu_Bis extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Centro        Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50B           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25B           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30B           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20B           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50B           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35B           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20B           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00B           N/A*", "");
        onibusTestes.add(e);










        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Centro        Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50B           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25B           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30B           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20B           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50B           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35B           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20B           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00B           N/A*", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Centro        Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00           06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30           06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30B          07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30           08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30           09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30B          10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30           11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30B          12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30           13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30           14:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30           15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30           16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30           17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30B          18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30           19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30           20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30B          21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40B                ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: B = Atende o final da Rua Bartolomeu de Gusmão.", "");
        onibusTestes.add(e);






        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_bartolomeu__bis);

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