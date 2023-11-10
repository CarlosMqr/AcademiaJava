package org.cmendoza.junit5app.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nombreBanco;
    private List<Cuenta> cuentas;// siempre se tiene que inicializar de lo contrario lanza un .NullPointerException:  because "this.cuentas" is null

//////////// CONSTRUCTOR ////////////
    public Banco(){
        this.cuentas = new ArrayList<>();
    }
/////////// GETTER ANS SETTER //////
    public String getNombreBanco(){
        return this.nombreBanco;
    }
    public void setNombreBanco(String nombreBanco){
        this.nombreBanco = nombreBanco;
    }
    public List<Cuenta> getCuentas(){
        return this.cuentas;
    }
    public void setCuentas(List<Cuenta> cuentas){
        this.cuentas = cuentas;
    }
////////// MÉTODOS ////////////////
    public void addCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
        cuenta.setBanco(this);
    }
public void Trasnferir(Cuenta origen, Cuenta destino, BigDecimal monto){
        origen.debito(monto);
        destino.credito(monto);

}

}
