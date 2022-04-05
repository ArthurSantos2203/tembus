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

public class Castelo_Sao_Manoel extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:40            05:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:05            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:55            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10            07:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            23:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            23:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40                   ", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:40                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:05                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:55                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:35                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:05                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:55                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40                   ", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:35                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:05                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:55                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:05                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:55                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:25                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:05                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:35                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:25                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40                   ", "");
        onibusTestes.add(e);


        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_castelo__sao__manoel);

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