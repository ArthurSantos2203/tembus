package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Mosela_Noturno extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Centro         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:10            00:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:20            01:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:20            03:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:50            04:15", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("T.Centro         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:10            00:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:20            01:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:20            03:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:50            04:15", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Centro         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:10            00:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:20            01:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:20            03:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:50            04:15", "");
        onibusTestes.add(e);




        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_mosela__noturno);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}