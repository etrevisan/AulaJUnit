/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo01junit;

/**
 *
 * @author emill
 */
public class Calculadora {
    public int soma(int a, int b){
        return a+b;
    }
    
    public int mult(int a, int b){
        return a*b;
    }
    
    public boolean isNegativo(int x){
        return x<0;
    }
}
