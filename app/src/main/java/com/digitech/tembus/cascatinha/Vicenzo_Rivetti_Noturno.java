package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class Vicenzo_Rivetti_Noturno extends AppCompatActivity {
    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Centro           Bairro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("00:30               00:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("01:45S              01:05", ""));
        onibusTestes.add(new TemBusLayoutAdapter("03:00S              02:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("                      03:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Centro           Bairro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("00:30               00:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("01:45S              01:05", ""));
        onibusTestes.add(new TemBusLayoutAdapter("03:00S              02:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("                      03:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Domingos e Feriados", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Centro           Bairro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("00:30               00:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("01:45S              01:05", ""));
        onibusTestes.add(new TemBusLayoutAdapter("03:00S              02:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("                      03:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: S = Via Sertão do Carangola.", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_vicenzo_rivetti_noturno);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);
    }
}
