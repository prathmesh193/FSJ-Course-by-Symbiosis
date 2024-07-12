//19.	Java Programs To Find Area And Circumference Of Circle

public class P19 {
    public static void main(String[] args) {
        double radius = 5.5;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area of circle is " + area);
        System.out.println("Circumference of circle is " + circumference);
    }
}
