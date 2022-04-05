package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Joao_Xavier extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Bingen         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            17:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            21:00", "");
        onibusTestes.add(e);






        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Bingen         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            17:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            21:00", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_joao__xavier);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}