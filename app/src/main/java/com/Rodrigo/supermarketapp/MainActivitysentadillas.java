package com.Rodrigo.supermarketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivitysentadillas extends AppCompatActivity {

    private ListView listView;
    private List<clasesentadillas> lista = new ArrayList<clasesentadillas>();
    flexionesAdapter flexionesAdapter;
    private Object sentadillasAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitysentadillas);

        listView = findViewById(R.id.listview);

        lista.add(new clasesentadillas("Sentadilla Basica", "20 x 4", R.drawable.sentadillaimagen));
        lista.add(new clasesentadillas("Sentadilla con salto", "25 x 4", R.drawable.sentadillados));
        lista.add(new clasesentadillas("Sentadilla Isometrica", "15 x 5", R.drawable.sentadillatres));
        lista.add(new clasesentadillas("Sentadilla Sumo", "20 x 3", R.drawable.sentadillacuatro));
        lista.add(new clasesentadillas("Sentadilla Sissy", "10 x 4", R.drawable.sentadillacinci));
        lista.add(new clasesentadillas("Sentadilla Bulgara", "10 x 4", R.drawable.sentadillaseis));
        lista.add(new clasesentadillas("Sentadilla Kang", "15 x 2", R.drawable.sentadillasiete));


        sentadillasAdapter = new sentadillasAdapter(MainActivitysentadillas.this,R.layout.list_item_lista3,lista);

        listView.setAdapter((ListAdapter) sentadillasAdapter);
    }
}