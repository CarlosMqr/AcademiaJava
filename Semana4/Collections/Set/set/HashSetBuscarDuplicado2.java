package org.cmendoza.ejemplo.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetBuscarDuplicado2 {
    public static void main(String[] args) {
        /*
        Programa que detecta elementos duplicados de un HashSet
        y los almacena en otro HashSet
         */
        String[] carros = {"Mazda","Sedan","Lotus","Ferrari","Honda","Sedan","Ferrari","Kia","BMW","Ford","Mazda"};
        Set<String> unicos = new HashSet<>();//conjunto de objetos
        Set<String> duplicados = new HashSet<>();//conjunto de objetos
        for (String carro: carros) {
            if (!unicos.add(carro)){//verifica cuál elemento del arreglo está duplicado,
                                    // ya que el método add retorna un bolean si ya existe un elemento
                duplicados.add(carro);//se agregan los duplicados
            }// fin del if
        }// fin del for
        unicos.removeAll(duplicados);// del Set se eliminan los duplicados

        System.out.println(" elementos unicos: " + unicos);
        System.out.println("elementos duplicados: " + duplicados);




    }
}
