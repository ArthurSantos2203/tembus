package com.digitech.tembus.petroita;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
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

public class AltoPedroIvo extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45A            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30A            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10A            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15             21:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00             22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00             23:20", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00             21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15             21:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45             22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00             22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00             23:20", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40             06:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40             07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40             09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40             10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40             11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40             12:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40             13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40             14:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40             15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40             16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40             17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40             18:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40             19:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40             20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40             21:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40             22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40             23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("A = Atende ao Colégio.", "");
        onibusTestes.add(e);



        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_alto_pedro_ivo);

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
