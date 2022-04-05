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
import com.digitech.tembus.petroita.Alagoas_Rua_C;
import com.digitech.tembus.petroita.Aldo_Tamancoldi;
import com.digitech.tembus.petroita.AltoIndependencia;
import com.digitech.tembus.petroita.AltoPedroIvo;
import com.digitech.tembus.petroita.Alto_Independencia_Alto_Serra_Cacilda;
import com.digitech.tembus.petroita.Alto_Independencia_Cacilda_Rua_O;
import com.digitech.tembus.petroita.Alto_Independencia_Noturno;
import com.digitech.tembus.petroita.Alto_Morin_Sargento_Noturno;
import com.digitech.tembus.petroita.Amazonas;
import com.digitech.tembus.petroita.Amazonas_Alagoas;
import com.digitech.tembus.petroita.Amazonas_Vila_Ipanema;
import com.digitech.tembus.petroita.Bairro_Maua;
import com.digitech.tembus.petroita.BingenQuitandinha;
import com.digitech.tembus.petroita.Campinho;
import com.digitech.tembus.petroita.Cap_Paladine_Castelanea;
import com.digitech.tembus.petroita.Capitao_Paladine_Coronel;
import com.digitech.tembus.petroita.Chacara_Flora;
import com.digitech.tembus.petroita.Coronel_Quitandinha_Bingen;
import com.digitech.tembus.petroita.DomJoaoBraga;
import com.digitech.tembus.petroita.Dr_Thouzet;
import com.digitech.tembus.petroita.Duques;
import com.digitech.tembus.petroita.Duques_Espirito_Noturno;
import com.digitech.tembus.petroita.Espirito_Santo;
import com.digitech.tembus.petroita.Espirito_Santo_Ceara;
import com.digitech.tembus.petroita.Espirito_Santo_Via_Amazonas;
import com.digitech.tembus.petroita.EstradaParaisoBnh;
import com.digitech.tembus.petroita.Getulio_Vargas;
import com.digitech.tembus.petroita.Gulf;
import com.digitech.tembus.petroita.Honduras;
import com.digitech.tembus.petroita.Honduras_Gulf;
import com.digitech.tembus.petroita.IndependenciaCacilda;
import com.digitech.tembus.petroita.Independencia_Alto_da_Serra;
import com.digitech.tembus.petroita.JoaquimGomensoro;
import com.digitech.tembus.petroita.Lagoinha;
import com.digitech.tembus.petroita.LagoinhaBingen;
import com.digitech.tembus.petroita.LagoinhaVisconde;
import com.digitech.tembus.petroita.Lopes_Trovao;
import com.digitech.tembus.petroita.Meio_Serra_Santos_Dumont;
import com.digitech.tembus.petroita.Meio_Serra_Teresa;
import com.digitech.tembus.petroita.Olga_Alto_Serra;
import com.digitech.tembus.petroita.Olga_Castrioto_Castelanea;
import com.digitech.tembus.petroita.Olga_Coronel_Veiga;
import com.digitech.tembus.petroita.Osvero_Villaca;
import com.digitech.tembus.petroita.Osvero_Villaca_Aldo_Tamancoldi;
import com.digitech.tembus.petroita.PedroIvo;
import com.digitech.tembus.petroita.PedroIvoVisconde;
import com.digitech.tembus.petroita.Praca_Catulo_Euclides;
import com.digitech.tembus.petroita.Quitandinha;
import com.digitech.tembus.petroita.QuitandinhaExecutivo;
import com.digitech.tembus.petroita.Rio_de_Janeiro;
import com.digitech.tembus.petroita.Rio_de_Janeiro_Alto_da_Serra;
import com.digitech.tembus.petroita.Rio_de_Janeiro_Friburgo;
import com.digitech.tembus.petroita.Roncoroni;
import com.digitech.tembus.petroita.Santa_Isabel;
import com.digitech.tembus.petroita.SaoSebastiaoAltoSerraExecutivo;
import com.digitech.tembus.petroita.SargentoDuasPontes;
import com.digitech.tembus.petroita.Sargento_Boening_Paula_Aguiar;
import com.digitech.tembus.petroita.Sargento_Pontes_Paula;
import com.digitech.tembus.petroita.Sargento_Via_Teresa;
import com.digitech.tembus.petroita.Simeria_Alto_da_Serra;
import com.digitech.tembus.petroita.Simeria_Castelanea;
import com.digitech.tembus.petroita.Simeria_Coronel_Veiga;
import com.digitech.tembus.petroita.Tancredo_Neves;
import com.digitech.tembus.petroita.Taquara;
import com.digitech.tembus.petroita.ThouzetExecutivo;
import com.digitech.tembus.petroita.Thouzet_Alto_da_Serra;
import com.digitech.tembus.petroita.Thouzet_SaoSebastiao_Simeria_Noturno;
import com.digitech.tembus.petroita.Valparaiso;
import com.digitech.tembus.petroita.ValparaisoDuasPontes;
import com.digitech.tembus.petroita.ValparaisoPraca;
import com.digitech.tembus.petroita.ValparaisoTerraSanta;
import com.digitech.tembus.petroita.ValparaisoThouzet;
import com.digitech.tembus.petroita.ValparaisoTrono;
import com.digitech.tembus.petroita.Valparaiso_Rio_de_Janeiro_Noturno;
import com.digitech.tembus.petroita.Venezuela;
import com.digitech.tembus.petroita.VilaFelipeDuasPontes;
import com.digitech.tembus.petroita.Vila_Felipe;
import com.digitech.tembus.petroita.Vila_Felipe_Vila_Real;
import com.digitech.tembus.petroita.Vinte_Quatro_Rua_Nova;
import com.digitech.tembus.petroita.Vinte_Quatro_de_Maio;
import com.digitech.tembus.petroita.Vital_Brasil_Alto;
import com.digitech.tembus.petroita.Vital_Brasil_Coronel;
import com.digitech.tembus.petroita.Vital_Castelanea;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TelaPetroita extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){



        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("021 - Executivo Dr. Thouzet", "Via BNH"); //case 0
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("022 - Executivo - São Sebastião", "Via Alto da Serra"); //case 1
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("023 - Executivo - Estrada do Paraiso", "Via BNH"); //case 2
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("024 - Executivo - Quitandinha",""); //case 3
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("025 - Executivo - Terminal Bingen X Quitandinha",""); //case 4
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("204 - Valparaíso","Via Praça da Liberdade"); //case 5
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("205 - Valparaíso","Via Duas Pontes - R.N.Sra. Aparecida"); //case 6
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("206 - Valparaíso Terra Santa","Via Rocha Cardoso"); //case 7
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("209 - Valparaíso","Via Dr. Thouzet"); //case 8
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("210 - Valparaíso","Via Duas Pontes - Rua Fabrício de Mattos"); //case 9
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("211 - Valparaíso","Via Duas Pontes (Gonçalves Dias)"); //case 10
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("212 - Joaquim Gomensoro",""); //case 11
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("401 - Alto Independência",""); //case 12
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("402 - Taquara",""); //case 13
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("403 - Honduras",""); //case 14
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("404 - Duques",""); //case 15
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("405 - Getúlio Vargas",""); //case 16
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("406 - Dr. Thouzet",""); //case 17
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("407 - Siméria","Via Castelânea"); //case 18
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("408 - Vital Brasil",""); //case 19
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("409 - Olga Castrioto","Via Castelânea"); //case 20
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("410 - Capitão Paladine","Via Castelânea"); //case 21
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("411 - Vital Brasil","Via Alto da Serra"); //case 22
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("412 - Quitandinha",""); //case 23
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("413 - Lopes Trovão",""); //case 24
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("414 - Chácara Flora",""); //case 25
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("415 - Vila Felipe","Via Rua Teresa"); //case 26
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("419 - Sargento Boening","Via Rua Teresa"); //case 27
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("420 - Meio da Serra","Via Rua Teresa"); //case 28
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("421 - Bairro Mauá",""); //case 29
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("422 - Amazonas",""); //case 30
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("423 - Vila Hípica Espirito Santo",""); //case 31
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("424 - Vila Hípica Rio de Janeiro",""); //case 32
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("425 - Venezuela","Getúlio Vargas"); //case 33
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("426 - Campinho","Via Duas Pontes"); //case 34
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("427 - 24 de maio",""); //case 35
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("428 - Vila Hípica Espirito Santo","Via Rua Ceará"); //case 36
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("429 - Lagoinha",""); //case 37
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("430 - Aldo Tamancoldi",""); //case 38
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("431 - Pedro Ivo",""); //Case 39
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("432 - Vila Felipe","via Duas Pontes"); //Case 40
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("433 - Sargento Boening","via Duas Pontes"); //Case 41
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("434 - Dom João Braga",""); //Case 42
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("435 - Alto Independência","via Cacilda Becker"); //Case 43
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("436 - Alto Independência","via Alto da Serra"); //Case 44
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("437 - Amazonas","via Alagoas"); //Case 45
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("438 - Siméria","via Alto da Serra"); //Case 46
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("439 - Dr. Thouzet","via Alto da Serra"); //Case 47
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("440 - Vila Hípica - Rio de Janeiro","via Alto da Serra"); //Case 48
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("442 - Comunidade do Gulf",""); //Case 49
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("443 - Tancredo Neves",""); //Case 50
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("444 - 24 de Maio","via Rua Nova"); //Case 51
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("445 - Osvero do Carmo Villaça",""); //Case 52
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("446 - Siméria","via Cel. Veiga"); //Case 53
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("447 - Vital Brasil","via Castelânea"); //Case 54
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("448 - Olga Castrioto","via Cel. Veiga"); //Case 55
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("449 - Capitão Paladine","via Cel. Veiga"); //Case 56
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("450 - Lagoinha","Via Terminal Bingen"); //Case 57
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("451 - Praça Catulo","Via Rua Euclides da Cunha"); //Case 58
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("452 - Sargento Boening - Rua Paula Aguiar","via Rua Teresa"); //Case 59
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("453 - Meio da Serra","Via Santos Dumont"); //Case 60
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("454 - Vila Hípica - Rio de Janeiro","Via Rua Friburgo"); //Case 61
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("455 - Lagoinha","Via Visconde do Bom Retiro"); //Case 62
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("456 - Pedro Ivo","Via Visconde do Bom Retiro"); //Case 63
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("457 - Sargento Boening","via Duas Pontes e Paula Aguiar"); //Case 64
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("458 - Vila Felipe","via Vila Real"); //Case 65
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("459 - Alto Independência","via Alto da Serra/Cacilda Becker"); //Case 66
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("461 - Olga Castrioto","via Alto da Serra"); //Case 67
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("462 - Alto Pedro Ivo",""); //Case 68
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("463 - Alto Independência","via C. Becker Rua O"); //Case 69
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("464 - Roncoroni","Via Eugênio Werneck"); //Case 70
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("465 - Amazonas","Vila Ipanema"); //Case 71
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("466 - Alagoas","via Rua C"); //Case 72
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("467 - Honduras","via Comunidade do Gulf"); //Case 73
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("468 - Osvero Villaça","via Aldo Tamancoldi"); //Case 74
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("469 - Vila Hípica - Espírito Santo Rua Ceará","via Amazonas"); //Case 75
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("470 - Santa Isabel",""); //Case 76
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("480 - Cel. Veiga","via Quitandinha X T. Bingen"); //Case 77
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("495 - Alto da Serra / Morin / Sargento Boening","Noturno"); //Case 78
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("496 - Alto Independência","Noturno"); //Case 79
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("497 - Duques / Espírito Santo","Noturno"); //Case 80
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("498 - Dr. Thouzet / São Sebastião / Siméria","Noturno"); //Case 81
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("499 - Valparaiso / Rio de Janeiro","Noturno"); //Case 82
        onibusTestes.add(e);


        return onibusTestes;

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_petroita);

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
                        startActivity(new Intent(TelaPetroita.this, ThouzetExecutivo.class));

                        break;
                    // case clicar na posição 1, significa que e o segundo item
                    case 1:
                        startActivity(new Intent(TelaPetroita.this, SaoSebastiaoAltoSerraExecutivo.class));

                        // faça algo referente ao item 2 a este item aqui dentro

                        break;
                    // case clicar na posição 2, significa que e o terceiro item
                    case 2:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, EstradaParaisoBnh.class));

                        break;

                    case 3:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, QuitandinhaExecutivo.class));


                        break;
                    // case clicar na posição 2, significa que e o terceiro item
                    case 4:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, BingenQuitandinha.class));


                        break;

                    case 5:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, ValparaisoPraca.class));

                        break;

                    case 6:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Valparaiso.class));

                        break;

                    case 7:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, ValparaisoTerraSanta.class));

                        break;

                    case 8:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, ValparaisoThouzet.class));

                        break;

                    case 9:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, ValparaisoTrono.class));

                        break;

                    case 10:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, ValparaisoDuasPontes.class));

                        break;

                    case 11:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, JoaquimGomensoro.class));

                        break;

                    case 12:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, AltoIndependencia.class ));

                        break;

                    case 13:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Taquara.class));

                        break;

                    case 14:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Honduras.class));

                        break;

                    case 15:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Duques.class));

                        break;

                    case 16:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Getulio_Vargas.class));

                        break;

                    case 17:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Dr_Thouzet.class));

                        break;

                    case 18:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Simeria_Castelanea.class));

                        break;

                    case 19:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Vital_Brasil_Coronel.class));

                        break;

                    case 20:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Olga_Castrioto_Castelanea.class));

                        break;

                    case 21:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Cap_Paladine_Castelanea.class));

                        break;

                    case 22:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Vital_Brasil_Alto.class));

                        break;

                    case 23:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Quitandinha.class));

                        break;

                    case 24:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Lopes_Trovao.class));

                        break;

                    case 25:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Chacara_Flora.class));

                        break;

                    case 26:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Vila_Felipe.class));

                        break;

                    case 27:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Sargento_Via_Teresa.class));

                        break;

                    case 28:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Meio_Serra_Teresa.class));

                        break;

                    case 29:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Bairro_Maua.class));

                        break;

                    case 30:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Amazonas.class));

                        break;

                    case 31:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Espirito_Santo.class));

                        break;

                    case 32:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Rio_de_Janeiro.class));

                        break;

                    case 33:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Venezuela.class));

                        break;

                    case 34:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Campinho.class));

                        break;

                    case 35:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Vinte_Quatro_de_Maio.class));

                        break;

                    case 36:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Espirito_Santo_Ceara.class));

                        break;

                    case 37:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Lagoinha.class));

                        break;

                    case 38:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Aldo_Tamancoldi.class));

                        break;
                    case 39:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, PedroIvo.class));

                        break;
                    case 40:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, VilaFelipeDuasPontes.class));

                        break;
                    case 41:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, SargentoDuasPontes.class));

                        break;
                    case 42:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, DomJoaoBraga.class));

                        break;

                    case 43:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, IndependenciaCacilda.class));

                        break;

                    case 44:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Independencia_Alto_da_Serra.class));

                        break;

                    case 45:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Amazonas_Alagoas.class));

                        break;

                    case 46:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Simeria_Alto_da_Serra.class));

                        break;

                    case 47:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Thouzet_Alto_da_Serra.class));

                        break;

                    case 48:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Rio_de_Janeiro_Alto_da_Serra.class));

                        break;

                    case 49:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Gulf.class));

                        break;

                    case 50:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Tancredo_Neves.class));

                        break;

                    case 51:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Vinte_Quatro_Rua_Nova.class));

                        break;

                    case 52:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Osvero_Villaca.class));

                        break;

                    case 53:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Simeria_Coronel_Veiga.class));

                        break;

                    case 54:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Vital_Castelanea.class));

                        break;

                    case 55:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Olga_Coronel_Veiga.class));

                        break;

                    case 56:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Capitao_Paladine_Coronel.class));

                        break;

                    case 57:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, LagoinhaBingen.class));

                        break;

                    case 58:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Praca_Catulo_Euclides.class));

                        break;

                    case 59:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Sargento_Boening_Paula_Aguiar.class));

                        break;

                    case 60:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Meio_Serra_Santos_Dumont.class));

                        break;

                    case 61:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Rio_de_Janeiro_Friburgo.class));

                        break;

                    case 62:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, LagoinhaVisconde.class));

                        break;

                    case 63:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, PedroIvoVisconde.class));

                        break;

                    case 64:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Sargento_Pontes_Paula.class));

                        break;

                    case 65:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Vila_Felipe_Vila_Real.class));

                        break;

                    case 66:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Alto_Independencia_Alto_Serra_Cacilda.class));

                        break;

                    case 67:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Olga_Alto_Serra.class));

                        break;

                    case 68:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, AltoPedroIvo.class));

                        break;

                    case 69:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Alto_Independencia_Cacilda_Rua_O.class));

                        break;

                    case 70:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Roncoroni.class));

                        break;

                    case 71:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Amazonas_Vila_Ipanema.class));

                        break;

                    case 72:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Alagoas_Rua_C.class));

                        break;

                    case 73:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Honduras_Gulf.class));

                        break;

                    case 74:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Osvero_Villaca_Aldo_Tamancoldi.class));

                        break;

                    case 75:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Espirito_Santo_Via_Amazonas.class));

                        break;

                    case 76:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Santa_Isabel.class));

                        break;

                    case 77:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Coronel_Quitandinha_Bingen.class));

                        break;

                    case 78:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Alto_Morin_Sargento_Noturno.class));

                        break;

                    case 79:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Alto_Independencia_Noturno.class));

                        break;

                    case 80:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Duques_Espirito_Noturno.class));

                        break;

                    case 81:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Thouzet_SaoSebastiao_Simeria_Noturno.class));

                        break;

                    case 82:
                        // faça algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Valparaiso_Rio_de_Janeiro_Noturno.class));

                        break;
                    // assim por diante ...
                }
            }
        });
    }
}