package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Terminal_Bingen_Manoel extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Centro       T.Bingen", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:50            05:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:30            N/A", "");
        onibusTestes.add(e);







        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Centro       T.Bingen", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:40            05:12", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:34", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:34            18:08", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:08            18:46", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:46            19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10            20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20            21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20            22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20            23:50", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Centro       T.Bingen", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:25            05:12", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:48            06:24", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:36", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:12            08:48", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:24            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:36            11:12", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:48            12:24", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:36", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:12            14:48", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:24            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:36            17:12", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:48            18:24", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:36", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:12            20:48", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:24            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:36            23:12", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:48            N/A", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_terminal__bingen__manoel);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}