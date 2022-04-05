package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class QuitandinhaExecutivo extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40            09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20            09:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            17:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            17:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            19:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40            20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50            21:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40            09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20            09:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            17:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            17:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            19:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40            20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50            21:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            N/A", "");
        onibusTestes.add(e);

        return onibusTestes;

    }


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_quitandinha_executivo);



            ListView lista = (ListView) findViewById(R.id.ListViewId);
            ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
            lista.setAdapter(adapter);

        }
    }