package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Vital_Brasil_Alto extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_vital__brasil__alto);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
