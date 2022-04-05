package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Pedras_Brancas extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro       T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:55            04:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10            15:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10H            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:50H            N/A*", "");
        onibusTestes.add(e);








        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Bairro       T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15            04:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            23:30", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro       T.Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15            04:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:05            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            23:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("H = Via Hospital Santa Teresa", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A = Não Faz parada. Chega e sai.", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_pedras__brancas);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}