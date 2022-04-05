package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class Vila_Manzini extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");   //SE QUISER COPIAR O CODIGO AMOR, É SÓ COPIAR A PARTIR DESSA LINHA
        onibusTestes.add(e);                                    //ATÉ ESSA AQUI! ;)

        e = new TemBusLayoutAdapter("05:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25           06:55K", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30             21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             22:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:55             23:30", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("05:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25           06:55K", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30             21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             22:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:55             23:30", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00FF          06:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15F           07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30F           09:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:45F           10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00F           11:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15F           12:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30F           14:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45F           15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00F           16:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15F           17:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30F           19:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45F           20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00F           21:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15F           22:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("K- Circular no ponto. Horário apenas previsto", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("F- Atende o Amoedo na volta da V. Manzini", "");
        onibusTestes.add(e);

        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_vila__manzini);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}