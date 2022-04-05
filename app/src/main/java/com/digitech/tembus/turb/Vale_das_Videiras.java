package com.digitech.tembus.turb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Vale_das_Videiras extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:30            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10            13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 23:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:30            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05            19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            23:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05            19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45            21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            23:40", "");
        onibusTestes.add(e);

        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_vale_das__videiras);


        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}