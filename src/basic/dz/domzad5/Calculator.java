package basic.dz.domzad5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = getOperand(sc, "Enter the first number: ");
        char op = getOperator(sc);
        double b = getOperand(sc, "Enter the second number: ");

        String result = calculate(a, op, b);
        System.out.println(result);
    }

    private static double getOperand(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            sc.next(); // Clear invalid input
            System.out.print(prompt);
        }
        return sc.nextDouble();
    }

    private static char getOperator(Scanner sc) {
        System.out.print("Enter an operator (+, -, *, /): ");
        while (true) {
            String input = sc.next();
            if (input.length() == 1 && "+-*/".indexOf(input.charAt(0)) != -1) {
                return input.charAt(0);
            }
            System.out.println("Invalid operator. Please enter one of (+, -, *, /).");
            System.out.print("Enter an operator (+, -, *, /): ");
        }
    }

    private static String calculate(double a, char op, double b) {
        return switch (op) {
            case '+' -> String.valueOf(a + b);
            case '-' -> String.valueOf(a - b);
            case '*' -> String.valueOf(a * b);
            case '/' -> b != 0 ? String.valueOf(a / b) : "Error: Division by zero!";
            default -> "Error: Unknown operation!";
        };
    }
}
