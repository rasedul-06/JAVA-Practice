package Loop;
//print sum of 1-10
import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum = sum + i;
        }
        System.out.println("Sum is: "+sum);
    }
}
