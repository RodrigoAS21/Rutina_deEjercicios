package com.Rodrigo.supermarketapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AbdominalAdapter extends ArrayAdapter<claseAbdominales> {

    private List<claseAbdominales> lista;
    private Context context;
    private int resourceLayout;

    public AbdominalAdapter(@NonNull Context context, int resource, @NonNull List<claseAbdominales> objects) {
        super(context, resource, objects);
        this.lista = objects;
        this.context = context;
        this.resourceLayout = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if(view == null)
            view = LayoutInflater.from(context).inflate(resourceLayout, null);

        claseAbdominales abdominales = lista.get(position);

        ImageView imagen = view.findViewById(R.id.imagen);
        imagen.setImageResource(abdominales.getImagen());

        TextView nombre = view.findViewById(R.id.NombreEjercicio);
        nombre.setText(abdominales.getAbdominal());

        TextView repeticion = view.findViewById(R.id.Repxsession);
        repeticion.setText(abdominales.getRepeticion());

        return view;
    }
}
