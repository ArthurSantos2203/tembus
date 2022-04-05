package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Quitandinha extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro            Bairro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro            Bairro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_quitandinha);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
