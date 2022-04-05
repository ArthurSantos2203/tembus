package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Taquara extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40UA           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20UA           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10UA           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20UA           08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00UA           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40UA           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:25UA           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10             22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20             23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:35            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:35            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:25            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20E              06:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20E              07:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20E              08:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20E              09:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20E              10:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20E              11:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20E              12:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20E              13:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20E              14:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20E              15:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20E              16:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20E              17:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20E              18:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20E              19:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20E              20:50E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30E              22:00E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("U = NÃO VAI NA RUA O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("A = Atende a Vista Alegre", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("E = via Rua Antonio da Silva Ligeiro", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_taquara);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
