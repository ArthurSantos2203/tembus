package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class SargentoDuasPontes extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20            21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);


        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_sargento_duas_pontes);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}