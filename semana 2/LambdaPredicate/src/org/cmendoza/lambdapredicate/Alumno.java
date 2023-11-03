package org.cmendoza.lambdapredicate;

public class Alumno {

    String nombre;
    int edad;
    double promedio;

    public Alumno(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        System.out.print("Nombre " + " Edad " + " Promedio " + "\n");
        return "["+ nombre +"] " + "["+ edad +"] " + " [" + promedio + "]";
    }
}
