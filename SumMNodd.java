package Loop;
//print sum of the odd numbers from m-n
import java.util.Scanner;

public class SumMNodd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int m,n;
        
        System.out.print("Enter Initial number: ");
        m = input.nextInt();
        
        System.out.print("Enter Final number: ");
        n = input.nextInt();
        
        System.out.println();
        System.out.print("Odd numbers are:");
        for(int i = m; i <= n; i++){
            if(i%2!=0){
                System.out.print(" "+i);
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Sum of odd numbers: "+sum);
    }
}
