package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class ValparaisoTerraSanta extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10A            21:30A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10A            22:30A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00             23:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Via Joaquim Gomensoro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10A            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10A            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00             23:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30             09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30             10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30             11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30             12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30             13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30             14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30             15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30             16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30             17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30             18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30             19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30             19:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20             20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10             21:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00             22:25", "");
        onibusTestes.add(e);


        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_valparaiso_terra_santa);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}

