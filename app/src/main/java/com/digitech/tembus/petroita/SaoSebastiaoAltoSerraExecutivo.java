package com.digitech.tembus.petroita;

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

public class SaoSebastiaoAltoSerraExecutivo extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50            07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50              N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A              17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50           07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50           08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A             17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00           18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20           20:00", "");
        onibusTestes.add(e);


        return onibusTestes;





    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_sao_sebastiao_alto_serra_executivo);



            ListView lista = (ListView) findViewById(R.id.ListViewId);
            ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
            lista.setAdapter(adapter);

        }
    }