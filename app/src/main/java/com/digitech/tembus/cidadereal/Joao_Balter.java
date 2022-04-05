package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Joao_Balter extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Battaillard-Quadra          Rua João Balter", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00                                 06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40                                 07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20                                 07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00                                 08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40                                 09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00                                 16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40                                 17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20                                 17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00                                 18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00                                 19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40                                 20:00", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Battaillard-Quadra          Rua João Balter", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00                                 06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40                                 07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20                                 07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00                                 08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40                                 09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00                                 16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40                                 17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20                                 17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00                                 18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00                                 19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40                                 20:00", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_joao__balter);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}