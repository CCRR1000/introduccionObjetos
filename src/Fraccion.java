/**
 * 7. Crea una clase Fraccion con métodos para sumar, restar, multiplicar y dividir fracciones.
 */
package src;

public class Fraccion {
    
    private int num1, denom1, num2, denom2, numeradorResultado, denominadorResultado;
    private double resultado;

    public Fraccion(int numerador1, int denominador1, int numerador2, int denominador2) {
        num1 = numerador1;
        denom1 = denominador1;
        num2 = numerador2;
        denom2 = denominador2;
    }

    public double sumar() {

        if (denom1 == denom2) {
            numeradorResultado = num1 + num2;
            resultado = (double) numeradorResultado / denom1;
        } else {
            numeradorResultado = num1*denom2 + num2*denom1;
            denominadorResultado = denom1 * denom2;
            resultado = (double) numeradorResultado / denominadorResultado;
        }
        return resultado;
    }

    public double restar() {
        
        if (denom1 == denom2) {
            numeradorResultado = num1 - num2;
            resultado = (double) numeradorResultado / denom1;
        } else {
            numeradorResultado = num1*denom2 - num2*denom1;
            denominadorResultado = denom1 * denom2;
            resultado = (double) numeradorResultado / denominadorResultado;
        }
        return resultado;
    }

    public double multiplicar() {
        numeradorResultado = num1 * num2;
        denominadorResultado = denom1 * denom2;
        double resultado = (double) numeradorResultado / denominadorResultado;
        return resultado;
    }

    public double dividir() {
        numeradorResultado = num1 * denom2;
        denominadorResultado = denom1 * num2 ;
        double resultado = (double) numeradorResultado / denominadorResultado;
        return resultado;
    }

    public int getNum1() {
        return num1;
    }
    
    public void setNum1(int _num1) {
        num1 = _num1;
    }

    public int getDenom2() {
        return denom2;
    }

    public void setDenom2(int _denom2) {
        denom2 = _denom2;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int _num2) {
        num2 = _num2;
    }

    public int getDenom1() {
        return denom1;
    }

    public void setDenom1(int _denom1) {
        denom1 = _denom1;
    }


    public int getNumeradorResultado() {
        return numeradorResultado;
    }

    public void setNumeradorResultado(int _numeradorResultado) {
        numeradorResultado = _numeradorResultado;
    }

    public int getDenominadorResultado() {
        return denominadorResultado;
    }

    public void setDenominadorResultado(int _denominadorResultado) {
        denominadorResultado = _denominadorResultado;
    }



   


}
