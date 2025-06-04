package Bitwise;
//build a program for bitwise right shift and left shift.
import java.util.Scanner;

public class ShiftLeftRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,c;

        System.out.print("Enter a: ");
        a = input.nextInt();

        c = a>>3; // 32/2=16, 16/2=8, 8/2=4
        System.out.println("Updated a is: "+c);

        c = a<<3; // 32*2=64, 64*2=128, 128*2=256
        System.out.println("Updated a is: "+c);

        input.close();
    }
}
