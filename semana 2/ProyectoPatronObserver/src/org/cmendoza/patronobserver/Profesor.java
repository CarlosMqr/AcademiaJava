package org.cmendoza.patronobserver;

public class Profesor extends Observer {
    String nombre;
    String apellido;

    public Profesor(String nombre, String apellido, Subject sb) {
        super(sb);
        this.nombre = nombre;
        this.apellido = apellido;
    }

    void showProfesor(){
        System.out.println("Profesor: " + nombre + apellido);
    }

    @Override
    void update() {
        showProfesor();
    }
}
