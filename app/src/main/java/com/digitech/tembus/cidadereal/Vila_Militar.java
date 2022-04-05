package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Vila_Militar extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro       T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:05              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:25            20:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:35            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            22:25", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro       T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:05              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:35            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            22:25", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro       T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25            06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45            08:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05            09:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:25            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45            12:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:05            13:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25            14:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            16:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05            17:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25            18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45            20:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:05            21:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:05            22:45", "");
        onibusTestes.add(e);





        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_vila__militar);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}