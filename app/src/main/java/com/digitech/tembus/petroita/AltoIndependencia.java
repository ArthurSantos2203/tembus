package com.digitech.tembus.petroita;

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

public class AltoIndependencia extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:35            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20            22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40            22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10            21:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            22:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20            22:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro, chega e sai.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45T            06:25T", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20              07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00T            07:45T", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40              08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25T            09:05T", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45T            10:25T", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20              11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:05T            11:45T", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40              12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25T            13:05T", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              13:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45T            14:25T", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:05T            15:45T", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40              16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:25T            17:05T", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45T            18:25T", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20              19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:05T            19:45T", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40              20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:25T            20:50T", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45T            22:10T", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20              23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T = ATENDE AO BAIRRO MAUÁ.", "");
        onibusTestes.add(e);


        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_alto_independencia);

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
