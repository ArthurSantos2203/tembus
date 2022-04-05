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

public class Cel_Veiga_Bingen extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Bingen         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00             04:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30P           05:05P", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30P             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30P             N/A*", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("T.Bingen         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:45             23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50              N/A*", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Bingen         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado. Chega e sai.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("P = Atendido pela linha 480 - Petro Ita.", "");
        onibusTestes.add(e);




        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_cel__veiga__bingen);

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
