package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class VilaFelipeDuasPontes extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:25            21:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:25            21:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);


        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_vila_felipe_duas_pontes);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}