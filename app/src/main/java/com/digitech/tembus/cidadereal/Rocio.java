package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Rocio extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Bingen         Rocio", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50            08:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50            20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            23:20", "");
        onibusTestes.add(e);






        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Bingen         Rocio", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50            08:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50            20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            23:20", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Bingen         Rocio", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10            05:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50            08:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            23:20", "");
        onibusTestes.add(e);





        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_rocio);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}