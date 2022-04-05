package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Vila_Felipe extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:55Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:55Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:55Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:55Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:55Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:55Y             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20             23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20              23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20             23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Y = Não opera durante as férias escolares.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("G = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_vila__felipe);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
