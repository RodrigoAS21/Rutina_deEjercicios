package com.Rodrigo.supermarketapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Continuar(View view){
        Intent continuar = new Intent(this,MainActivity2.class);
        startActivity(continuar);
    }

    /*public void Iriniciar (View view) {
        Intent iniciar = new Intent(this, IniciarSesionActivity.class);
        startActivity(iniciar);
    }
    public void IrRegistrarse (View view) {
        Intent i = new Intent(this, RegistrarseActivity.class);
        startActivity(i);
    }*/

}