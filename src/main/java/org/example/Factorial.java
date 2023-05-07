package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        try {
            int factorial = Factorial.getFactorial(number);
            System.out.println(number + " factorial equals " + factorial);
        } catch (InputMismatchException e) {
            System.out.println("Error: Wrong input format");
        } catch (StackOverflowError e) {
            System.out.println("Error: The number is too big for calculation or negative");
        } finally {
            scanner.close();
        }
    }

    public static int getFactorial(int number) {
        if (number == 0)
            return 1;
        else
            return (number * getFactorial(number - 1));
    }
}
