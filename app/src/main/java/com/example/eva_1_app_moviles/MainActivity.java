package com.example.eva_1_app_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import Modelos.Usuario;
import Modelos.*; // <-- trae todas las clases.

public class MainActivity extends AppCompatActivity {

    // Declaro variables para guardar elementos Gráficos
    private EditText username, password;
    private Button boton;

    Usuario usu = new Usuario(); // esta es mi clase.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // llamamos por id del elemento gráfico
        username = findViewById(R.id.etUser); // <-- ese es el id del elemento.
        password = findViewById(R.id.etPass);
        boton = findViewById(R.id.btn);

        // Método OnClick (Hice click al botón ...)
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String usuario = usu.getNombre().toString(); // guardo el dato de clase en mi variable.

                if(username.getText().equals(usuario) && password.getText().equals(usu.getPasswordHash().toString()))
                {
                    // Me desplaza hacia el otro activity. ..
                    Intent i = new Intent(getBaseContext(), Alumnos_act.class);
                    startActivity(i); // inicia el activity.
                }

            }
        });


    }
}