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

        e = new TemBusLayoutAdapter("022 - Executivo - S??o Sebasti??o", "Via Alto da Serra"); //case 1
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("023 - Executivo - Estrada do Paraiso", "Via BNH"); //case 2
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("024 - Executivo - Quitandinha",""); //case 3
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("025 - Executivo - Terminal Bingen X Quitandinha",""); //case 4
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("204 - Valpara??so","Via Pra??a da Liberdade"); //case 5
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("205 - Valpara??so","Via Duas Pontes - R.N.Sra. Aparecida"); //case 6
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("206 - Valpara??so Terra Santa","Via Rocha Cardoso"); //case 7
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("209 - Valpara??so","Via Dr. Thouzet"); //case 8
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("210 - Valpara??so","Via Duas Pontes - Rua Fabr??cio de Mattos"); //case 9
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("211 - Valpara??so","Via Duas Pontes (Gon??alves Dias)"); //case 10
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("212 - Joaquim Gomensoro",""); //case 11
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("401 - Alto Independ??ncia",""); //case 12
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("402 - Taquara",""); //case 13
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("403 - Honduras",""); //case 14
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("404 - Duques",""); //case 15
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("405 - Get??lio Vargas",""); //case 16
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("406 - Dr. Thouzet",""); //case 17
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("407 - Sim??ria","Via Castel??nea"); //case 18
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("408 - Vital Brasil",""); //case 19
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("409 - Olga Castrioto","Via Castel??nea"); //case 20
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("410 - Capit??o Paladine","Via Castel??nea"); //case 21
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("411 - Vital Brasil","Via Alto da Serra"); //case 22
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("412 - Quitandinha",""); //case 23
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("413 - Lopes Trov??o",""); //case 24
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("414 - Ch??cara Flora",""); //case 25
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("415 - Vila Felipe","Via Rua Teresa"); //case 26
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("419 - Sargento Boening","Via Rua Teresa"); //case 27
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("420 - Meio da Serra","Via Rua Teresa"); //case 28
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("421 - Bairro Mau??",""); //case 29
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("422 - Amazonas",""); //case 30
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("423 - Vila H??pica Espirito Santo",""); //case 31
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("424 - Vila H??pica Rio de Janeiro",""); //case 32
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("425 - Venezuela","Get??lio Vargas"); //case 33
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("426 - Campinho","Via Duas Pontes"); //case 34
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("427 - 24 de maio",""); //case 35
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("428 - Vila H??pica Espirito Santo","Via Rua Cear??"); //case 36
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

        e = new TemBusLayoutAdapter("434 - Dom Jo??o Braga",""); //Case 42
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("435 - Alto Independ??ncia","via Cacilda Becker"); //Case 43
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("436 - Alto Independ??ncia","via Alto da Serra"); //Case 44
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("437 - Amazonas","via Alagoas"); //Case 45
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("438 - Sim??ria","via Alto da Serra"); //Case 46
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("439 - Dr. Thouzet","via Alto da Serra"); //Case 47
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("440 - Vila H??pica - Rio de Janeiro","via Alto da Serra"); //Case 48
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("442 - Comunidade do Gulf",""); //Case 49
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("443 - Tancredo Neves",""); //Case 50
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("444 - 24 de Maio","via Rua Nova"); //Case 51
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("445 - Osvero do Carmo Villa??a",""); //Case 52
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("446 - Sim??ria","via Cel. Veiga"); //Case 53
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("447 - Vital Brasil","via Castel??nea"); //Case 54
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("448 - Olga Castrioto","via Cel. Veiga"); //Case 55
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("449 - Capit??o Paladine","via Cel. Veiga"); //Case 56
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("450 - Lagoinha","Via Terminal Bingen"); //Case 57
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("451 - Pra??a Catulo","Via Rua Euclides da Cunha"); //Case 58
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("452 - Sargento Boening - Rua Paula Aguiar","via Rua Teresa"); //Case 59
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("453 - Meio da Serra","Via Santos Dumont"); //Case 60
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("454 - Vila H??pica - Rio de Janeiro","Via Rua Friburgo"); //Case 61
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("455 - Lagoinha","Via Visconde do Bom Retiro"); //Case 62
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("456 - Pedro Ivo","Via Visconde do Bom Retiro"); //Case 63
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("457 - Sargento Boening","via Duas Pontes e Paula Aguiar"); //Case 64
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("458 - Vila Felipe","via Vila Real"); //Case 65
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("459 - Alto Independ??ncia","via Alto da Serra/Cacilda Becker"); //Case 66
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("461 - Olga Castrioto","via Alto da Serra"); //Case 67
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("462 - Alto Pedro Ivo",""); //Case 68
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("463 - Alto Independ??ncia","via C. Becker Rua O"); //Case 69
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("464 - Roncoroni","Via Eug??nio Werneck"); //Case 70
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("465 - Amazonas","Vila Ipanema"); //Case 71
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("466 - Alagoas","via Rua C"); //Case 72
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("467 - Honduras","via Comunidade do Gulf"); //Case 73
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("468 - Osvero Villa??a","via Aldo Tamancoldi"); //Case 74
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("469 - Vila H??pica - Esp??rito Santo Rua Cear??","via Amazonas"); //Case 75
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("470 - Santa Isabel",""); //Case 76
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("480 - Cel. Veiga","via Quitandinha X T. Bingen"); //Case 77
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("495 - Alto da Serra / Morin / Sargento Boening","Noturno"); //Case 78
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("496 - Alto Independ??ncia","Noturno"); //Case 79
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("497 - Duques / Esp??rito Santo","Noturno"); //Case 80
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("498 - Dr. Thouzet / S??o Sebasti??o / Sim??ria","Noturno"); //Case 81
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

            /* o position representa a posi????o que o usu??rio clicou*/

                switch (position) {
                    // case clicar na posi????o 0, significa que e o primeiro item
                    case 0:
                        startActivity(new Intent(TelaPetroita.this, ThouzetExecutivo.class));

                        break;
                    // case clicar na posi????o 1, significa que e o segundo item
                    case 1:
                        startActivity(new Intent(TelaPetroita.this, SaoSebastiaoAltoSerraExecutivo.class));

                        // fa??a algo referente ao item 2 a este item aqui dentro

                        break;
                    // case clicar na posi????o 2, significa que e o terceiro item
                    case 2:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, EstradaParaisoBnh.class));

                        break;

                    case 3:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, QuitandinhaExecutivo.class));


                        break;
                    // case clicar na posi????o 2, significa que e o terceiro item
                    case 4:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, BingenQuitandinha.class));


                        break;

                    case 5:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, ValparaisoPraca.class));

                        break;

                    case 6:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Valparaiso.class));

                        break;

                    case 7:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, ValparaisoTerraSanta.class));

                        break;

                    case 8:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, ValparaisoThouzet.class));

                        break;

                    case 9:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, ValparaisoTrono.class));

                        break;

                    case 10:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, ValparaisoDuasPontes.class));

                        break;

                    case 11:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, JoaquimGomensoro.class));

                        break;

                    case 12:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, AltoIndependencia.class ));

                        break;

                    case 13:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Taquara.class));

                        break;

                    case 14:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Honduras.class));

                        break;

                    case 15:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Duques.class));

                        break;

                    case 16:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Getulio_Vargas.class));

                        break;

                    case 17:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Dr_Thouzet.class));

                        break;

                    case 18:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Simeria_Castelanea.class));

                        break;

                    case 19:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Vital_Brasil_Coronel.class));

                        break;

                    case 20:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Olga_Castrioto_Castelanea.class));

                        break;

                    case 21:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Cap_Paladine_Castelanea.class));

                        break;

                    case 22:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Vital_Brasil_Alto.class));

                        break;

                    case 23:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Quitandinha.class));

                        break;

                    case 24:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Lopes_Trovao.class));

                        break;

                    case 25:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Chacara_Flora.class));

                        break;

                    case 26:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Vila_Felipe.class));

                        break;

                    case 27:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Sargento_Via_Teresa.class));

                        break;

                    case 28:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Meio_Serra_Teresa.class));

                        break;

                    case 29:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Bairro_Maua.class));

                        break;

                    case 30:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Amazonas.class));

                        break;

                    case 31:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Espirito_Santo.class));

                        break;

                    case 32:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Rio_de_Janeiro.class));

                        break;

                    case 33:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Venezuela.class));

                        break;

                    case 34:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Campinho.class));

                        break;

                    case 35:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Vinte_Quatro_de_Maio.class));

                        break;

                    case 36:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Espirito_Santo_Ceara.class));

                        break;

                    case 37:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Lagoinha.class));

                        break;

                    case 38:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, Aldo_Tamancoldi.class));

                        break;
                    case 39:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, PedroIvo.class));

                        break;
                    case 40:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, VilaFelipeDuasPontes.class));

                        break;
                    case 41:
                        // fa??a algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaPetroita.this, SargentoDuasPontes.class));

                        break;
                    case 42:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, DomJoaoBraga.class));

                        break;

                    case 43:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, IndependenciaCacilda.class));

                        break;

                    case 44:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Independencia_Alto_da_Serra.class));

                        break;

                    case 45:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Amazonas_Alagoas.class));

                        break;

                    case 46:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Simeria_Alto_da_Serra.class));

                        break;

                    case 47:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Thouzet_Alto_da_Serra.class));

                        break;

                    case 48:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Rio_de_Janeiro_Alto_da_Serra.class));

                        break;

                    case 49:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Gulf.class));

                        break;

                    case 50:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Tancredo_Neves.class));

                        break;

                    case 51:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Vinte_Quatro_Rua_Nova.class));

                        break;

                    case 52:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Osvero_Villaca.class));

                        break;

                    case 53:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Simeria_Coronel_Veiga.class));

                        break;

                    case 54:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Vital_Castelanea.class));

                        break;

                    case 55:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Olga_Coronel_Veiga.class));

                        break;

                    case 56:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Capitao_Paladine_Coronel.class));

                        break;

                    case 57:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, LagoinhaBingen.class));

                        break;

                    case 58:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Praca_Catulo_Euclides.class));

                        break;

                    case 59:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Sargento_Boening_Paula_Aguiar.class));

                        break;

                    case 60:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Meio_Serra_Santos_Dumont.class));

                        break;

                    case 61:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Rio_de_Janeiro_Friburgo.class));

                        break;

                    case 62:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, LagoinhaVisconde.class));

                        break;

                    case 63:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, PedroIvoVisconde.class));

                        break;

                    case 64:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Sargento_Pontes_Paula.class));

                        break;

                    case 65:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Vila_Felipe_Vila_Real.class));

                        break;

                    case 66:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Alto_Independencia_Alto_Serra_Cacilda.class));

                        break;

                    case 67:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Olga_Alto_Serra.class));

                        break;

                    case 68:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, AltoPedroIvo.class));

                        break;

                    case 69:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Alto_Independencia_Cacilda_Rua_O.class));

                        break;

                    case 70:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Roncoroni.class));

                        break;

                    case 71:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Amazonas_Vila_Ipanema.class));

                        break;

                    case 72:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Alagoas_Rua_C.class));

                        break;

                    case 73:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Honduras_Gulf.class));

                        break;

                    case 74:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Osvero_Villaca_Aldo_Tamancoldi.class));

                        break;

                    case 75:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Espirito_Santo_Via_Amazonas.class));

                        break;

                    case 76:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Santa_Isabel.class));

                        break;

                    case 77:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Coronel_Quitandinha_Bingen.class));

                        break;

                    case 78:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Alto_Morin_Sargento_Noturno.class));

                        break;

                    case 79:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Alto_Independencia_Noturno.class));

                        break;

                    case 80:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Duques_Espirito_Noturno.class));

                        break;

                    case 81:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Thouzet_SaoSebastiao_Simeria_Noturno.class));

                        break;

                    case 82:
                        // fa??a algo referente ao item 3 a este item aqui dentro
                        startActivity(new Intent(TelaPetroita.this, Valparaiso_Rio_de_Janeiro_Noturno.class));

                        break;
                    // assim por diante ...
                }
            }
        });
    }
}