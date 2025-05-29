package Area;
//
import java.util.Scanner;
public class TriangleArea{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double base, height, area;

        System.out.print("Enter the base of Triangle:");
        base = input.nextDouble();

        System.out.print("Enter the height of Triangle:");
        height = input.nextDouble();

        area = 0.5*base*height;

        System.out.println("The area of Triangle is:"+area);
    }
}
