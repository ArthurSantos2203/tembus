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

public class Casemiro_de_Abreu extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:25             22:20", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:25             22:20", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_casemiro_de__abreu);

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
