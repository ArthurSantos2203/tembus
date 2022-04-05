package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Meio_Serra_Teresa extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:10              01:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:30              03:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:10              01:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:30              03:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:50              04:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:55              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:25              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:35              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:00              01:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_meio__serra__teresa);


        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}