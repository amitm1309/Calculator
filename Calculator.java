public class Calculator {

    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Main method to test add and subtract methods
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(10, 5);
        int difference = calc.subtract(10, 5);

        System.out.println("Addition : " + sum);       // Output: Addition: 15
        System.out.println("Subtraction : " + difference); // Output: Subtraction: 5
    }
}