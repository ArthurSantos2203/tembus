package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Santa_Isabel extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:20             01:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05             20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00             21:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             22:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10             22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40             23:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:10             00:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40                  ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:20             01:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05             20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00             21:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             22:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10             22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40             23:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:10             00:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40                  ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:20             01:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05             20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00             21:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             22:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10             22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40             23:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:10             00:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:40                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_santa__isabel);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
