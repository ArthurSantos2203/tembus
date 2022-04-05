package com.digitech.tembus.turb;

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

public class MatrizPedroNava extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Matriz      T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50                  ", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Matriz      T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50                  ", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Matriz      T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50                  ", "");
        onibusTestes.add(e);


        return onibusTestes;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_matriz_pedro_nava);



        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}