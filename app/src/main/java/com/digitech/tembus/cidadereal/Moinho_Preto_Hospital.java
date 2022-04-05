package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Moinho_Preto_Hospital extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20MS            05:00M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20MS            05:50M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30MS            06:50M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50MS            08:10M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30MS            09:40M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10MS            11:20M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50MS            13:00M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30MS            14:40M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10MS            16:20M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50MS            18:00M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10MS            19:30M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30MS            20:50M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40MS            22:10M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                   23:10M", "");
        onibusTestes.add(e);






        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20MS            05:00M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20MS            05:50M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30MS            06:50M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50MS            08:10M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30MS            09:40M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10MS            11:20M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50MS            13:00M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30MS            14:40M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10MS            16:20M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50MS            18:00M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10MS            19:30M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30MS            20:50M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40MS            22:10M", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                   23:10M", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20O            05:00O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20O            05:50O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30O            06:50O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50O            08:10O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10O            09:30O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30O            10:50O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40O            12:10O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10O            13:30O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30O            14:50O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50O            16:10O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10O            17:30O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30O            18:50O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30O            20:00O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30O            21:00O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30O            22:00O", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20O            23:00O", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("M = Via Praça da Mosela", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("S = Via Hospital Santa Teresa", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("O = Via Alberto de Oliveira", "");
        onibusTestes.add(e);




        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_moinho__preto__hospital);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}