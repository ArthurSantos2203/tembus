package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Gulf extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15             N/A*", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15             21:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15             22:40", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              06:30 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              07:30 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              08:30 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45O             09:25O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15O             10:55O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45O             12:25O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15O             13:55O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45O             15:25O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15O             16:55O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45O             18:25o", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15O             19:55O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_gulf);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
