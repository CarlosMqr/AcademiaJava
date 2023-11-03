package org.cmendoza.patronobserver.ejemplos;

import org.cmendoza.patronobserver.Cooporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Cooporacion google = new Cooporacion("Google",1000);

        google.addObserver((observable,obj) -> {
            System.out.println("carlos: " + observable);
        });


        google.addObserver((observable,obj) -> {
            System.out.println("daniela: " + observable);
        });


        google.addObserver((observable,obj) -> {
            System.out.println("Dan: " + observable);
        });


        google.modificaPrecio(200);















    }
}
