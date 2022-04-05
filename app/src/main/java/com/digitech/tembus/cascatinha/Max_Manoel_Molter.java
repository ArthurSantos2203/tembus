package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class Max_Manoel_Molter extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");   //SE QUISER COPIAR O CODIGO AMOR, É SÓ COPIAR A PARTIR DESSA LINHA
        onibusTestes.add(e);                                    //ATÉ ESSA AQUI! ;)
        e = new TemBusLayoutAdapter("06:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:25", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:25", "");
        onibusTestes.add(e);


        return onibusTestes;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_max__manoel__molter);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}