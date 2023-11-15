package org.cmendoza.ejemplo.set;

import org.cmendoza.ejemplo.modelo.Alumno;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

       // Set<Alumno> alumno = new TreeSet<>((a,b) -> b.getNotas().compareTo(a.getNotas()));// todos los elementos que se agreguen tiene que implementar comparable
        //en el constructor del TreeSet crear una expresión Lambda para comparar por nombre o notas
        // sobreescribe el método de la clase Alumno
        Set<Alumno> alumno = new TreeSet<>(Comparator.comparing((Alumno::getNombre)).reversed());//forma corta
        alumno.add(new Alumno("Carlos",8));
        alumno.add(new Alumno("jazmin",9));
        alumno.add(new Alumno("Adriana",7));
        alumno.add(new Alumno("Jessy",6));
        alumno.add(new Alumno("Daniela",3));
        alumno.add(new Alumno("Bell",7));

        System.out.println("alumno = " + alumno);











    }
}
