package com.digitech.tembus.cidadereal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Terminal_Bingen extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Centro       T.Bingen", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:00            04:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:25            04:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:35            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:48            05:14", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:58            05:22", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:06            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:14            05:38", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:22            05:46", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:54", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:38            06:02", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:46            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:54            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:02            06:26", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            06:34", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:18            06:42", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:26            06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:34            06:48", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:42            07:06", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50            07:14", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:58            07:22", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:06            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:14            07:38", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:22            07:46", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            07:54", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:38            08:02", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:46            08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:02            08:18", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10            08:26", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:18            08:34", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:26            08:42", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:34            08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:42            08:58", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50            09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:58            09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50            10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20            10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            10:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50            11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            11:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            12:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            12:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50            13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            13:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50            14:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20            14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50            15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            17:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50            18:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50            19:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:35            20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:10            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30            21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45            21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15            22:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45            22:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            23:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            23:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45            23:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:35                   ", "");
        onibusTestes.add(e);









        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Centro       T.Bingen", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:35            01:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:00            04:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:20            04:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:40            05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00            05:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:10            05:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30            05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            05:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50            06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10            06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30            06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50            07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10            07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20            07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40            07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50            08:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00            08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10            08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:30            08:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40            08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:50            09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:10            09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20            09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            09:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40            09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50            10:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00            10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10            10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20            10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            10:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            10:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:50            11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10            11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30            11:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            11:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00            12:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10            12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20            12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            12:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40            12:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50            13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:10            13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30            13:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:50            14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10            14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20            14:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            14:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:40            14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50            15:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00            15:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10            15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            15:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30            15:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50            16:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:10            16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            16:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            16:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:40            16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            17:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00            17:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10            17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:20            17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            17:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            17:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:50            18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10            18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            18:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30            18:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40            18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50            19:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00            19:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:20            19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            19:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45            19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            20:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            20:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:20            20:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:40            21:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00            21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15            21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30            22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50            22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:10            22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:30            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  23:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("                  00:10", "");
        onibusTestes.add(e);



        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Centro       T.Bingen", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("00:35            01:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40            05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00            06:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20            06:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40            06:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00            07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10            07:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30            07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50            08:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10            08:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20            08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40            08:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00            09:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20            09:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:30            09:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:50            10:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:10            10:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30            10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40            11:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00            11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20            12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40            12:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:50            12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:10            13:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30            13:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:50            13:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00            13:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:20            14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:40            14:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00            14:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:10            15:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30            15:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50            15:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:10            15:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20            16:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:40            16:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00            16:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20            17:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30            17:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:50            17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10            18:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30            18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:40            18:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00            18:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:20            19:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40            19:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:50            19:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:10            20:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30            20:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:50            20:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00            20:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:20            21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:40            21:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00            21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10            22:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30            22:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50            22:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10            23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:20            23:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:40            00:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:00                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("23:35                   ", "");
        onibusTestes.add(e);




        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cidade_real_terminal__bingen);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}