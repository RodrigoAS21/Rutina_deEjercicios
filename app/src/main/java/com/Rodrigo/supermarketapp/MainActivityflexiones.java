package com.Rodrigo.supermarketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.ImageReader;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivityflexiones extends AppCompatActivity {

    private ListView listView;
    private List<claseflexiones> lista = new ArrayList<>();
    flexionesAdapter flexionesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityflexiones);

        listView = findViewById(R.id.listview);

        lista.add(new claseflexiones("de brazo", "20 x 3", R.drawable.imagenflexiones));
        lista.add(new claseflexiones("indu", "25 x 3", R.drawable.felxionuno));
        lista.add(new claseflexiones("asimetricas", "15 x 4", R.drawable.flexiondos));
        lista.add(new claseflexiones("de diamante", "10 x 3", R.drawable.flexiontres));
        lista.add(new claseflexiones("de una mano", "10 x 2", R.drawable.flexioncinco));
        lista.add(new claseflexiones("Espartanas", "20 x 3", R.drawable.flexionseis));


        flexionesAdapter = new flexionesAdapter(MainActivityflexiones.this,R.layout.list_item_lista2,lista);

        listView.setAdapter(flexionesAdapter);
    }


}