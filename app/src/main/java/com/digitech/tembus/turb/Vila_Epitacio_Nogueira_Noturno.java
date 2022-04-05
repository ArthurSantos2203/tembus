package com.digitech.tembus.turb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Vila_Epitacio_Nogueira_Noturno extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Centro          Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:15            01:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:15            03:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:15                 ", "");
        onibusTestes.add(e);









        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro          Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:15            01:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:15            03:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:15                 ", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro          Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:15            01:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:15            03:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:15                 ", "");
        onibusTestes.add(e);


        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_vila__epitacio__nogueira__noturno);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);
    }
}
