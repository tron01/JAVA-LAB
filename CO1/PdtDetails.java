import java.util.Scanner;
class Product{
	int pcode, price;
	String pname="";

	public void Read(){
	System.out.println("...enter the details....");
	System.out.println("enter pdt code, name, price....");

	Scanner sc=new Scanner(System.in);
	pcode=sc.nextInt();
	pname=sc.next();
	price=sc.nextInt();
	}
	
	public void Display(){
	System.out.println("..Product details..");
	System.out.println("product code= "+pcode);
	System.out.println("product name= "+pname);
	System.out.println("product price= "+price);
	}
}
public class PdtDetails{
  public static void main(String args[]){
	Product p1=new Product();
	Product p2=new Product();
	Product p3=new Product();
	System.out.println("enter the 1st pdt details....");
	p1.Read();
	System.out.println("enter the 2nd pdt details....");
	p2.Read();
	System.out.println("enter the 3rd pdt details....");
	p3.Read();
	
	if(p1.price<p2.price && p1.price<p3.price){
	   System.out.println("Smallest price is: "+p1.price);
	   p1.Display();		
	}
	else if(p2.price<p3.price){
	   System.out.println("Smallest price is: "+p2.price);
	   p2.Display();
	}
	else {
	   System.out.println("Smallest price is: "+p3.price);
	   p3.Display();
	}
    }
}	

/**
enter the 1st pdt details....
...enter the details....
enter pdt code, name, price....
11
cycle
10000
enter the 2nd pdt details....
...enter the details....
enter pdt code, name, price....
20
car
100000   
enter the 3rd pdt details....
...enter the details....
enter pdt code, name, price....
19
bike
20000  
Smallest price is: 10000
..Product details..
product code= 11
product name= cycle
product price= 10000

 */