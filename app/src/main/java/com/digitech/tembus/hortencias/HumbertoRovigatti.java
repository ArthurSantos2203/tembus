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

public class HumbertoRovigatti extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro      T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            13:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20            21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 23:30I", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro      T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            13:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20            21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                 23:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: I = Faz a viagem com Itinerário do 314", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro      T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00            23:30", "");
        onibusTestes.add(e);


        return onibusTestes;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_humberto_rovigatti);



        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}