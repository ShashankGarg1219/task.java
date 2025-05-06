// Calculator.java
// This program demonstrates method overloading in Java

import java.util.Scanner;

public class Calculator {

    // First add method: takes two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Second add method: takes three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Third add method: takes two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Main method
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        // Using first add method
        System.out.print("Enter two integers: ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int sum1 = calc.add(int1, int2);
        System.out.println("Sum of two integers: " + sum1);

        // Using second add method
        System.out.print("Enter three integers: ");
        int int3 = scanner.nextInt();
        int int4 = scanner.nextInt();
        int int5 = scanner.nextInt();
        int sum2 = calc.add(int3, int4, int5);
        System.out.println("Sum of three integers: " + sum2);

        // Using third add method
        System.out.print("Enter two decimal numbers: ");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();
        double sum3 = calc.add(double1, double2);
        System.out.println("Sum of two doubles: " + sum3);

        scanner.close();
    }
}
