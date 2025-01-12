package adi.learn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void addNumbers() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int sum = calculator.add(1, 2);

        // Asset
        Assertions.assertEquals(3, sum);
    }
}