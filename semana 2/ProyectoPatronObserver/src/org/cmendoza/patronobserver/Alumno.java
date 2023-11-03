package org.cmendoza.patronobserver;

public class Alumno extends Observer {
    String nombre;
    String apellido;

    public Alumno(String nombre, String apellido, Subject sb) {
        super(sb);
        this.nombre = nombre;
        this.apellido = apellido;
    }

    void showAlumno(){
        System.out.println("Alumno: " + nombre + apellido);
    }


    @Override
    void update() {
        showAlumno();
    }
}
