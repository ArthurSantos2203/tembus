package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Osvero_Villaca extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00             21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40             22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20             22:50E", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00             21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40             22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20             22:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("E = Atende ao Aldo Tamancoldi.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_osvero__villaca);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
