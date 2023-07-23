//c04 - prgm 1 part -1
package graphics;
import java.util.*;
interface Shape {
    public void area();
    
}

public class Circle implements Shape {
    Scanner sc = new Scanner(System.in);
    Double r;
    Double ar,pr;
    public void area() {
        System.out.print("Enter the radius : ");
        r = sc.nextDouble();
       ar=3.14*r*r;
        System.out.println("Area  :" + ar);

    }
}