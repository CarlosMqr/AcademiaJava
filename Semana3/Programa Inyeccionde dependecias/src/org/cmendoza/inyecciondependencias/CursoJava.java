package org.cmendoza.inyecciondependencias;

public class CursoJava implements ICurso {

    private String curso;

    public CursoJava(String curso) {
        this.curso = curso;
    }

    @Override
    public void asignarCurso() {
        System.out.println("Curso Asignado: " + curso);

    }
}
