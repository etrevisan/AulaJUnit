/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exemplo01junit.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emill
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
   @Test
   public void testeSoma()
   {
       Calculadora c = new Calculadora();
       assertEquals(8, c.soma(3,5));
   }
   
   @Test
   public void testeMult()
   {
       Calculadora c = new Calculadora();
       assertEquals(12, c.mult(4,3));
   }
   
   @Test
   public void testeNegativo()
   {
       Calculadora c = new Calculadora();
       assertTrue(c.isNegativo(-2));
   }
}
