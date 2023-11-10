package org.cmendoza.junit5app.models;


import org.cmendoza.junit5app.exceptions.DineroInsuficienteException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {
    @DisplayName("es nombre de la cuenta")
    @Test
    void testNombreCuenta(){
        //en el bigDecimal es mejor poner el número como String
        Cuenta cuenta = new Cuenta("Carlos", new BigDecimal("1000.12345"));//Primero instanciar la clase
        //cuenta.setPersona("Carlos");
        //segundo afirmar
        String esperado = "Carlos";// esperado
        // vs realizada
        String real = cuenta.getPersona();

        assertEquals(esperado,real);
        assertTrue(real.equals("Carlos"));

    }
    @Test
    void saldoCuenta(){
        Cuenta cuenta = new Cuenta("Jazmin", new BigDecimal("1000.12345"));
        assertEquals(1000.12345,cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ONE) < 0);
    }

    @Test
    void testReferenciaCuenta() {
        Cuenta cuenta = new Cuenta("Carlos",new BigDecimal("8900.9997"));
        Cuenta cuenta2 = new Cuenta("Carlos",new BigDecimal("8900.9997"));
        //assertNotEquals(cuenta2,cuenta);
        assertEquals(cuenta2,cuenta);
    }

     // primero probamos y después implementamos el código,
    // ya que el metodo débito no realiza ninguna funcion
    @Test
    void debitoCuenta() {
        Cuenta cuenta = new Cuenta("jazmin",new BigDecimal("1000.12345"));
        cuenta.debito(new BigDecimal(100));// se va restar 100 de 1000.12345 nuestra cuenta
        assertNotNull(cuenta.getSaldo());
        assertEquals(900,cuenta.getSaldo().intValue());
        assertEquals("900.12345", cuenta.getSaldo().toPlainString());//toPlainString() devuelve el String plano con el valor del saldo
    }

    @Test
    void creditoCuenta() {
        Cuenta cuenta = new Cuenta("jazmin",new BigDecimal("1000.12345"));
        cuenta.credito(new BigDecimal(100));// se va restar 100 de 1000.12345 nuestra cuenta
        assertNotNull(cuenta.getSaldo());
        assertEquals(1100,cuenta.getSaldo().intValue());
        assertEquals("1100.12345", cuenta.getSaldo().toPlainString());//toPlainString() devuelve el String plano con el valor del saldo
    }

    @Test
    void testDineroInsuficienteException() {
        Cuenta cuenta = new Cuenta("Jazmin",new BigDecimal("1000.12345"));
        Exception exception = assertThrows(DineroInsuficienteException.class,()->{// devuelve el objeto de la excepcion
            cuenta.debito(new BigDecimal(1500));
        });// recibe dos argumentos 1 el nombre de la clase

        String actual = exception.getMessage();
        String esperado = "Dinero Insuficiente";
        assertEquals(esperado, actual);
    }

    @Test
    void TransferirDinero() {
        Cuenta cuentaDestino = new Cuenta("Jazmin",new BigDecimal("2500"));
        Cuenta cuentaOrigen = new Cuenta("Carlos",new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.setNombreBanco("Santander");
        /*String esperado = "Santander";
        String real = banco.getNombreBanco();
        assertEquals(esperado,real);*/
        banco.Trasnferir(cuentaOrigen,cuentaDestino,new BigDecimal(500));
        assertEquals("1000.8989",cuentaOrigen.getSaldo().toPlainString());// verifica que el saldo esperado sea igual al saldo de la cuenta origen
        assertEquals("3000",cuentaDestino.getSaldo().toPlainString());// verifica que el saldo de la cuenta destino sea el saldo esperado

    }

    @Test
    void relacionBancoCuentas() {
        Cuenta cuentaDestino = new Cuenta("Jazmin",new BigDecimal("2500"));
        Cuenta cuentaOrigen = new Cuenta("Carlos",new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.addCuenta(cuentaDestino);//metodo para agregar cuentas al banco
        banco.addCuenta(cuentaOrigen);

        assertEquals(2,banco.getCuentas().size());// espera dos cuentas y verifica que la lista tenga dos cuentas

        banco.setNombreBanco("Santander");

        banco.Trasnferir(cuentaOrigen,cuentaDestino,new BigDecimal(500));
        assertEquals("1000.8989",cuentaOrigen.getSaldo().toPlainString());// verifica que el saldo esperado sea igual al saldo de la cuenta origen menos 500
        assertEquals("3000",cuentaDestino.getSaldo().toPlainString());// verifica que el saldo de la cuenta destino sea el saldo esperado más 500

        assertEquals("Santander",cuentaDestino.getBanco().getNombreBanco());//relacion inversa de banco con la cuenta


        assertEquals("Jazmin",banco.getCuentas().stream().filter(c ->c.getPersona().equals("Jazmin")).findFirst().get().getPersona());
        assertTrue(banco.getCuentas().stream().anyMatch(c ->c.getPersona().equals("Jazmin")));// verifica que Jazmin este dentro de las cuentas

    }





}