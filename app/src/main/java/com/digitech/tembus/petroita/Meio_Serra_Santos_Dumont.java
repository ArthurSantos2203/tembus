package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Meio_Serra_Santos_Dumont extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10H            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45H            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25H            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00H            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30             22:30", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:05             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30             22:30", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00             22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("H = Ponto Final na Comunidade Francisco de Assis (HORTA).", "");
        onibusTestes.add(e);


        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_meio__serra__santos__dumont);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}