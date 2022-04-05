package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Olga_Castrioto_Castelanea extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50              21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_olga__castrioto__castelanea);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
