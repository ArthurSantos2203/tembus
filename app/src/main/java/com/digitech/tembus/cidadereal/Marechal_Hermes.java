package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Marechal_Hermes extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro       T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20            23:00", "");
        onibusTestes.add(e);







        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Bairro       T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: N/A* = Não fica parado no ponto. Chega e sai.", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro       T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20            23:00", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_marechal__hermes);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}