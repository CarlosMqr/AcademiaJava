package org.cmendoza.patronobserver;

public class EjemploPatronObserver {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Alumno alumno = new Alumno("carlos "," Mendoza", mouse);
        Profesor profesor = new Profesor("Juan "," Herrera",mouse);

        mouse.click();

        System.out.println("==============================");
        Curso curso = new Curso("Java",mouse);
        Universidad uni = new Universidad("UAEM",mouse);
        mouse.click();
        mouse.eliminar(curso);
        System.out.println("=============================");
        Curso curso2 = new Curso("Python",mouse);

        mouse.click();


    }
}
