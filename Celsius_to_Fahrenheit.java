package Temperature;
//Write a program that convert temperature Celsius to Fahrenheit
import java.util.Scanner;
public class Celsius_to_Fahrenheit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cels,far;

        System.out.print("Enter the value in celsius: ");
        cels = input.nextDouble();

        far = 1.8 * cels + 32;

        System.out.println("The Fahrenheit value is: "+far);
    }
}
