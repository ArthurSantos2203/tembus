package com.digitech.tembus.hortencias;

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

public class SpartacoBanal extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro      T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            10:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            17:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            22:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 23:00", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro      T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            10:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            17:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            22:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 23:00", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro      T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            10:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            17:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            22:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 23:00", "");
        onibusTestes.add(e);


        return onibusTestes;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_spartaco_banal);



        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}