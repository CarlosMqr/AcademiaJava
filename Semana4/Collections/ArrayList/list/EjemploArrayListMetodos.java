package org.cmendoza.ejemplo.list;

import org.cmendoza.ejemplo.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayListMetodos {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        al.add(new Alumno("Carlos",8));
        al.add(0,new Alumno("jazmin",9));//indicamos que Jazmin con la posición 1 pase a la posición 0
        al.add(new Alumno("Adriana",7));
        al.add(new Alumno("Jessy",6));
        al.add(new Alumno("Daniela",3));
        al.add(new Alumno("Bell",10));
        al.set(3,new Alumno("Araceli",16));//el set modifica quita a jessy y deja a araceli

        //obtiene el total objetos de la lista
        System.out.println(al + " Método size() " + al.size());

        //Método para indicar si está vacía la lista
        System.out.println("¿Esta Vacía la lista? " + al.isEmpty());

        al.sort(Comparator.comparing((Alumno a)->a.getNotas()).reversed());
        al.forEach(System.out::println);
        //al.forEach(alu -> System.out.println(alu));

        //para eliminar tiene que ser idéntico cuando es por objeto
        al.remove(new Alumno("Araceli",16));//el remove utiliza el equals que se implementó en la clase Alumno
        System.out.println(al + "size = " + al.size());

        //contains
        boolean b = al.contains(new Alumno("jazmin",9));//tiene que ser idéntico usa el método equal
        System.out.println("La lista contiene a Jazmin? " + b);

        //convertir la lista a un arreglo
        System.out.println("convertir una lista a un arreglo");
        Object o [] = al.toArray();
        for (Object ob: al) {
            System.out.println("ob = " + ob);
        }

















    }
}
