package Series;
//print the sum of n numbers and the distance of each number is 2
import java.util.Scanner;
public class SumD2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,sum=0;
        
        System.out.print("Enter a number: ");
        n = input.nextInt();
        
        for(i=1; i<=n; i=i+2){
            sum = sum + i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sum is: "+sum);
    }
}
