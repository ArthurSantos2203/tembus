package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Vital_Castelanea extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10             21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00U            22:25U", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00U            23:30U", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10             23:40", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30             23:00", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45             06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45             07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45             08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45             09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45             10:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45             11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45             12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45             13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45             14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45             15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45             16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45             17:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45             18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45             19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45             20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45             21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45             22:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45             23:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_vital__castelanea);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
