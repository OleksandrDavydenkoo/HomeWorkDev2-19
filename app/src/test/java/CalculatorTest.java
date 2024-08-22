package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int result = 3 + 2;
        assertEquals(5, result, "3 + 2 should equal 5");
    }
}