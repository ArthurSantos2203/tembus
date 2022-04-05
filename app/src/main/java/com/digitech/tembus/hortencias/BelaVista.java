package com.digitech.tembus.hortencias;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

public class BelaVista extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro                T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:45                   05:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15I                 05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45                   06:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10Y                 06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45                   07:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15I                  07:10Y", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20Y                 07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45                   08:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15I                 08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45                   09:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15I                 09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45                   10:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15I                 10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45                   11:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15I                  11:30Y", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40Y                 11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45                   12:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15I                 12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45                   13:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15I                 13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45                   14:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15I                 14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45                   15:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15I                 15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45                   16:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15I                 16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45                   17:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15I                 17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45                   17:50Y", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00Y                  18:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15I                 18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45                   18:50Y", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00Y                  19:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15I                 19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45                   20:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15I                 20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45                   21:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15I                 21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45                   22:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15I                 22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45                   23:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15A                 23:15A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                       23:40A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro                T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:45                   05:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15I                 05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45                   06:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15I                 06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45                   07:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15I                 07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45                   08:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15I                 08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45                   09:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15I                 09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45                   10:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15I                 10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45                   11:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15I                 11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45                   12:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15I                 12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45                   13:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15I                 13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45                   14:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15I                 14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45                   15:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15I                 15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45                   16:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15I                 16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45                   17:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15I                 17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45                   18:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15I                 18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45                   19:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15I                 19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45                   20:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15I                 20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45                   21:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15I                 21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45                   22:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15I                 22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45                   23:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15A                 23:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                        23:40A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("  Bairro              T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30I                  05:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15                  06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45                  07:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15I                 07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45                  08:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15I                 08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45                  09:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15I                 09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45                  10:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15I                 10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45                  11:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15I                 11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45                  12:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15I                 12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45                  13:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15I                 13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45                  14:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15I                 14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45                  15:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15I                 15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45                  16:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15I                 16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45                  17:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15I                 17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45                  18:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15I                 18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45                  19:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15I                 19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45                  20:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15I                 20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45                  21:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15I                 21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45                  22:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15I                 22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45                  23:00I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("I = Atende ao Alto Bela Vista.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Y = Não opera durante as Férias Escolares.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("A = Praça do Cenip.", "");

        return onibusTestes;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_bela_vista);

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

