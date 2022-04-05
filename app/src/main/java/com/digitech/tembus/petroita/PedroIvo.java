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

public class PedroIvo extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            16:45A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20A            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45            22:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45            08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15            09:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45            15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40V            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15            05:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:30", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("A = Atende o Colégio.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("V = Viagem da linha 429 que atende ao Lagoinha e Pedro Ivo.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);


        return onibusTestes;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_pedro_ivo);




        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}