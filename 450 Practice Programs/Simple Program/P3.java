//3.	Calculate compound interest 

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        double principle,rate=0.1,time,ci;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Principle amount:");
        principle= sc.nextDouble();
        System.out.println("Enter Time:");
        time=sc.nextDouble();
        ci=principle*(Math.pow((1+rate/100),time))-principle;
        System.out.println("Compound Interest is :"+ci);
    }
}
