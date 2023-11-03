package org.cmendoza.patronobserver;

public class Universidad extends Observer{

    String nombreUni;

    public Universidad(String nombreUni, Subject sb) {
        super(sb);
        this.nombreUni = nombreUni;
    }

    void showUni(){
        System.out.println("Universidad: " + nombreUni);
    }

    @Override
    void update() {
        showUni();
    }
}
