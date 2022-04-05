package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Olga_Coronel_Veiga extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15             21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15             22:45", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20             22:50", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30             06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30             07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             08:00", "");
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

        e = new TemBusLayoutAdapter("19:30             20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30             21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30             23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_olga__coronel__veiga);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
