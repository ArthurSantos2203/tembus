package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class JoaquimGomensoro extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            N/A*", "");
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

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            N/A*", "");
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

        e = new TemBusLayoutAdapter("20:50            21:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro, chega e sai.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00              15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00              19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55              20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45              21:10", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_joaquim_gomensoro);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}