package org.cmendoza.ejemplo.map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMapRObjetos {
    public static void main(String[] args) {
        /*
        no es una lista, pero noms permite guardar una lista de objetos
        usa el método equal y hasCode para verificar si las llaves son iguales
        map no es ordenado

        también los map pueden tener relación de objetos
         */

        Map<String, Object> persona = new HashMap<>();
        persona.put("nombre","Carlos");//agregar objetos
        persona.put("apellido","Mendoza");
        persona.put("email","carlosm@gmail.com");
        persona.put("edad","27");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais","México");
        direccion.put("estado","estado de méxico");
        direccion.put("municipio","texcoco");
        direccion.put("calle","one Street");
        direccion.put("numero","106");

        persona.put("direccion",direccion);//se enviá un tipo objeto a persona

        System.out.print(persona.get("nombre"));
        System.out.print(persona.get("apellido"));

        //eliminar
        persona.remove("apellido");
        System.out.println(persona);

        //contiene key
        System.out.println("==============containsKey================");
        System.out.print("contiene la llave? ");
        System.out.println(persona.containsKey("apellido"));
        //contiene valor?
        System.out.print("contiene al objeto Mendoza? ");
        System.out.println(persona.containsValue("Mendoza"));

        //se guardan en una colección de valores
        System.out.println("================imprimir valores==============");
        Collection<Object> valores = persona.values();
        for (Object val: valores) {
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
        for (Map.Entry<String, Object> par: persona.entrySet()){
            Object valor = par.getValue();
            if (valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El pais de " + nom + " es " + direccionMap.get("pais"));
                System.out.println("El estado de " + nom + " es " + direccionMap.get("estado"));
                System.out.println("El municipio de " + nom + " es " + direccionMap.get("municipio"));
            }
            System.out.println(par.getKey() + ": Valor: " + valor);

        }

        //for sencillo
        System.out.println("==========for sencillo===========");
        for (String llave: persona.keySet()) {
            Object valor = persona.get(llave);
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

        System.out.println("relación de map");
        Map<String,String> dPersona = (Map<String, String>) persona.get("direccion");
        String pais = dPersona.get("pais");
        String estado = dPersona.get("estado");
        String calle = dPersona.get("calle");
        String numero = dPersona.get("numero");
        String municipio = dPersona.get("municipio");
        System.out.println("El pais de " + persona.get("nombre") + " es " + pais
        + " vive en el estado de " + estado + " en el municipio de " + municipio +  " en la calle " + calle + " con numero " + numero);


    }
}
