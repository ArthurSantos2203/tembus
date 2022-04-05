package com.digitech.tembus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.hortencias.AltoAlcobacinha;
import com.digitech.tembus.hortencias.BairroEsperanca;
import com.digitech.tembus.hortencias.BairroEsperancaExtra;
import com.digitech.tembus.hortencias.BelaVista;
import com.digitech.tembus.hortencias.BelaVistaGregorio;
import com.digitech.tembus.hortencias.CorreasQuissama;
import com.digitech.tembus.hortencias.Floresta;
import com.digitech.tembus.hortencias.FlorestaFrancisco;
import com.digitech.tembus.hortencias.HumbertoRovigatti;
import com.digitech.tembus.hortencias.LoteamentoNoturno;
import com.digitech.tembus.hortencias.LoteamentoNovaCascatinha;
import com.digitech.tembus.hortencias.LoteamentoSamambaia;
import com.digitech.tembus.hortencias.LuizSalomao;
import com.digitech.tembus.hortencias.PonteFerro;
import com.digitech.tembus.hortencias.PonteSamambaia;
import com.digitech.tembus.hortencias.RodolfoPires;
import com.digitech.tembus.hortencias.SamambaiaRuaG;
import com.digitech.tembus.hortencias.SpartacoBanal;
import com.digitech.tembus.hortencias.TerminalCorreasPedro;
import com.digitech.tembus.hortencias.TerminalItamarati;
import com.digitech.tembus.hortencias.TerminalItamaratiAlto;
import com.digitech.tembus.hortencias.TerminalItamaratiBingen;
import com.digitech.tembus.hortencias.ViuvaLima;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import com.digitech.tembus.turb.MatrizPedroNava;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TelaHortencias extends AppCompatActivity {


    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){



        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("300 - Terminal Corrêas ", "Via Quissamã");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("301 - Loteamento Samambaia ", "Via Rua G");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("302 - Floresta", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("303 - Bela Vista","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("306 - Bairro Esperança","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("307 - Ponte Samambaia","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("309 - Humberto Rovigatti","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("310 - Spartaco Banal","");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("311 - Matriz de Cascatinha","Via Pedro Nava");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("312 - Loteamento Samambaia","Noturno");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("314 - Loteamento Samambaia", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("315 - Loteamento Nova Cascatinha", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("316 - Floresta", " Via Francisco Scali");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("317 - Bela Vista", "Via Gregorio Cruzick");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("318 - Luiz Salomão Viana", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("319 - Rodolfo A. Pires - Luiz Paulistano", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("321 - Alto Alcobacinha", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("322 - Viúva Lima", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("323 - Ponte de Ferro", "Via Bairro Esperança");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("324 - Bairro Esperança", "Extra");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("330 - Terminal Corrêas", "Via Pedro Elmer");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("340 - Terminal Itamarati", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("360 - Terminal Itamarati/Alto da Serra", "");
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("370 - Terminal Itamarati/Bingen", "");
        onibusTestes.add(e);



        return onibusTestes;


    }


        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_hortencias);

        //Anuncio aqui embaixo!!!

        AdView adview = (AdView)findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder()
        .build();

        adview.loadAd(adRequest);
        MobileAds.initialize(this, "ca-app-pub-5546010065820975/6101274775");




        ListView lista = (ListView) findViewById(R.id.listViewid);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {

            /* o position representa a posição que o usuário clicou*/

                switch (position) {
                    // case clicar na posição 0, significa que e o primeiro item
                    case 0:
                        startActivity(new Intent(TelaHortencias.this, CorreasQuissama.class));

                        break;
                    // case clicar na posição 1, significa que e o segundo item
                    case 1:
                        startActivity(new Intent(TelaHortencias.this, SamambaiaRuaG.class));

                        // faça algo referente ao item 2 a este item aqui dentro

                        break;
                    // case clicar na posição 2, significa que e o terceiro item
                    case 2:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, Floresta.class));


                        break;

                    case 3:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, BelaVista.class));


                        break;
                    // case clicar na posição 2, significa que e o terceiro item
                    case 4:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, BairroEsperanca.class));


                        break;
                    // case clicar na posição 2, significa que e o terceiro item
                    case 5:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, PonteSamambaia.class));

                        break;
                    case 6:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, HumbertoRovigatti.class));

                        break;
                    case 7:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, SpartacoBanal.class));

                        break;
                    case 8:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, MatrizPedroNava.class));

                        break;
                    case 9:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, LoteamentoNoturno.class));

                        break;
                    case 10:
                        //faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, LoteamentoSamambaia.class));

                        break;
                    case 11:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, LoteamentoNovaCascatinha.class));

                        break;
                    case 12:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, FlorestaFrancisco.class));

                        break;
                    case 13:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, BelaVistaGregorio.class));

                        break;
                    case 14:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, LuizSalomao.class));

                        break;
                    case 15:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, RodolfoPires.class));

                        break;
                    case 16:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, AltoAlcobacinha.class));

                        break;
                    case 17:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, ViuvaLima.class));

                        break;
                    case 18:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, PonteFerro.class));

                        break;
                    case 19:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, BairroEsperancaExtra.class));

                        break;
                    case 20:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, TerminalCorreasPedro.class));

                        break;
                    case 21:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, TerminalItamarati.class));

                        break;
                    case 22:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, TerminalItamaratiAlto.class));

                        break;
                    case 23:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaHortencias.this, TerminalItamaratiBingen.class));

                        break;
                    // assim por diante ...
                }
            }
        });
    }
}






        //"ca-app-pub-3940256099942544/6300978111");codigo de teste banner*/