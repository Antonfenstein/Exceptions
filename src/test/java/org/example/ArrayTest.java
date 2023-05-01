package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ArrayTest {
    @Test
    public void arrayException(){
        ArrayIndexOutOfBoundsException thrown = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
        {
            Array.returnArrayElement(7);
        });
        System.out.println(thrown.getMessage());
    }
    @Test
    public void arrayNegativeException(){
        ArrayIndexOutOfBoundsException thrown = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
        {
            Array.returnArrayElement(-5);
        });
        System.out.println(thrown.getMessage());
    }
    @Test
    public void testNoException() {
        assertDoesNotThrow(() -> {
            Array.returnArrayElement(0);
        });
    }
}
