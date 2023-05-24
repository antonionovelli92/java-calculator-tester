package org.java.calctest;
import org.java.calc.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Random;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    private Random random = new Random();

    @Test
    public void testAdd() {
        float num1 = random.nextFloat();
        float num2 = random.nextFloat();
        float t = num1 + num2;

        float result = calculator.add(num1, num2);
        assertEquals(t, result, 0.0001f);
    }

    @Test
    public void testSubtract() {
        float num1 = random.nextFloat();
        float num2 = random.nextFloat();
        float t = num1 - num2;

        float result = calculator.subtract(num1, num2);
        assertEquals(t, result, 0.0001f);
    }

    @Test
    public void testDivide() {
        float num1 = random.nextFloat();
        float num2 = random.nextFloat();
        if (num2 == 0) {
        	// Evito la divisione per zero
            num2 = random.nextFloat() + 0.1f; 
        }
        float t = num1 / num2;

        float result = calculator.divide(num1, num2);
        assertEquals(t, result, 0.0001f);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(random.nextFloat(), 0.0f);
        });
    }

    @Test
    public void testMultiply() {
        float num1 = random.nextFloat();
        float num2 = random.nextFloat();
        float t = num1 * num2;

        float result = calculator.multiply(num1, num2);
        assertEquals(t, result, 0.0001f);
    }
}
