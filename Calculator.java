
public class Calculator {
    public int add(int a, int b) {
        // Returns the sum of a + b
        return a + b;
    }

    public int sub(int a, int b) {
        // Returns the subtraction of b from a
        return a - b;
    }

    public int multiply(int a, int b) {
        // Returns the multiplication of a anb
        return a * b;
    }

    public double divide(double a, double b) {
        // Returns the division of a over b
        if (b == 0) {
            throw new ArithmeticException("division by zero");
        }
        return a / b;
    }
}

