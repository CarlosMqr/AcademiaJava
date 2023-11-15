package org.cmendoza.ejemplo.map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        /*
        no es una lista, pero noms permite guardar una lista de objetos
        usa el método equal y hasCode para verificar si las llaves son iguales
        map no es ordenado
         */

        Map<String, String> persona = new HashMap<>();
        persona.put("nombre","Carlos");//agregar objetos
        persona.put("apellido","Mendoza");
        persona.put("email","carlosm@gmail.com");
        persona.put("edad","27");

        //System.out.print(persona.get("nombre"));
        //System.out.print(persona.get("apellido"));

        //eliminar
        //persona.remove("apellido");
       // System.out.println(persona);

        //contiene key
        System.out.println("==============containsKey================");
        System.out.print("contiene la llave? ");
        System.out.println(persona.containsKey("apellido"));
        //contiene valor?
        System.out.print("contiene al objeto Mendoza? ");
        System.out.println(persona.containsValue("Mendoza"));

        //se guardan en una colección de valores
        System.out.println("================imprimir valores==============");
        Collection<String> valores = persona.values();
        for (String val: valores) {
            System.out.println(val);
        }

        //imprimir las llaves del map
        System.out.println("================imprimir llaves==============");
        Set<String> llaves = persona.keySet();
        for (String k:llaves) {
            System.out.println("llaves del map: " + k);
        }

        //para iterar con llaves y valores
        System.out.println("================imprimir llaves y valores==============");
        for (Map.Entry<String,String> par: persona.entrySet()){
            System.out.println(par.getKey() + ": Valor: " + par.getValue());

        }

        //for sencillo
        System.out.println("==========for sencillo===========");
        for (String llave: persona.keySet()) {
            String valor = persona.get(llave);
            System.out.println(llave + " valor: " + valor);
        }

        System.out.println("==========expresión lambda===========");
        persona.forEach((llave,valor) -> {
            System.out.println(llaves + " => " + valor);
        });

        System.out.println("total de elementos: ");
        System.out.println(persona.size());

        System.out.println("=======remplazar===========");
        persona.replace("nombre","Jazmin");
        System.out.println(persona);


    }
}
