package com.digitech.tembus.turb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.digitech.tembus.R;
import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import java.util.ArrayList;

public class Terminal_Correas extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Segunda a sexta", "");
        onibusTestes.add(e);
        e = new TemBusLayoutAdapter("T.Correas      Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("04:30           05:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00           05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30           06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:45           06:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50           06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00           06:35Y", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:15           06:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20Y          07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30           07:10Y", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:45           07:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:55Y          07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00           07:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:15           07:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:25           08:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:35           08:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50           08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00           08:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:13           08:56", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:26           09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:39           09:22", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:52           09:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:05           09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20           10:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:35           10:18", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:48           10:32", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:02           10:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:15           11:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:30           11:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45           11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00           11:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:15           12:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:30           12:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:45           12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00           12:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:15           13:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:30           13:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:45           13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00           13:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15           14:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30           14:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45           14:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:05           14:40Y", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:20           14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:25Y          15:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:35           15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:50           15:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:05           15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:20           16:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:35           16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:50           16:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:05           16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:20           17:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:35           17:10Y", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55Y          17:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:55           17:40Y", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:10           17:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:25Y          18:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:25           18:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45           18:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00           18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:10           18:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:25           19:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:40           19:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00           19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15           20:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30           20:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45           20:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:05           20:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:25           21:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:45           21:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:05           21:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:25           22:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45           22:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:05           22:55", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:25           23:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:45                   ", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Sábado", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Correas      Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00           05:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:15           05:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:30           06:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40           06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:50           06:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00           06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:10           06:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20           06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:30           07:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40           07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:50           07:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00           07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:10           07:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20           07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:30           08:01", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40           08:12", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:50           08:25", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00           08:36", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:10           08:48", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20           09:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:32           09:08", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:45           09:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00           09:32", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:12           09:44", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:24           09:56", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:36           10:08", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:44           10:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:56           10:32", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:08           10:44", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20           10:56", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:33           11:08", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:45           11:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:58           11:32", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:10           11:44", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:23           11:56", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:36           12:08", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:48           12:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00           12:32", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:12           12:44", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:24           12:56", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:36           13:08", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:48           13:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00           13:32", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:12           13:44", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:24           13:56", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:36           14:08", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:48           14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00           14:32", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:12           14:44", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:24           14:56", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:36           15:08", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:48           15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00           15:32", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:12           15:44", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:24           15:56", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:36           16:08", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:48           16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00           16:32", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:12           16:44", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:24           16:56", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:36           17:08", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:48           17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00           17:32", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:12           17:44", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:24           17:56", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:36           18:08", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:48           18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00           18:32", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:12           18:44", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:24           18:56", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:36           19:08", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:48           19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00           19:32", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:12           19:44", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:24           19:56", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:36           20:08", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:48           20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00           20:32", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:12           20:44", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:24           20:56", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:36           21:08", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:48           21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:00           21:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:15           21:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30           22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:45           22:15", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:00           22:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:15           22:45", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30           23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50           23:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("Domingos e Feriados", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("T.Correas      Centro", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:00           05:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:20           05:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("05:40           06:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:00           06:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:20           06:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("06:40           07:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:00           07:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:20           07:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("07:40           08:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:00           08:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:20           08:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("08:40           09:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:00           09:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:20           09:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("09:40           10:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:00           10:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:20           10:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("10:40           11:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:00           11:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:20           11:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11:40           12:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:00           12:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:20           12:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("12:40           13:10", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:00           13:30", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:15           13:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:30           14:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("13:45           14:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:00           14:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:15           14:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:30           15:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("14:45           15:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:00           15:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:15           15:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:30           16:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("15:45           16:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:00           16:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:15           16:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:30           17:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("16:45           17:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:00           17:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:15           17:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:30           18:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("17:45           18:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:00           18:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:15           18:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:30           19:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("18:45           19:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:00           19:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:15           19:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:30           20:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("19:45           20:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:00           20:35", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:15           20:50", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:30           21:05", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("20:50           21:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:10           21:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:30           22:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("21:50           22:20", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:10           22:40", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:30           23:00", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("22:50           23:20", "");
        onibusTestes.add(e);

        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.turb_terminal__correas);

        ListView lista = (ListView) findViewById(R.id.ListViewId);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());

        lista.setAdapter(adapter);

    }
}