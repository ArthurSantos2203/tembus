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

public class RodolfoPires extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Itamarati      Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45          05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45          05:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45          06:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45          07:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45          08:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45          09:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45          10:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45          11:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45          12:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45          13:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45          14:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45          15:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45          16:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45          17:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45          18:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45          19:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50          20:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 21:55", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Itamarati      Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45          05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45          05:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45          06:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45          07:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45          08:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45          09:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45          10:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45          11:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45          12:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45          13:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45          14:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45          15:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45          16:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45          17:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45          18:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45          19:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45          20:55", "");
        onibusTestes.add(e);



        return onibusTestes;
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_rodolfo_pires);




        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}