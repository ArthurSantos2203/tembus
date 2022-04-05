package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class Vicenzo_Rivetti extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");   //SE QUISER COPIAR O CODIGO AMOR, É SÓ COPIAR A PARTIR DESSA LINHA
        onibusTestes.add(e);                                    //ATÉ ESSA AQUI! ;)

        e = new TemBusLayoutAdapter("05:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:05              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30               N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:55            21:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:35            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            23:30", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            23:30", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10            07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10            08:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40            09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10            11:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10            13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10            15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            17:10","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10            17:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            19:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50            20:30","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            21:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10            21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10            22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            23:30", "");
        onibusTestes.add(e);


        return onibusTestes;


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_vicenzo__rivetti);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}