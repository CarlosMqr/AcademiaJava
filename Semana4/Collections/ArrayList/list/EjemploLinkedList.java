package org.cmendoza.ejemplo.list;

import org.cmendoza.ejemplo.modelo.Alumno;
import java.util.LinkedList;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        enlazada.add(new Alumno("Carlos",8));
        enlazada.add(new Alumno("jazmin",9));
        enlazada.add(new Alumno("Adriana",7));
        enlazada.add(new Alumno("Jessy",6));
        enlazada.add(new Alumno("Daniela",3));



        //obtiene el total objetos de la lista
        System.out.println(enlazada + " Método size() " + enlazada.size());

        enlazada.addFirst(new Alumno("Bell",10));//agrega al principio
        enlazada.addLast(new Alumno("Miriam",11));//agrega al ultimo
        System.out.println(enlazada);

        //obtiene el primer elemento de la lista y no lanza error
        System.out.println("Primer elemento: " + enlazada.peekFirst());
        //obtiene el último elemento de la lista y no lanza error-
        System.out.println("último elemento: " + enlazada.peekLast());

        System.out.println("Obtener por indice");
        System.out.println(enlazada.get(2));

        System.out.println("\n remover");
        //elimina el primer elemento y retorna null si no existe
        System.out.println(enlazada.pollFirst());
        System.out.println(enlazada);

        //elimina el último elemento y retorna null si no existe
        System.out.println(enlazada.pollLast());
        System.out.println(enlazada);

        //remover por indice
        //enlazada.remove(new Alumno());

        //busca por objeto
        Alumno a = new Alumno("Carlos",8);
        System.out.println("El indice: " + enlazada.indexOf(a) + " Pertenece a: " + enlazada.peekFirst());

       // froma de imprimir con while la LinkedList
        ListIterator<Alumno> li = enlazada.listIterator();
        while (li.hasNext()){
            Alumno alu = li.next();
            System.out.println(alu);
        }
        System.out.println("\nal reves");
         //imprimir al reves
        while (li.hasPrevious()){
            Alumno al = li.previous();
            System.out.println(al);
        }



















    }
}
