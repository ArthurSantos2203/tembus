package com.digitech.tembus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.cascatinha.Alto_Boa_Vista;
import com.digitech.tembus.cascatinha.Alto_Comunidade_Alemao;
import com.digitech.tembus.cascatinha.Atilio_Marotti;
import com.digitech.tembus.cascatinha.Atilio_Marotti_Ademir;
import com.digitech.tembus.cascatinha.Boa_Vista;
import com.digitech.tembus.cascatinha.Boa_Vista_Noturno;
import com.digitech.tembus.cascatinha.Cidade_Nova;
import com.digitech.tembus.cascatinha.Comunidade_Neylor;
import com.digitech.tembus.cascatinha.Comunidade_Sao_Luiz;
import com.digitech.tembus.cascatinha.Comunidade_Ventura;
import com.digitech.tembus.cascatinha.Comunidade_do_Alemao;
import com.digitech.tembus.cascatinha.Fragoso_Temistocles;
import com.digitech.tembus.cascatinha.Jardim_Salvador;
import com.digitech.tembus.cascatinha.Joao_De_Deus;
import com.digitech.tembus.cascatinha.Luiz_Pelegrini;
import com.digitech.tembus.cascatinha.Max_Manoel_Molter;
import com.digitech.tembus.cascatinha.Max_Manoel_Molter_Manzini;
import com.digitech.tembus.cascatinha.Modesto_Guimaraes;
import com.digitech.tembus.cascatinha.Monte_Florido;
import com.digitech.tembus.cascatinha.Montese;
import com.digitech.tembus.cascatinha.Quarteirao_Brasileiro;
import com.digitech.tembus.cascatinha.Roseiral;
import com.digitech.tembus.cascatinha.Vale_Carangola;
import com.digitech.tembus.cascatinha.Vale_Dos_Esquilos;
import com.digitech.tembus.cascatinha.Veridiano_Felix;
import com.digitech.tembus.cascatinha.Vicenzo_Rivetti;
import com.digitech.tembus.cascatinha.Vicenzo_Rivetti_Noturno;
import com.digitech.tembus.cascatinha.Vicenzo_Sucupira;
import com.digitech.tembus.cascatinha.Vila_Manzini;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TelaCascatinha extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {
        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList();
        onibusTestes.add(new TemBusLayoutAdapter("502 - Comunidade São Luiz", ""));
        onibusTestes.add(new TemBusLayoutAdapter("503 - Cidade Nova", ""));
        onibusTestes.add(new TemBusLayoutAdapter("505 - Vila Manzini", ""));
        onibusTestes.add(new TemBusLayoutAdapter("506 - Vicenzo Rivetti", ""));
        onibusTestes.add(new TemBusLayoutAdapter("507 - João de Deus", ""));
        onibusTestes.add(new TemBusLayoutAdapter("508 - Max Manoel Molter", ""));
        onibusTestes.add(new TemBusLayoutAdapter("510 - Vale dos Esquilos", ""));
        onibusTestes.add(new TemBusLayoutAdapter("511 - Boa Vista", ""));
        onibusTestes.add(new TemBusLayoutAdapter("512 - Quarteirão Brasileiro", ""));
        onibusTestes.add(new TemBusLayoutAdapter("513 - Comunidade do Alemão", ""));
        onibusTestes.add(new TemBusLayoutAdapter("515 - Jardim Salvador", ""));
        onibusTestes.add(new TemBusLayoutAdapter("516 - Roseiral", ""));
        onibusTestes.add(new TemBusLayoutAdapter("517 - Comunidade do Ventura", ""));
        onibusTestes.add(new TemBusLayoutAdapter("518 - Atílio Marotti", ""));
        onibusTestes.add(new TemBusLayoutAdapter("519 - Vale do Carangola", ""));
        onibusTestes.add(new TemBusLayoutAdapter("520 - Fragoso", "via Temistocles"));
        onibusTestes.add(new TemBusLayoutAdapter("521 - Monte Florido", ""));
        onibusTestes.add(new TemBusLayoutAdapter("522 - Luiz Pelegrini", ""));
        onibusTestes.add(new TemBusLayoutAdapter("523 - Alto da Boa Vista", ""));
        onibusTestes.add(new TemBusLayoutAdapter("524 - Veridiano Félix", ""));
        onibusTestes.add(new TemBusLayoutAdapter("525 - Comunidade do Neylor", ""));
        onibusTestes.add(new TemBusLayoutAdapter("526 - Modesto Guimarães", ""));
        onibusTestes.add(new TemBusLayoutAdapter("527 - Estrada da Saudade - Montese", ""));
        onibusTestes.add(new TemBusLayoutAdapter("528 - Alto Comunidade do Alemão", ""));
        onibusTestes.add(new TemBusLayoutAdapter("529 - Vicenzo Rivetti - Débora C. Sucupira", "via Amoedo"));
        onibusTestes.add(new TemBusLayoutAdapter("530 - Atílio Marotti", "Rua Ademir Ferreira Barcelos (Nova)"));
        onibusTestes.add(new TemBusLayoutAdapter("560 - Max Manoel Molter / Vila Manzini / Modesto Guimarães", ""));
        onibusTestes.add(new TemBusLayoutAdapter("598 - Vicenzo Rivetti", "Noturno"));
        onibusTestes.add(new TemBusLayoutAdapter("599 - Boa Vista", "Noturno"));
        return onibusTestes;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cascatinha);

       /* //Anuncio aqui embaixo!!!

        AdView adview = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
                .build();

        adview.loadAd(adRequest);
        MobileAds.initialize(this, "ca-app-pub-5546010065820975/6101274775");*/


        ListView lista = (ListView) findViewById(R.id.listViewid);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {

            /* o position representa a posição que o usuário clicou*/

                switch (position) {
                    case 0:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Comunidade_Sao_Luiz.class));
                        return;
                    case 1:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Cidade_Nova.class));
                        return;
                    case 2:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Vila_Manzini.class));
                        return;
                    case 3:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Vicenzo_Rivetti.class));
                        return;
                    case 4:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Joao_De_Deus.class));
                        return;
                    case 5:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Max_Manoel_Molter.class));
                        return;
                    case 6:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Vale_Dos_Esquilos.class));
                        return;
                    case 7:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Boa_Vista.class));
                        return;
                    case 8:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Quarteirao_Brasileiro.class));
                        return;
                    case 9:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Comunidade_do_Alemao.class));
                        return;
                    case 10:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Jardim_Salvador.class));
                        return;
                    case 11:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Roseiral.class));
                        return;
                    case 12:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Comunidade_Ventura.class));
                        return;
                    case 13:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Atilio_Marotti.class));
                        return;
                    case 14:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Vale_Carangola.class));
                        return;
                    case 15:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Fragoso_Temistocles.class));
                        return;
                    case 16:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Monte_Florido.class));
                        return;
                    case 17:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Luiz_Pelegrini.class));
                        return;
                    case 18:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Alto_Boa_Vista.class));
                        return;
                    case 19:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Veridiano_Felix.class));
                        return;
                    case 20:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Comunidade_Neylor.class));
                        return;
                    case 21:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Modesto_Guimaraes.class));
                        return;
                    case 22:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Montese.class));
                        return;
                    case 23:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Alto_Comunidade_Alemao.class));
                        return;
                    case 24:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Vicenzo_Sucupira.class));
                        return;
                    case 25:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Atilio_Marotti_Ademir.class));
                        return;
                    case 26:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Max_Manoel_Molter_Manzini.class));
                        return;
                    case 27:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Vicenzo_Rivetti_Noturno.class));
                        return;
                    case 28:
                        TelaCascatinha.this.startActivity(new Intent(TelaCascatinha.this, Boa_Vista_Noturno.class));
                        return;
                    default:
                        return;
                }
            }
        });
    }
}
