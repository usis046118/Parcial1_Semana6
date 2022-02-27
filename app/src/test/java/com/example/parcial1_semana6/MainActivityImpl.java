package com.example.parcial1_semana6;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bienvenido);

// Crear objetos que enlazan con los componentes
        final EditText tNombre = (EditText)this.findViewById(R.id.etNombre);
        final EditText tApellido = (EditText)this.findViewById(R.id.etApellido);
        Button bDatos = (Button)this.findViewById(R.id.btEnviarDatos);

// Crear el método Clic para el botón
        bDatos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
// Crear las variables que reciben los datos
                String nom = tNombre.getText().toString();
                String ape = tApellido.getText().toString();


// Primera salida utilizando Toast//

                Toast.makeText( getApplicationContext(),"Tu nombre es: "+nom+" "+ape, Toast.LENGTH_LONG).show();

            }
        });

    }
    public void siguiente(view view, Bundle savedInstanceState) {
        Intent siguiente = new Intent(this, dos.class);
        startActivity(siguiente);



        // Codigo fuente de la pantalla//
        final EditText tNombre = (EditText) this.findViewById(R.id.etNombre);
        final EditText tApellido = (EditText) this.findViewById(R.id.etApellido);
        Button bDatos = (Button) this.findViewById(R.id.btEnviarDatos);


        bDatos.setOnClickListener(new View.OnClickListener() {

            //  Crear en metodo Clic para el boton//

            @Override
            public void onClick(View view) {

                String nom = tNombre.getText().toString();
                String ape = tApellido.getText().toString();

// Primera salida utilizando Toast//

                Toast.makeText(getApplicationContext(), "Tu nombre es: " + nom + " " + ape, Toast.LENGTH_LONG).show();

            }
        });

    }


}
