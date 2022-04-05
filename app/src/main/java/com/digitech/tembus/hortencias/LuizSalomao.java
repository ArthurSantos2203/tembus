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

public class LuizSalomao extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro      T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40          06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20          06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30F        06:50F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00          07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30F        07:50F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40          08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10F        08:30F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20          08:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00          09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40          10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20          10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00          11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40          12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20          12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00          13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40          14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20          14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00          15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40          16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20          16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00          17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30F        17:30F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40          18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20         18:10F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30F         18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00         19:10F", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30F         19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40          20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20          20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00          21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40          22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20          23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: F = Não opera durante as Férias Escolares", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro      T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40          06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20          06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00          07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40          08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20          08:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00          09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40          10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20          10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00          11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40          12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20          12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00          13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40          14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20          14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00          15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40          16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20          16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00          17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40          18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20          18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00          19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40          20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20          20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00          21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40          22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20          23:00", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro      T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30          06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30          07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30          08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30          09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30          10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30          11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30          12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30          13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30          14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30          15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30          16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30          17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30          18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30          19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30          20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30          21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30          22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30          23:00", "");
        onibusTestes.add(e);


        return onibusTestes;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_luiz_salomao);




        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}