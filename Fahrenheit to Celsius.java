package temperature;
// Write a program that converts temperature from Fahrenheit to Celsius
import java.util.Scanner;

public class Fahrenheit_to_Celsius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double farn, cels;

        System.out.print("Enter the value in Fahrenheit: ");
        farn = input.nextDouble();

        cels = (farn - 32) * 5 / 9;

        System.out.println("The Celsius value is: " + cels);
    }
}
