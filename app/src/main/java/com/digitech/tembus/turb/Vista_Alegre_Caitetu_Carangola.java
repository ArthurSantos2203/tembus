package com.digitech.tembus.turb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Vista_Alegre_Caitetu_Carangola extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00A              06:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45B              07:00B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15C              07:30C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00A              08:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45B              09:00B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15C              09:30C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00A              10:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45B              11:00B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15C              11:30C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00A              12:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40B              12:50B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00A              13:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40C              13:50C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00A              14:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45B              15:00B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15C              15:30C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00A              16:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45B              17:00B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15C              17:30C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00A              18:25A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45B              19:15B", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30C              19:45C", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10A              20:35A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30A                    ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00                     ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: A = Atende ao Carangola", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: B = Vista Alegre - Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: C = Atende ao Caitetu", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_vista__alegre__caitetu__carangola);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}