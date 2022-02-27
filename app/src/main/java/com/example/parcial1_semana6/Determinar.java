package com.example.parcial1_semana6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Determinar extends AppCompatActivity {

    Integer estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinar);

        TextView Nombre = (TextView)findViewById(R.id.tvNombreReci);
        TextView Edad = (TextView)findViewById(R.id.tvEdadReci);
        TextView Estado = (TextView)findViewById(R.id.tvEstado);
        Button bVolver = (Button)findViewById(R.id.btVolver);

        Bundle datosRecibidos = this.getIntent().getExtras();
        String nombre = datosRecibidos.getString("pNombre");
        String edad = datosRecibidos.getString("pEdad");

        Nombre.setText("Tu Nombre Es: " + nombre);
        Edad.setText("Tu Edad Es: " + edad);

        estado = Integer.parseInt(edad);

        if(estado < 18){
            Estado.setText("Eres Menor De Edad");
        }else{
            Estado.setText("Eres Mayor De Edad");
        }

        bVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vuelva = new Intent(Determinar.this,EnviarDatos.class);
                startActivity(vuelva);
            }
        });
    }
}