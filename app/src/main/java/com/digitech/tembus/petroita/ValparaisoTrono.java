package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class ValparaisoTrono extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            22:40N", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            23:30N", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            22:40N", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            23:30N", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N = Realizado pelo veículo da linha 496", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_valparaiso_trono);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}