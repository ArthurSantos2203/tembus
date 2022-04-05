package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Tancredo_Neves extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25             06:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25             07:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25             08:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25             09:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:25             10:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:25             11:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25             12:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25             13:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:25             14:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25             15:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:25             16:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:25             17:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25             18:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25             19:55", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_tancredo__neves);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
