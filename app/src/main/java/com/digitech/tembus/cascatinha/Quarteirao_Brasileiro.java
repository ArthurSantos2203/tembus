package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class Quarteirao_Brasileiro extends AppCompatActivity {
    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro       T.Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:55             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:50             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:00            20:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:00            21:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:00            22:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("23:00            23:35", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro       T.Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:15             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:55             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:45             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:30             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:40             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:50             N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:00            20:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:00            21:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:00            22:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("23:00            23:35", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: N/A* = Não fica parado no Centro. Chega e Sai.", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Domingos e Feriados", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro       T.Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00            06:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:00            07:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:00            08:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:00            09:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:00            10:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:00            11:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:00            12:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:00            13:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:00            14:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:00            15:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:00            16:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:00            17:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:00            18:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:00            19:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:00            20:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:00            21:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:00            22:30", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_quarteirao__brasileiro);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);
    }
}
