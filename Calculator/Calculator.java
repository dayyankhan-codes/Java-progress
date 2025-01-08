package Calculator;

import java.util.Scanner;

public class Calculator {
    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
    	return a / b;
    }
    public static double mod(double a, double b) {
    	return a % b;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1.Add");
        System.out.println("2.ubtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("5.Modulus");

        int choice = scanner.nextInt();
        double result;

        switch (choice) {
            case 1:
                result = sum(num1, num2);
                System.out.println("Answer: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Answer: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Answer: " + result);
                break;
            case 4:
                result = divide(num1, num2);
                System.out.println("Answer: " + result);
                break;
            case 5:
            	result = mod(num1, num2);
            	System.out.println("Answer: " + result);
                break;
        }

        scanner.close();
    }
}
