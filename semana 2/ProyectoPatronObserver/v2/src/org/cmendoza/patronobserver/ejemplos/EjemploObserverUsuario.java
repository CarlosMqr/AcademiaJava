package org.cmendoza.patronobserver.ejemplos;

import org.cmendoza.patronobserver.UsuarioRepositorio;

public class EjemploObserverUsuario {
    public static void main(String[] args) {

        UsuarioRepositorio repo = new UsuarioRepositorio();

        repo.addObserver((o,u)-> System.out.println("Envia un email al usuario " + u));
        repo.addObserver((o,u)-> System.out.println("Enviando un email al admionsitrador"));
        repo.addObserver((o,u)-> System.out.println("Guardando la info del usuario " + u + " en el logs"));

        repo.crearUsuario("Carlos");

    }
}
