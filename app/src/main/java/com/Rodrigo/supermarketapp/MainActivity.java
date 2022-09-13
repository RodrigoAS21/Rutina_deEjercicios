package com.Rodrigo.supermarketapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void MainActivity2(View view){
        Intent MainActivity2 = new Intent(this, com.Rodrigo.supermarketapp.MainActivity2.class);
        StartActivity();
    }

    private void StartActivity() {
    }
}