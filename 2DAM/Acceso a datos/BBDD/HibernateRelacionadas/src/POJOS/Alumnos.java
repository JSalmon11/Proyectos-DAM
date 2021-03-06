package POJOS;
// Generated 09-feb-2022 11:07:57 by Hibernate Tools 4.3.1

/**
 * Alumnos generated by hbm2java
 */
public class Alumnos implements java.io.Serializable {

    private int mat;
    private Curso curso;
    private String nombre;

    public Alumnos() {
    }

    public Alumnos(int mat) {
        this.mat = mat;
    }

    public Alumnos(int mat, Curso curso, String nombre) {
        this.mat = mat;
        this.curso = curso;
        this.nombre = nombre;
    }

    public int getMat() {
        return this.mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno: Mat: " + mat + ". Curso: " + curso + " Nombre: " + nombre + '.';
    }

    public String mostrar() {
        return "Alumno: Mat: " + mat + ". Nombre: " + nombre + '.';
    }
}
