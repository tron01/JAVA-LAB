//c04 - prgm 1 part -2

import graphics.Circle;
import graphics.Triangle;
import graphics.Rectangle;
import graphics.Square;
import java.util.*;
public class graphics_package {
    public static void main(String []args)
    {
         Scanner sc = new Scanner(System.in);
        
        
      
         int n;
        while (true) {
             System.out.println("1:Area of Rectangle");
            System.out.println("2:Area of Triangle");
            System.out.println("3:Area of square");
            System.out.println("4:Area of circle");
            System.out.println("5:EXIT");
            System.out.println("Enter Your choice ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                Rectangle r = new Rectangle();
                    r.area();
                    break;
                case 2:
                 Triangle t = new Triangle();
                     t.area();
                    break;
                case 3:
                 
        Square sq = new Square();
                    sq.area();; 
                    break;
                case 4:
                Circle c = new Circle();
                     c.area();
                    break;
                case 5:
                    System.out.println("Exiting the Program");
                    System.exit(0);
                default:
                    System.out.println("invalid! choice");

            }
        }

    }

}

/**
1:Area of Rectangle
2:Area of Triangle
3:Area of square
4:Area of circle
5:EXIT
Enter Your choice
1
Enter the Length : 10
Enter the breadth : 4
Area :40
1:Area of Rectangle
2:Area of Triangle
3:Area of square
4:Area of circle
5:EXIT
Enter Your choice
2
Enter the breadth : 2
Enter the height : 3
Area :3
1:Area of Rectangle
2:Area of Triangle
3:Area of square
4:Area of circle
5:EXIT
Enter Your choice
3
Enter the side of square : 4
Area :16
1:Area of Rectangle
2:Area of Triangle
3:Area of square
4:Area of circle
5:EXIT
Enter Your choice
4
Enter the radius : 5
Area  :78.5
1:Area of Rectangle
2:Area of Triangle
3:Area of square
4:Area of circle
5:EXIT
Enter Your choice
5
Exiting the Program

 */