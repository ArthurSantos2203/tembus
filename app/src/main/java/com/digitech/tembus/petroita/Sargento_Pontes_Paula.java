package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Sargento_Pontes_Paula extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_sargento__pontes__paula);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
