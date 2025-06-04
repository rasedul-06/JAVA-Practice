package Math;
//build a program for some Math classes...
import java.util.Scanner;

public class MathClasses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter X: ");
        int x = input.nextInt();

        System.out.print("Enter Y: ");
        int y = input.nextInt();

        System.out.print("Enter Z: ");
        int z = input.nextInt();

        int max = Math.max(x,y);
        System.out.println("Maximum: "+max);

        int min = Math.min(x,y);
        System.out.println("Minimum: "+min);

        int absolute = Math.abs(z);
        System.out.println("Absolute: "+absolute);

        double power = Math.pow(x,y);
        System.out.println("Power: "+power);

        int round = Math.round(9.4f);
        System.out.println("Round of 9.4 is: "+round);

        double pi = Math.PI;
        System.out.println("PI :"+pi);

        input.close();
    }
}
