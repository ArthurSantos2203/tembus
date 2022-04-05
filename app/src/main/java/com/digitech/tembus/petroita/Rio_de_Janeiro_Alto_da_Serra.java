package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Rio_de_Janeiro_Alto_da_Serra extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10             06:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             08:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10             09:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40             11:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10             12:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40             14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00             15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30             17:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00             18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30             20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50             21:35", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10             06:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             08:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10                  ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30             17:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00             18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30                  ", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25             07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:55             08:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25             10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55             11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25             13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:55             14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25             16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55             17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25             19:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55             20:40", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_rio_de__janeiro__alto_da__serra);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
