package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class Duarte_Silveira extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Centro        Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:59            07:09", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:19            07:39", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:49            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:59            10:19", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:29            10:39", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10            13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:59            14:19", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:29            14:39", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:05            15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:59            17:19", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:34            17:44", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10            18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35            18:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            19:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:09            20:29", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:44            20:54", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20            21:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 23:29", "");
        onibusTestes.add(e);






        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("T.Centro         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:35            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:59", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:59            07:39", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:39            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            10:19", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:19            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45            14:29", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:29            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            17:29", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:29            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            20:29", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:29            21:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10            21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:59            23:29", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Centro         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:35            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:59", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:59            07:39", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:39            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            10:19", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:19            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45            14:29", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:29            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            17:29", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:29            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            20:29", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:29            21:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10            21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:59            23:29", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_duarte__silveira);

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