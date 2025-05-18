package Chapter_6;
//Ex-6.24 find the perfect number.
import java.util.Scanner;

public class Calculate_Perfect_Number {


    public boolean isPerfect(int num){

        int sum=0;
        StringBuilder sb=new StringBuilder();

                for(int i=1;i<num;i++){
                    if(num%i==0){
                        sum+=i;
                        sb.append(i).append(" , "); //store all fector in sb

                    }
                }

        if(sum==num){
            System.out.println(num + "  Is a perfect Number");
            System.out.println(sb+""+num);
            return true;
        }
        else {
           // System.out.println(sum+"  "+num);
            System.out.println(num+ " is not a Perfect Number");
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int number=sc.nextInt();
        Calculate_Perfect_Number cpn=new Calculate_Perfect_Number();
        cpn.isPerfect(number);
    }
}
