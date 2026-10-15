package Modelos;

import java.util.Date;

public class Tarea {
    private int id_Tarea;
    private String titulo;
    private String descripcion;
    private Date fechaLimite;
    private int puntos;
    private String cursoId;

    // Constructor por defecto con datos de ejemplo
    public Tarea() {
        this.id_Tarea = 1;
        this.titulo = "Tarea1";
        this.descripcion = "Tarea1";
        this.puntos = 7;
        this.cursoId = "1";
    }
    // Constructor con parámetros

    public Tarea(int id_Tarea, String titulo, String descripcion, Date fechaLimite, int puntos, String cursoId) {
        this.id_Tarea = id_Tarea;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.puntos = puntos;
        this.cursoId = cursoId;
    }
    // Getters y Setters

    public int getId_Tarea() {
        return id_Tarea;
    }

    public void setId_Tarea(int id_Tarea) {
        this.id_Tarea = id_Tarea;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getCursoId() {
        return cursoId;
    }

    public void setCursoId(String cursoId) {
        this.cursoId = cursoId;
    }
}
