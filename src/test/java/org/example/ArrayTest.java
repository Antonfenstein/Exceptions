package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ArrayTest {
    @Test
    public void arrayExceptionOutOfBounds(){
        ArrayIndexOutOfBoundsException thrown = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
        {
            Array.returnArrayElement(7);
        });
        System.out.println(thrown.getMessage());
    }
    @Test
    public void arrayNegativeNumberOfArrayElementException(){
        ArrayIndexOutOfBoundsException thrown = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
        {
            Array.returnArrayElement(-5);
        });
        System.out.println(thrown.getMessage());
    }
    @Test
    public void testWithNoException() {
        assertDoesNotThrow(() -> {
            Array.returnArrayElement(0);
        });
    }
}
