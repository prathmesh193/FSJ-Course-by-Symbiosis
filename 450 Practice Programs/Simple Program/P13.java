//13.	LCM of Two Numbers

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = 0;
        for (int i = 1; i <= a * b; i++) 
        {
            if (i % a == 0 && i % b == 0)
            {
                lcm = i;
            }
        }
                System.out.println("LCM of " + a + " and " + b + " is "+lcm);
    }
}
