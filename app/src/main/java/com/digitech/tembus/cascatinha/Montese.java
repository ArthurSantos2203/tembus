package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class Montese extends AppCompatActivity {
    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro           Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30              22:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro           Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30              22:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: N/A* = Não fica parado no Centro. Chega e sai.", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_montese);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);
    }
}
