package com.example.eva_1_app_moviles;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import Modelos.Tarea;

public class Tarea_act extends AppCompatActivity {

    private TextView txtTarea;
    private Button btnTarea;
    Tarea tar = new Tarea();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea);

        txtTarea = findViewById(R.id.txtTarea);
        btnTarea = findViewById(R.id.btnTarea);

        btnTarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtTarea.setText("ID: " + tar.getId_Tarea() + "\n" +
                        "Título: " + tar.getTitulo() + "\n" +
                        "Descripción: " + tar.getDescripcion() + "\n" +
                        "Puntos: " + tar.getPuntos() + "\n" +
                        "Curso ID: " + tar.getCursoId());
            }
        });
    }
}