package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Simeria_Coronel_Veiga extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15             21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:25             22:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20             23:40", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20             21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:25             22:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20             23:40", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00F             06:40F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20F             08:00F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40F             09:20F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00F             10:40F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20F             12:00F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40F             13:20F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00F             14:40F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20F             16:00F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40F             17:20F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00F             18:40F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20F             20:00F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40F             21:20F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00F             22:40F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00F             23:30F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("F = Atende a Comunidade Frente para o Mar.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_simeria__coronel__veiga);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
