package com.digitech.tembus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.cidadereal.Alberto_de_Oliveira;
import com.digitech.tembus.cidadereal.Alberto_de_Oliveira_Hospital;
import com.digitech.tembus.cidadereal.Alto_Moinho_Preto;
import com.digitech.tembus.cidadereal.Bairro_Castrioto;
import com.digitech.tembus.cidadereal.Bartolomeu_Bis;
import com.digitech.tembus.cidadereal.Bataillard;
import com.digitech.tembus.cidadereal.Bataillard_Hospital;
import com.digitech.tembus.cidadereal.Batista_da_Costa;
import com.digitech.tembus.cidadereal.Campo_do_Serrano;
import com.digitech.tembus.cidadereal.Candido_Portinari;
import com.digitech.tembus.cidadereal.Candido_Portinari_Campo;
import com.digitech.tembus.cidadereal.Casemiro_de_Abreu;
import com.digitech.tembus.cidadereal.Castrioto_Luzitano_Noturno;
import com.digitech.tembus.cidadereal.Caxambu_Luzitano;
import com.digitech.tembus.cidadereal.Cel_Veiga_Bingen;
import com.digitech.tembus.cidadereal.Centenario;
import com.digitech.tembus.cidadereal.Comunidade_Vitoria;
import com.digitech.tembus.cidadereal.Contorno;
import com.digitech.tembus.cidadereal.Corredor_Duarte;
import com.digitech.tembus.cidadereal.Dias_de_Oliveira;
import com.digitech.tembus.cidadereal.Duarte_Silveira;
import com.digitech.tembus.cidadereal.Duarte_da_Silveira_Bartolomeu;
import com.digitech.tembus.cidadereal.Fazenda_Inglesa_Contorno;
import com.digitech.tembus.cidadereal.Fazenda_Inglesa_cidade_real_;
import com.digitech.tembus.cidadereal.Joao_Balter;
import com.digitech.tembus.cidadereal.Joao_Xavier;
import com.digitech.tembus.cidadereal.Kopke_Alvaro;
import com.digitech.tembus.cidadereal.Marechal_Hermes;
import com.digitech.tembus.cidadereal.Moinho_Preto_Hospital;
import com.digitech.tembus.cidadereal.Mosela_Noturno;
import com.digitech.tembus.cidadereal.Mosela_Quarteirao;
import com.digitech.tembus.cidadereal.Pedras_Brancas;
import com.digitech.tembus.cidadereal.Pedras_Brancas_Teofilo;
import com.digitech.tembus.cidadereal.Rocio;
import com.digitech.tembus.cidadereal.Rodoviaria_Jorge_Justen;
import com.digitech.tembus.cidadereal.Terminal_Bingen;
import com.digitech.tembus.cidadereal.Terminal_Bingen_Correas;
import com.digitech.tembus.cidadereal.Terminal_Bingen_Duarte;
import com.digitech.tembus.cidadereal.Terminal_Bingen_Executivo;
import com.digitech.tembus.cidadereal.Terminal_Bingen_Manoel;
import com.digitech.tembus.cidadereal.Terminal_Bingen_Quitandinha_Executivo;
import com.digitech.tembus.cidadereal.Terminal_Itaipava_Bingen;
import com.digitech.tembus.cidadereal.Terminal_Itamarati_Bingen;
import com.digitech.tembus.cidadereal.Vila_Militar;
import com.digitech.tembus.cidadereal.Waldemar_Ferreira_Barao;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;

public class TelaCidadeReal extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus() {


        ArrayList<TemBusLayoutAdapter> onibusTestes = new ArrayList<TemBusLayoutAdapter>();
        TemBusLayoutAdapter e = new TemBusLayoutAdapter("10 - Terminal Bingen", "Executivo"); //case 0
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("11 - Terminal Bingen X Quitandinha", "Executivo"); //case 1
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("100 - Terminal Bingen", ""); //case 2
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("101 - Rocio", ""); //case 3
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("102 - Bartolomeu de Gusmão", "Via 14 Bis"); //case 4
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("103 - Cândido Portinari", ""); //case 5
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("104 - Vila Militar", ""); //case 6
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("105 - Alberto de Oliveira", ""); //case 7
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("106 - Bataillard", ""); //case 8
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("107 - Terminal Bingen", "Via Manoel Torres"); //case 9
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("108 - Bairro Castrioto", ""); //case 10
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("110 - Duarte da Silveira", ""); //case 11
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("111 - Terminal Bingen", "Via Duarte da Silveira"); //case 12
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("112 - Waldemar Ferreira da Silva", "Via Barão de Águas Claras"); //case 13
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("113 - Marechal Hermes", ""); //case 14
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("114 - Batista da Costa", ""); //case 15
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("115 - Campo do Serrano", ""); //case 16
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("116 - Dias de Oliveira", ""); //case 17
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("117 - João Xavier", ""); //case 18
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("118 - Pedras Brancas", ""); //case 19
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("119 - Kopke - Álvaro Lopes de Castro", "Via Vila São José"); //case 20
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("120 - Contorno", ""); //case 21
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("121 - Casemiro de Abreu", ""); //case 22
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("122 - Fazenda Inglesa", ""); //case 23
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("123 - Centenário", ""); //case 24
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("125 - Castrioto / Luzitano", "Noturno"); //case 25
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("126 - Duarte da Silveira / Bartolomeu de Gusmão", "Noturno"); //case 26
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("127 - Mosela", "Noturno"); //case 14
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("129 - Alto Moinho Preto", ""); //case 15
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("130 - Rodoviária", "Via Jorge Justen/ G. Kreischer"); //case 16
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("132 - Pedras Brancas - Teófilo da Silva", "Via Hospital Santa Teresa"); //case 17
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("133 - Alberto de Oliveira", "Via Hospital Santa Teresa"); //case 18
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("134 - Bataillard - Rua F", "Via Hospital Santa Teresa"); //case 19
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("135 - Caxambu Luzitano", "Via Rua Elisa Mussel Peixoto"); //case 20
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("136 - João Balter X Bataillard", "Nova Linha"); //case 21
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("137 - Fazenda Inglesa", "Via estrada do Contorno"); //case 22
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("139 - Moinho Preto", "Via Hospital Santa Teresa"); //case 23
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("140 - Comunidade Vitória", ""); //case 24
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("142 - Cândido Portinari", "Via C. do Serrano e B. da Costa"); //case 25
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("145 - Mosela", "Via Q. Ingelhein X Terminal Bingen"); //case 26
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("150 - Terminal Bingen X Terminal Corrêas", ""); //case 24
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("160 - Terminal Itaipava X Terminal Bingen", ""); //case 24
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("170 - Terminal Itamarati X Terminal Bingen", ""); //case 24
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("180 - Cel. Veiga", "Via Quitandinha X Terminal Bingen"); //case 24
        onibusTestes.add(e);

        e = new TemBusLayoutAdapter("190 - Corredor Duarte da Silveira", ""); //case 24
        onibusTestes.add(e);


        return onibusTestes;

    }

    ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cidade_real);

        //Anuncio aqui embaixo!!!

        AdView adview = (AdView) findViewById(R.id.adView);

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
                        startActivity(new Intent(TelaCidadeReal.this, Terminal_Bingen_Executivo.class));

                        break;

                    case 1:
                        startActivity(new Intent(TelaCidadeReal.this, Terminal_Bingen_Quitandinha_Executivo.class));

                        break;

                    case 2:
                        startActivity(new Intent(TelaCidadeReal.this, Terminal_Bingen.class));

                        break;

                    case 3:
                        startActivity(new Intent(TelaCidadeReal.this, Rocio.class));

                        break;

                    case 4:
                        startActivity(new Intent(TelaCidadeReal.this, Bartolomeu_Bis.class));

                        break;

                    case 5:
                        startActivity(new Intent(TelaCidadeReal.this, Candido_Portinari.class));

                        break;

                    case 6:
                        startActivity(new Intent(TelaCidadeReal.this, Vila_Militar.class));

                        break;

                    case 7:
                        startActivity(new Intent(TelaCidadeReal.this, Alberto_de_Oliveira.class));

                        break;

                    case 8:
                        startActivity(new Intent(TelaCidadeReal.this, Bataillard.class));

                        break;

                    case 9:
                        startActivity(new Intent(TelaCidadeReal.this, Terminal_Bingen_Manoel.class));

                        break;

                    case 10:
                        startActivity(new Intent(TelaCidadeReal.this, Bairro_Castrioto.class));

                        break;

                    case 11:
                        startActivity(new Intent(TelaCidadeReal.this, Duarte_Silveira.class));

                        break;

                    case 12:
                        startActivity(new Intent(TelaCidadeReal.this, Terminal_Bingen_Duarte.class));

                        break;

                    case 13:
                        startActivity(new Intent(TelaCidadeReal.this, Waldemar_Ferreira_Barao.class));

                        break;

                    case 14:
                        startActivity(new Intent(TelaCidadeReal.this, Marechal_Hermes.class));

                        break;

                    case 15:
                        startActivity(new Intent(TelaCidadeReal.this, Batista_da_Costa.class));

                        break;

                    case 16:
                        startActivity(new Intent(TelaCidadeReal.this, Campo_do_Serrano.class));

                        break;

                    case 17:
                        startActivity(new Intent(TelaCidadeReal.this, Dias_de_Oliveira.class));

                        break;

                    case 18:
                        startActivity(new Intent(TelaCidadeReal.this, Joao_Xavier.class));

                        break;

                    case 19:
                        startActivity(new Intent(TelaCidadeReal.this, Pedras_Brancas.class));

                        break;

                    case 20:
                        startActivity(new Intent(TelaCidadeReal.this, Kopke_Alvaro.class));

                        break;

                    case 21:
                        startActivity(new Intent(TelaCidadeReal.this, Contorno.class));

                        break;

                    case 22:
                        startActivity(new Intent(TelaCidadeReal.this, Casemiro_de_Abreu.class));

                        break;

                    case 23:
                        startActivity(new Intent(TelaCidadeReal.this, Fazenda_Inglesa_cidade_real_.class));

                        break;

                    case 24:
                        startActivity(new Intent(TelaCidadeReal.this, Centenario.class));

                        break;

                    case 25:
                        startActivity(new Intent(TelaCidadeReal.this, Castrioto_Luzitano_Noturno.class));

                        break;

                    case 26:
                        startActivity(new Intent(TelaCidadeReal.this, Duarte_da_Silveira_Bartolomeu.class));

                        break;

                    case 27:
                        startActivity(new Intent(TelaCidadeReal.this, Mosela_Noturno.class));

                        break;

                    case 28:
                        startActivity(new Intent(TelaCidadeReal.this, Alto_Moinho_Preto.class));

                        break;

                    case 29:
                        startActivity(new Intent(TelaCidadeReal.this, Rodoviaria_Jorge_Justen.class));

                        break;

                    case 30:
                        startActivity(new Intent(TelaCidadeReal.this, Pedras_Brancas_Teofilo.class));

                        break;

                    case 31:
                        startActivity(new Intent(TelaCidadeReal.this, Alberto_de_Oliveira_Hospital.class));

                        break;

                    case 32:
                        startActivity(new Intent(TelaCidadeReal.this, Bataillard_Hospital.class));

                        break;

                    case 33:
                        startActivity(new Intent(TelaCidadeReal.this, Caxambu_Luzitano.class));

                        break;

                    case 34:
                        startActivity(new Intent(TelaCidadeReal.this, Joao_Balter.class));

                        break;

                    case 35:
                        startActivity(new Intent(TelaCidadeReal.this, Fazenda_Inglesa_Contorno.class));

                        break;

                    case 36:
                        startActivity(new Intent(TelaCidadeReal.this, Moinho_Preto_Hospital.class));

                        break;

                    case 37:
                        startActivity(new Intent(TelaCidadeReal.this, Comunidade_Vitoria.class));

                        break;

                    case 38:
                        startActivity(new Intent(TelaCidadeReal.this, Candido_Portinari_Campo.class));

                        break;

                    case 39:
                        startActivity(new Intent(TelaCidadeReal.this, Mosela_Quarteirao.class));

                        break;

                    case 40:
                        startActivity(new Intent(TelaCidadeReal.this, Terminal_Bingen_Correas.class));

                        break;

                    case 41:
                        startActivity(new Intent(TelaCidadeReal.this, Terminal_Itaipava_Bingen.class));

                        break;

                    case 42:
                        startActivity(new Intent(TelaCidadeReal.this, Terminal_Itamarati_Bingen.class));

                        break;

                    case 43:
                        startActivity(new Intent(TelaCidadeReal.this, Cel_Veiga_Bingen.class));

                        break;

                    case 44:
                        startActivity(new Intent(TelaCidadeReal.this, Corredor_Duarte.class));

                        break;


                }
            }
        });
    }
}