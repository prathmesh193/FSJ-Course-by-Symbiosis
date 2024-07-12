//10.	Factorial of a Given Number
import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        int num,fact=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        num=sc.nextInt();
        for(int i=1;i<num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of given number: "+fact);
    }
}
