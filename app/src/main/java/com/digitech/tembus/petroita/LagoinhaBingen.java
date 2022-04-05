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

public class LagoinhaBingen extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05            18:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40            19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            20:10", "");
        onibusTestes.add(e);

        return onibusTestes;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_lagoinha_bingen);



        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}