package Loop;
//Example of prime number
import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,i,count=0;
        
        System.out.print("Enter any Integer number: ");
        num = input.nextInt();
        
        for(i=2; i<num; i++){
            if(num%2==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("It's a prime number.");
        }else{
            System.out.println("It's not a prime number.");
        }
    }
}
