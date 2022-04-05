package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Lopes_Trovao extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro             Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15O             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25O             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15              10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05              16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05              20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro             Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20              06:10O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50O             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20O             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50O             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20O             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15O             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro             Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15O              06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15O              07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45O              09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15O              10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45O              12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15O              13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45O              15:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15O              16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45O              18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15O              19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:55O              21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15O              22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:30O                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("O = Não atende a rua Euclides da Cunha de Oliveira.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("O = Realizado pela linha 453.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_lopes__trovao);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}