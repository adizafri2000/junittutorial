package adi.learn;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @Tag(TutorialClassificationConst.VALUES)
    void addNumbers() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int sum = calculator.add(1, 2);

        // Assert
        assertEquals(3, sum);
    }

    @Test
    @Tag(TutorialClassificationConst.CUSTOM_ERROR_MESSAGES)
    void addNumbers2() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2), "1 + 2 should equal 3");
    }


    @Test
    @Tag(TutorialClassificationConst.EXCEPTIONS)
    void divideByZeroThrowsIllegalArgumentException() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

    @Test
    @Tag(TutorialClassificationConst.EXCEPTIONS)
    void divideByZeroThrowsIllegalArgumentException2() {
        Calculator calculator = new Calculator();
        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
        assertEquals("Cannot divide by zero", thrown.getMessage());
    }


}