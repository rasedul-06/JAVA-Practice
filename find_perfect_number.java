package Perfect_Number;
import java.util.Scanner;

public class find_perfect_number {

    public boolean isPerfect(int num) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
                sb.append(i).append(" , ");
            }
        }

        if (sum == num) {
            System.out.println(num + " is a perfect number");
            System.out.println(sb + "" + num);
            return true;
        } else {
            System.out.println(num + " is not a perfect number");
        }
        return false;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int number = sc.nextInt();
            find_perfect_number cpn = new find_perfect_number();
            cpn.isPerfect(number);
        }
    }
}
