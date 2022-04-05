package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class IndependenciaCacilda extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55             16:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:25             20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00             21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00             21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15             05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:35             07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:55             08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15             09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:35             11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:55             12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15             13:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35             15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55             16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15             17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35             19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55             20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15             21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_independencia_cacilda);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
