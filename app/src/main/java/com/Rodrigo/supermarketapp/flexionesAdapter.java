package com.Rodrigo.supermarketapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class flexionesAdapter extends ArrayAdapter<claseflexiones> {
    private List<claseflexiones> lista;
    private Context context;
    private int resourselayout;

    public flexionesAdapter(Context context, int resource, List<claseflexiones> objects){
        super(context, resource, objects);
        this.lista = objects;
        this.context = context;
        this.resourselayout = resource;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if(view == null)
            view = LayoutInflater.from(context).inflate(resourselayout, null);

        claseflexiones flexiones = lista.get(position);

        ImageView imageView = view.findViewById(R.id.imagendos);
        imageView.setImageResource(flexiones.getImage());

        TextView nombreflex = view.findViewById(R.id.Nejercicio);
        nombreflex.setText(flexiones.getFlexiones());

        TextView repe = view.findViewById(R.id.repeticiones);
        repe.setText(flexiones.getFlexiones());

        return view;
    }

}
