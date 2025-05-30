package Relational;

import java.util.Scanner;
public class MaxMin{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three number: ");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        int max=num1;
        int min=num1;

        if(num2>max){
            max=num2;
        }else if(num2<min){
            min=num2;
        }else if(num3>max){
            max=num3;
        }else if(num3<min){
            min=num3;
        }
        System.out.println("Maximum number is: "+max);
        System.out.println("Minimum number is: "+min);
        input.close();
    }
}
