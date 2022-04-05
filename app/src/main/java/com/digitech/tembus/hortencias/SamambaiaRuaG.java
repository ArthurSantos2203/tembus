package com.digitech.tembus.hortencias;

import android.graphics.Paint;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.webkit.WebSettings.*;

public class SamambaiaRuaG extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("Bairro            T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00                  05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40                  06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20                  06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00                  07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40                  08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20                  08:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00                  09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40                  10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20                  10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00                  11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40                  12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20                  12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00                  13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40                  14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20                  14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00                  15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40                  16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20                  16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00                  17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40                  18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20                  18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00                  19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40                  20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20                  20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00                  21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40                  22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20                  22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00                  05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40                  06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20                  06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00                  07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40                  08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20                  08:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00                  09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40                  10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20                  10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00                  11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40                  12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20                  12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00                  13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40                  14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20                  14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00                  15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40                  16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20                  16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00                  17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40                  18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20                  18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00                  19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40                  20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20                  20:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00                  21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40                  22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20                  22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            T.Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00I                 06:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00I                 07:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00I                 08:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00I                 09:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00I                 10:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00I                 11:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00I                 12:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00I                 13:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00I                 14:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00I                 15:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00I                 16:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00I                 17:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00I                 18:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00I                 19:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00I                 20:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00I                 21:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00I                 22:30I", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("I = Atende a Ponte Samambaia", "");
        onibusTestes.add(e);

        return onibusTestes;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hortencias_samambaia_rua_g);



        ListView lista = (ListView) findViewById(R.id.listViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}