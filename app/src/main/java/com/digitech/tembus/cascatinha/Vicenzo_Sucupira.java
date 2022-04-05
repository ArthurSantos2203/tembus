package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class Vicenzo_Sucupira extends AppCompatActivity {
    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro           Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:20              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:15              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:55              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:20              22:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:30              23:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro           Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:20              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:15              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:55              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:20              22:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:30              23:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: N/A* = Não fica parado no Centro. Chega e sai.", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_vicenzo_sucupira);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);
    }
}
