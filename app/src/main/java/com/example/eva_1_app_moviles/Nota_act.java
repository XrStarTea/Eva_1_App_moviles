package com.example.eva_1_app_moviles;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import Modelos.Nota;

public class Nota_act extends AppCompatActivity {

    private TextView txtNota;
    private Button btnNota;
    Nota nota = new Nota();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nota);

        txtNota = findViewById(R.id.txtNota);
        btnNota = findViewById(R.id.btnNota);

        btnNota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNota.setText("ID Nota: " + nota.getId_Nota() + "\n" +
                        "Alumno ID: " + nota.getAlumnoId() + "\n" +
                        "Tarea ID: " + nota.getTareaId() + "\n" +
                        "CalificaciÃ³n: " + nota.getCalificacion() + "\n" +
                        "Comentario: " + nota.getComentario());
            }
        });
    }
}