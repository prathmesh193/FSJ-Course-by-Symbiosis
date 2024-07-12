//8.	Simple Interest
import java.util.Scanner;

class P8 {
    public static void main(String[] args) {
        double principle,rate=2,time,si;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the principle amount: ");
        principle=sc.nextDouble();
        System.out.println("Enter the time in years:");
        time= sc.nextDouble();

        si=(principle*rate*time)/100;
        System.out.println("Simple interest is :"+si);
    }    
}
