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

public class sentadillasAdapter extends ArrayAdapter<clasesentadillas> {
    private List<clasesentadillas> lista;
    private Context context;
    private int resourceLayout;

    public sentadillasAdapter(Context context, int resource, List<clasesentadillas> objects){
        super(context, resource, objects);
        this.lista = objects;
        this.context = context;
        this.resourceLayout = resource;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if (view == null)
            view = LayoutInflater.from(context).inflate(resourceLayout, null);

        clasesentadillas sentadillas = lista.get(position);

        ImageView imagentres = view.findViewById(R.id.imagentres);
        imagentres.setImageResource(sentadillas.getImagentres());

        TextView Nsentadillas = view.findViewById(R.id.Nsentadilla);
        sentadillas.setSentadillas(sentadillas.getSentadillas());

        TextView repsentadillas = view.findViewById(R.id.repsentadillas);
        repsentadillas.setText(sentadillas.getRepsentadillas());

        return view;
    }
}
