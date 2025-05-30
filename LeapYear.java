package Relational;
//Write a program that calculate leap year
import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("It's a leap year.");
        }else{
            System.out.println("It's not a leap year.");
        }
        input.close();
    }
}
