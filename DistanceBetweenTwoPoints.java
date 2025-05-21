package Distance;
// Calculate the distance between two points

import java.util.Scanner;

public class Distance_Between_Two_Points {

    public static  double calDistance(double [] num1,double[] num2)
    {
        double x1=num1[0];
        double y1=num1[1];
        double x2=num1[0];
        double y2=num2[1];
        System.out.println( "1St point ("+x1+" , "+y1+ ")");
        System.out.println("2nd point ("+x2+" , "+y2+ ")");
        double distance =Math.sqrt((Math.pow((x1-x2),2)+Math.pow((y1-y2),2)));
        return distance;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] a=new double[2];
        double[] b=new double[2];
        for (int i=0;i<2;i++){
            if (i==0){
                System.out.print("Enter the  x values  of both point : ");
                a[0]=sc.nextDouble();
                b[0]=sc.nextDouble();
            }
            else {
                System.out.print("Enter the y of both point : ");
                a[1]=sc.nextDouble();
                b[1]=sc.nextDouble();
            }

        }

        System.out.println("Distance Between Two Point is: "+ calDistance(a,b));
    }
}
