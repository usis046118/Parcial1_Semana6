package com.example.parcial1_semana6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class bienvenido extends AppCompatActivity {

    Button Siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bienvenido);
        Siguiente = (Button) findViewById(R.id.btSiguiente);

        Siguiente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                Intent packageContext;
                Intent i = new Intent(bienvenido.this, menu.class);
                startActivity(i);

            }
        });
    }
}




















