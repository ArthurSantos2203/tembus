package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Vital_Brasil_Coronel extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30              21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50              21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30              22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30              23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00              22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00              23:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10              05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15              06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15              07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:15              08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15              09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15              10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15              11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15              12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15              13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15              14:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15              15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15              16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15              17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15              18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15              19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15              20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15              21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15              22:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15              23:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_vital__brasil__coronel);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
