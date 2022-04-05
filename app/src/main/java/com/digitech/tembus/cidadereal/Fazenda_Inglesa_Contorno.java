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

public class Fazenda_Inglesa_Contorno extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Bingen                              Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30                                 05:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20                                 06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10                                 07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00                                 08:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50                                 09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40                                 10:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30                                 11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20                                 11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10                                 12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00                                 13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50                                 14:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40                                 15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30                                 15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20                                 16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10                                 17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00                                 18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50                                 19:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40                                 20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20                                 20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20                                 21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10                                 22:40", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("T.Bingen                              Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30                                 05:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20                                 06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10                                 07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00                                 08:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50                                 09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40                                 10:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30                                 11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20                                 11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10                                 12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00                                 13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50                                 14:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40                                 15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30                                 15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20                                 16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10                                 17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00                                 18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50                                 19:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40                                 20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20                                 20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20                                 21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10                                 22:40", "");
        onibusTestes.add(e);




        return onibusTestes;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_fazenda__inglesa__contorno);

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
