package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class Max_Manoel_Molter_Manzini extends AppCompatActivity {
    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Domingos e Feriados", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro             Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:45M              08:10G", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:25G              09:10M", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:45M              10:10G", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:25G              11:10M", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:45M              12:10G", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:25G              13:10M", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:45M              14:10G", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:25G              15:10M", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:45M              16:10G", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:00G              17:10M", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:45M              18:10G", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:20G              19:10M", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: G = via Modesto Guimarães", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: M = via Max Manoel Molter", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_max__manoel__molter__manzini);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);
    }
}
