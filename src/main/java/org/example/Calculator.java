package org.example;

public class Calculator {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Calculator <num1> <num2> <operation>");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        String operation = args[2];

        double result = calculate(num1, num2, operation);
        System.out.println("Result: " + result);
    }

    private static double calculate(double num1, double num2, String operation) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "x":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    System.exit(1);
                }
            default:
                System.out.println("Error: Invalid operation");
                System.exit(1);
                return 0; // Unreachable, but required for compilation
        }
    }
}
