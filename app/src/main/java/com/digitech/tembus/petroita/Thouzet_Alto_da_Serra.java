package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Thouzet_Alto_da_Serra extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00             22:30", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00             22:30", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_thouzet__alto_da__serra);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
