package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class Monte_Florido extends AppCompatActivity {
    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro          Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:45              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:45              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:25              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:10             22:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro          Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:45              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:45              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:25              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:10             22:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Domingos e Feriados", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro          Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:20              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:20              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:20              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:10             22:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("OBS: N/A* = Não fica parado no Centro. Chega e sai.", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_monte__florido);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);
    }
}
