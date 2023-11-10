package org.cmendoza.junit5app.models;

import org.cmendoza.junit5app.exceptions.DineroInsuficienteException;

import java.math.BigDecimal;

public class Cuenta {
    private String persona;
    private BigDecimal saldo;
    private Banco banco;

//////////// CONSTRUCTOR ////////////
    public Cuenta(String persona, BigDecimal saldo){
        this.saldo = saldo;
        this.persona = persona;
    }
/////////// GETTER ANS SETTER //////
    public String getPersona(){
        return this.persona;
    }
    public void setPersona(String carlos){
        this.persona = persona;
    }
    public BigDecimal getSaldo(){
        return this.saldo;
    }
    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }

    public Banco getBanco(){
        return this.banco;
    }
    public void setBanco(Banco banco){
        this.banco= banco;
    }
////////// MÉTODOS ////////////////

    public void debito(BigDecimal monto){
      /* BigDecimal total = new BigDecimal(0);
       total = this.saldo.subtract(monto);*/
        BigDecimal nuevoSaldo = this.saldo.subtract(monto);// devuelve una nueva instancia con la resta
                                                // BigDecimal es inmutable
        /*
        para comparar un BigDecimal con otro BigDecimal debemos usar el metodo comparTo()
         */

        if (nuevoSaldo.compareTo(BigDecimal.ZERO) < 0){
            throw new DineroInsuficienteException("Dinero Insuficiente");
        }
        this.saldo = nuevoSaldo;



    }
    public void credito(BigDecimal monto){
        this.saldo = this.saldo.add(monto);

    }


    @Override
    public boolean equals(Object obj) {
        if ((obj == null) || !(obj instanceof Cuenta)){
            return false;
        }
        Cuenta c = (Cuenta) obj;
        if (this.persona == null || this.saldo== null){// compara persona y saldo de la clase cuenta con el cast de obj persona y saldo
            return false;
        }
        return this.persona.equals(c.getPersona()) && this.saldo.equals(c.getSaldo());
    }
}
