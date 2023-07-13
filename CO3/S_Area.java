//c03 - prgm -1
import java.util.Scanner;
class Shape{
static int area(int a){return a*a;}
static int area(int a,int b){return a*b;}
static double area(double c){return 3.14*c*c;}
}
class S_Area{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter length a:");
int a= sc.nextInt(); 
System.out.println("Enter breadth b:"); 
int b=sc.nextInt();
System.out.println("Enter radius:"); 
double c=sc.nextDouble();
System.out.println("Area of Square:"+Shape.area(a));
System.out.println("Area of Rectangle:"+Shape.area(a,b));
System.out.println("Area of Circle:"+Shape.area(c));
}}

/*
Enter length a:
10
Enter breadth b:
2
Enter radius:
4
Area of Square:100
Area of Rectangle:20
Area of Circle:50.24
*/