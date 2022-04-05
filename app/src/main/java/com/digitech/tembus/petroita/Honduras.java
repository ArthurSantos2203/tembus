package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Honduras extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20H             05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00              15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00              19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00G            21:30G", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00G            22:30G", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20              05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00              06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00              07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00              08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00              15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00              19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00              22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20               05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00               06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00               07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00               08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00E              10:05E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30E              11:35E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00E              13:05E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30E              14:35E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00E              16:05E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30E              17:35E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00E              19:05E", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30E                    ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("H = ATENDE A RUA PROF. ANGELICA LOPES DE CASTRO", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("G = VIA GULF.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("E = VEICULLO COMPARTILHADO COM A LINHA 442 - C. GULF", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_honduras);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}