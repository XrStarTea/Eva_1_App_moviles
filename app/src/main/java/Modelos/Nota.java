package Modelos;

import java.util.Date;

public class Nota {
    private int id_Nota;
    private String alumnoId;
    private String tareaId;
    private float calificacion;
    private Date fechaEntrega;
    private String comentario;

    // Constructor por defecto con datos de ejemplo
    public Nota() {
        this.id_Nota = 1;
        this.alumnoId = "Nota1";
        this.tareaId = "Nota1";
        this.calificacion = 7.0f;
        this.comentario = "Comentario1";
    }
    // Constructor con parámetros
    public Nota(int id_Nota, String alumnoId, String tareaId, float calificacion, Date fechaEntrega, String comentario) {
        this.id_Nota = id_Nota;
        this.alumnoId = alumnoId;
        this.tareaId = tareaId;
        this.calificacion = calificacion;
        this.fechaEntrega = fechaEntrega;
        this.comentario = comentario;
    }
    // Getters y Setters
    public int getId_Nota() {
        return id_Nota;
    }

    public void setId_Nota(int id_Nota) {
        this.id_Nota = id_Nota;
    }

    public String getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(String alumnoId) {
        this.alumnoId = alumnoId;
    }

    public String getTareaId() {
        return tareaId;
    }

    public void setTareaId(String tareaId) {
        this.tareaId = tareaId;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
