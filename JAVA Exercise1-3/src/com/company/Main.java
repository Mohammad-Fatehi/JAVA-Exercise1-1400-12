package com.company;

/*
 * Mohammad Fatehi
 * Java Exercise1-3
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        System.out.print("Enter the first number: ");
        Scanner firstInput = new Scanner(System.in);
        int firstnumber = firstInput.nextInt();
        System.out.println("");
        System.out.print("Enter the next number: ");
        Scanner secondInput = new Scanner(System.in);
        int nextnumber = secondInput.nextInt();
        System.out.println("");
        System.out.println("1-Show the result of the sum");
        System.out.println("2-Show the result of the subtraction");
        System.out.println("3-Show the result of the multiply");
        System.out.println("4-Show the result of the division");
        System.out.print("Select the type of operator according to its number: ");
        Scanner operationInput = new Scanner(System.in);
        int operator = operationInput.nextInt();
        int result = 0;
        switch (operator) {
            case 1:
                result = firstnumber + nextnumber;
                System.out.println("Result of Sum: " + result);
                break;
            case 2:
                result = firstnumber - nextnumber;
                System.out.println("Result of Subtraction: " + result);
                break;
            case 3:
                result = firstnumber * nextnumber;
                System.out.println("Result of Multiply: " + result);
                break;
            case 4:
                result = firstnumber / nextnumber;
                System.out.println("Result of Division: " + result);
                break;
        }
    }
}