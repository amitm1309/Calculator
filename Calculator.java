public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }   

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(10, 5);
        int difference = calc.subtract(10, 5);
        int multiplyResult = calc.multiply(10, 5);
        int divideResult = calc.divide(10, 5);

        System.out.println("Addition result: " + sum);
        System.out.println("Subtraction result: " + difference);
        System.out.println("Multiplication result: " + multiplyResult);
        System.out.println("Division : " + divideResult);
    
    }
}