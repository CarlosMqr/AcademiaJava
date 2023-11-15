package org.cmendoza.ejemplo.list;

import org.cmendoza.ejemplo.modelo.Alumno;

import java.util.*;

public class  EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> alumno = new ArrayList<>();

        alumno.add(new Alumno("Carlos",8));
        alumno.add(new Alumno("jazmin",9));
        alumno.add(new Alumno("Adriana",7));
        alumno.add(new Alumno("Jessy",6));
        alumno.add(new Alumno("Daniela",3));
        alumno.add(new Alumno("Bell",7));
        alumno.add(new Alumno("Bell",7));

        /*Collections.sort(alumno,(a,b) -> b.getNotas().compareTo(a.getNotas()));*//*sirve para ordenar, pero usa el método del Alumno que ordena por notas
                                   también se puede sobreescribir con una función Lambda en el constructor
                                   del Collection.sort()*/

        //otro forma de listar con comparator
        alumno.sort(Comparator.comparing((Alumno a)-> a.getNotas()).reversed());//para imprimir de mayor a menor invocar reversing()


        System.out.println("Iterando con for clasico solo para List<> y LinkedList<> ");
        for (int i = 0; i < alumno.size(); i++) {
            System.out.println(alumno.get(i));
        }











    }
}
