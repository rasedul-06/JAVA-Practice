package Relational;
//Write a program that prints even odd
import java.util.Scanner;
public class Even_Odd{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter any integer number: ");
        num = input.nextInt();

        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
