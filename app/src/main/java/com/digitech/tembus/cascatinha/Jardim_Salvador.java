package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class Jardim_Salvador extends AppCompatActivity {
    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro         T.Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:25             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:50             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:10             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:40            21:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:15            21:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:50            22:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:30            23:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro         T.Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:25             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:00             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:50             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:20             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:10             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:40            21:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:15            21:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:50            22:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:30            23:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: N/A* = Não fica parado no Centro. Chega e sai.", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Domingos e Feriados", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro         T.Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00            06:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:00            07:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:00            08:35", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:10            09:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:30            11:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:50            12:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:10            13:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:30            15:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:50            16:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:10            17:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:30            19:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:50            20:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:10            21:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:30            23:10", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_jardim__salvador);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);
    }
}
