package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        try {
            int factorial = 1;
            for (int i = number; i >= 1; i--) {
                factorial = factorial * i;
            }
            System.out.println(number + " factorial equals " + factorial);
        } catch (InputMismatchException e){
            System.out.println("Error: Wrong input format");
        } finally {
            scanner.close();
        }
}
}
