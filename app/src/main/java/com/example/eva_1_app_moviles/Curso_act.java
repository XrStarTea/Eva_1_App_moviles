package com.example.eva_1_app_moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import Modelos.Curso;

public class Curso_act extends AppCompatActivity {

    private EditText curso;
    private TextView creditos;
    private Button btn;
    Curso cur = new Curso();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso);

        curso = findViewById(R.id.etCurso);
        creditos = findViewById(R.id.txtComprobar);
        btn = findViewById(R.id.btnComprobar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String cursos = curso.getText().toString();

                // Sentencias de Control ... nivel 2 del IF ....
                switch(cursos) {
                    case "Java":
                        creditos.setText("Los créditos en JAVA son: "  + cur.getCreditos());
                        break;
                    case "Python":
                        creditos.setText("Los créditos en Python son: " + 3);
                        break;
                    default:  // si no es ningún curso,
                        creditos.setText("Porfavor escoja un curso :,v ");
                }

            }
        });

    }
}