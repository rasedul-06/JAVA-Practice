package Loop;
//Example of prime number
import java.util.Scanner;
public class AdvancePrimeNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,i,count = 0;
        
        System.out.print("Enter any Integer number: ");
        num = input.nextInt();
        System.out.println();
        if(num==0 || num==1){
            System.out.println("It's not a prime number.");
        }else {
            for (i = 2; i < num/2; i++) { //কোন সংখ্যাকে ঐ সংখ্যার অর্ধেকের বেশি সংখ্যা দিয়ে ভাগ করা যায় না।
                if (num % 2 == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime number.");
            } else {
                System.out.println("Not a prime number");
            }
        }
    }
}
