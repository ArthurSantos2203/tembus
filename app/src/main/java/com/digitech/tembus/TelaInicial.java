package com.digitech.tembus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ListMenuItemView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.digitech.tembus.adapter.TemBusAdapter;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class TelaInicial extends AppCompatActivity {

    private ArrayList<TemBusLayoutAdapter> adicionarOnibus(){

        ArrayList<TemBusLayoutAdapter> onibusLista = new ArrayList<TemBusLayoutAdapter>();

        TemBusLayoutAdapter e = new TemBusLayoutAdapter("Petroita", ""); //case 0
        onibusLista.add(e);

        e = new TemBusLayoutAdapter("Turb", ""); //case 1
        onibusLista.add(e);

        e = new TemBusLayoutAdapter("Cidade das Hortências", ""); //case 2
        onibusLista.add(e);

        e = new TemBusLayoutAdapter("Viação Cascatinha", ""); //case 3
        onibusLista.add(e);

        e = new TemBusLayoutAdapter("Cidade Real", ""); //case 4
        onibusLista.add(e);

        return onibusLista;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);

        //Anuncio aqui embaixo!!!
        //Fim dos Anuncios!!!

        ListView lista = (ListView) findViewById(R.id.listViewid);
        ArrayAdapter adapter = new TemBusAdapter(this, adicionarOnibus());
        lista.setAdapter(adapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {


                /* o position representa a posição que o usuário clicou*/

                switch (position) {
                    // case clicar na posição 0, significa que e o primeiro item
                    case 0:
                        startActivity(new Intent(TelaInicial.this, TelaPetroita.class));

                        break;
                    // case clicar na posição 1, significa que e o segundo item
                    case 1:
                        startActivity(new Intent(TelaInicial.this, TelaTurb.class));

                        // faça algo referente ao item 2 a este item aqui dentro

                        break;
                    // case clicar na posição 2, significa que e o terceiro item
                    case 2:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaInicial.this, TelaHortencias.class));

                        break;

                    case 3:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaInicial.this, TelaCascatinha.class));


                        break;
                    // case clicar na posição 2, significa que e o terceiro item
                    case 4:
                        // faça algo referente ao item 3 a este item aqui dentro

                        startActivity(new Intent(TelaInicial.this, TelaCidadeReal.class));


                        break;
                }
            }
        });
    }
}