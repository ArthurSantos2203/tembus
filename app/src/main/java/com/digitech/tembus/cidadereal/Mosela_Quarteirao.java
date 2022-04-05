package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Mosela_Quarteirao extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Bingen         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            05:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50            10:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:05            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            21:00", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("T.Bingen         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            05:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50            10:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:05            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            21:00", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_mosela__quarteirao);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}