public class ArithmeticOperations {
    public static void main(String[] args) {
        // Directly assigning values
        double num1 = 25;
        double num2 = 5;

        // Performing arithmetic operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : 0; // Handling division by zero
        double modulus = num1 % num2;

        // Square root and cube root calculations
        double squareRootNum1 = Math.sqrt(num1);
        double squareRootNum2 = Math.sqrt(num2);
        double cubeRootNum1 = Math.cbrt(num1);
        double cubeRootNum2 = Math.cbrt(num2);

        // Displaying results
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("\nResults:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + (num2 != 0 ? division : "Undefined (Cannot divide by zero)"));
        System.out.println("Modulus: " + modulus);
        System.out.println("Square Root of " + num1 + ": " + squareRootNum1);
        System.out.println("Square Root of " + num2 + ": " + squareRootNum2);
        System.out.println("Cube Root of " + num1 + ": " + cubeRootNum1);
        System.out.println("Cube Root of " + num2 + ": " + cubeRootNum2);
    }
}