package org.cmendoza.patronobserver;

public class Mouse extends Subject{

    void click(){
        notifyObservers();
    }


}
