//c04 - prgm 1 part -1

package graphics;
import java.util.*;
public class Triangle implements Shape
{
    Scanner sc = new Scanner(System.in);
    int h, b;

    public void area() {
        System.out.print("Enter the breadth : ");
        b = sc.nextInt();
        System.out.print("Enter the height : ");
        h =sc.nextInt();
       int area =b*h/2;
        System.out.println("Area :" + area);

    }
    
}