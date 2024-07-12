//12.  Area of a Circle

import java.util.Scanner;

class P12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double radius,area;
        System.out.println("Enter the radius of the circle: ");
        radius = sc.nextDouble();
        area = 3.14*radius*radius;
        System.out.println("The area of the circle is: "+area);
    }
}