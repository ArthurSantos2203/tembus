package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Rodoviaria_Jorge_Justen extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Bingen       T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:55            07:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25            08:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:35            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:05            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:35            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:05            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:05            21:15", "");
        onibusTestes.add(e);






        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("T.Bingen       T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:55            07:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25            08:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:35            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:05            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:35            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:05            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:05            21:15", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_rodoviaria__jorge__justen);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}