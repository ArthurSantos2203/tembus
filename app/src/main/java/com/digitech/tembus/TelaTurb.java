package com.digitech.tembus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import com.digitech.tembus.turb.Aguas_Lindas;
import com.digitech.tembus.turb.Aguas_Lindas_Executivo;
import com.digitech.tembus.turb.Alcides_Carneiro;
import com.digitech.tembus.turb.Araras;
import com.digitech.tembus.turb.Araras_Executivo;
import com.digitech.tembus.turb.Araras_Itaipava;
import com.digitech.tembus.turb.Araras_Noturno;
import com.digitech.tembus.turb.Araras_Santa_Luzia;
import com.digitech.tembus.turb.Araras_Vista_Alegre;
import com.digitech.tembus.turb.Bairro_Gloria;
import com.digitech.tembus.turb.BonfimPinheiral;
import com.digitech.tembus.turb.Bonfim_Vale_das_Flores;
import com.digitech.tembus.turb.Caitetu;
import com.digitech.tembus.turb.Calembe;
import com.digitech.tembus.turb.Castelo_Sao_Manoel;
import com.digitech.tembus.turb.Castelo_Sao_Manoel_Mercedes;
import com.digitech.tembus.turb.Castelo_Sao_Manoel_Seis;
import com.digitech.tembus.turb.Correas_Carangola;
import com.digitech.tembus.turb.Fazenda_Inglesa;
import com.digitech.tembus.turb.Terminal_Correas;
import com.digitech.tembus.turb.Terminal_Correas_Estrada;
import com.digitech.tembus.turb.Vale_das_Videiras;
import com.digitech.tembus.turb.Vale_das_Videiras_Itaipava;
import com.digitech.tembus.turb.Vila_Epitacio;
import com.digitech.tembus.turb.Vila_Epitacio_Nogueira_Noturno;
import com.digitech.tembus.turb.Vista_Alegre;
import com.digitech.tembus.turb.Vista_Alegre_Caitetu_Carangola;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TelaTurb extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){



        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("500 - Terminal Corrêas", "via Estrada da Saudade"); //case 0
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("600 - Terminal Corrêas", ""); //case 1
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("601 - Fazenda Inglesa", ""); //case 2
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("602 - Vale das Videiras",""); //case 3
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("603 - Águas Lindas",""); //case 4
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("604 - Vila Epitácio",""); //case 5
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("605 - Vale das Videiras X T. Itaipava",""); //case 6
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("606 - Hospital Alcides Carneiro",""); //case 7
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("607 - Caitetu",""); //case 8
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("608 - Calembe",""); //case 9
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("609 - Castelo São Manoel",""); //case 10
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("610 - Araras",""); //case 11
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("611 - Bonfim - Pinheral",""); //case 12
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("612 - Vista Alegra",""); //case 13
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("613 - Bairro da Glória",""); //case 14
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("615 - Terminal Corrêas X Carangola",""); //case 15
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("616 - Bonfim - Vale das Flores",""); //case 16
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("617 - Araras X Terminal Itaipava",""); //case 17
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("618 - Araras - Vale de Santa Luzia",""); //case 18
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("619 - Castelo São Manoel","Rua 6 e Rua 11 X Terminal Corrêas"); //case 19
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("621 - Castelo São Manoel","Rua Mercedes X Terminal Corrêas"); //case 20
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("622 - Araras","Vista Alegre"); //case 21
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("660 - Vista Alegre / Caitetu / Carangola X Terminal Corrêas",""); //case 22
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("670 - Araras X Centro","Executivo não integrado"); //case 23
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("672 - Águas Lindas","Executivo não integrado"); //case 24
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("698 - Vila Epitácio / Nogueira","Noturno"); //case 25
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("699 - Araras","Noturno"); //case 26
        onibusTestes.add(e);


        return onibusTestes;


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_turb);

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
                        startActivity(new Intent(TelaTurb.this, Terminal_Correas_Estrada.class));

                        break;
                    // case clicar na posição 1, significa que e o segundo item
                    case 1:
                        startActivity(new Intent(TelaTurb.this, Terminal_Correas.class));

                        // faça algo referente ao item 2 a este item aqui dentro

                        break;
                    // case clicar na posição 2, significa que e o terceiro item
                    case 2:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Fazenda_Inglesa.class));

                        break;

                    case 3:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Vale_das_Videiras.class));


                        break;
                    // case clicar na posição 2, significa que e o terceiro item
                    case 4:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Aguas_Lindas.class));


                        break;

                    case 5:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Vila_Epitacio.class));

                        break;

                    case 6:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Vale_das_Videiras_Itaipava.class));

                        break;

                    case 7:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Alcides_Carneiro.class));

                        break;

                    case 8:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Caitetu.class));

                        break;

                    case 9:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Calembe.class));

                        break;

                    case 10:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Castelo_Sao_Manoel.class));

                        break;

                    case 11:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Araras.class));

                        break;

                    case 12:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, BonfimPinheiral.class));

                        break;

                    case 13:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Vista_Alegre.class));

                        break;

                    case 14:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Bairro_Gloria.class));

                        break;

                    case 15:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Correas_Carangola.class));

                        break;

                    case 16:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Bonfim_Vale_das_Flores.class));

                        break;

                    case 17:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Araras_Itaipava.class));

                        break;

                    case 18:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Araras_Santa_Luzia.class));

                        break;

                    case 19:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Castelo_Sao_Manoel_Seis.class));

                        break;

                    case 20:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Castelo_Sao_Manoel_Mercedes.class));

                        break;

                    case 21:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Araras_Vista_Alegre.class));

                        break;

                    case 22:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Vista_Alegre_Caitetu_Carangola.class));

                        break;

                    case 23:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Araras_Executivo.class));

                        break;

                    case 24:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Aguas_Lindas_Executivo.class));

                        break;

                    case 25:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Vila_Epitacio_Nogueira_Noturno.class));

                        break;

                    case 26:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Araras_Noturno.class));

                        break;


                    /*case 27:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Araras.class));

                        break;

                    case 28:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Araras.class));

                        break;

                    case 29:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Araras.class));

                        break;

                    case 30:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaTurb.this, Araras.class));

                        break;*/
                    // assim por diante ...
                }
            }
        });
    }
}