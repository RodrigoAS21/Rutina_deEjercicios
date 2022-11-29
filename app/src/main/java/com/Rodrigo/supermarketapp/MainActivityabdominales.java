package com.Rodrigo.supermarketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivityabdominales extends AppCompatActivity {

    private ListView listView;
    private List<claseAbdominales> lista = new ArrayList<>();
    AbdominalAdapter abdominalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityabdominales);

        listView = findViewById(R.id.listview);

        lista.add(new claseAbdominales("Abdominal Tradicional", "10 x 4 Sesiones", R.drawable.abdominaldos));
        lista.add(new claseAbdominales("Plancha", "35 min. x 3 Sesiones", R.drawable.abdominaltres));
        lista.add(new claseAbdominales("Levantamiento en Blocke", "20 x 3 Sesiones", R.drawable.abdominalcinco));
        lista.add(new claseAbdominales("Piernas Elevadas", "15 x 4 Sesiones", R.drawable.abdominalcuatro));
        lista.add(new claseAbdominales("Elevacion de Piernas como Tijeras", "15 con cada Pierna x 3 Sesiones", R.drawable.abdominalseis));
        lista.add(new claseAbdominales("Flexion de Pierna", "20 x 4 Sesiones", R.drawable.abdominalsiete));
        lista.add(new claseAbdominales("Crunch Lateral", "25 x 2 Sesiones", R.drawable.undefined));


        abdominalAdapter = new AbdominalAdapter(MainActivityabdominales.this,R.layout.list_item_lista1,lista);

        listView.setAdapter(abdominalAdapter);

    }

}