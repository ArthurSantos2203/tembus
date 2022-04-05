package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Sargento_Via_Teresa extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45              23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:30              23:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30              23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:30              23:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00              23:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_sargento__via__teresa);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
