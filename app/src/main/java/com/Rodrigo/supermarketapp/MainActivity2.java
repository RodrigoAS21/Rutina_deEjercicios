package com.Rodrigo.supermarketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

    public void flexiones(View view) {
        Intent flexiones = new Intent(this, MainActivityflexiones.class);
        startActivity(flexiones);
    }

    public void Abdominales(View view) {
        Intent Abdominales = new Intent(this, MainActivityabdominales.class);
        startActivity(Abdominales);
    }

    public void sentadillas(View view) {
        Intent sentadillas = new Intent(this, MainActivitysentadillas.class);
        startActivity(sentadillas);
    }

    public void press_banca(View view) {
        Intent press_banca = new Intent(this, MainActivitypressbanca.class);
        startActivity(press_banca);
    }

    public void actividades(View view) {
        Intent i = new Intent(this, Registro.class);
        startActivity(i);
    }

}