package org.cmendoza.ejemplo.set;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        /*
        el TreeSet ordena
        y no se puede colocar cualquier objeto tiene que usar la Interfaz Comparable
        y en método usar el compareTo de lo contrario lanzara error
         */
        Set<String> ts = new TreeSet<>();
        ts.add("cinco");
        ts.add("tres");
        ts.add("uno");
        ts.add("cuatro");
        ts.add("dos");
        System.out.println(ts);

        //expresión Lamda
        Set<Integer> numeros = new TreeSet<>((a,b) ->{
                    return b.compareTo(a);
        });//ordena de mayor a menor
        numeros.add(2);
        numeros.add(4);
        numeros.add(5);
        numeros.add(3);
        numeros.add(1);
        System.out.println("numeros = " + numeros);
        boolean b = numeros.add(2);
        System.out.println("Permite duplicados? " + b);


        System.out.println("pasa duplicados a otro TreeSet");
        Integer[] Arrnumeros = {1,2,3,4,5,6,7,8,9,10,5,8,1};
        Set<Integer> unicos = new TreeSet<>(Comparator.reverseOrder());//otra forma de ordenar un treeSet (mayor a menor)
        Set<Integer> duplicados = new TreeSet<>();

        for (Integer nums: Arrnumeros) {
            if (!unicos.add(nums)){
                duplicados.add(nums);
            }
        }

        System.out.println("duplicados = " + duplicados);
        System.out.println("unicos = " + unicos);

    }
}
