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

public class Batista_da_Costa extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro       T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            05:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10            22:40", "");
        onibusTestes.add(e);








        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Bairro       T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            05:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10            22:40", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("OBS: N/A* = Não fica parado no ponto. Chega e sai.", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro       T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10           06:35V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00           07:35V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00           08:35V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15           09:55V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:35           11:15V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:55           12:35V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15           13:55V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35           15:15V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55           16:35V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15           17:55V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35           19:15V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55           20:35V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15           21:40V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15           22:40V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: V = Atende a Rua Waldemar Ferreira da Silva.", "");
        onibusTestes.add(e);




        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_batista_da__costa);

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
