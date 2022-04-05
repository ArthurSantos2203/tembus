package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class Roseiral extends AppCompatActivity {
    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro         T.Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:45            21:15", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30            22:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:00            22:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro         T.Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:45            21:15", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30            22:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:00            22:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: N/A* = Não fica parado no Centro. Chega e sai.", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Domingos e Feriados", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro         T.Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:15            06:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:15            07:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:15            09:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:45            10:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:15            12:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:45            13:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:15            15:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:45            16:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:15            18:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:45            19:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:15            21:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:40            22:15", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_roseiral);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);
    }
}
