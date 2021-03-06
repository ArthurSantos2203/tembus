package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Honduras_Gulf extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Domingos e Feriados", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("Bairro          Centro", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("05:20             N/A*", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("06:00             N/A*", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("07:00             N/A*", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("08:10             N/A*", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("09:20             N/A*", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("10:30             N/A*", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("11:40             N/A*", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("12:50             N/A*", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("14:10             N/A*", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("15:20             N/A*", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("16:30             N/A*", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("17:40             N/A*", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("18:50             N/A*", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("20:00             N/A*", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("21:00             21:25", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("22:00             22:30", "");
    onibusTestes.add(e);

    e = new TemBusLayoutAdapter("N/A* = N??o fica parado no Centro. Chega e sai.", "");
    onibusTestes.add(e);

    return onibusTestes;

}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_honduras__gulf);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
