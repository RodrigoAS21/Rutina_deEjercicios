package com.Rodrigo.supermarketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivitypressbanca extends AppCompatActivity {

    private ListView listView;
    private List<clasepressbanca> lista = new ArrayList<clasepressbanca>();
    flexionesAdapter flexionesAdapter;
    private Object pressbancaAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitypressbanca);

        listView = findViewById(R.id.listview);

        lista.add(new clasepressbanca("Press Banca", "15 x 3", R.drawable.pressbacanuno));
        lista.add(new clasepressbanca("Press Banca Inclinado", "15 x 3", R.drawable.pressbancados));
        lista.add(new clasepressbanca("Press Banca Declinado", "10 x 3", R.drawable.pressbancatres));


        pressbancaAdapter = new pressbancaAdapter(MainActivitypressbanca.this,R.layout.list_item_lista2,lista);

        listView.setAdapter((ListAdapter) pressbancaAdapter);
    }
}