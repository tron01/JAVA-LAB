//c04 - prgm 1 part -1

package graphics;
import java.util.*;
public class Rectangle implements Shape {
    Scanner sc = new Scanner(System.in);
    int l, b;

    public void area() {
        System.out.print("Enter the Length : ");
        l = sc.nextInt();
        System.out.print("Enter the breadth : ");
        b =sc.nextInt();
       int area =l * b;
        System.out.println("Area :" + area);

    }
}