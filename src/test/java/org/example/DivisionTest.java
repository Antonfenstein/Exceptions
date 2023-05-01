package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DivisionTest
{
       @Test
    public void testException(){
                Assertions.assertThrows(ArithmeticException.class, ()-> {
           Division.divideTwoNumbers(10,0);
        });
    }
    @Test
    public void testNoException(){
        Assertions.assertEquals(5, Division.divideTwoNumbers(20,4));
    }

}
