package Area;
//Write a program that takes input form user and calculate the area of a circle
import java.util.Scanner;
public class CircleArea{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius, area;

        System.out.print("Enter the radius of a circle:");
        radius = input.nextDouble();

        area = 3.1416*radius*radius;

        System.out.println("The area of Circle is:"+area);
    }
}
