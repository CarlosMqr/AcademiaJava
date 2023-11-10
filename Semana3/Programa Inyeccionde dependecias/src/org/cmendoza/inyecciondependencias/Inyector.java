package org.cmendoza.inyecciondependencias;

public class Inyector {

    static  Alumno getAlumno(){
        //alumno.curso = new CursoJava("Java");
       // alumno.curso = new CursoPython("Python");
       // alumno.setCurso(new CursoJava("Java"));
        ICurso cursoJava = new CursoJava("Java");
        ICurso cursoPython = new CursoPython("python");
        return new Alumno("Carlos","mendoza",cursoJava);
    }

}
