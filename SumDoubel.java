package Series;
//print the sum of double numbers
import java.util.Scanner;
public class SumDouble{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double i,n,sum=0;
        
        System.out.print("Enter a number: ");
        n = input.nextDouble();
        
        for(i=1.5; i<=n; i++){
            sum = sum + i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sum is: "+sum);
    }
}
