/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohm;

/**
 *
 * @author roger
 */
public class Resistencia {
    
    private double res;

    public Resistencia() {
    }

    public String toString() {
        return "" + res;
    }

    public double Operacion(double num1, double num2) {
        res= num1 / num2;
        return res;
    }
}
