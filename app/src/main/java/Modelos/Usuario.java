package Modelos;

import java.util.Date;

public class Usuario {
    private int id_Usuario;
    private String nombre;
    private String email;
    private String passwordHash;
    private Date fechaRegistro;
    private boolean activo;

    // Constructor por defecto con datos de ejemplo
    public Usuario() {
        this.id = 1;
        this.nombre = "Usuario1";
        this.email = "Usuario1@mail.com";
        this.passwordHash = "Usuario1122";
    }
    // Constructor con parámetros
    public Usuario(int id_Usuario, String nombre, String email, String passwordHash, Date fechaRegistro, boolean activo) {
        this.id_Usuario = id_Usuario;
        this.nombre = nombre;
        this.email = email;
        this.passwordHash = passwordHash;
        this.fechaRegistro = fechaRegistro;
        this.activo = activo;
    }
    // Getters y Setters
    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
