package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Pedras_Brancas_Teofilo extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro         T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45            05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:35            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20            23:00", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Bairro         T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:35            05:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20            23:00", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro         T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:35            05:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado. Chega e sai.", "");
        onibusTestes.add(e);




        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_pedras__brancas__teofilo);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}