package com.Rodrigo.supermarketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.ImageReader;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivityflexiones extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private String ejercicios [] = {"Flexion normal", "Flexion Dimante", "Flexion Espartana"};
    private String sessiones_y_repeticiones [] = {"3 sessiones de 10 rep.", "3 sessiones de 10 rep.", "3 sessiones de 10 rep."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityflexiones);

        tv1 = (TextView)findViewById(R.id.tv1);
        lv1 = (ListView)findViewById(R.id.lv1);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_lista1,ejercicios);
        lv1.setAdapter(adapter);

        lv1.setOnClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void OnItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("Elejiste" + lv1.getItemAtPosition(i) + "son" + sessiones_y_repeticiones[i] + "cada una");
            }
        });
    }
}