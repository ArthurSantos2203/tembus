package com.digitech.tembus.hortencias;

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

public class ViuvaLima extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T. Itamarati            Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40                     N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40                     20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Bairro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_viuva_lima);



        ListView lista = (ListView) findViewById(R.id.listViewid);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}