package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Waldemar_Ferreira_Barao extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro        Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:35                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50            22:35", "");
        onibusTestes.add(e);






        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Bairro        Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:35                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50            22:35", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro        Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:15", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_waldemar__ferreira__barao);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}