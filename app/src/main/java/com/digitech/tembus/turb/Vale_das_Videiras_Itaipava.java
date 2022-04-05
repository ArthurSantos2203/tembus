package com.digitech.tembus.turb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Vale_das_Videiras_Itaipava extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Itaipava       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            20:45", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Itaipava       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            20:45", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Itaipava       Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            20:45", "");
        onibusTestes.add(e);


        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_vale_das__videiras__itaipava);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}
