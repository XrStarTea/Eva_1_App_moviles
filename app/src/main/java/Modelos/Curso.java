package Modelos;

public class Curso {
    private int id_Curso;
    private String nombre;
    private String codigo;
    private String profesorid;
    private int creditos;
    private String horario;

    // Constructor por defecto con datos de ejemplo
    public Curso() {
        this.id_Curso = 1;
        this.nombre = "Curso1";
        this.codigo = "Curso1";
        this.profesorid = "ProfesorID1";
        this.creditos = 1;
        this.horario = "horario1";
    }
    // Constructor con parámetros
    public Curso(int id_Curso, String nombre, String codigo, String profesorid, int creditos, String horario) {
        this.id_Curso = id_Curso;
        this.nombre = nombre;
        this.codigo = codigo;
        this.profesorid = profesorid;
        this.creditos = creditos;
        this.horario = horario;
    }
    // Getters y Setters
    public int getId_Curso() {
        return id_Curso;
    }

    public void setId_Curso(int id_Curso) {
        this.id_Curso = id_Curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfesorid() {
        return profesorid;
    }

    public void setProfesorid(String profesorid) {
        this.profesorid = profesorid;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
