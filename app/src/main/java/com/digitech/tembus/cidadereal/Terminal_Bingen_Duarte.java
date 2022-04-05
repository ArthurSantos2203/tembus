package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Terminal_Bingen_Duarte extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Bingen        Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10V          05:00BV", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50            05:25V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30V           06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00V          06:45V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40V          07:20V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40V           08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20V          12:00V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00V          12:40V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45V          16:25V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20V          17:00V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05V          17:45V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                18:30V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                19:15V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: V = Não atende a Comunidade do Veludo", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: B = Via BR-040", "");
        onibusTestes.add(e);






        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("T.Bingen        Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:55            19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35                 ", "");
        onibusTestes.add(e);


        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_terminal__bingen__duarte);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}