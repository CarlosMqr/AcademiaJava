package org.cmendoza.inyecciondependencias;

public class EjemploInyeccionDep {
    public static void main(String[] args) {
        //Alumno al = new Alumno("Carlos","Mendoza");
        Alumno al = Inyector.getAlumno();
        al.asignaCurso();




    }
}
