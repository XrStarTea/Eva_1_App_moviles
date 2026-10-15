package com.example.eva_1_app_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import Modelos.Alumno;

public class Alumnos_act extends AppCompatActivity {


    private TextView metadata;
    private Button boton;

    Alumno alumn = new Alumno();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumnos);

        metadata = findViewById(R.id.txt);
        boton = findViewById(R.id.btnAlumnos);

        // MÃ©todo OnClick
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String matricula = alumn.getMatricula().toString();
                Float Promedio = alumn.getPromedio(); // este es float
                String carrera = alumn.getCarrera().toString();

                metadata.setText(
                        "EL promedio del Alumno es: " + Promedio +  "\n"
                                +  "La matricula es: " + matricula + "\n" +
                                "Estudi la carrera de: " + carrera);
            }
        });


    }
}