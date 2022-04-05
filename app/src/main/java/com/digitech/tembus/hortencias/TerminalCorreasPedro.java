package com.digitech.tembus.hortencias;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class TerminalCorreasPedro extends AppCompatActivity {


    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Centro       T.Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:10            22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro       T.Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10                       ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:10            22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro       T.Corrêas", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            20:30", "");
        onibusTestes.add(e);

        return onibusTestes;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_terminal_correas_pedro);

        ListView lista = (ListView) findViewById(R.id.listViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
