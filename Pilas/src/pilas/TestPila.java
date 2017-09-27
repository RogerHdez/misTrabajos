/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author roger
 */
public class TestPila {
    public static void main (String [] pony){
    
        Pilas pila = new Pilas(12);
        pila.push(5);
        pila.peek();
        pila.pop();
    
    }
}
