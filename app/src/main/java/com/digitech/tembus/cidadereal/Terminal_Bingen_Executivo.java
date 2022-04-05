package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Terminal_Bingen_Executivo extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Centro       Rodoviária", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:30            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:50            05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50            07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10            07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10            08:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50            09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50            10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10            10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50            11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10            11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10            12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50            13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10            13:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50            14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10            14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50            15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10            16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10            17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50            18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10            18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50            19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50            20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10            20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            23:10", "");
        onibusTestes.add(e);








        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro       Rodoviária", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            23:10", "");
        onibusTestes.add(e);

        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_terminal__bingen__executivo);


        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}