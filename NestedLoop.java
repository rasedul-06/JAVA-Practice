package Loop;
//Write a program for nested loop
import java.util.Scanner;
public class NestedLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, i, j, result;
        
        System.out.print("Enter Initial number: ");
        m = input.nextInt();
        
        System.out.print("Enter Final number: ");
        n = input.nextInt();
        
        System.out.println();
        
        for(i = m; i <= n; i++){
            System.out.println("Table for "+i+":");
            for(j = 1; j <= 10; j++){
                result = i * j;
                System.out.println(i+" x "+j+" = "+result);
            }
            System.out.println();
        }
    }
}
