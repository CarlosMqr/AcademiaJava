package org.cmendoza.lambdapredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EjemploLambdaPredicate {
    public static void main(String[] args) {
        boolean r;

        Alumno[] alumnos = new Alumno[5];
        alumnos[0] = new Alumno("Carlos",20,8.5);
        alumnos[1] = new Alumno("Pedro",20,8.5);
        alumnos[2] = new Alumno("Lalo",20,8.5);
        alumnos[3] = new Alumno("Jessy",20,8.5);
        alumnos[4] = new Alumno("Daniela",20,8.5);

        List<Alumno> listAlumn = Arrays.asList(alumnos);

        //System.out.println("Materia");
        //show(listAlumn, st -> st.getPromedio() > 7.5);

       // System.out.println("Mayor de edad?:");
        //show(listAlumn,st -> st.edad > 18);

        System.out.println("Cantidade de letras en nombre mayor a 5");
        show(listAlumn,st->st.nombre.length() > 5);






    }

    private static void show(List<Alumno> listAlumn, Predicate<Alumno> predicate) {
        boolean r;
        for (Alumno al: listAlumn) {
            r = predicate.test(al);
            System.out.println(al + " : " + r);

        }
    }
}
