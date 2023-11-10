package org.cmendoza.inyecciondependencias;

public class Alumno {
    private String nombre;
    private String apellido;

    private ICurso curso;
    public Alumno(String nombre, String apellido, ICurso curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
    }

    /*public ICurso getCurso() {
        return curso;
    }

    public void setCurso(ICurso curso) {
        this.curso = curso;
    }*/

    void asignaCurso(){
        System.out.println(nombre + " " + apellido);
        curso.asignarCurso();
    }
}
