//11.	Read Integer (N) and Print the First Three Powers (N^1, N^2, N^3)

import java.util.Scanner;

class P11 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int n = sc.nextInt();

        int power1 = n;
        int power2 = n*n;
        int power3 = n*n*n;

        System.out.println("First Power (n^1): "+power1);
        System.out.println("Second Power (n^2): "+power2);
        System.out.println("Third Power (n^3): "+power3);
    }
}
