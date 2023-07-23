//c04 - prgm 1 part -1

package graphics;
import java.util.*;
public class Square implements Shape
{
     Scanner sc = new Scanner(System.in);
    int a;

    public void area() {
        System.out.print("Enter the side of square : ");
        a = sc.nextInt();
        System.out.println("Area :" + a*a);

    }

}