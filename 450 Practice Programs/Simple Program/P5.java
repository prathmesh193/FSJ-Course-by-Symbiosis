//5.	Swap two numbers
public class P5 {
    public static void main(String[] args) {
        int x=10,y=20;
        System.out.println("1st number:"+x);
        System.out.println("2nd Number:"+y);

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("After Swapping--");
        System.out.println("1st number:"+x);
        System.out.println("2nd number:"+y);
    }
}
