package com.company;

/*
 * Mohammad Fatehi
 * Java Exercise class
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        int[] numbers = { 10,5,4,7,8,21,10,54,3,10,4};
        System.out.print("Enter your number to search: ");
        Scanner input = new Scanner(System.in);
        int Receivednumber = input.nextInt();
        if (checkArray(Receivednumber, numbers)) {
            System.out.println("True");
            System.out.println("There are (" + counter + ") of these numbers in this array");
        }
        else
            System.out.println("False");
    }
    static int counter = 0;
    public static boolean checkArray(int Numberentered, int[] Arraylist) {
        for (int i = 0; i < Arraylist.length ; i++) {
            if (Arraylist[i] == Numberentered) {
                counter++;
            }
        }
        if (counter > 0) {
            return true;
        }
        return false;
    }
}