package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Terminal_Itaipava_Bingen extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Bingen       T.Itaipava", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 23:10", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("T.Bingen       T.Itaipava", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:10            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 22:30", "");
        onibusTestes.add(e);







        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Bingen       T.Itaipava", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 22:00", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_terminal__itaipava__bingen);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);
    }
}
