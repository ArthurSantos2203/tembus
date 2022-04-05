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

public class Lagoinha extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro            Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00**           06:30**", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40             07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00**           07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40             08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00**           08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40             09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00**           N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50             10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50             11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50             12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50             13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50             14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50             15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50             16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40**           17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00             17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40**           18:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00             18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40**           19:10**", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40**           20:10**", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00             20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20             20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45**           21:20**", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20             21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45**           22:10**", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10             22:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45**           23:10**", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:25**           23:40V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:35            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:40            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:55            N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10            22:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:25            23:40V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Bairro          Centro","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A                05:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A                05:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40              06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10              06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30              06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50              07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10              07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30              07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50              08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10              08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30              09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00              09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30              10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00              10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30              11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00              11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30              12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00              12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30              13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00              13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30              14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00              14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30              15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00              15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30              16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00              16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30              17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00              17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30              18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00              18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30              19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00              19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30              20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00              20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30              21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00              21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30              21:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00              22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20              22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:20              23:40V", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("*OBS: Não fica parado no Terminal Centro. Chega e sai.", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("**OBS: Não opera durante as férias escolares. ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("V: Viagem do 429 que atende a Lagoinha e Pedro Ivo.", "");
        onibusTestes.add(e);

        return onibusTestes;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petroita_lagoinha);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

    }
}



