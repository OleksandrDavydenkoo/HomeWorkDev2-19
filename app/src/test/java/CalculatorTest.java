package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int result = 3 + 4;
        assertEquals(7, result, "3 + 4 should equal 7");
    }
}