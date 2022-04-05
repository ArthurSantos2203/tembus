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

public class LoteamentoNoturno extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro      Loteamento", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15A            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:20            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:20            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:30            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:10            N/A", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro      Loteamento", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15A            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:20            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:20            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:30            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:10            N/A", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro      Loteamento", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:15A            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:20            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("01:20            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("02:30            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:10            N/A", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("OBS: A = Faz o itinerário com a linha 309.", "");
        onibusTestes.add(e);



        return onibusTestes;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_loteamento_noturno);




        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}
