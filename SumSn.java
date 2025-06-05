package Series;
//print the sum of square numbers
import java.util.Scanner;
public class SumSN{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n,sum=0;
        
        System.out.print("Enter a number: ");
        n = input.nextInt();
        
        System.out.print("Sum is: ");
        for(i=1; i<=n; i++){
            sum = sum + i*i;
            System.out.print(i+"X"+i+" ");
        }
        System.out.print("= ");
        System.out.println(+sum);
    }
}
