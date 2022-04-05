package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class Joao_De_Deus extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");   //SE QUISER COPIAR O CODIGO AMOR, É SÓ COPIAR A PARTIR DESSA LINHA
        onibusTestes.add(e);                                    //ATÉ ESSA AQUI! ;)

        e = new TemBusLayoutAdapter("05:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45              N/A", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10              22:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45              N/A", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10            22:40", "");
        onibusTestes.add(e);


        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_joao__de__deus);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}