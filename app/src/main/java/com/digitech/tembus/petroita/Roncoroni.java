package com.digitech.tembus.petroita;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import org.w3c.dom.Text;

import java.util.ArrayList;

public class Roncoroni extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:35            22:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            22:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20              06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20              07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20              08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20              09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20              10:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20              11:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20              12:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20              13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20              14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20              15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20              16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20              17:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20              18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20              19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20              20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20              21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não fica parado no Centro. Chega e sai.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_roncoroni);



        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}