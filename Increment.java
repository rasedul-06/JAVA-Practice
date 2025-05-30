package Unary;
// Write a program that represent Increment

import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x,y;

        System.out.print("Enter a value: ");
        x = input.nextInt();

        //post increment
        y = x++;
        System.out.println("Y="+y);

        y = x;
        System.out.println("Y="+y);

        //pre increment
        y = ++x;
        System.out.println("Y="+y);

        y = x;
        System.out.println("Y="+y);
    }
}
