package com.example.eva_1_app_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        /*Button siguiente = findViewById(R.id.btnSiguiente);
        siguiente.setOnClickListener(v ->
                startActivity(new Intent(Alumnos_act.this, Curso_act.class)));
import android.content.Intent;*/

        // Método OnClick del botón Iniciar Sesión (Login)
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userIngresado = username.getText().toString().trim();
                String passIngresada = password.getText().toString().trim();

                String usuarioValido = usu.getNombre();
                String passValida = usu.getPasswordHash();

                if (userIngresado.equals(usuarioValido) && passIngresada.equals(passValida)) {
                    Intent intent = new Intent(MainActivity.this, Alumnos_act.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}