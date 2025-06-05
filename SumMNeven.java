package Loop;
//print sum of the even numbers from m-n
import java.util.Scanner;

public class SumMNeven{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int m,n;
        
        System.out.print("Enter Initial number: ");
        m = input.nextInt();
        
        System.out.print("Enter Final number: ");
        n = input.nextInt();
        
        System.out.println();
        System.out.print("Even numbers are:");
        for(int i = m; i <= n; i++){
            if(i%2==0){
                System.out.print(" "+i);
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Sum of even numbers: "+sum);
    }
}
