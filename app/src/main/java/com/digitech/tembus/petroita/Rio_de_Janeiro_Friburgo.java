package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Rio_de_Janeiro_Friburgo extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30             21:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00             21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50             22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20             22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00             23:30", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30             21:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00             21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50             22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20             22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00             23:30", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10             06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50             09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10             10:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30             12:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50             13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10             14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30             16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50             17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10             18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30             20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50             21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10             22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);


        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_rio_de__janeiro__friburgo);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
