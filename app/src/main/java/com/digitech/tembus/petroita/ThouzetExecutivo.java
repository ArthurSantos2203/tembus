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

public class ThouzetExecutivo extends AppCompatActivity {


    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("07:00            07:30", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("08:00            08:30", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("09:00              N/A", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("17:40            18:25", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("19:10            19:50", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("07:00           07:30", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("08:00           08:30", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("09:00             N/A", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("16:20           17:00", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("17:40           18:25", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("19:10           19:50", "");
        onibusTestes.add(e);


        return onibusTestes;




        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.petroita_thouzet_executivo);



        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}