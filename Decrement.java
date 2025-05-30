package Unary;
// Write a program that represent Decrement

import java.util.Scanner;

public class Decrement{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x,y;

        System.out.print("Enter a value: ");
        x = input.nextInt();

        //post increment
        y = x--;
        System.out.println("Y="+y);

        y = x;
        System.out.println("Y="+y);

        //pre increment
        y = --x;
        System.out.println("Y="+y);

        y = x;
        System.out.println("Y="+y);
    }
}
