package com.digitech.tembus.petroita;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Thouzet_SaoSebastiao_Simeria_Noturno extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro          Bairros", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:00             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:10             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:15             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:00             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:15             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro          Bairros", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:00             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:10             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:15             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:00             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:15             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Centro          Bairros", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:00             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:10             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:15             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("03:00             N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:15             N/A", "");
        onibusTestes.add(e);

        return onibusTestes;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_thouzet__sao_sebastiao__simeria__noturno);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}
