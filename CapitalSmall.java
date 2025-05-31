package Logical;
//Write a program for Capital letter and Small letter
import java.util.Scanner;

public class CapitalSmall{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter any Character: ");
        char ch = input.next().charAt(0);

        // using logical operator
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Small Letter.");
        }else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Capital Letter.");
        }else{
            System.out.println("Not a valid character.");
        }

        // using method
        /*if(Character.isUpperCase(ch)){
            System.out.println("Capital Letter");
        }else if(Character.isLowerCase(ch)){
            System.out.println("Small Letter");
        }else {
            System.out.println("It's not a Letter");
        }*/
    }
}
