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

public class CorreasQuissama extends AppCompatActivity {

    private AdView mAdView;

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Centro            T.Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15                    04:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30                    05:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50                    05:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00U                  05:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("  06:15                   06:00U", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20                    06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("  06:30                    07:00E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("  06:40                    08:00E  ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("  06:50                    09:00E  ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00U                   16:40U", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10                    17:00U", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30E                   18:00E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40U                   19:00E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50                    20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00U                   20:20E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10                    21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20U                     N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30E                     N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00U                     N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30E                     N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40U                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00U                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10U                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20U                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00U                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20U                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40U                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00U                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40U                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00U                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10U                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30UE                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40                      N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30                      N/A", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro                T.Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20                  06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:35                  07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:55                  08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10                  09:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25                  11:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45                  12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00                  13:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15                  14:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30                  15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50                  16:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05                  18:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20                  19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:35                  20:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55                  08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:35                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:05                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:25                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15                    N/A ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:25                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:55                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:05                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:05                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:25                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00                    N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30                    N/A", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro          T.Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20               06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20               07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40               08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20               08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40               09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20               09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40               10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20               10:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40               11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20               11:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40               12:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20               12:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40               13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20               13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40               14:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20               14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40               15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20               15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40               16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20               16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40               17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20               17:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40               18:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20               18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40               19:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20               19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40               20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20               20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40               21:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20               21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40               22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20                 N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("U = Horário feito com Carro Extra", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("E = Direto", "");
        onibusTestes.add(e);

        return onibusTestes;


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_correas_quissama);

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



        ListView lista = (ListView) findViewById(R.id.listViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
