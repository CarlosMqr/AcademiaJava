package org.cmendoza.patronobserver;

import java.util.ArrayList;
import java.util.List;

abstract public class Subject {

    List<Observer> listObservers = new ArrayList<>();

    void guardar(Observer observer){
        listObservers.add(observer);
    }

    void eliminar(Observer observer){
        listObservers.remove(observer);
    }

    void notifyObservers(){
        for (Observer observer: listObservers) {
            observer.update();
        }
    }





}
