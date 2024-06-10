
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(20, 10);
        assertEquals(10, result);
    }

    @Test
    public void testMultiply() {
    Calculator calculator = new Calculator();
    int result = calculator.multiply(10, 20);
    assertEquals(200, result);
    }

    @Test
    public void testDivide() {
    Calculator calculator = new Calculator();
    double result = calculator.divide(20.0, 10.0);
    assertEquals(2.0, result, 0.001); // Tolerance for floating-point comparison
    }

     @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("division by zero", exception.getMessage());
    }


}
