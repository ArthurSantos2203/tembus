package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class Vale_Dos_Esquilos extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");   //SE QUISER COPIAR O CODIGO AMOR, É SÓ COPIAR A PARTIR DESSA LINHA
        onibusTestes.add(e);                                    //ATÉ ESSA AQUI! ;)

        e = new TemBusLayoutAdapter("00:00                N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:50              04:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20              05:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40              05:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20              06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30              06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45              07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20              07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30              07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45              08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20              08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40              09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20              09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40              10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20              10:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40              11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              11:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:25              12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45              12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10              12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:35              13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55              13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15              13:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20              13:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45              14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50              14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:05              15:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:55              16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15              16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40              16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05              17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20               17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:25               17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50              17:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15              18:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35              18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10              19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20              19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35              19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50              20:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30              20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40              20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55              20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10              21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:25              22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00              23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30              23:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15                   ", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:50             05:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20             05:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45             06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:55             06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10             06:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25             06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45             07:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:55             07:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15             07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             07:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45             08:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00             08:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20             08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40             09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00             09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20             09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40             10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00             10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20             10:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            11:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40             12:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20              12:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40              13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20              13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40             14:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40              15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00              15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20              15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40              16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20              16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40             17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              17;30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20              17:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            18:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00           18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20              18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40              19:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00              19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20              19:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              20:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20              21:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:55              22:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10              22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:25              22:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15              23:40", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:55            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:55            07:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:55            08:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55            09:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:55            10:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55            11:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:55            12:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:55            13:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:55            14:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:55            15:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55            16:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55            17:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:55            18:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:55            19:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55            20:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:55            21:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:55            22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45            23:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15            23:40", "");
        onibusTestes.add(e);

        return onibusTestes;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_vale__dos__esquilos);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}