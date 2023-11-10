package org.cmendoza.inyecciondependencias;

public class CursoPython implements ICurso {
    String curso;

    public CursoPython(String curso) {
        this.curso = curso;
    }

    @Override
    public void asignarCurso() {
        System.out.println("Curso Asignado: " + curso);
    }
}
