package com.digitech.tembus.cascatinha;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class Vale_Carangola extends AppCompatActivity {
    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("Segunda a sexta", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro          Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:20              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:45              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:05              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:25              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:20              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:45              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:05              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:25              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:35              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:05              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:35              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:45              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:15              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:25              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:35              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:05              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:35             21:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:00             21:25", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30             21:55", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:00             22:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:30             23:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("23:00             23:35", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Sábado", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro          Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:20              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:45              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:05              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:25              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:20              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:45              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:40              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:05              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:25              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:35              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:05              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:35              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:10              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:45              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:15              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:50              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:25              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:00              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:35              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:05              N/A*", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:35             21:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:00             21:25", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30             21:55", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:00             22:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:30             23:00", ""));
        onibusTestes.add(new TemBusLayoutAdapter("23:00             23:35", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Domingos e Feriados", ""));
        onibusTestes.add(new TemBusLayoutAdapter("Bairro          Centro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("05:30              06:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:05              06:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("06:50              07:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("07:30              08:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:10              08:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("08:50              09:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("09:30              10:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:10              10:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("10:50              11:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("11:25              12:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:10              12:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("12:50              13:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("13:30              14:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:10              14:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("14:50              15:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("15:30              16:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:10              16:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("16:50              17:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("17:30              18:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:10              18:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("18:50              19:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("19:25              20:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:10              20:50", ""));
        onibusTestes.add(new TemBusLayoutAdapter("20:50              21:30", ""));
        onibusTestes.add(new TemBusLayoutAdapter("21:30              22:10", ""));
        onibusTestes.add(new TemBusLayoutAdapter("22:10              22:50", ""));
        return onibusTestes;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cascatinha_vale__carangola);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);
    }
}
