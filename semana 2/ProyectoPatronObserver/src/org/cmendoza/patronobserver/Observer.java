package org.cmendoza.patronobserver;

abstract public class Observer {

    Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        subject.guardar(this);
    }

    abstract void update();
}
