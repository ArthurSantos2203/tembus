package com.digitech.tembus.hortencias;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class PonteFerro extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Centro         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15          05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45          05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15          06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30          06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15F          N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15F          N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00F          N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45F          N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:50           N/A*", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15          05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45          05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15          06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:50           N/A*", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro         Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15           05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15           N/A*", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("OBS: F = Não opera durante as Férias Escolares.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: N/A* = Não fica parado. Chega e sai..", "");
        onibusTestes.add(e);


        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_ponte_ferro);



        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}
