package com.digitech.tembus.hortencias;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class TerminalItamaratiBingen extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Itamarati          T. Bingen", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:05              05:05*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:55*           05:55 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45              06:45*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35*            07:35 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25              08:25*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15*           09:15 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05              16:05*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05*           17:05 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05              18:05*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:05*           19:05 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05              20:05*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:05*           21:05 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("* =  Atendido pela Linha 11 - Cidade Real ", "");
        onibusTestes.add(e);

        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_terminal_itamarati_bingen);


        ListView lista = (ListView) findViewById(R.id.listViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}


