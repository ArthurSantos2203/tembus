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

public class Dias_de_Oliveira extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Bingen         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:55            05:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:05            07:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25            07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15            08:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:35            08:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50            09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25            09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:35            10:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45            12:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20BA          12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55            13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:05            14:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15            15:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:25            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            17:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35            17:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:55            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45            19:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:05            19:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55            20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:05            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:35            21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:05            22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:35            22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:05            23:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("B = Via BR-040", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("A = Apenas no período escola", "");
        onibusTestes.add(e);







        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("T.Bingen         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:55            05:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:05            07:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15            08:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50            09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25            09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:35            10:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45            12:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55            13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:05            14:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15            15:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:25            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35            17:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45            19:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55            20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:05            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:35            21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:05            22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:35            22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:05            23:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:35                 ", "");
        onibusTestes.add(e);






        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Centro       T.Bingen", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:55            07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05            08:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            09:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50            10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:25            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35            11:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45            13:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            13:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:55            14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:05            15:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15            16:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:25            17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35            18:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            20:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20            22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:10            23:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:45                  ", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_dias_de__oliveira);

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