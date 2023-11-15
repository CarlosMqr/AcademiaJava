package org.cmendoza.ejemplo.map;


import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {
        /*
        no es una lista, pero noms permite guardar una lista de objetos
        usa el método equal y hasCode para verificar si las llaves son iguales
        map no es ordenado

        también los map pueden tener relación de objetos
        no puede tener llaves nulas el TreeMap
         */

        Map<String, Object> persona = new TreeMap<>((a,b) -> b.compareTo(a));
        persona.put("nombre","Carlos");//agregar objetos
        persona.put("apellido","Mendoza");
        persona.put("email","carlosm@gmail.com");
        persona.put("edad","27");

        Map<String, String> direccion = new TreeMap<>(Comparator.reverseOrder());
        direccion.put("pais","México");
        direccion.put("estado","estado de méxico");
        direccion.put("municipio","texcoco");
        direccion.put("calle","one Street");
        direccion.put("numero","106");

        persona.put("direccion",direccion);//se enviá un tipo objeto a persona
        System.out.println(persona);
        System.out.println(direccion);

    }
}
