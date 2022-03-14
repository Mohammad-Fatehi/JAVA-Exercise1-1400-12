package com.company;

/*
 * Mohammad Fatehi
 * JAVA Exercise1-2
 */

public class Main
{
    public static void main(String[] args) {

        int[] numbers = { 15, 30, 5, 10, 50, 1, 11, 100, 17};//Enter your numbers here
        int FirstNumber = 0, LastNumber = 0 , i;
        for ( i = 0; i < numbers.length ; i++) {
            if (i == 0) {
                FirstNumber = numbers[0];
            } else {
                LastNumber = numbers[i];
                if (LastNumber > FirstNumber) {
                    FirstNumber = LastNumber;
                }
            }
        }
        if (FirstNumber > LastNumber) {
            System.out.println("The Maximum number is : "+ FirstNumber);
        } else {
            System.out.println("The Maximum number is : "+ LastNumber);
        }
    }
}