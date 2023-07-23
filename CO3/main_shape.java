// c03 prg -6 

import java.util.Scanner;
import java.util.*;
import java.lang.*;

interface Shape {
    float pi =3.14F;
    float area();
    float perimeter();
}

class Circle implements Shape{
int r;
Scanner s =new Scanner(System.in);


public  float perimeter(){
    
System.out.print("Enter the radius : ");
r=s.nextInt();
return (pi * 2 * r);
}
public  float area(){
    
System.out.print("Enter the radius : ");
r=s.nextInt();
return (pi * r * r);
}

}

class Rectangle implements Shape{
int l,b;
Scanner s =new Scanner(System.in);



public float perimeter(){
System.out.print("Enter the length : ");
l=s.nextInt();
System.out.print("Enter the breadth  : ");
b=s.nextInt();
return ( 2*( l+ b) );

}
public  float area(){

System.out.print("Enter the length : ");
l=s.nextInt();
System.out.print("Enter the breadth  : ");
b=s.nextInt();
return (l*b);

}

}

class main_shape{
     public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        int ch;
        while (true) {
            System.out.println("1:Area of Circle");
            System.out.println("2:Perimeter of Circle");
            System.out.println("3:Area of Rectangle");
            System.out.println("4:Perimter of Rectangle");
            System.out.println("5:EXIT");
            System.out.println("enter choice ");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    float ar = c.area();
                    System.out.println("Area  :" + ar);
                    break;
                case 2:
                    float pr = c.perimeter();
                    System.out.println("perimeter : "+pr);
                    break;
                case 3:
                    float a = r.area();
                    System.out.println("Area :" + a);
                    break;
                case 4:
                    float pr1 = r.perimeter();
                    System.out.println("perimeter :"+pr1);
                    break;
                case 5:
                    System.out.println("Exiting the Program");
                    System.exit(0);
                default:
                    System.out.println("invalid!");

            }
        }

    }

}
/**
1:Area of Circle
2:Perimeter of Circle
3:Area of Rectangle
4:Perimter of Rectangle
5:EXIT
enter choice
1
Enter the radius : 3
Area  :28.26
1:Area of Circle
2:Perimeter of Circle
3:Area of Rectangle
4:Perimter of Rectangle
5:EXIT
enter choice
2
Enter the radius : 44
perimeter : 276.32
1:Area of Circle
2:Perimeter of Circle
3:Area of Rectangle
4:Perimter of Rectangle
5:EXIT
enter choice
5
Exiting the Program

 */