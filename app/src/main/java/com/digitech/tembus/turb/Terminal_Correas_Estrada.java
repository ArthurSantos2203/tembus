package com.digitech.tembus.turb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Terminal_Correas_Estrada extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Correas       Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:55                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:05                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50            22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Correas       Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:55                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:05                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50            22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro       T.Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45            08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45            09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45            10:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45            11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45            13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45            14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            17:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45            19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45            21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45            22:15", "");
        onibusTestes.add(e);

        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_terminal__correas__estrada);


        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}