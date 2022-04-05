package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Terminal_Bingen_Correas extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Bingen       T.Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            04:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            22:00", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("T.Bingen       T.Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            04:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            22:00", "");
        onibusTestes.add(e);






        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Bingen       T.Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            21:00", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_terminal__bingen__correas);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);
    }
}
