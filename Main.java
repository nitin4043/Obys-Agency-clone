@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        // Lambda expression for addition
        Calculator add = (a, b) -> a + b;

        // Lambda expression for subtraction
        Calculator sub = (a, b) -> a - b;

        // Lambda expression for division with error handling
        Calculator div = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        };

        // Multiplcation
        Calculator mul = (a, b) -> a * b;
        // Multiplcation
        Calculator mod = (a, b) -> a % b;

        try {
            System.out.println("Addition: " + add.operate(5, 3)); // Output: 8
            System.out.println("Subtraction: " + sub.operate(5, 3)); // Output: 2
            System.out.println("Multiplcation: " + mul.operate(5, 3)); // Output: 2
            System.out.println("Multiplcation: " + mod.operate(5, 3)); // Output: 2
            System.out.println("Division: " + div.operate(5, 0)); // This will throw error
        } catch (ArithmeticException e) {
            System.out.println("Please try another number: " + e.getMessage());
        }
    }
}
