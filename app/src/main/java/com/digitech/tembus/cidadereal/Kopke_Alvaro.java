package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Kopke_Alvaro extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Centro        Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:10             N/A*", "");
        onibusTestes.add(e);




        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);


        e = new TemBusLayoutAdapter("T.Centro        Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20             N/A*", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:10             N/A*", "");
        onibusTestes.add(e);





        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Centro        Bairro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00V            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45V            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35V            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:25V            08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:15V            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:05V            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:55V            11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45V            12:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:35V            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:25V            13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15V            14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:05V            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:55V            16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45V            17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:35V            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25V            18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15V            19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05V            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:55V            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45V            22:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30V                 ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("V = Atende a Vila São José", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("N/A* = Não Faz parada. Chega e sai.", "");
        onibusTestes.add(e);



        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_kopke__alvaro);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}