package com.Rodrigo.supermarketapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import registro.IngresoDatos;

public class Registro extends AppCompatActivity {

    private CalendarView calendarView;
    private EditText caloriasDiarias;
    private EditText kmDiarias;
    private TextView fecha_actividad;
    private Button guardar;



    private FirebaseDatabase database;
    private DatabaseReference myRef;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        calendarView = findViewById(R.id.calendarView);
        caloriasDiarias = findViewById(R.id.text_calorias);
        kmDiarias = findViewById(R.id.text_km);
        fecha_actividad = findViewById(R.id.text_fecha);

        guardar = findViewById(R.id.button_agregar);



        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Registro Actividad");


        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String fechaSeleccionada = dayOfMonth+"/"+month+"/"+year;




                fecha_actividad.setText(fechaSeleccionada);



            }
        });

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarActividadDiaria(fecha_actividad.getText().toString(), caloriasDiarias.getText().toString(), kmDiarias.getText().toString());
                myRef.setValue("Se a guardado correctamente");
                Toast.makeText(Registro.this, "Se a guardado correctamente", Toast.LENGTH_SHORT).show();
            }

        });



    }
    public void guardarActividadDiaria(String fecha, String calorias, String km){
        IngresoDatos ingresoDatos = new IngresoDatos(fecha, calorias, km);






                }


    }
