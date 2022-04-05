package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Praca_Catulo_Euclides extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:05             21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50N            22:30N", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50N            23:15N", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40N                   ", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:05             21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50N            22:30N", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50N            23:15N", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40N                   ", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N = Realizado pela linha 495.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_praca__catulo__euclides);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
