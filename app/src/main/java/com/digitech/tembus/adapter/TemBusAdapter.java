package com.digitech.tembus.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.digitech.tembus.R;
import com.digitech.tembus.layoutAdapter.TemBusLayoutAdapter;

import java.util.ArrayList;

public class TemBusAdapter extends ArrayAdapter<TemBusLayoutAdapter>{

    private final Context context;
    private final ArrayList<TemBusLayoutAdapter>elementos;

    public TemBusAdapter(Context context, ArrayList<TemBusLayoutAdapter>elementos){
        super(context, R.layout.tembuslayout, elementos);
        this.context = context;
        this.elementos = elementos;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.tembuslayout, parent, false);

        TextView nomeOnibus = (TextView) rowView.findViewById(R.id.nome);
        TextView via = (TextView) rowView.findViewById(R.id.via);

        nomeOnibus.setText(elementos.get(position).getNome());
        via.setText(elementos.get(position).getVia());

        return rowView;
    }
}
