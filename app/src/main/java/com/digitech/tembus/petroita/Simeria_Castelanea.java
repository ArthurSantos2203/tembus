package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Simeria_Castelanea extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40              22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50              22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50              23:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50              21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50              22:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:55              23:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A = Não faz horário no centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_simeria__castelanea);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
