package Relational;
//Write a program that calculate pass, fail.
import java.util.Scanner;

public class PassFail{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Mark: ");
        int mark = input.nextInt();

        if(mark >= 40 && mark <= 100){
            System.out.println("PASS");
        }else if(mark < 40 && mark >= 0){
            System.out.println("FAIL");
        } else{
            System.out.println("Not a valid mark.");
        }
    }
}
