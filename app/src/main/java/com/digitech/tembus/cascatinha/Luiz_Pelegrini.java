package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class Luiz_Pelegrini extends AppCompatActivity {
    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro          Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00            06:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:40            07:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:20            07:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:00            08:25", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:50            09:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:50            10:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:50            11:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:50            12:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:50            13:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:50            14:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:50            15:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:50            16:15", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:40            17:05", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:30            17:55", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:20            18:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:15            19:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:15            20:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:15            21:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:15            22:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro          Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00            06:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:40            07:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:20            07:40", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:00            08:25", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:50            09:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:50            10:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:50            11:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:50            12:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:50            13:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:50            14:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:50            15:20", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:50            16:15", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:40            17:05", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:30            17:55", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:20            18:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:15            19:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:15            20:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:15            21:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:15            22:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Domingos e Feriados", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro          Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:15            07:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:15            08:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:15            09:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:15            10:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:15            11:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:15            12:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:15            13:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:15            14:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:15            15:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:15            16:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:15            17:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:15            18:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:15            19:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:15            20:45", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:15            21:45", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_luiz__pelegrini);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);
    }
}
