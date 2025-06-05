package Loop;
//print sum of the numbers from m-n
import java.util.Scanner;

public class SumMN{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int m,n;
        
        System.out.print("Enter Initial number: ");
        m = input.nextInt();
        
        System.out.print("Enter Final number: ");
        n = input.nextInt();
        
        for(int i = m; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Sum is: "+sum);
    }
}
