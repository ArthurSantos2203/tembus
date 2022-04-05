package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Rio_de_Janeiro extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40              22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30              21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40              22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30              21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50              06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50              07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10              08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30              10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50              11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10              12:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30              14:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50              15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10              16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30              18:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50              19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10              20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30              22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50              23:30", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_rio_de__janeiro);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}