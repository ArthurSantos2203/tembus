package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class ValparaisoThouzet extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15A           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("A = Atende ao 204 no horário de 05:20", "");
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

        e = new TemBusLayoutAdapter("10:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15            N/A*", "");
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

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro, chega e sai.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40              06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40              07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50              08:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:05              09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20              10:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35              12:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50              13:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:05              14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20              15:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35              17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50              18:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:05              19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20              20:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:35              22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40              23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20              23:40", "");
        onibusTestes.add(e);

        return onibusTestes;

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_valparaiso_thouzet);

            ListView lista = (ListView) findViewById(R.id.ListViewId);
            ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
            lista.setAdapter(adapter);

        }
    }