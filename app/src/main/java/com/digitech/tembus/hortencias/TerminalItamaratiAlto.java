package com.digitech.tembus.hortencias;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class TerminalItamaratiAlto extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Itamarati          Alto da Serra", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50                    06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10                    07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30                    09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45                    16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10                    18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10                    19:50", "");
        onibusTestes.add(e);

        return onibusTestes;
    }


        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.hortencias_terminal_itamarati_alto);

            ListView lista = (ListView) findViewById(R.id.listViewId);
            ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
            lista.setAdapter(adapter);

        }
    }

