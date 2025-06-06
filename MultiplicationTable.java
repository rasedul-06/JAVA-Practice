package Loop;
//Write a program for create a multiplication table
import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, i, result;
        
        System.out.print("Enter an Integer number: ");
        number = input.nextInt();
        
        System.out.println();
        System.out.println("Multiplication Table is: ");
        
        for(i = 1; i <= 10; i++){
            result = i * number;
            System.out.println(number+" x "+i+" = "+result);
        }
    }
}
