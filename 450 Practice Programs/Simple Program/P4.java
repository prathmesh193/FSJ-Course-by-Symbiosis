//4.	Calculate power of a number
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num,power;
        double result;
        System.out.println("Enter the number:");
        num=sc.nextInt();
        System.out.println("Enter the power of the nuumber:");
        power=sc.nextInt();
        result=Math.pow(num,power);
        System.out.println("Result:"+result);
        /*
         * long result=1;
         * while(power!=0)
         * {
         *      result=result*base;
         *      --power;
         * }
         * System.out.println("Result = "+result);
         */
    }
}
