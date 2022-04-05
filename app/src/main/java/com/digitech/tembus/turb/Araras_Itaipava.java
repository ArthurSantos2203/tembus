package com.digitech.tembus.turb;

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

public class Araras_Itaipava extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Itaipava         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40               06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20               08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00               09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40              11:45B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40               13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20               15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00               16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40               18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30               20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00               21:45", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Itaipava         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40               06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20               08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00               09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40              11:45B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40               13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20               15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00               16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40               18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30               20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00               21:45", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("OBS: B = Via Brazão", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_araras__itaipava);

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
