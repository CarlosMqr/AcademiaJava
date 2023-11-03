package org.cmendoza.patronobserver;

public class Curso extends Observer{

    String curso;

    public Curso(String curso, Subject sb) {
        super(sb);
        this.curso = curso;
    }

    void showCurso(){
        System.out.println("Curso: " + curso);
    }

    @Override
    void update() {
        showCurso();
    }
}
