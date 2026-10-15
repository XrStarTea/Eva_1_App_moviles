package Modelos;

import java.util.Date;

public class Alumno {
    private int id_Alumno;
    private String matricula;
    private String carrera;
    private float promedio;
    private String tokenDispositivo;
    private int semestre;

    // Constructor por defecto con datos de ejemplo
    public Alumno() {
        this.id_Alumno = 1;
        this.matricula = "Alumno1";
        this.carrera = "Alumno1@mail.com";
        this.promedio = 7.0f;
        this.semestre = 1;
    }
    // Constructor con parámetros
    public Alumno(int id_Alumno, String matricula, String carrera, float promedio, String tokenDispositivo, int semestre) {
        this.id_Alumno = id_Alumno;
        this.matricula = matricula;
        this.carrera = carrera;
        this.promedio = promedio;
        this.tokenDispositivo = tokenDispositivo;
        this.semestre = semestre;
    }
    // Getters y Setters
    public int getId_Alumno() {
        return id_Alumno;
    }

    public void setId_Alumno(int id_Alumno) {
        this.id_Alumno = id_Alumno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getTokenDispositivo() {
        return tokenDispositivo;
    }

    public void setTokenDispositivo(String tokenDispositivo) {
        this.tokenDispositivo = tokenDispositivo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
