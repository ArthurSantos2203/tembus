package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class ValparaisoDuasPontes extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00           21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00           22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20           23:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00           21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00           22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20           23:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro, chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_valparaiso_duas_pontes);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}