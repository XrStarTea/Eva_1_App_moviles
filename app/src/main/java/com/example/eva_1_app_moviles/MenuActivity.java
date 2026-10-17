package com.example.eva_1_app_moviles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import Modelos.*;

public class MenuActivity extends AppCompatActivity {
    Alumno alumno = new Alumno();
    Curso curso = new Curso();
    Nota nota = new Nota();
    Tarea tarea = new Tarea();
    Usuario usuario = new Usuario();
    TextView UNombre, UEmail, UFechaRegistro;
    TextView CNombre, CProfesorId, CHorario;
    TextView TTitulo, TDescripcion, TFechaLimite, TPuntos;
    TextView AMatricula, ACarrera, APromedio, ASemestre;
    TextView NCalificacion, NFechaEntrega, NComentario;

    private Button btn_revelar, btn_volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        btn_volver = findViewById(R.id.btn_volver);
        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btn_revelar = findViewById(R.id.btn_revelar);
        btn_revelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UNombre = findViewById(R.id.UNombre);
                UEmail = findViewById(R.id.UEmail);
                UFechaRegistro = findViewById(R.id.UFechaRegistro);
                CNombre = findViewById(R.id.CNombre);
                CProfesorId = findViewById(R.id.CProfesorId);
                CHorario = findViewById(R.id.CHorario);

                TTitulo = findViewById(R.id.TTitulo);
                TDescripcion = findViewById(R.id.TDescripcion);
                TFechaLimite = findViewById(R.id.TFechaLimite);
                TPuntos = findViewById(R.id.TPuntos);
                AMatricula = findViewById(R.id.AMatricula);
                ACarrera = findViewById(R.id.ACarrera);

                APromedio = findViewById(R.id.APromedio);
                ASemestre = findViewById(R.id.ASemestre);

                NCalificacion = findViewById(R.id.NCalificacion);
                NFechaEntrega = findViewById(R.id.NFechaEntrega);
                NComentario = findViewById(R.id.NComentario);

                UNombre.setText(alumno.getMatricula());
                UEmail.setText(alumno.getCarrera());
                UFechaRegistro.setText(String.valueOf(alumno.getPromedio()));

                CNombre.setText(curso.getNombre());
                CProfesorId.setText(curso.getProfesorid());
                CHorario.setText(curso.getHorario());

                TTitulo.setText(tarea.getTitulo());
                TDescripcion.setText(tarea.getDescripcion());
                TFechaLimite.setText(String.valueOf(tarea.getFechaLimite()));
                TPuntos.setText(String.valueOf(tarea.getPuntos()));

                AMatricula.setText(alumno.getMatricula());
                ACarrera.setText(alumno.getCarrera());
                APromedio.setText(String.valueOf(alumno.getPromedio()));

                ASemestre.setText(String.valueOf(alumno.getSemestre()));

                NCalificacion.setText(String.valueOf(nota.getCalificacion()));
                NFechaEntrega.setText(String.valueOf(nota.getFechaEntrega()));
                NComentario.setText(nota.getComentario());
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}