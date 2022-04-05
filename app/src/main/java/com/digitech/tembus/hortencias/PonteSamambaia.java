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
import java.util.ArrayList;

public class PonteSamambaia extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:30                05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20                06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00                07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40                07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20                08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00                09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40                09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20                10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00                11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40                11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20                12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00                13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40                13:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20                14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00                15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40                15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20                16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00                17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40                17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20                18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00                19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40                19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20                20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00                21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40                21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20                22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00                23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40                     ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:30                05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20                06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00                07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40                07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20                08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00                09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40                09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20                10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00                11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40                11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20                12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00                13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40                13:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20                14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00                15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40                15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20                16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00                17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40                17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20                18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00                19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40                19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20                20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00                21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40                21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20                22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00                23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40                     ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20                06:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30                07:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30                08:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30                09:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30                10:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30                11:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30                12:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30                13:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30                14:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30                15:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30                16:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30                17:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30                18:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30                19:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30                20:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30                21:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30                22:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30                23:00W", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:30                      ", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("W = Atende ao Loteamento Samambaia", "");
        onibusTestes.add(e);

        return onibusTestes;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_ponte_samambaia);



        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}