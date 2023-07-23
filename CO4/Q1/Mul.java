//c04 - prgm 1 part -2

package arithmetic;
import java.util.*;

public class Mul implements opn {
    Scanner sc = new Scanner(System.in);
    int a, b;

    public void operation() {
        System.out.print("Enter the 1 st number : ");
        a = sc.nextInt();
        System.out.print("Enter the 2 nd number : ");
        b =sc.nextInt();
        int s =a * b;
        System.out.println("MULTIPLICATION RESULT :" + s);

    }
}