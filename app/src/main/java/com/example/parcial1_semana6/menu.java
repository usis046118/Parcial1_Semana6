package com.example.parcial1_semana6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    Button EnviarDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        EnviarDatos = (Button) findViewById(R.id.btEnviarDatos);

        EnviarDatos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                Intent packageContext;
                Intent i = new Intent(menu.this, EnviarDatos.class);
                startActivity(i);

            }
        });
    }
}

