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

public class LoteamentoSamambaia extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro      T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:55            05:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00                  ", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro      T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:55            05:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            23:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50C                  ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: C = Via praça do Cenip", "");
        onibusTestes.add(e);



        return onibusTestes;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_loteamento_samambaia);



        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}