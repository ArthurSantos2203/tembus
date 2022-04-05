package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Getulio_Vargas extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30              06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40              07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20              09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20              N/A**", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20              17:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40              19:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20              22:00", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_getulio__vargas);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}