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

public class pressbancaAdapter extends ArrayAdapter<clasepressbanca> {
    private List<clasepressbanca> lista;
    private Context context;
    private int resourceLayout;

    public pressbancaAdapter(Context context, int resource, List<clasepressbanca> objects){
        super(context, resource, objects);
        this.lista = objects;
        this.context = context;
        this.resourceLayout = resource;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if (view == null)
            view = LayoutInflater.from(context).inflate(resourceLayout, null);

        clasepressbanca press_banca = lista.get(position);

        ImageView imagencuatro = view.findViewById(R.id.imagencuatro);
        imagencuatro.setImageResource(press_banca.getImagencuatro());

        TextView Npressbanca = view.findViewById(R.id.btnpressbanca);
        press_banca.setPress_banca(press_banca.getPress_banca());

        return view;
    }
}
