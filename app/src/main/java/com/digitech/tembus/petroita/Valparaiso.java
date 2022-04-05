package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Valparaiso extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:25              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:05A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00A             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50              22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:35              23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15              23:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("A = Via Trono de Fátima", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:25             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:05             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50              22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:35              23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15              23:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingo", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:05            06:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50            07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            08:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            08:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            09:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15            11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15            12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15            13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15            14:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15            15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15            16:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15            17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15            18:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15            20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50            22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:35            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20            23:40", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_valparaiso);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
