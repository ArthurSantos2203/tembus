package com.digitech.tembus.turb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Vista_Alegre extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25            08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10U           10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40U           11:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25            12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40U           13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50            15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50            20:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50            22:00", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25            08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10U           10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40U           11:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:25            12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40U           13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50            15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50            20:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50            22:00", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Corrêas         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45A            07:00A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45A            09:00A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45A            11:00A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40A            12:50A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45A            15:00A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45A            17:00A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45A            19:15A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: U = Carro da Linha 600", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: A = Atendido pela Linha 600", "");
        onibusTestes.add(e);



        return onibusTestes;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_vista__alegre);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}